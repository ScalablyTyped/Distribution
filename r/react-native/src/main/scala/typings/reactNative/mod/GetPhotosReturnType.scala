package typings.reactNative.mod

import typings.reactNative.AnonHasnextpage
import typings.reactNative.AnonNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPhotosReturnType extends js.Object {
  var edges: js.Array[AnonNode]
  var page_info: AnonHasnextpage
}

object GetPhotosReturnType {
  @scala.inline
  def apply(edges: js.Array[AnonNode], page_info: AnonHasnextpage): GetPhotosReturnType = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPhotosReturnType]
  }
}

