package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInstanceMod {
  
  @JSImport("@react-md/utils/types/wia-aria/getInstance", "getInstance")
  @js.native
  def getInstance(refOrInstance: RefOrInstance): HTMLElement | Null = js.native
  
  type RefOrInstance = HTMLElement | Null | (MutableRefObject[HTMLElement | Null])
}
