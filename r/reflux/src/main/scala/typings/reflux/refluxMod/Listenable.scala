package typings.reflux.refluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listenable extends js.Object {
  var listen: ListenFn
}

object Listenable {
  @scala.inline
  def apply(listen: ListenFn): Listenable = {
    val __obj = js.Dynamic.literal(listen = listen)
  
    __obj.asInstanceOf[Listenable]
  }
}

