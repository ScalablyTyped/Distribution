package typings.reactOnsenui.anon

import typings.reactOnsenui.mod.PullHookChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedContent extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var fixedContent: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* e */ PullHookChangeEvent, Unit]] = js.undefined
  
  var onLoad: js.UndefOr[js.Function1[/* done */ js.Function0[Unit], Unit]] = js.undefined
  
  var onPull: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var thresholdHeight: js.UndefOr[Double] = js.undefined
}
object FixedContent {
  
  inline def apply(): FixedContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FixedContent] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFixedContent(value: Boolean): Self = StObject.set(x, "fixedContent", value.asInstanceOf[js.Any])
    
    inline def setFixedContentUndefined: Self = StObject.set(x, "fixedContent", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOnChange(value: /* e */ PullHookChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnLoad(value: /* done */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnPull(value: () => Unit): Self = StObject.set(x, "onPull", js.Any.fromFunction0(value))
    
    inline def setOnPullUndefined: Self = StObject.set(x, "onPull", js.undefined)
    
    inline def setThresholdHeight(value: Double): Self = StObject.set(x, "thresholdHeight", value.asInstanceOf[js.Any])
    
    inline def setThresholdHeightUndefined: Self = StObject.set(x, "thresholdHeight", js.undefined)
  }
}
