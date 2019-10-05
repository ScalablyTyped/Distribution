package typings.sharepoint

import typings.sharepoint.SP.JsGrid.IStyleType.Splitter
import typings.sharepoint.SP.JsGrid.IStyleType.SplitterHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dra extends js.Object {
  var dra: Splitter
  var dragHandle: SplitterHandle
  var hover: Splitter
  var hoverHandle: SplitterHandle
  var normal: Splitter
  var normalHandle: SplitterHandle
}

object Anon_Dra {
  @scala.inline
  def apply(
    dra: Splitter,
    dragHandle: SplitterHandle,
    hover: Splitter,
    hoverHandle: SplitterHandle,
    normal: Splitter,
    normalHandle: SplitterHandle
  ): Anon_Dra = {
    val __obj = js.Dynamic.literal(dra = dra, dragHandle = dragHandle, hover = hover, hoverHandle = hoverHandle, normal = normal, normalHandle = normalHandle)
  
    __obj.asInstanceOf[Anon_Dra]
  }
}

