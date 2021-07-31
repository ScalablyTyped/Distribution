package typings.raf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(callback: js.Function1[/* timestamp */ Double, Unit]): Double = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("raf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cancel(handle: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def polyfill(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("polyfill")().asInstanceOf[Unit]
  @scala.inline
  def polyfill(globalObject: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("polyfill")(globalObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
