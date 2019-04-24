package typings
package atPulumiAwsLib.getPrefixListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPrefixListResult extends js.Object {
  /**
    * The list of CIDR blocks for the AWS service associated
    * with the prefix list.
    */
  val cidrBlocks: js.Array[java.lang.String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The name of the selected prefix list.
    */
  val name: java.lang.String
  val prefixListId: js.UndefOr[java.lang.String] = js.undefined
}

object GetPrefixListResult {
  @scala.inline
  def apply(
    cidrBlocks: js.Array[java.lang.String],
    id: java.lang.String,
    name: java.lang.String,
    prefixListId: java.lang.String = null
  ): GetPrefixListResult = {
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks, id = id, name = name)
    if (prefixListId != null) __obj.updateDynamic("prefixListId")(prefixListId)
    __obj.asInstanceOf[GetPrefixListResult]
  }
}

