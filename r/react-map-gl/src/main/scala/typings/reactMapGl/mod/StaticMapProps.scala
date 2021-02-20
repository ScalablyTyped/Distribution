package typings.reactMapGl.mod

import typings.reactMapGl.anon.Height
import typings.reactMapGl.anon.MaxPitch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticMapProps extends MapboxProps {
  
  var className: js.UndefOr[String] = js.native
  
  var disableTokenWarning: js.UndefOr[Boolean] = js.native
  
  var onResize: js.UndefOr[js.Function1[/* dimensions */ Height, Unit]] = js.native
  
  var preventStyleDiffing: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var visibilityConstraints: js.UndefOr[MaxPitch] = js.native
}
object StaticMapProps {
  
  @scala.inline
  def apply(height: Double | String, width: Double | String): StaticMapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapProps]
  }
  
  @scala.inline
  implicit class StaticMapPropsMutableBuilder[Self <: StaticMapProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDisableTokenWarning(value: Boolean): Self = StObject.set(x, "disableTokenWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTokenWarningUndefined: Self = StObject.set(x, "disableTokenWarning", js.undefined)
    
    @scala.inline
    def setOnResize(value: /* dimensions */ Height => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    @scala.inline
    def setPreventStyleDiffing(value: Boolean): Self = StObject.set(x, "preventStyleDiffing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventStyleDiffingUndefined: Self = StObject.set(x, "preventStyleDiffing", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setVisibilityConstraints(value: MaxPitch): Self = StObject.set(x, "visibilityConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityConstraintsUndefined: Self = StObject.set(x, "visibilityConstraints", js.undefined)
  }
}
