package typings.pulumiAws.nfsLocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.datasync.NfsLocationOnPremConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NfsLocationState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block containing information for connecting to the NFS File System.
    */
  val onPremConfig: js.UndefOr[Input[NfsLocationOnPremConfig]] = js.native
  /**
    * Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
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
}

object NfsLocationState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    onPremConfig: Input[NfsLocationOnPremConfig] = null,
    serverHostname: Input[String] = null,
    subdirectory: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    uri: Input[String] = null
  ): NfsLocationState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (onPremConfig != null) __obj.updateDynamic("onPremConfig")(onPremConfig.asInstanceOf[js.Any])
    if (serverHostname != null) __obj.updateDynamic("serverHostname")(serverHostname.asInstanceOf[js.Any])
    if (subdirectory != null) __obj.updateDynamic("subdirectory")(subdirectory.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[NfsLocationState]
  }
}

