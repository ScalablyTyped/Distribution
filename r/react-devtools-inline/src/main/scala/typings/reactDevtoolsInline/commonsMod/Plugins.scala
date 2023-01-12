package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugins extends StObject {
  
  var stylex: StyleXPlugin | Null
}
object Plugins {
  
  inline def apply(): Plugins = {
    val __obj = js.Dynamic.literal(stylex = null)
    __obj.asInstanceOf[Plugins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
    
    inline def setStylex(value: StyleXPlugin): Self = StObject.set(x, "stylex", value.asInstanceOf[js.Any])
    
    inline def setStylexNull: Self = StObject.set(x, "stylex", null)
  }
}
