package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagePositions extends js.Object {
  var borderBoxCenter: Position
  var selection: Position
}

object PagePositions {
  @scala.inline
  def apply(borderBoxCenter: Position, selection: Position): PagePositions = {
    val __obj = js.Dynamic.literal(borderBoxCenter = borderBoxCenter.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePositions]
  }
}

