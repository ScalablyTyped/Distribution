package typings.reactDashMovable

import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewIndex extends js.Object {
  var newIndex: Double
  var oldIndex: Double
  var targetRect: ClientRect
}

object Anon_NewIndex {
  @scala.inline
  def apply(newIndex: Double, oldIndex: Double, targetRect: ClientRect): Anon_NewIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], targetRect = targetRect.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NewIndex]
  }
}

