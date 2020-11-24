package typings.stdMocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stdout extends js.Object {
  
  var stdout: js.Array[String] = js.native
}
object Stdout {
  
  @scala.inline
  def apply(stdout: js.Array[String]): Stdout = {
    val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stdout]
  }
  
  @scala.inline
  implicit class StdoutOps[Self <: Stdout] (val x: Self) extends AnyVal {
    
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
    def setStdoutVarargs(value: String*): Self = this.set("stdout", js.Array(value :_*))
    
    @scala.inline
    def setStdout(value: js.Array[String]): Self = this.set("stdout", value.asInstanceOf[js.Any])
  }
}
