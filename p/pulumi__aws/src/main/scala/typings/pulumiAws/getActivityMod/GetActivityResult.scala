package typings.pulumiAws.getActivityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetActivityResult extends js.Object {
  val arn: String = js.native
  /**
    * The date the activity was created.
    */
  val creationDate: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
}

object GetActivityResult {
  @scala.inline
  def apply(arn: String, creationDate: String, id: String, name: String): GetActivityResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActivityResult]
  }
}

