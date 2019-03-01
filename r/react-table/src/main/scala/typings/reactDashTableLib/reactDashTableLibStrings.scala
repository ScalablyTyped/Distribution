package typings
package reactDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashTableLibStrings {
  @js.native
  sealed trait asc extends js.Object
  
  @js.native
  sealed trait checkbox
    extends reactDashTableLib.libHocSelectTableMod.SelectType
  
  @js.native
  sealed trait desc extends js.Object
  
  @js.native
  sealed trait radio
    extends reactDashTableLib.libHocSelectTableMod.SelectType
  
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def radio: radio = "radio".asInstanceOf[radio]
}

