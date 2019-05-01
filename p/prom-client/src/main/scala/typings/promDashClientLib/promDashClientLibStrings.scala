package typings
package promDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object promDashClientLibStrings {
  @js.native
  sealed trait average
    extends promDashClientLib.promDashClientMod.Aggregator
  
  @js.native
  sealed trait first
    extends promDashClientLib.promDashClientMod.Aggregator
  
  @js.native
  sealed trait max
    extends promDashClientLib.promDashClientMod.Aggregator
  
  @js.native
  sealed trait min
    extends promDashClientLib.promDashClientMod.Aggregator
  
  @js.native
  sealed trait omit
    extends promDashClientLib.promDashClientMod.Aggregator
  
  @js.native
  sealed trait sum
    extends promDashClientLib.promDashClientMod.Aggregator
  
  @scala.inline
  def average: average = "average".asInstanceOf[average]
  @scala.inline
  def first: first = "first".asInstanceOf[first]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  @scala.inline
  def omit: omit = "omit".asInstanceOf[omit]
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
}

