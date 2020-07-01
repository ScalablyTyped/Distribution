package typings.sade.anon

import typings.mri.mod.ArrayOrString
import typings.mri.mod.DictionaryObject
import typings.sade.sadeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  lazy  :true} & sade.sade.ParseOptions */
trait lazytrueParseOptions extends js.Object {
  /** Additional aliases for specific flags */
  var alias: js.UndefOr[DictionaryObject[ArrayOrString]] = js.undefined
  /** A flag or array of flags whose values are boolean */
  var boolean: js.UndefOr[ArrayOrString] = js.undefined
  /** Default values for flags */
  var default: js.UndefOr[DictionaryObject[_]] = js.undefined
  var `lazy`: js.UndefOr[`true` with Boolean] = js.undefined
  var string: js.UndefOr[ArrayOrString] = js.undefined
  var unknown: js.UndefOr[js.Function1[/* flag */ String, Unit]] = js.undefined
}

object lazytrueParseOptions {
  @scala.inline
  def apply(
    alias: DictionaryObject[ArrayOrString] = null,
    boolean: ArrayOrString = null,
    default: DictionaryObject[_] = null,
    `lazy`: js.UndefOr[`true` with Boolean] = js.undefined,
    string: ArrayOrString = null,
    unknown: /* flag */ String => Unit = null
  ): lazytrueParseOptions = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.get.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction1(unknown))
    __obj.asInstanceOf[lazytrueParseOptions]
  }
}

