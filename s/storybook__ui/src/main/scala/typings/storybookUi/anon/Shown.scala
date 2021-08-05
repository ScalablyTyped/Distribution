package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shown extends StObject {
  
  var shown: Boolean
}
object Shown {
  
  inline def apply(shown: Boolean): Shown = {
    val __obj = js.Dynamic.literal(shown = shown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shown]
  }
  
  extension [Self <: Shown](x: Self) {
    
    inline def setShown(value: Boolean): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
  }
}
