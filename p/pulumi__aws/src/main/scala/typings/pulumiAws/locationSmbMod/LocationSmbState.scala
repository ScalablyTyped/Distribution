package typings.pulumiAws.locationSmbMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.datasync.LocationSmbMountOptions
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationSmbState extends js.Object {
  /**
    * A list of DataSync Agent ARNs with which this location will be associated.
    */
  val agentArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: js.UndefOr[Input[String]] = js.native
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
  val password: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the IP address or DNS name of the SMB server. The DataSync Agent(s) use this to mount the SMB share.
    */
  val serverHostname: js.UndefOr[Input[String]] = js.native
  /**
    * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
    */
  val subdirectory: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  val uri: js.UndefOr[Input[String]] = js.native
  /**
    * The user who can mount the share and has file and folder permissions in the SMB share.
    */
  val user: js.UndefOr[Input[String]] = js.native
}

object LocationSmbState {
  @scala.inline
  def apply(
    agentArns: Input[js.Array[Input[String]]] = null,
    arn: Input[String] = null,
    domain: Input[String] = null,
    mountOptions: Input[LocationSmbMountOptions] = null,
    password: Input[String] = null,
    serverHostname: Input[String] = null,
    subdirectory: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    uri: Input[String] = null,
    user: Input[String] = null
  ): LocationSmbState = {
    val __obj = js.Dynamic.literal()
    if (agentArns != null) __obj.updateDynamic("agentArns")(agentArns.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (mountOptions != null) __obj.updateDynamic("mountOptions")(mountOptions.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (serverHostname != null) __obj.updateDynamic("serverHostname")(serverHostname.asInstanceOf[js.Any])
    if (subdirectory != null) __obj.updateDynamic("subdirectory")(subdirectory.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationSmbState]
  }
}

