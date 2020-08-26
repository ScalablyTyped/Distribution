package typings.stdMocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StderrStdout extends js.Object {
  var stderr: js.Array[String] = js.native
  var stdout: js.Array[String] = js.native
}

object StderrStdout {
  @scala.inline
  def apply(stderr: js.Array[String], stdout: js.Array[String]): StderrStdout = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StderrStdout]
  }
  @scala.inline
  implicit class StderrStdoutOps[Self <: StderrStdout] (val x: Self) extends AnyVal {
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
    def setStderrVarargs(value: String*): Self = this.set("stderr", js.Array(value :_*))
    @scala.inline
    def setStderr(value: js.Array[String]): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdoutVarargs(value: String*): Self = this.set("stdout", js.Array(value :_*))
    @scala.inline
    def setStdout(value: js.Array[String]): Self = this.set("stdout", value.asInstanceOf[js.Any])
  }
  
}

