package typings.stdMocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std-mocks.std-mocks.Options & {  print :boolean | undefined} */
@js.native
trait Optionsprintbooleanundefi extends js.Object {
  
  var print: js.UndefOr[Boolean] = js.native
  
  var stderr: js.UndefOr[Boolean] = js.native
  
  var stdout: js.UndefOr[Boolean] = js.native
}
object Optionsprintbooleanundefi {
  
  @scala.inline
  def apply(): Optionsprintbooleanundefi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optionsprintbooleanundefi]
  }
  
  @scala.inline
  implicit class OptionsprintbooleanundefiOps[Self <: Optionsprintbooleanundefi] (val x: Self) extends AnyVal {
    
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
    def setPrint(value: Boolean): Self = this.set("print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    
    @scala.inline
    def setStderr(value: Boolean): Self = this.set("stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    
    @scala.inline
    def setStdout(value: Boolean): Self = this.set("stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
  }
}
