package typings.promClient

import typings.promClient.mod.Aggregator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promClientStrings {
  
  @js.native
  sealed trait average extends Aggregator
  @scala.inline
  def average: average = "average".asInstanceOf[average]
  
  @js.native
  sealed trait first extends Aggregator
  @scala.inline
  def first: first = "first".asInstanceOf[first]
  
  @js.native
  sealed trait max extends Aggregator
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait min extends Aggregator
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  
  @js.native
  sealed trait omit extends Aggregator
  @scala.inline
  def omit: omit = "omit".asInstanceOf[omit]
  
  @js.native
  sealed trait sum extends Aggregator
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
}
