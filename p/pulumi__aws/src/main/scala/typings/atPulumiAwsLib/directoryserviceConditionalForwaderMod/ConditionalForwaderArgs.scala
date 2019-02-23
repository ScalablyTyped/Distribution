package typings
package atPulumiAwsLib.directoryserviceConditionalForwaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalForwaderArgs extends js.Object {
  /**
    * The id of directory.
    */
  val directoryId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A list of forwarder IP addresses.
    */
  val dnsIps: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * The fully qualified domain name of the remote domain for which forwarders will be used.
    */
  val remoteDomainName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

