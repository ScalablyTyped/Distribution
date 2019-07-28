package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.Anon_EndcursorHasnextpage
import typings.reactDashNative.Anon_Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPhotosReturnType extends js.Object {
  var edges: js.Array[Anon_Node]
  var page_info: Anon_EndcursorHasnextpage
}

object GetPhotosReturnType {
  @scala.inline
  def apply(edges: js.Array[Anon_Node], page_info: Anon_EndcursorHasnextpage): GetPhotosReturnType = {
    val __obj = js.Dynamic.literal(edges = edges, page_info = page_info)
  
    __obj.asInstanceOf[GetPhotosReturnType]
  }
}

