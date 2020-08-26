package typings.pulumiAws.inputMod.efs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointPosixUser extends js.Object {
  /**
    * The POSIX group ID used for all file system operations using this access point.
    */
  var gid: Input[Double] = js.native
  /**
    * Secondary POSIX group IDs used for all file system operations using this access point.
    */
  var secondaryGids: js.UndefOr[Input[js.Array[Input[Double]]]] = js.native
  /**
    * The POSIX user ID used for all file system operations using this access point.
    */
  var uid: Input[Double] = js.native
}

object AccessPointPosixUser {
  @scala.inline
  def apply(gid: Input[Double], uid: Input[Double]): AccessPointPosixUser = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPointPosixUser]
  }
  @scala.inline
  implicit class AccessPointPosixUserOps[Self <: AccessPointPosixUser] (val x: Self) extends AnyVal {
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
    def setGid(value: Input[Double]): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: Input[Double]): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondaryGidsVarargs(value: Input[Double]*): Self = this.set("secondaryGids", js.Array(value :_*))
    @scala.inline
    def setSecondaryGids(value: Input[js.Array[Input[Double]]]): Self = this.set("secondaryGids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryGids: Self = this.set("secondaryGids", js.undefined)
  }
  
}

