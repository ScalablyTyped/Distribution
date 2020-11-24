package typings.reactWidgets.commonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactWidgetsCommonProps extends js.Object {
  
  /**
    * Disable the widget, if an Array of values is passed in only those values will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean | js.Array[_]] = js.native
  
  /**
    * Used to label and annotate aria- attributes
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Mark whether the SelectList should render right-to-left. This property can also be
    * implicitly passed to the widget through a childContext prop (isRtl) this allows higher
    * level application components to specify the direction.
    * @default false
    */
  var isRtl: js.UndefOr[Boolean] = js.native
  
  /**
    * Place the widget in a read-only mode, If an Array of values is passed in only those
    * values will be read-only.
    * @default false
    */
  var readOnly: js.UndefOr[Boolean | js.Array[_]] = js.native
}
object ReactWidgetsCommonProps {
  
  @scala.inline
  def apply(): ReactWidgetsCommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactWidgetsCommonProps]
  }
  
  @scala.inline
  implicit class ReactWidgetsCommonPropsOps[Self <: ReactWidgetsCommonProps] (val x: Self) extends AnyVal {
    
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
    def setDisabledVarargs(value: js.Any*): Self = this.set("disabled", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: Boolean | js.Array[_]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsRtl(value: Boolean): Self = this.set("isRtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRtl: Self = this.set("isRtl", js.undefined)
    
    @scala.inline
    def setReadOnlyVarargs(value: js.Any*): Self = this.set("readOnly", js.Array(value :_*))
    
    @scala.inline
    def setReadOnly(value: Boolean | js.Array[_]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
  }
}
