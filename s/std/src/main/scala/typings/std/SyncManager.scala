package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This ServiceWorker API interface provides an interface for registering and listing sync registrations. */
@js.native
trait SyncManager extends js.Object {
  
  def getTags(): js.Promise[js.Array[java.lang.String]] = js.native
  
  def register(tag: java.lang.String): js.Promise[Unit] = js.native
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
  
  @scala.inline
  implicit class SyncManagerOps[Self <: SyncManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetTags(value: () => js.Promise[js.Array[java.lang.String]]): Self = this.set("getTags", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: java.lang.String => js.Promise[Unit]): Self = this.set("register", js.Any.fromFunction1(value))
  }
}
