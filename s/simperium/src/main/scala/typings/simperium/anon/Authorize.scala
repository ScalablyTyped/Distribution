package typings.simperium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorize extends js.Object {
  def authorize(username: String, password: String): js.Promise[Accesstoken]
  def create(username: String, password: String): js.Promise[Accesstoken]
}

object Authorize {
  @scala.inline
  def apply(
    authorize: (String, String) => js.Promise[Accesstoken],
    create: (String, String) => js.Promise[Accesstoken]
  ): Authorize = {
    val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction2(authorize), create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[Authorize]
  }
}

