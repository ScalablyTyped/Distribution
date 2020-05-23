package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This ServiceWorker API interface provides an interface for registering and listing sync registrations. */
trait SyncManager extends js.Object {
  def getTags(): js.Promise[js.Array[java.lang.String]]
  def register(tag: java.lang.String): js.Promise[Unit]
}

object SyncManager {
  @scala.inline
  def apply(
    getTags: () => js.Promise[js.Array[java.lang.String]],
    register: java.lang.String => js.Promise[Unit]
  ): SyncManager = {
    val __obj = js.Dynamic.literal(getTags = js.Any.fromFunction0(getTags), register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[SyncManager]
  }
}

