package typings
package atPulumiAwsLib.datasyncNfsLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NfsLocationArgs extends js.Object {
  /**
    * Configuration block containing information for connecting to the NFS File System.
    */
  val onPremConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AgentArnsArray]
  /**
    * Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
    */
  val serverHostname: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
    */
  val subdirectory: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
    ]
  ] = js.undefined
}

