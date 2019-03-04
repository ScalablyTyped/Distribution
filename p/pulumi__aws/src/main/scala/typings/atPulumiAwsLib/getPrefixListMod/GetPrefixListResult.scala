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
}

object GetPrefixListResult {
  @scala.inline
  def apply(cidrBlocks: js.Array[java.lang.String], id: java.lang.String, name: java.lang.String): GetPrefixListResult = {
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks, id = id, name = name)
  
    __obj.asInstanceOf[GetPrefixListResult]
  }
}

