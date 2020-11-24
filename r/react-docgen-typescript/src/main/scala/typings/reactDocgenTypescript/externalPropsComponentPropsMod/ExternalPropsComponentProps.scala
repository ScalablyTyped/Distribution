package typings.reactDocgenTypescript.externalPropsComponentPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalPropsComponentProps extends js.Object {
  
  /** prop1 description */
  var prop1: String = js.native
}
object ExternalPropsComponentProps {
  
  @scala.inline
  def apply(prop1: String): ExternalPropsComponentProps = {
    val __obj = js.Dynamic.literal(prop1 = prop1.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalPropsComponentProps]
  }
  
  @scala.inline
  implicit class ExternalPropsComponentPropsOps[Self <: ExternalPropsComponentProps] (val x: Self) extends AnyVal {
    
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
  }
}
