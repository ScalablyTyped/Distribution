package typings.reactNativeCommunityCliPluginMetro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collapse extends StObject {
  
  var collapse: Boolean
}
object Collapse {
  
  inline def apply(collapse: Boolean): Collapse = {
    val __obj = js.Dynamic.literal(collapse = collapse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collapse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collapse] (val x: Self) extends AnyVal {
    
    inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
  }
}
