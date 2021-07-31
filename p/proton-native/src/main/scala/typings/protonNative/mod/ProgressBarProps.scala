package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBarProps
  extends StObject
     with GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * Whether the ProgressBar is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current value of the ProgressBar (0-100). A value of -1 indicates an indeterminate progressbar.
    */
  var value: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the ProgressBar can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ProgressBarProps {
  
  @scala.inline
  def apply(): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarProps]
  }
  
  @scala.inline
  implicit class ProgressBarPropsMutableBuilder[Self <: ProgressBarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
