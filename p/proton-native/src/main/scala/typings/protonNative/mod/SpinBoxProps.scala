package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpinBoxProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * Whether the Spinbox is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * When the Spinbox value is changed. The current value is passed as a parameter.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  /**
    * What the value of the Spinbox is set to.
    */
  var value: js.UndefOr[Double] = js.native
  
  /**
    * Whether the Spinbox can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object SpinBoxProps {
  
  @scala.inline
  def apply(): SpinBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinBoxProps]
  }
  
  @scala.inline
  implicit class SpinBoxPropsMutableBuilder[Self <: SpinBoxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
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
