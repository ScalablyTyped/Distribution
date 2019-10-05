package typings.atPulumiAws.datasyncNfsLocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.datasync.NfsLocationOnPremConfig
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NfsLocationState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configuration block containing information for connecting to the NFS File System.
    */
  val onPremConfig: js.UndefOr[Input[NfsLocationOnPremConfig]] = js.undefined
  /**
    * Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
    */
  val serverHostname: js.UndefOr[Input[String]] = js.undefined
  /**
    * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
    */
  val subdirectory: js.UndefOr[Input[String]] = js.undefined
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  val uri: js.UndefOr[Input[String]] = js.undefined
}

object NfsLocationState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    onPremConfig: Input[NfsLocationOnPremConfig] = null,
    serverHostname: Input[String] = null,
    subdirectory: Input[String] = null,
    tags: Input[StringDictionary[Input[String]]] = null,
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

