package typings.reactNative.mod

import typings.reactNative.anon.Hasnextpage
import typings.reactNative.anon.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPhotosReturnType extends js.Object {
  var edges: js.Array[Node]
  var page_info: Hasnextpage
}

object GetPhotosReturnType {
  @scala.inline
  def apply(edges: js.Array[Node], page_info: Hasnextpage): GetPhotosReturnType = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhotosReturnType]
  }
}

