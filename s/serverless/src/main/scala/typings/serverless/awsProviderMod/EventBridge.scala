package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventBridge extends js.Object {
  var eventBus: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[Input] = js.undefined
  var inputPath: js.UndefOr[String] = js.undefined
  var inputTransformer: js.UndefOr[InputTransformer] = js.undefined
  var pattern: js.UndefOr[PatternExisting | PatternInput] = js.undefined
  var schedule: js.UndefOr[String] = js.undefined
}

object EventBridge {
  @scala.inline
  def apply(
    eventBus: String = null,
    input: Input = null,
    inputPath: String = null,
    inputTransformer: InputTransformer = null,
    pattern: PatternExisting | PatternInput = null,
    schedule: String = null
  ): EventBridge = {
    val __obj = js.Dynamic.literal()
    if (eventBus != null) __obj.updateDynamic("eventBus")(eventBus.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputPath != null) __obj.updateDynamic("inputPath")(inputPath.asInstanceOf[js.Any])
    if (inputTransformer != null) __obj.updateDynamic("inputTransformer")(inputTransformer.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBridge]
  }
}

