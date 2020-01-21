package typings.promClient

import typings.promClient.mod.Aggregator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object promClientStrings {
  @js.native
  sealed trait average extends Aggregator
  
  @js.native
  sealed trait first extends Aggregator
  
  @js.native
  sealed trait max extends Aggregator
  
  @js.native
  sealed trait min extends Aggregator
  
  @js.native
  sealed trait omit extends Aggregator
  
  @js.native
  sealed trait sum extends Aggregator
  
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

