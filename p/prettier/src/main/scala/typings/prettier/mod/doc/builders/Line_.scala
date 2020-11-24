package typings.prettier.mod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line_ extends _Doc {
  
  var hard: js.UndefOr[Boolean] = js.native
  
  var literal: js.UndefOr[Boolean] = js.native
  
  var soft: js.UndefOr[Boolean] = js.native
  
  var `type`: typings.prettier.prettierStrings.line = js.native
}
object Line_ {
  
  @scala.inline
  def apply(`type`: typings.prettier.prettierStrings.line): Line_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line_]
  }
  
  @scala.inline
  implicit class Line_Ops[Self <: Line_] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.prettier.prettierStrings.line): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHard(value: Boolean): Self = this.set("hard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHard: Self = this.set("hard", js.undefined)
    
    @scala.inline
    def setLiteral(value: Boolean): Self = this.set("literal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiteral: Self = this.set("literal", js.undefined)
    
    @scala.inline
    def setSoft(value: Boolean): Self = this.set("soft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoft: Self = this.set("soft", js.undefined)
  }
}
