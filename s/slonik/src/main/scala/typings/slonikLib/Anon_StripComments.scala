package typings
package slonikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StripComments extends js.Object {
  var stripComments: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_StripComments {
  @scala.inline
  def apply(stripComments: js.UndefOr[scala.Boolean] = js.undefined): Anon_StripComments = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stripComments)) __obj.updateDynamic("stripComments")(stripComments)
    __obj.asInstanceOf[Anon_StripComments]
  }
}

