package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Removes all event handlers and their native subscriptions
    */
  def cleanup(): js.Promise[_] = js.native
  /**
    * disconnect to firebase backend
    */
  def goOffline(): Unit = js.native
  /**
    * connect to firebase backend
    */
  def goOnline(): Unit = js.native
  /**
    * unregister listener
    */
  def off(path: String, modifiersString: String): js.Any = js.native
  def off(path: String, modifiersString: String, eventName: String): js.Any = js.native
  def off(path: String, modifiersString: String, eventName: String, origCB: js.Function0[Unit]): js.Any = js.native
  /**
    * register listener
    */
  def on(
    path: String,
    modifiersString: String,
    modifiers: js.Array[String],
    eventName: String,
    cb: js.Function0[Unit],
    errorCb: js.Function0[Unit]
  ): js.Any = js.native
  /**
    * Returns a new firebase reference instance
    * */
  def ref(): RnReference = js.native
  def ref(path: String): RnReference = js.native
}

