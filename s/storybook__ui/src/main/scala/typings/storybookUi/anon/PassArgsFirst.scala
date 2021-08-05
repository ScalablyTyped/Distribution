package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PassArgsFirst extends StObject {
  
  var passArgsFirst: Boolean
}
object PassArgsFirst {
  
  inline def apply(passArgsFirst: Boolean): PassArgsFirst = {
    val __obj = js.Dynamic.literal(passArgsFirst = passArgsFirst.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassArgsFirst]
  }
  
  extension [Self <: PassArgsFirst](x: Self) {
    
    inline def setPassArgsFirst(value: Boolean): Self = StObject.set(x, "passArgsFirst", value.asInstanceOf[js.Any])
  }
}
