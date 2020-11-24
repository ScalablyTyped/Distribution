package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/wia-aria/getInstance", JSImport.Namespace)
@js.native
object getInstanceMod extends js.Object {
  
  def getInstance(refOrInstance: RefOrInstance): HTMLElement | Null = js.native
  
  type RefOrInstance = HTMLElement | Null | (MutableRefObject[HTMLElement | Null])
}
