package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyResourceTypes extends js.Object {
  var resourceTypes: js.Array[java.lang.String]
  var schedules: js.Array[Anon_CopyTags]
  var targetTags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object Anon_KeyResourceTypes {
  @scala.inline
  def apply(
    resourceTypes: js.Array[java.lang.String],
    schedules: js.Array[Anon_CopyTags],
    targetTags: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): Anon_KeyResourceTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resourceTypes")(resourceTypes)
    __obj.updateDynamic("schedules")(schedules)
    __obj.updateDynamic("targetTags")(targetTags)
    __obj.asInstanceOf[Anon_KeyResourceTypes]
  }
}

