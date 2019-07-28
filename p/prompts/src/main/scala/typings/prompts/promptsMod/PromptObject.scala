package typings.prompts.promptsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptObject[T /* <: String */] extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var choices: js.UndefOr[js.Array[Choice]] = js.undefined
  var float: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[PrevCaller[T, Unit]] = js.undefined
  var hint: js.UndefOr[String] = js.undefined
  var inactive: js.UndefOr[String] = js.undefined
  var increment: js.UndefOr[Double] = js.undefined
  var initial: js.UndefOr[String | Double | Boolean | Date] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[ValueOrFunc[String]] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: ValueOrFunc[T]
  var onState: js.UndefOr[PrevCaller[T, Unit]] = js.undefined
  var round: js.UndefOr[Double] = js.undefined
  var seperator: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var suggest: js.UndefOr[
    js.Function3[/* prev */ js.Any, /* values */ js.Any, /* prompt */ PromptObject[String], Unit]
  ] = js.undefined
  var `type`: PromptType | Falsy | (PrevCaller[T, PromptType | Falsy])
  var validate: js.UndefOr[PrevCaller[T, Boolean | String]] = js.undefined
}

object PromptObject {
  @scala.inline
  def apply[T /* <: String */](
    name: ValueOrFunc[T],
    `type`: PromptType | Falsy | (PrevCaller[T, PromptType | Falsy]),
    active: String = null,
    choices: js.Array[Choice] = null,
    float: js.UndefOr[Boolean] = js.undefined,
    format: PrevCaller[T, Unit] = null,
    hint: String = null,
    inactive: String = null,
    increment: Int | Double = null,
    initial: String | Double | Boolean | Date = null,
    limit: Int | Double = null,
    mask: String = null,
    max: Int | Double = null,
    message: ValueOrFunc[String] = null,
    min: Int | Double = null,
    onState: PrevCaller[T, Unit] = null,
    round: Int | Double = null,
    seperator: String = null,
    style: String = null,
    suggest: (/* prev */ js.Any, /* values */ js.Any, /* prompt */ PromptObject[String]) => Unit = null,
    validate: PrevCaller[T, Boolean | String] = null
  ): PromptObject[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (active != null) __obj.updateDynamic("active")(active)
    if (choices != null) __obj.updateDynamic("choices")(choices)
    if (!js.isUndefined(float)) __obj.updateDynamic("float")(float)
    if (format != null) __obj.updateDynamic("format")(format)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onState != null) __obj.updateDynamic("onState")(onState)
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (seperator != null) __obj.updateDynamic("seperator")(seperator)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suggest != null) __obj.updateDynamic("suggest")(js.Any.fromFunction3(suggest))
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[PromptObject[T]]
  }
}

