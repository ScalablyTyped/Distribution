package typings.rcTable

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponents extends js.Object {
  var components: Requireable[_]
  var table: Requireable[_]
}

object AnonComponents {
  @scala.inline
  def apply(components: Requireable[_], table: Requireable[_]): AnonComponents = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComponents]
  }
}

