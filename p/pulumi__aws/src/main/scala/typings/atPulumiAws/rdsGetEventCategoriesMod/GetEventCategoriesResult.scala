package typings.atPulumiAws.rdsGetEventCategoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEventCategoriesResult extends js.Object {
  /**
    * A list of the event categories.
    */
  val eventCategories: js.Array[String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val sourceType: js.UndefOr[String] = js.undefined
}

object GetEventCategoriesResult {
  @scala.inline
  def apply(eventCategories: js.Array[String], id: String, sourceType: String = null): GetEventCategoriesResult = {
    val __obj = js.Dynamic.literal(eventCategories = eventCategories, id = id)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    __obj.asInstanceOf[GetEventCategoriesResult]
  }
}

