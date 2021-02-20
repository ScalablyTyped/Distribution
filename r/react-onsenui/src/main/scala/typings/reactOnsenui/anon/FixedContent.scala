package typings.reactOnsenui.anon

import typings.reactOnsenui.mod.PullHookChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedContent extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var fixedContent: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* e */ PullHookChangeEvent, Unit]] = js.native
  
  var onLoad: js.UndefOr[js.Function1[/* done */ js.Function0[Unit], Unit]] = js.native
  
  var onPull: js.UndefOr[js.Function0[Unit]] = js.native
  
  var thresholdHeight: js.UndefOr[Double] = js.native
}
object FixedContent {
  
  @scala.inline
  def apply(): FixedContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedContent]
  }
  
  @scala.inline
  implicit class FixedContentMutableBuilder[Self <: FixedContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFixedContent(value: Boolean): Self = StObject.set(x, "fixedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedContentUndefined: Self = StObject.set(x, "fixedContent", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ PullHookChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* done */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnPull(value: () => Unit): Self = StObject.set(x, "onPull", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPullUndefined: Self = StObject.set(x, "onPull", js.undefined)
    
    @scala.inline
    def setThresholdHeight(value: Double): Self = StObject.set(x, "thresholdHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdHeightUndefined: Self = StObject.set(x, "thresholdHeight", js.undefined)
  }
}
