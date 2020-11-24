package typings.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Persistoid extends js.Object {
  
  def flush(): js.Promise[_] = js.native
  
  def update(state: js.Object): Unit = js.native
}
object Persistoid {
  
  @scala.inline
  def apply(flush: () => js.Promise[_], update: js.Object => Unit): Persistoid = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Persistoid]
  }
  
  @scala.inline
  implicit class PersistoidOps[Self <: Persistoid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFlush(value: () => js.Promise[_]): Self = this.set("flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: js.Object => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
