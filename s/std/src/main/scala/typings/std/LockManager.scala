package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
@js.native
trait LockManager extends StObject {
  
  /* standard dom */
  def query(): js.Promise[LockManagerSnapshot] = js.native
  
  /* standard dom */
  def request(name: java.lang.String, callback: LockGrantedCallback): js.Promise[Any] = js.native
  /* standard dom */
  def request(name: java.lang.String, options: LockOptions, callback: LockGrantedCallback): js.Promise[Any] = js.native
}
