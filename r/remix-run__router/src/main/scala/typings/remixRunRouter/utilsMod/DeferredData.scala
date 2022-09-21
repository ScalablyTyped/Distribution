package typings.remixRunRouter.utilsMod

import typings.std.AbortSignal
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@remix-run/router/dist/utils", "DeferredData")
@js.native
open class DeferredData protected () extends StObject {
  def this(data: Record[String, Any]) = this()
  
  /* private */ var abortPromise: Any = js.native
  
  def cancel(): Unit = js.native
  
  /* private */ var controller: Any = js.native
  
  var data: Record[String, Any] = js.native
  
  def done: Boolean = js.native
  
  /* private */ var onSettle: Any = js.native
  
  /* private */ var pendingKeys: Any = js.native
  
  def resolveData(signal: AbortSignal): js.Promise[Boolean] = js.native
  
  def subscribe(fn: js.Function1[/* aborted */ Boolean, Unit]): Unit = js.native
  
  /* private */ var subscriber: Any = js.native
  
  /* private */ var trackPromise: Any = js.native
  
  /* private */ var unlistenAbortSignal: Any = js.native
  
  def unwrappedData: js.Object = js.native
}
