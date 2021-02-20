package typings.promiseWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerMod {
  
  @JSImport("promise-worker/register", JSImport.Default)
  @js.native
  def default[TMessageIn, TMessageOut](callback: js.Function1[/* message */ TMessageIn, js.Promise[TMessageOut] | TMessageOut]): Unit = js.native
}
