package typings.reactMdUtils

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findSizingContainerMod {
  
  @JSImport("@react-md/utils/types/positioning/findSizingContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findSizingContainer(): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findSizingContainer")().asInstanceOf[HTMLElement | Null]
  inline def findSizingContainer(el: HTMLElement): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findSizingContainer")(el.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
}
