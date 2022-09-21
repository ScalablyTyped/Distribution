package typings.scrivito.mod

import typings.scrivito.scrivitoStrings.bottom
import typings.scrivito.scrivitoStrings.center
import typings.scrivito.scrivitoStrings.left
import typings.scrivito.scrivitoStrings.right
import typings.scrivito.scrivitoStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.scrivito.mod.OptimizeForFit
  - typings.scrivito.mod.OptimizeForResize
*/
trait OptimizeDefinition extends StObject
object OptimizeDefinition {
  
  inline def OptimizeForFit(crop: center | top | left | right | bottom): typings.scrivito.mod.OptimizeForFit = {
    val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], fit = "crop")
    __obj.asInstanceOf[typings.scrivito.mod.OptimizeForFit]
  }
  
  inline def OptimizeForResize(): typings.scrivito.mod.OptimizeForResize = {
    val __obj = js.Dynamic.literal(fit = "resize")
    __obj.asInstanceOf[typings.scrivito.mod.OptimizeForResize]
  }
}
