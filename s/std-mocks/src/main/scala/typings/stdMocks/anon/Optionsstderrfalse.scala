package typings.stdMocks.anon

import typings.stdMocks.stdMocksBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std-mocks.std-mocks.Options & {  stderr :false} */
@js.native
trait Optionsstderrfalse extends js.Object {
  
  var stderr: js.UndefOr[Boolean] with `false` = js.native
  
  var stdout: js.UndefOr[Boolean] = js.native
}
object Optionsstderrfalse {
  
  @scala.inline
  def apply(stderr: js.UndefOr[Boolean] with `false`): Optionsstderrfalse = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsstderrfalse]
  }
  
  @scala.inline
  implicit class OptionsstderrfalseOps[Self <: Optionsstderrfalse] (val x: Self) extends AnyVal {
    
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
    def setStderr(value: js.UndefOr[Boolean] with `false`): Self = this.set("stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdout(value: Boolean): Self = this.set("stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
  }
}
