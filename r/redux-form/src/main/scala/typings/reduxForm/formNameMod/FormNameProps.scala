package typings.reduxForm.formNameMod

import typings.react.mod.ReactNode
import typings.reduxForm.anon.Form
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormNameProps extends js.Object {
  
  def children(props: Form): ReactNode = js.native
}
object FormNameProps {
  
  @scala.inline
  def apply(children: Form => ReactNode): FormNameProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[FormNameProps]
  }
  
  @scala.inline
  implicit class FormNamePropsOps[Self <: FormNameProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: Form => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
  }
}
