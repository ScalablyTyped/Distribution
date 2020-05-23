package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results[T] extends js.Object {
  var results: T
}

object Results {
  @scala.inline
  def apply[T](results: T): Results[T] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results[T]]
  }
}

