package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager)
  */
@js.native
trait LockManager extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/query) */
  /* standard dom */
  def query(): js.Promise[LockManagerSnapshot] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/request) */
  /* standard dom */
  def request(name: java.lang.String, callback: LockGrantedCallback): js.Promise[Any] = js.native
  /* standard dom */
  def request(name: java.lang.String, options: LockOptions, callback: LockGrantedCallback): js.Promise[Any] = js.native
}
