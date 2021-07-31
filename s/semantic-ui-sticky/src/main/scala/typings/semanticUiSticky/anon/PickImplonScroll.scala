package typings.semanticUiSticky.anon

import typings.semanticUiSticky.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'onScroll'> */
trait PickImplonScroll extends StObject {
  
  def onScroll(): Unit
  @JSName("onScroll")
  var onScroll_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonScroll {
  
  @scala.inline
  def apply(onScroll: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonScroll = {
    val __obj = js.Dynamic.literal(onScroll = onScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonScroll]
  }
  
  @scala.inline
  implicit class PickImplonScrollMutableBuilder[Self <: PickImplonScroll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnScroll(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
  }
}
