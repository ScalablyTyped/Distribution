package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResults[T] extends js.Object {
  var results: T
}

object AnonResults {
  @scala.inline
  def apply[T](results: T): AnonResults[T] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResults[T]]
  }
}

