package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyResourceTypesSchedules extends js.Object {
  var resourceTypes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var schedules: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_CopyTagsCreateRule]]]
  var targetTags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
}

object Anon_KeyResourceTypesSchedules {
  @scala.inline
  def apply(
    resourceTypes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    schedules: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_CopyTagsCreateRule]]],
    targetTags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ): Anon_KeyResourceTypesSchedules = {
    val __obj = js.Dynamic.literal(resourceTypes = resourceTypes.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], targetTags = targetTags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyResourceTypesSchedules]
  }
}

