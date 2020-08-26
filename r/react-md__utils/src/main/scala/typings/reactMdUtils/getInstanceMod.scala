package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/wia-aria/getInstance", JSImport.Namespace)
@js.native
object getInstanceMod extends js.Object {
  def default(refOrInstance: RefOrInstance): HTMLElement | Null = js.native
  type RefOrInstance = HTMLElement | Null | (MutableRefObject[HTMLElement | Null])
}

