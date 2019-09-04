package typings.reactDashIntl.distComponentsCreateFormattedComponentMod

import typings.reactDashIntl.distTypesMod.FormatDateOptions
import typings.reactDashIntl.distTypesMod.FormatNumberOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatter extends js.Object {
  var formatDate: FormatDateOptions
  var formatNumber: FormatNumberOptions
  var formatTime: FormatDateOptions
}

object Formatter {
  @scala.inline
  def apply(formatDate: FormatDateOptions, formatNumber: FormatNumberOptions, formatTime: FormatDateOptions): Formatter = {
    val __obj = js.Dynamic.literal(formatDate = formatDate.asInstanceOf[js.Any], formatNumber = formatNumber.asInstanceOf[js.Any], formatTime = formatTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Formatter]
  }
}

