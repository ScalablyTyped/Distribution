package typings
package showdownLib.showdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Showdown option description.
  */
trait ShowdownOptionDescription extends js.Object {
  /**
    * The default value of option.
    */
  var defaultValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The description of the option.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the option value.
    */
  var `type`: js.UndefOr[
    showdownLib.showdownLibStrings.boolean | showdownLib.showdownLibStrings.string | showdownLib.showdownLibStrings.integer
  ] = js.undefined
}

object ShowdownOptionDescription {
  @scala.inline
  def apply(
    defaultValue: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    `type`: showdownLib.showdownLibStrings.boolean | showdownLib.showdownLibStrings.string | showdownLib.showdownLibStrings.integer = null
  ): ShowdownOptionDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowdownOptionDescription]
  }
}

