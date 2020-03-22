package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeJoi.AnonWrapArrays
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  root ? :string,   key ? :string,   messages ? :{  wrapArrays ? :boolean}, [key: string] : react-native-joi.react-native-joi.LanguageOptions} & std.Partial<std.Record<react-native-joi.react-native-joi.Types, react-native-joi.react-native-joi.LanguageOptions>> */
trait LanguageRootOptions extends /* key */ StringDictionary[LanguageOptions] {
  var alternatives: js.UndefOr[LanguageOptions] = js.undefined
  var any: js.UndefOr[LanguageOptions] = js.undefined
  var array: js.UndefOr[LanguageOptions] = js.undefined
  var binary: js.UndefOr[LanguageOptions] = js.undefined
  var boolean: js.UndefOr[LanguageOptions] = js.undefined
  var date: js.UndefOr[LanguageOptions] = js.undefined
  var function: js.UndefOr[LanguageOptions] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var `lazy`: js.UndefOr[LanguageOptions] = js.undefined
  var messages: js.UndefOr[AnonWrapArrays] = js.undefined
  var number: js.UndefOr[LanguageOptions] = js.undefined
  var `object`: js.UndefOr[LanguageOptions] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var string: js.UndefOr[LanguageOptions] = js.undefined
}

object LanguageRootOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[LanguageOptions] = null,
    alternatives: LanguageOptions = null,
    any: LanguageOptions = null,
    array: LanguageOptions = null,
    binary: LanguageOptions = null,
    boolean: LanguageOptions = null,
    date: LanguageOptions = null,
    function: LanguageOptions = null,
    key: String = null,
    `lazy`: LanguageOptions = null,
    messages: AnonWrapArrays = null,
    number: LanguageOptions = null,
    `object`: LanguageOptions = null,
    root: String = null,
    string: LanguageOptions = null
  ): LanguageRootOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives.asInstanceOf[js.Any])
    if (any != null) __obj.updateDynamic("any")(any.asInstanceOf[js.Any])
    if (array != null) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageRootOptions]
  }
}

