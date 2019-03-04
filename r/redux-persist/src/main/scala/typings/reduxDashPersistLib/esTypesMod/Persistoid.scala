package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistoid extends js.Object {
  def flush(): js.Promise[_]
  def update(item: js.Any): scala.Unit
}

object Persistoid {
  @scala.inline
  def apply(flush: js.Function0[js.Promise[_]], update: js.Function1[js.Any, scala.Unit]): Persistoid = {
    val __obj = js.Dynamic.literal(flush = flush, update = update)
  
    __obj.asInstanceOf[Persistoid]
  }
}

