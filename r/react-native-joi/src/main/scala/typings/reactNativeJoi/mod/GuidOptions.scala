package typings.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuidOptions extends js.Object {
  var version: js.Array[GuidVersions] | GuidVersions = js.native
}

object GuidOptions {
  @scala.inline
  def apply(version: js.Array[GuidVersions] | GuidVersions): GuidOptions = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuidOptions]
  }
  @scala.inline
  implicit class GuidOptionsOps[Self <: GuidOptions] (val x: Self) extends AnyVal {
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
    def setVersionVarargs(value: GuidVersions*): Self = this.set("version", js.Array(value :_*))
    @scala.inline
    def setVersion(value: js.Array[GuidVersions] | GuidVersions): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

