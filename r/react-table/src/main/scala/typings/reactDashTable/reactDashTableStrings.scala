package typings.reactDashTable

import typings.reactDashTable.libHocSelectTableMod.SelectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashTableStrings {
  @js.native
  sealed trait checkbox extends SelectType
  
  @js.native
  sealed trait radio extends SelectType
  
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  @scala.inline
  def radio: radio = "radio".asInstanceOf[radio]
}

