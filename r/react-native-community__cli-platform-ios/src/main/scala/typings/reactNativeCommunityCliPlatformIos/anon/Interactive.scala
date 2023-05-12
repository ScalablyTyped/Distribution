package typings.reactNativeCommunityCliPlatformIos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interactive extends StObject {
  
  var interactive: Boolean
}
object Interactive {
  
  inline def apply(interactive: Boolean): Interactive = {
    val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interactive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interactive] (val x: Self) extends AnyVal {
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
  }
}
