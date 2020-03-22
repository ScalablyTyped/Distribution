package typings.sade

import typings.mri.mod.ArrayOrString
import typings.mri.mod.DictionaryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<sade.sade.ParseOptions> */
trait ReadonlyParseOptions extends js.Object {
  val alias: js.UndefOr[DictionaryObject[ArrayOrString]] = js.undefined
  val boolean: js.UndefOr[ArrayOrString] = js.undefined
  val default: js.UndefOr[DictionaryObject[_]] = js.undefined
  val `lazy`: js.UndefOr[Boolean] = js.undefined
  val string: js.UndefOr[ArrayOrString] = js.undefined
  val unknown: js.UndefOr[js.Function1[/* flag */ String, Unit]] = js.undefined
}

object ReadonlyParseOptions {
  @scala.inline
  def apply(
    alias: DictionaryObject[ArrayOrString] = null,
    boolean: ArrayOrString = null,
    default: DictionaryObject[_] = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    string: ArrayOrString = null,
    unknown: /* flag */ String => Unit = null
  ): ReadonlyParseOptions = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction1(unknown))
    __obj.asInstanceOf[ReadonlyParseOptions]
  }
}

