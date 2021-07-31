package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInstanceMod {
  
  @JSImport("@react-md/utils/types/wia-aria/getInstance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getInstance(refOrInstance: RefOrInstance): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(refOrInstance.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  
  type RefOrInstance = HTMLElement | Null | (MutableRefObject[HTMLElement | Null])
}
