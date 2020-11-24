package typings.reactMdOverlay

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdOverlay.overlayMod.OverlayProps
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/overlay", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val DEFAULT_OVERLAY_CLASSNAMES: CSSTransitionClassNames = js.native
  
  val DEFAULT_OVERLAY_TIMEOUT: TransitionTimeout = js.native
  
  val Overlay: ForwardRefExoticComponent[OverlayProps with RefAttributes[HTMLDivElement]] = js.native
}
