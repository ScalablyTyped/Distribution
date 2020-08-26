package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attrs1 extends js.Object {
  var attrs1: String = js.native
  var attrs2: js.UndefOr[String] = js.native
  var dir1: String = js.native
  var dir2: js.UndefOr[String] = js.native
  var pt: Double | String = js.native
}

object Attrs1 {
  @scala.inline
  def apply(attrs1: String, dir1: String, pt: Double | String): Attrs1 = {
    val __obj = js.Dynamic.literal(attrs1 = attrs1.asInstanceOf[js.Any], dir1 = dir1.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs1]
  }
  @scala.inline
  implicit class Attrs1Ops[Self <: Attrs1] (val x: Self) extends AnyVal {
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
    def setAttrs1(value: String): Self = this.set("attrs1", value.asInstanceOf[js.Any])
    @scala.inline
    def setDir1(value: String): Self = this.set("dir1", value.asInstanceOf[js.Any])
    @scala.inline
    def setPt(value: Double | String): Self = this.set("pt", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttrs2(value: String): Self = this.set("attrs2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs2: Self = this.set("attrs2", js.undefined)
    @scala.inline
    def setDir2(value: String): Self = this.set("dir2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir2: Self = this.set("dir2", js.undefined)
  }
  
}

