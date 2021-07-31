package typings.promiseWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerMod {
  
  @JSImport("promise-worker/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[TMessageIn, TMessageOut](callback: js.Function1[/* message */ TMessageIn, js.Promise[TMessageOut] | TMessageOut]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
