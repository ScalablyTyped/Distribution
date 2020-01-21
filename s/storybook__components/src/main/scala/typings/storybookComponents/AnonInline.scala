package typings.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInline extends js.Object {
  var `inline`: Boolean
}

object AnonInline {
  @scala.inline
  def apply(`inline`: Boolean): AnonInline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInline]
  }
}

