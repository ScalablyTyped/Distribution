package typings.reactNativeTabView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overscroll extends StObject {
  
  var overscroll: js.UndefOr[Boolean] = js.undefined
}
object Overscroll {
  
  @scala.inline
  def apply(): Overscroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overscroll]
  }
  
  @scala.inline
  implicit class OverscrollMutableBuilder[Self <: Overscroll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverscroll(value: Boolean): Self = StObject.set(x, "overscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscrollUndefined: Self = StObject.set(x, "overscroll", js.undefined)
  }
}
