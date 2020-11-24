package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlState extends js.Object {
  
  var ast: JsxAST | Null = js.native
}
object XmlState {
  
  @scala.inline
  def apply(): XmlState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlState]
  }
  
  @scala.inline
  implicit class XmlStateOps[Self <: XmlState] (val x: Self) extends AnyVal {
    
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
    def setAst(value: JsxAST): Self = this.set("ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstNull: Self = this.set("ast", null)
  }
}
