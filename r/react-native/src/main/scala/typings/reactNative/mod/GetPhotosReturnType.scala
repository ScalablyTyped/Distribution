package typings.reactNative.mod

import typings.reactNative.anon.Hasnextpage
import typings.reactNative.anon.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPhotosReturnType extends js.Object {
  var edges: js.Array[Node] = js.native
  var page_info: Hasnextpage = js.native
}

object GetPhotosReturnType {
  @scala.inline
  def apply(edges: js.Array[Node], page_info: Hasnextpage): GetPhotosReturnType = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhotosReturnType]
  }
  @scala.inline
  implicit class GetPhotosReturnTypeOps[Self <: GetPhotosReturnType] (val x: Self) extends AnyVal {
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
    def setEdgesVarargs(value: Node*): Self = this.set("edges", js.Array(value :_*))
    @scala.inline
    def setEdges(value: js.Array[Node]): Self = this.set("edges", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage_info(value: Hasnextpage): Self = this.set("page_info", value.asInstanceOf[js.Any])
  }
  
}

