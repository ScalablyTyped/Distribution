package typings.remixRunRouter.distUtilsMod

import typings.std.AbortSignal
import typings.std.Record
import typings.std.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@remix-run/router/dist/utils", "DeferredData")
@js.native
open class DeferredData protected () extends StObject {
  def this(data: Record[String, Any]) = this()
  def this(data: Record[String, Any], responseInit: ResponseInit) = this()
  
  /* private */ var abortPromise: Any = js.native
  
  def cancel(): Unit = js.native
  
  /* private */ var controller: Any = js.native
  
  var data: Record[String, Any] = js.native
  
  var deferredKeys: js.Array[String] = js.native
  
  def done: Boolean = js.native
  
  /* private */ var emit: Any = js.native
  
  var init: js.UndefOr[ResponseInit] = js.native
  
  /* private */ var onSettle: Any = js.native
  
  def pendingKeys: js.Array[String] = js.native
  
  /* private */ var pendingKeysSet: Any = js.native
  
  def resolveData(signal: AbortSignal): js.Promise[Boolean] = js.native
  
  def subscribe(fn: js.Function2[/* aborted */ Boolean, /* settledKey */ js.UndefOr[String], Unit]): js.Function0[Boolean] = js.native
  
  /* private */ var subscribers: Any = js.native
  
  /* private */ var trackPromise: Any = js.native
  
  /* private */ var unlistenAbortSignal: Any = js.native
  
  def unwrappedData: js.Object = js.native
}
