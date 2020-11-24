package typings.raf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(callback: js.Function1[/* timestamp */ Double, Unit]): Double = js.native
  
  def cancel(handle: Double): Unit = js.native
  
  def polyfill(): Unit = js.native
  def polyfill(globalObject: js.Any): Unit = js.native
}
