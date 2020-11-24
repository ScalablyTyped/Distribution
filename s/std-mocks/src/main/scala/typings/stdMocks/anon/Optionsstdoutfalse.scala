package typings.stdMocks.anon

import typings.stdMocks.stdMocksBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std-mocks.std-mocks.Options & {  stdout :false} */
@js.native
trait Optionsstdoutfalse extends js.Object {
  
  var stderr: js.UndefOr[Boolean] = js.native
  
  var stdout: js.UndefOr[Boolean] with `false` = js.native
}
object Optionsstdoutfalse {
  
  @scala.inline
  def apply(stdout: js.UndefOr[Boolean] with `false`): Optionsstdoutfalse = {
    val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsstdoutfalse]
  }
  
  @scala.inline
  implicit class OptionsstdoutfalseOps[Self <: Optionsstdoutfalse] (val x: Self) extends AnyVal {
    
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
    def setStdout(value: js.UndefOr[Boolean] with `false`): Self = this.set("stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderr(value: Boolean): Self = this.set("stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
  }
}
