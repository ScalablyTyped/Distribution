package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This ServiceWorker API interface provides an interface for registering and listing sync registrations. */
trait SyncManager extends StObject {
  
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
  
  @scala.inline
  implicit class SyncManagerMutableBuilder[Self <: SyncManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTags(value: () => js.Promise[js.Array[java.lang.String]]): Self = StObject.set(x, "getTags", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: java.lang.String => js.Promise[Unit]): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
  }
}
