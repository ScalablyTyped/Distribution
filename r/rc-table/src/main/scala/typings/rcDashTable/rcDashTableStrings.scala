package typings.rcDashTable

import typings.rcDashTable.libInterfaceMod.ScrollPosition
import typings.rcDashTable.libInterfaceMod._FixedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcDashTableStrings {
  @js.native
  sealed trait RC_TABLE_INTERNAL_COL_DEFINE extends js.Object
  
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait both
    extends ScrollPosition
       with typings.rcDashTable.esInterfaceMod.ScrollPosition
  
  @js.native
  sealed trait center extends js.Object
  
  @js.native
  sealed trait fixed extends js.Object
  
  @js.native
  sealed trait horizontal extends js.Object
  
  @js.native
  sealed trait left
    extends ScrollPosition
       with typings.rcDashTable.esInterfaceMod.ScrollPosition
       with _FixedType
       with typings.rcDashTable.esInterfaceMod._FixedType
  
  @js.native
  sealed trait middle
    extends ScrollPosition
       with typings.rcDashTable.esInterfaceMod.ScrollPosition
  
  @js.native
  sealed trait right
    extends ScrollPosition
       with typings.rcDashTable.esInterfaceMod.ScrollPosition
       with _FixedType
       with typings.rcDashTable.esInterfaceMod._FixedType
  
  @js.native
  sealed trait vertical extends js.Object
  
  @scala.inline
  def RC_TABLE_INTERNAL_COL_DEFINE: RC_TABLE_INTERNAL_COL_DEFINE = "RC_TABLE_INTERNAL_COL_DEFINE".asInstanceOf[RC_TABLE_INTERNAL_COL_DEFINE]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def fixed: fixed = "fixed".asInstanceOf[fixed]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

