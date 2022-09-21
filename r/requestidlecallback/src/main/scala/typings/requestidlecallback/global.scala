package typings.requestidlecallback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def cancel(handle: IdleCallbackHandle): Unit = js.Dynamic.global.applyDynamic("cancel")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def cancelIdleCallback(handle: Double): Unit = js.Dynamic.global.applyDynamic("cancelIdleCallback")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def request(callback: js.Function1[/* deadline */ IdleDeadline, Unit]): IdleCallbackHandle = js.Dynamic.global.applyDynamic("request")(callback.asInstanceOf[js.Any]).asInstanceOf[IdleCallbackHandle]
  inline def request(callback: js.Function1[/* deadline */ IdleDeadline, Unit], options: IdleRequestOptions): IdleCallbackHandle = (js.Dynamic.global.applyDynamic("request")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IdleCallbackHandle]
  
  inline def requestIdleCallback(callback: js.Function1[/* deadline */ IdleDeadline, Unit]): Double = js.Dynamic.global.applyDynamic("requestIdleCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def requestIdleCallback(callback: js.Function1[/* deadline */ IdleDeadline, Unit], options: IdleRequestOptions): Double = (js.Dynamic.global.applyDynamic("requestIdleCallback")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
}
