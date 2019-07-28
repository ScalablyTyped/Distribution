package typings.atPulumiAws.sfnActivityMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityArgs extends js.Object {
  /**
    * The name of the activity to create.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ActivityArgs {
  @scala.inline
  def apply(name: Input[String] = null, tags: Input[StringDictionary[_]] = null): ActivityArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityArgs]
  }
}

