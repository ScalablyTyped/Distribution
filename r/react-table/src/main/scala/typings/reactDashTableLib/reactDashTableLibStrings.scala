package typings
package reactDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashTableLibStrings {
  @js.native
  sealed trait checkbox
    extends reactDashTableLib.libHocSelectTableMod.SelectType
  
  @js.native
  sealed trait radio
    extends reactDashTableLib.libHocSelectTableMod.SelectType
  
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  @scala.inline
  def radio: radio = "radio".asInstanceOf[radio]
}

