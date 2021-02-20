package typings.promiseTimeout

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-timeout", "TimeoutError")
  @js.native
  class TimeoutError () extends Error
  
  @JSImport("promise-timeout", "timeout")
  @js.native
  def timeout[T](promise: js.Promise[T], timeoutMillis: Double): js.Promise[T] = js.native
}
