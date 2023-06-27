package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLock)
  */
@js.native
trait WakeLock extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLock/request) */
  /* standard dom */
  def request(): js.Promise[WakeLockSentinel] = js.native
  def request(`type`: WakeLockType): js.Promise[WakeLockSentinel] = js.native
}
