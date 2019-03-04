package typings
package atPulumiAwsLib.getAmiIdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAmiIdsResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val ids: js.Array[java.lang.String]
}

object GetAmiIdsResult {
  @scala.inline
  def apply(id: java.lang.String, ids: js.Array[java.lang.String]): GetAmiIdsResult = {
    val __obj = js.Dynamic.literal(id = id, ids = ids)
  
    __obj.asInstanceOf[GetAmiIdsResult]
  }
}

