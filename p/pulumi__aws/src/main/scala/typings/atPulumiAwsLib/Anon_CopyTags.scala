package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CopyTags extends js.Object {
  var copyTags: scala.Boolean
  var createRule: Anon_IntervalIntervalUnit
  var name: java.lang.String
  var retainRule: Anon_Count
  var tagsToAdd: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object Anon_CopyTags {
  @scala.inline
  def apply(
    copyTags: scala.Boolean,
    createRule: Anon_IntervalIntervalUnit,
    name: java.lang.String,
    retainRule: Anon_Count,
    tagsToAdd: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_CopyTags = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copyTags")(copyTags)
    __obj.updateDynamic("createRule")(createRule)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("retainRule")(retainRule)
    if (tagsToAdd != null) __obj.updateDynamic("tagsToAdd")(tagsToAdd)
    __obj.asInstanceOf[Anon_CopyTags]
  }
}

