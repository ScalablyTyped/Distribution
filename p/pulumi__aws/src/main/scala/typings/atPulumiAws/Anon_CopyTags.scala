package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CopyTags extends js.Object {
  var copyTags: Boolean
  var createRule: Anon_IntervalIntervalUnit
  var name: String
  var retainRule: Anon_Count
  var tagsToAdd: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Anon_CopyTags {
  @scala.inline
  def apply(
    copyTags: Boolean,
    createRule: Anon_IntervalIntervalUnit,
    name: String,
    retainRule: Anon_Count,
    tagsToAdd: StringDictionary[js.Any] = null
  ): Anon_CopyTags = {
    val __obj = js.Dynamic.literal(copyTags = copyTags, createRule = createRule, name = name, retainRule = retainRule)
    if (tagsToAdd != null) __obj.updateDynamic("tagsToAdd")(tagsToAdd)
    __obj.asInstanceOf[Anon_CopyTags]
  }
}

