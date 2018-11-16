package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Persistor extends js.Object {
  def dispatch(action: PersistorAction): PersistorAction
  def flush(): stdLib.Promise[_]
  def getState(): PersistorState
  def pause(): scala.Unit
  def persist(): scala.Unit
  def purge(): stdLib.Promise[_]
  def subscribe(callback: PersistorSubscribeCallback): js.Function0[_]
}

