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
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
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
    user: Input[String],
    domain: Input[String] = null,
    mountOptions: Input[LocationSmbMountOptions] = null,
    tags: Input[StringDictionary[_]] = null
  ): LocationSmbArgs = {
    val __obj = js.Dynamic.literal(agentArns = agentArns.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], serverHostname = serverHostname.asInstanceOf[js.Any], subdirectory = subdirectory.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (mountOptions != null) __obj.updateDynamic("mountOptions")(mountOptions.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationSmbArgs]
  }
}

