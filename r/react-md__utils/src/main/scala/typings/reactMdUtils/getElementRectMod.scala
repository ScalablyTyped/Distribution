package typings.reactMdUtils

import typings.reactMdUtils.typesMod.Coords
import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/positioning/getElementRect", JSImport.Namespace)
@js.native
object getElementRectMod extends js.Object {
  def default(element: HTMLElement): DOMRect | ClientRect = js.native
  def default(element: HTMLElement, coords: Coords): DOMRect | ClientRect = js.native
}

