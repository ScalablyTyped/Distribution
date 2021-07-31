package typings.semanticUiSticky.anon

import typings.semanticUiSticky.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'onUnstick'> */
trait PickImplonUnstick extends StObject {
  
  def onUnstick(): Unit
  @JSName("onUnstick")
  var onUnstick_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonUnstick {
  
  @scala.inline
  def apply(onUnstick: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonUnstick = {
    val __obj = js.Dynamic.literal(onUnstick = onUnstick.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonUnstick]
  }
  
  @scala.inline
  implicit class PickImplonUnstickMutableBuilder[Self <: PickImplonUnstick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnUnstick(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onUnstick", value.asInstanceOf[js.Any])
  }
}
