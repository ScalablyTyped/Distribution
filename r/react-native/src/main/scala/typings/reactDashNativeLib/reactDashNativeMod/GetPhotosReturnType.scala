package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPhotosReturnType extends js.Object {
  var edges: js.Array[reactDashNativeLib.Anon_Node]
  var page_info: reactDashNativeLib.Anon_EndcursorHasnextpage
}

object GetPhotosReturnType {
  @scala.inline
  def apply(
    edges: js.Array[reactDashNativeLib.Anon_Node],
    page_info: reactDashNativeLib.Anon_EndcursorHasnextpage
  ): GetPhotosReturnType = {
    val __obj = js.Dynamic.literal(edges = edges, page_info = page_info)
  
    __obj.asInstanceOf[GetPhotosReturnType]
  }
}

