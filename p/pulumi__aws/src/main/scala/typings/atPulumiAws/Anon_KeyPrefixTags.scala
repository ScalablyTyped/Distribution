package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyPrefixTags extends js.Object {
  var prefix: js.UndefOr[Input[String]] = js.undefined
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object Anon_KeyPrefixTags {
  @scala.inline
  def apply(prefix: Input[String] = null, tags: Input[StringDictionary[_]] = null): Anon_KeyPrefixTags = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyPrefixTags]
  }
}

