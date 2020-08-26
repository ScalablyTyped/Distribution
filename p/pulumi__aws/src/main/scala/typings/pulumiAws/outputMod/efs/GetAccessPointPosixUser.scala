package typings.pulumiAws.outputMod.efs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessPointPosixUser extends js.Object {
  /**
    * Group ID
    */
  var gid: Double = js.native
  /**
    * Secondary group IDs
    */
  var secondaryGids: js.Array[Double] = js.native
  /**
    * User Id
    * * `rootDirectory`- Single element list containing information on the directory on the Amazon EFS file system that the access point provides access to.
    */
  var uid: Double = js.native
}

object GetAccessPointPosixUser {
  @scala.inline
  def apply(gid: Double, secondaryGids: js.Array[Double], uid: Double): GetAccessPointPosixUser = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], secondaryGids = secondaryGids.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointPosixUser]
  }
  @scala.inline
  implicit class GetAccessPointPosixUserOps[Self <: GetAccessPointPosixUser] (val x: Self) extends AnyVal {
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
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondaryGidsVarargs(value: Double*): Self = this.set("secondaryGids", js.Array(value :_*))
    @scala.inline
    def setSecondaryGids(value: js.Array[Double]): Self = this.set("secondaryGids", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
  
}

