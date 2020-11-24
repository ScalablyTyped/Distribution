package typings.reactDocgenTypescript.externalPropsComponentPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalOptionalComponentProps extends js.Object {
  
  /** prop1 description */
  var prop1: js.UndefOr[String] = js.native
}
object ExternalOptionalComponentProps {
  
  @scala.inline
  def apply(): ExternalOptionalComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalOptionalComponentProps]
  }
  
  @scala.inline
  implicit class ExternalOptionalComponentPropsOps[Self <: ExternalOptionalComponentProps] (val x: Self) extends AnyVal {
    
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
    def setProp1(value: String): Self = this.set("prop1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProp1: Self = this.set("prop1", js.undefined)
  }
}
