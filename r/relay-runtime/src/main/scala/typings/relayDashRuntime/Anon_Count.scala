package typings.relayDashRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  val count: String
  val cursor: String
}

object Anon_Count {
  @scala.inline
  def apply(count: String, cursor: String): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Count]
  }
}

