package typings.atPulumiAws.rdsGetEventCategoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventCategoriesResult extends js.Object {
  /**
    * A list of the event categories.
    */
  val eventCategories: js.Array[String] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val sourceType: js.UndefOr[String] = js.native
}

object GetEventCategoriesResult {
  @scala.inline
  def apply(eventCategories: js.Array[String], id: String, sourceType: String = null): GetEventCategoriesResult = {
    val __obj = js.Dynamic.literal(eventCategories = eventCategories.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventCategoriesResult]
  }
}

