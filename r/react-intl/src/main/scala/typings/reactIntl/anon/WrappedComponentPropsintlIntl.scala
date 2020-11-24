package typings.reactIntl.anon

import typings.reactIntl.srcTypesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-intl.react-intl/src/components/injectIntl.WrappedComponentProps<'intl'> */
@js.native
trait WrappedComponentPropsintlIntl extends js.Object {
  
  var intl: IntlShape = js.native
}
object WrappedComponentPropsintlIntl {
  
  @scala.inline
  def apply(intl: IntlShape): WrappedComponentPropsintlIntl = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponentPropsintlIntl]
  }
  
  @scala.inline
  implicit class WrappedComponentPropsintlIntlOps[Self <: WrappedComponentPropsintlIntl] (val x: Self) extends AnyVal {
    
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
    def setIntl(value: IntlShape): Self = this.set("intl", value.asInstanceOf[js.Any])
  }
}
