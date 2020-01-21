package typings.prompts.mod

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
  var suggest: js.UndefOr[js.Function2[/* input */ js.Any, /* choices */ js.Array[Choice], js.Promise[_]]] = js.undefined
  var `type`: PromptType | Falsy | (PrevCaller[T, PromptType | Falsy])
  var validate: js.UndefOr[PrevCaller[T, Boolean | String | (js.Promise[Boolean | String])]] = js.undefined
}

object PromptObject {
  @scala.inline
  def apply[T /* <: String */](
    name: ValueOrFunc[T],
    active: String = null,
    choices: js.Array[Choice] = null,
    float: js.UndefOr[Boolean] = js.undefined,
    format: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => Unit = null,
    hint: String = null,
    inactive: String = null,
    increment: Int | Double = null,
    initial: String | Double | Boolean | Date = null,
    limit: Int | Double = null,
    mask: String = null,
    max: Int | Double = null,
    message: ValueOrFunc[String] = null,
    min: Int | Double = null,
    onState: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => Unit = null,
    round: Int | Double = null,
    seperator: String = null,
    style: String = null,
    suggest: (/* input */ js.Any, /* choices */ js.Array[Choice]) => js.Promise[_] = null,
    `type`: PromptType | Falsy | (PrevCaller[T, PromptType | Falsy]) = null,
    validate: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => Boolean | String | (js.Promise[Boolean | String]) = null
  ): PromptObject[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (!js.isUndefined(float)) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction3(format))
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onState != null) __obj.updateDynamic("onState")(js.Any.fromFunction3(onState))
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (seperator != null) __obj.updateDynamic("seperator")(seperator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suggest != null) __obj.updateDynamic("suggest")(js.Any.fromFunction2(suggest))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction3(validate))
    __obj.asInstanceOf[PromptObject[T]]
  }
}

