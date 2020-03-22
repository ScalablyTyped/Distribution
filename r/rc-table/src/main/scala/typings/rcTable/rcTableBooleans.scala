package typings.rcTable

import typings.rcTable.interfaceMod.ExpandableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcTableBooleans {
  @js.native
  sealed trait `false` extends ExpandableType
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

