package typings.reactSortableHoc

import typings.reactSortableHoc.mod.Axis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactSortableHocStrings {
  @js.native
  sealed trait x extends Axis
  
  @js.native
  sealed trait xy extends Axis
  
  @js.native
  sealed trait y extends Axis
  
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  @scala.inline
  def xy: xy = "xy".asInstanceOf[xy]
  @scala.inline
  def y: y = "y".asInstanceOf[y]
}

