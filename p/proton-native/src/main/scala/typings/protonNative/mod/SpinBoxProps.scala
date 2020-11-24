package typings.protonNative.mod

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
  implicit class SpinBoxPropsOps[Self <: SpinBoxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
