package typings.raf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raf", JSImport.Namespace)
  @js.native
  def apply(callback: js.Function1[/* timestamp */ Double, Unit]): Double = js.native
  
  @JSImport("raf", "cancel")
  @js.native
  def cancel(handle: Double): Unit = js.native
  
  @JSImport("raf", "polyfill")
  @js.native
  def polyfill(): Unit = js.native
  @JSImport("raf", "polyfill")
  @js.native
  def polyfill(globalObject: js.Any): Unit = js.native
}
