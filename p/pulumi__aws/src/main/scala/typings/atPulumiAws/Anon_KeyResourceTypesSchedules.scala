package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyResourceTypesSchedules extends js.Object {
  var resourceTypes: Input[js.Array[Input[String]]]
  var schedules: Input[js.Array[Input[Anon_CopyTagsCreateRule]]]
  var targetTags: Input[StringDictionary[_]]
}

object Anon_KeyResourceTypesSchedules {
  @scala.inline
  def apply(
    resourceTypes: Input[js.Array[Input[String]]],
    schedules: Input[js.Array[Input[Anon_CopyTagsCreateRule]]],
    targetTags: Input[StringDictionary[_]]
  ): Anon_KeyResourceTypesSchedules = {
    val __obj = js.Dynamic.literal(resourceTypes = resourceTypes.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], targetTags = targetTags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyResourceTypesSchedules]
  }
}

