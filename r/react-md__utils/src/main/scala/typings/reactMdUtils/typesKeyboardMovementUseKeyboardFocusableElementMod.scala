package typings.reactMdUtils

import typings.react.mod.Ref
import typings.react.mod.RefCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementUseKeyboardFocusableElementMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement/useKeyboardFocusableElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useKeyboardFocusableElement[E /* <: HTMLElement */](): RefCallback[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusableElement")().asInstanceOf[RefCallback[E]]
  inline def useKeyboardFocusableElement[E /* <: HTMLElement */](ref: Ref[E]): RefCallback[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusableElement")(ref.asInstanceOf[js.Any]).asInstanceOf[RefCallback[E]]
}
