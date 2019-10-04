package typings.reduxDashPersist.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistoid extends js.Object {
  def flush(): js.Promise[_]
  def update(state: js.Object): Unit
}

object Persistoid {
  @scala.inline
  def apply(flush: () => js.Promise[_], update: js.Object => Unit): Persistoid = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Persistoid]
  }
}

