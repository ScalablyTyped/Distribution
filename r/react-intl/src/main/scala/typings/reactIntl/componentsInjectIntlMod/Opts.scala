package typings.reactIntl.componentsInjectIntlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Opts[IntlPropName /* <: String */, ForwardRef /* <: Boolean */] extends js.Object {
  
  var enforceContext: js.UndefOr[Boolean] = js.native
  
  var forwardRef: js.UndefOr[ForwardRef] = js.native
  
  var intlPropName: js.UndefOr[IntlPropName] = js.native
}
object Opts {
  
  @scala.inline
  def apply[IntlPropName /* <: String */, ForwardRef /* <: Boolean */](): Opts[IntlPropName, ForwardRef] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opts[IntlPropName, ForwardRef]]
  }
  
  @scala.inline
  implicit class OptsOps[Self <: Opts[_, _], IntlPropName /* <: String */, ForwardRef /* <: Boolean */] (val x: Self with (Opts[IntlPropName, ForwardRef])) extends AnyVal {
    
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
    def setEnforceContext(value: Boolean): Self = this.set("enforceContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceContext: Self = this.set("enforceContext", js.undefined)
    
    @scala.inline
    def setForwardRef(value: ForwardRef): Self = this.set("forwardRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardRef: Self = this.set("forwardRef", js.undefined)
    
    @scala.inline
    def setIntlPropName(value: IntlPropName): Self = this.set("intlPropName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntlPropName: Self = this.set("intlPropName", js.undefined)
  }
}
