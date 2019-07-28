package typings.atPulumiAws.sfnActivityMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityState extends js.Object {
  /**
    * The date the activity was created.
    */
  val creationDate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the activity to create.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ActivityState {
  @scala.inline
  def apply(
    creationDate: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ActivityState = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityState]
  }
}

