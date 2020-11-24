package typings.reactMdUtils

import typings.reactMdUtils.typesMod.Coords
import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/positioning/getElementRect", JSImport.Namespace)
@js.native
object getElementRectMod extends js.Object {
  
  def getElementRect(element: HTMLElement): DOMRect | ClientRect = js.native
  def getElementRect(element: HTMLElement, coords: Coords): DOMRect | ClientRect = js.native
}
