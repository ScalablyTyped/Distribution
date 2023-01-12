package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transparent extends StObject {
  
  var transparent: Boolean
}
object Transparent {
  
  inline def apply(transparent: Boolean): Transparent = {
    val __obj = js.Dynamic.literal(transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transparent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transparent] (val x: Self) extends AnyVal {
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
  }
}
