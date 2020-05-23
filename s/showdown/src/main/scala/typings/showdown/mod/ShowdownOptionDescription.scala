package typings.showdown.mod

import typings.showdown.showdownStrings.boolean
import typings.showdown.showdownStrings.integer
import typings.showdown.showdownStrings.string
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
  var defaultValue: js.UndefOr[Boolean] = js.undefined
  /**
    * The description of the option.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The type of the option value.
    */
  var `type`: js.UndefOr[boolean | string | integer] = js.undefined
}

object ShowdownOptionDescription {
  @scala.inline
  def apply(
    defaultValue: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    `type`: boolean | string | integer = null
  ): ShowdownOptionDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowdownOptionDescription]
  }
}

