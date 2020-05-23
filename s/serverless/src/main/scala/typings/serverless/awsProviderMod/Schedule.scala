package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schedule extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var input: js.UndefOr[Input] = js.undefined
  var inputPath: js.UndefOr[String] = js.undefined
  var inputTransformer: js.UndefOr[InputTransformer] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var rate: String
}

object Schedule {
  @scala.inline
  def apply(
    rate: String,
    description: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    input: Input = null,
    inputPath: String = null,
    inputTransformer: InputTransformer = null,
    name: String = null
  ): Schedule = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputPath != null) __obj.updateDynamic("inputPath")(inputPath.asInstanceOf[js.Any])
    if (inputTransformer != null) __obj.updateDynamic("inputTransformer")(inputTransformer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
}

