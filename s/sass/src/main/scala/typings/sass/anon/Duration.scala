package typings.sass.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  /**
    * `end - start`
    */
  var duration: Double = js.native
  /**
    * `Date.now()` after the compilation.
    */
  var end: Double = js.native
  /**
    * The path to the scss file, or `data` if the source was not a file.
    */
  var entry: String = js.native
  /**
    * Absolute paths to all related files in no particular order.
    */
  var includedFiles: js.Array[String] = js.native
  /**
    * `Date.now()` before the compilation.
    */
  var start: Double = js.native
}

object Duration {
  @scala.inline
  def apply(duration: Double, end: Double, entry: String, includedFiles: js.Array[String], start: Double): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], includedFiles = includedFiles.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntry(value: String): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludedFilesVarargs(value: String*): Self = this.set("includedFiles", js.Array(value :_*))
    @scala.inline
    def setIncludedFiles(value: js.Array[String]): Self = this.set("includedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

