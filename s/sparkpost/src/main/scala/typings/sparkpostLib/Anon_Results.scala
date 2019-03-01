package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Results[T] extends js.Object {
  var results: T
}

object Anon_Results {
  @scala.inline
  def apply[T](results: T): Anon_Results[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Results[T]]
  }
}

