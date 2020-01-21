package typings.reactMaterialUiFormValidator.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FormEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorFormProps
  extends /* key */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var debounceTime: js.UndefOr[Double] = js.undefined
  var instantValidate: js.UndefOr[Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* errors */ js.Array[_], Unit]] = js.undefined
  def onSubmit(event: FormEvent[Element]): Unit
}

object ValidatorFormProps {
  @scala.inline
  def apply(
    onSubmit: FormEvent[Element] => Unit,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    debounceTime: Int | Double = null,
    instantValidate: js.UndefOr[Boolean] = js.undefined,
    onError: /* errors */ js.Array[_] => Unit = null
  ): ValidatorFormProps = {
    val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (debounceTime != null) __obj.updateDynamic("debounceTime")(debounceTime.asInstanceOf[js.Any])
    if (!js.isUndefined(instantValidate)) __obj.updateDynamic("instantValidate")(instantValidate.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    __obj.asInstanceOf[ValidatorFormProps]
  }
}

