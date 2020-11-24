package typings.protractor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpecName extends js.Object {
  
  var specName: js.UndefOr[String] = js.native
  
  var stackTrace: js.UndefOr[String] = js.native
}
object SpecName {
  
  @scala.inline
  def apply(): SpecName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecName]
  }
  
  @scala.inline
  implicit class SpecNameOps[Self <: SpecName] (val x: Self) extends AnyVal {
    
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
    def setSpecName(value: String): Self = this.set("specName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecName: Self = this.set("specName", js.undefined)
    
    @scala.inline
    def setStackTrace(value: String): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackTrace: Self = this.set("stackTrace", js.undefined)
  }
}
