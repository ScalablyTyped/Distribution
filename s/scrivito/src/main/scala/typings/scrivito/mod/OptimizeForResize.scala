package typings.scrivito.mod

import typings.scrivito.scrivitoStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizeForResize
  extends StObject
     with OptimizeFor
     with OptimizeDefinition {
  
  var fit: resize
}
object OptimizeForResize {
  
  inline def apply(): OptimizeForResize = {
    val __obj = js.Dynamic.literal(fit = "resize")
    __obj.asInstanceOf[OptimizeForResize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptimizeForResize] (val x: Self) extends AnyVal {
    
    inline def setFit(value: resize): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
  }
}
