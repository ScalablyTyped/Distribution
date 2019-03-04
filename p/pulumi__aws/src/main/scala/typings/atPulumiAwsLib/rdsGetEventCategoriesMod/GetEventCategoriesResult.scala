package typings
package atPulumiAwsLib.rdsGetEventCategoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEventCategoriesResult extends js.Object {
  /**
    * A list of the event categories.
    */
  val eventCategories: js.Array[java.lang.String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetEventCategoriesResult {
  @scala.inline
  def apply(eventCategories: js.Array[java.lang.String], id: java.lang.String): GetEventCategoriesResult = {
    val __obj = js.Dynamic.literal(eventCategories = eventCategories, id = id)
  
    __obj.asInstanceOf[GetEventCategoriesResult]
  }
}

