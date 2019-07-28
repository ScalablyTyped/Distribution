package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyResourceTypeTags extends js.Object {
  var resourceType: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Anon_KeyResourceTypeTags {
  @scala.inline
  def apply(resourceType: String = null, tags: StringDictionary[js.Any] = null): Anon_KeyResourceTypeTags = {
    val __obj = js.Dynamic.literal()
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_KeyResourceTypeTags]
  }
}

