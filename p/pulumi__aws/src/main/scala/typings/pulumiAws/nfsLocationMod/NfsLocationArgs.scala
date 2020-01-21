package typings.pulumiAws.nfsLocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.datasync.NfsLocationOnPremConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NfsLocationArgs extends js.Object {
  /**
    * Configuration block containing information for connecting to the NFS File System.
    */
  val onPremConfig: Input[NfsLocationOnPremConfig] = js.native
  /**
    * Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
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
}

object NfsLocationArgs {
  @scala.inline
  def apply(
    onPremConfig: Input[NfsLocationOnPremConfig],
    serverHostname: Input[String],
    subdirectory: Input[String],
    tags: Input[StringDictionary[Input[String]]] = null
  ): NfsLocationArgs = {
    val __obj = js.Dynamic.literal(onPremConfig = onPremConfig.asInstanceOf[js.Any], serverHostname = serverHostname.asInstanceOf[js.Any], subdirectory = subdirectory.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NfsLocationArgs]
  }
}

