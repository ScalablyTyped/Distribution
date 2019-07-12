package typings
package reactDashMaterialDashUiDashFormDashValidatorLib.reactDashMaterialDashUiDashFormDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorFormProps
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var debounceTime: js.UndefOr[scala.Double] = js.undefined
  var instantValidate: js.UndefOr[scala.Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* errors */ js.Array[_], scala.Unit]] = js.undefined
  def onSubmit(event: reactLib.reactMod.FormEventHandler[reactLib.Element]): scala.Unit
}

object ValidatorFormProps {
  @scala.inline
  def apply(
    onSubmit: reactLib.reactMod.FormEventHandler[reactLib.Element] => scala.Unit,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    debounceTime: scala.Int | scala.Double = null,
    instantValidate: js.UndefOr[scala.Boolean] = js.undefined,
    onError: /* errors */ js.Array[_] => scala.Unit = null
  ): ValidatorFormProps = {
    val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (debounceTime != null) __obj.updateDynamic("debounceTime")(debounceTime.asInstanceOf[js.Any])
    if (!js.isUndefined(instantValidate)) __obj.updateDynamic("instantValidate")(instantValidate)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    __obj.asInstanceOf[ValidatorFormProps]
  }
}

