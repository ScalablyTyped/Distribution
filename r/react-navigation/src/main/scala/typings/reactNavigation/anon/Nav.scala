package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nav extends StObject {
  
  var nav: NavigationState | Null = js.native
}
object Nav {
  
  @scala.inline
  def apply(): Nav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nav]
  }
  
  @scala.inline
  implicit class NavMutableBuilder[Self <: Nav] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNav(value: NavigationState): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavNull: Self = StObject.set(x, "nav", null)
  }
}
