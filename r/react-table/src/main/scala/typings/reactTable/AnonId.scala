package typings.reactTable

import typings.reactTable.mod.HeaderProps
import typings.reactTable.mod.IdType
import typings.reactTable.mod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId[D /* <: js.Object */] extends js.Object {
  var Header: Renderer[HeaderProps[D]]
  var id: IdType[D]
}

object AnonId {
  @scala.inline
  def apply[D /* <: js.Object */](Header: Renderer[HeaderProps[D]], id: IdType[D]): AnonId[D] = {
    val __obj = js.Dynamic.literal(Header = Header.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId[D]]
  }
}

