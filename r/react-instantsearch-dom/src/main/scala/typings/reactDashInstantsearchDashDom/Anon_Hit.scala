package typings.reactDashInstantsearchDashDom

import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.Hit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hit[T] extends js.Object {
  var hit: Hit[T]
}

object Anon_Hit {
  @scala.inline
  def apply[T](hit: Hit[T]): Anon_Hit[T] = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Hit[T]]
  }
}

