package typings.pulumiAws.locationSmbMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.datasync.LocationSmbMountOptions
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationSmbArgs extends js.Object {
  /**
    * A list of DataSync Agent ARNs with which this location will be associated.
    */
  val agentArns: Input[js.Array[Input[String]]] = js.native
  /**
    * The name of the Windows domain the SMB server belongs to.
    */
  val domain: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block containing mount options used by DataSync to access the SMB Server. Can be `AUTOMATIC`, `SMB2`, or `SMB3`.
    */
  val mountOptions: js.UndefOr[Input[LocationSmbMountOptions]] = js.native
  /**
    * The password of the user who can mount the share and has file permissions in the SMB.
    */
  val password: Input[String] = js.native
  /**
    * Specifies the IP address or DNS name of the SMB server. The DataSync Agent(s) use this to mount the SMB share.
    */
  val serverHostname: Input[String] = js.native
  /**
    * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
    */
  val subdirectory: Input[String] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The user who can mount the share and has file and folder permissions in the SMB share.
    */
  val user: Input[String] = js.native
}

object LocationSmbArgs {
  @scala.inline
  def apply(
    agentArns: Input[js.Array[Input[String]]],
    password: Input[String],
    serverHostname: Input[String],
    subdirectory: Input[String],
    user: Input[String]
  ): LocationSmbArgs = {
    val __obj = js.Dynamic.literal(agentArns = agentArns.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], serverHostname = serverHostname.asInstanceOf[js.Any], subdirectory = subdirectory.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationSmbArgs]
  }
  @scala.inline
  implicit class LocationSmbArgsOps[Self <: LocationSmbArgs] (val x: Self) extends AnyVal {
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
    def setAgentArnsVarargs(value: Input[String]*): Self = this.set("agentArns", js.Array(value :_*))
    @scala.inline
    def setAgentArns(value: Input[js.Array[Input[String]]]): Self = this.set("agentArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: Input[String]): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerHostname(value: Input[String]): Self = this.set("serverHostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubdirectory(value: Input[String]): Self = this.set("subdirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: Input[String]): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: Input[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setMountOptions(value: Input[LocationSmbMountOptions]): Self = this.set("mountOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountOptions: Self = this.set("mountOptions", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

