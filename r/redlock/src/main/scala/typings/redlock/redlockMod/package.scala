package typings.redlock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object redlockMod {
  type Callback[T] = js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit]
  /**
    * Function that returns the LUA script to run on the
    * Redis server to extend the ttl of a locked resource.
    *
    * @param origScript - Redblock's default LUA script to extend a lock's ttl.
    */
  type ExtendScriptFunction = LockScriptFunction
  /**
    * Function that returns the LUA script to run on the
    * Redis server to lock a resource.
    *
    * @param origScript - Redblock's default LUA script to lock a resource.
    */
  type LockScriptFunction = js.Function1[/* origScript */ String, String]
  /**
    * Function that returns the LUA script to run on the
    * Redis server to unlock a resource.
    *
    * @param origScript - Redblock's default LUA script to unlock a resource.
    */
  type UnlockScriptFunction = LockScriptFunction
}
