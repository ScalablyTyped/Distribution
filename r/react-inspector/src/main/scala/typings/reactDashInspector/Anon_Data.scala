package typings.reactDashInspector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var depth: Double
  var expanded: Boolean
  var isNonEnumerable: Boolean
  var name: String
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Any, depth: Double, expanded: Boolean, isNonEnumerable: Boolean, name: String): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isNonEnumerable = isNonEnumerable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data]
  }
}

