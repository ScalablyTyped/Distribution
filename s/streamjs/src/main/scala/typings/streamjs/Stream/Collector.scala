package typings.streamjs.Stream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collector[T] extends js.Object {
  
  def accumulator(e1: T, e2: T): T = js.native
  @JSName("accumulator")
  var accumulator_Original: Accumulator[T] = js.native
  
  def finisher(elem: T): T = js.native
  @JSName("finisher")
  var finisher_Original: Function[T, T] = js.native
  
  def supplier(): T = js.native
  @JSName("supplier")
  var supplier_Original: Supplier[T] = js.native
}
