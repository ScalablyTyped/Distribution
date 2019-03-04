package typings
package atPulumiAwsLib.datasyncNfsLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NfsLocationArgs extends js.Object {
  /**
    * Configuration block containing information for connecting to the NFS File System.
    */
  val onPremConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AgentArnsArray]
  /**
    * Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
    */
  val serverHostname: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
    */
  val subdirectory: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
}

object NfsLocationArgs {
  @scala.inline
  def apply(
    onPremConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AgentArnsArray],
    serverHostname: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    subdirectory: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    tags: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null
  ): NfsLocationArgs = {
    val __obj = js.Dynamic.literal(onPremConfig = onPremConfig.asInstanceOf[js.Any], serverHostname = serverHostname.asInstanceOf[js.Any], subdirectory = subdirectory.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NfsLocationArgs]
  }
}

