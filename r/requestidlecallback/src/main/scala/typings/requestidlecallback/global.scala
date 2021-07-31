package typings.requestidlecallback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @scala.inline
  def cancel(handle: IdleCallbackHandle): Unit = js.Dynamic.global.applyDynamic("cancel")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def cancelIdleCallback(handle: Double): Unit = js.Dynamic.global.applyDynamic("cancelIdleCallback")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def request(callback: IdleRequestCallback): IdleCallbackHandle = js.Dynamic.global.applyDynamic("request")(callback.asInstanceOf[js.Any]).asInstanceOf[IdleCallbackHandle]
  @scala.inline
  def request(callback: IdleRequestCallback, options: IdleRequestOptions): IdleCallbackHandle = (js.Dynamic.global.applyDynamic("request")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IdleCallbackHandle]
  
  @scala.inline
  def requestIdleCallback(callback: IdleRequestCallback): Double = js.Dynamic.global.applyDynamic("requestIdleCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def requestIdleCallback(callback: IdleRequestCallback, options: IdleRequestOptions): Double = (js.Dynamic.global.applyDynamic("requestIdleCallback")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
}
