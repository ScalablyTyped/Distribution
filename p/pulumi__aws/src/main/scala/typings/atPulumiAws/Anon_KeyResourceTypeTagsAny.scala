package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyResourceTypeTagsAny extends js.Object {
  var resourceType: js.UndefOr[Input[String]] = js.undefined
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object Anon_KeyResourceTypeTagsAny {
  @scala.inline
  def apply(resourceType: Input[String] = null, tags: Input[StringDictionary[_]] = null): Anon_KeyResourceTypeTagsAny = {
    val __obj = js.Dynamic.literal()
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyResourceTypeTagsAny]
  }
}

