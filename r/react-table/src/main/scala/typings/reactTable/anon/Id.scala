package typings.reactTable.anon

import typings.reactTable.mod.HeaderProps
import typings.reactTable.mod.IdType
import typings.reactTable.mod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id[D /* <: js.Object */] extends js.Object {
  var Header: Renderer[HeaderProps[D]] = js.native
  var id: IdType[D] = js.native
}

object Id {
  @scala.inline
  def apply[/* <: js.Object */ D](Header: Renderer[HeaderProps[D]], id: IdType[D]): Id[D] = {
    val __obj = js.Dynamic.literal(Header = Header.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[D]]
  }
  @scala.inline
  implicit class IdOps[Self <: Id[_], /* <: js.Object */ D] (val x: Self with Id[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeader(value: Renderer[HeaderProps[D]]): Self = this.set("Header", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: IdType[D]): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

