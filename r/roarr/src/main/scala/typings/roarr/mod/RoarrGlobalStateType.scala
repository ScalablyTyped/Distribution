package typings.roarr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoarrGlobalStateType extends WriterType {
  var sequence: Double = js.native
  var versions: js.Array[String] = js.native
}

object RoarrGlobalStateType {
  @scala.inline
  def apply(sequence: Double, versions: js.Array[String], write: String => Unit): RoarrGlobalStateType = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[RoarrGlobalStateType]
  }
  @scala.inline
  implicit class RoarrGlobalStateTypeOps[Self <: RoarrGlobalStateType] (val x: Self) extends AnyVal {
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
    def setSequence(value: Double): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionsVarargs(value: String*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[String]): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
  
}

