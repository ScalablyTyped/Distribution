package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetOnNavigation extends StObject {
  
  var resetOnNavigation: js.UndefOr[Boolean] = js.undefined
}
object ResetOnNavigation {
  
  @scala.inline
  def apply(): ResetOnNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetOnNavigation]
  }
  
  @scala.inline
  implicit class ResetOnNavigationMutableBuilder[Self <: ResetOnNavigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResetOnNavigation(value: Boolean): Self = StObject.set(x, "resetOnNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetOnNavigationUndefined: Self = StObject.set(x, "resetOnNavigation", js.undefined)
  }
}
