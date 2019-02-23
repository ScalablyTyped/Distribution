package typings
package atPulumiAwsLib.sesReceiptFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptFilterArgs extends js.Object {
  /**
    * The IP address or address range to filter, in CIDR notation
    */
  val cidr: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the filter
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Block or Allow
    */
  val policy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

