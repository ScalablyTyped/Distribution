package typings.serverless

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommand extends js.Object {
  var commands: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  var lifecycleEvents: js.UndefOr[js.Array[String]] = js.undefined
  var options: js.UndefOr[StringDictionary[AnonRequired]] = js.undefined
  var usage: js.UndefOr[String] = js.undefined
}

object AnonCommand {
  @scala.inline
  def apply(
    commands: StringDictionary[js.Object] = null,
    lifecycleEvents: js.Array[String] = null,
    options: StringDictionary[AnonRequired] = null,
    usage: String = null
  ): AnonCommand = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (lifecycleEvents != null) __obj.updateDynamic("lifecycleEvents")(lifecycleEvents.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommand]
  }
}

