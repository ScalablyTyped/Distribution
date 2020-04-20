package typings.resolveOptions.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver extends js.Object {
  def resolve(key: String): js.UndefOr[Double | String | Boolean | Date | Null]
}

object Resolver {
  @scala.inline
  def apply(resolve: String => js.UndefOr[Double | String | Boolean | Date | Null]): Resolver = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Resolver]
  }
}

