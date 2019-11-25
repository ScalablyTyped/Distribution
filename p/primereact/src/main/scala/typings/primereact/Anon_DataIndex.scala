package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataIndex extends js.Object {
  var data: js.Any
  var index: Double
  var originalEvent: Event
}

object Anon_DataIndex {
  @scala.inline
  def apply(data: js.Any, index: Double, originalEvent: Event): Anon_DataIndex = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataIndex]
  }
}

