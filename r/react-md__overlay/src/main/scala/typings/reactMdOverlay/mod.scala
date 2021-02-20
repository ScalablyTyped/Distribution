package typings.reactMdOverlay

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdOverlay.overlayMod.OverlayProps
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_CLASSNAMES")
  @js.native
  val DEFAULT_OVERLAY_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_TIMEOUT")
  @js.native
  val DEFAULT_OVERLAY_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/overlay", "Overlay")
  @js.native
  val Overlay: ForwardRefExoticComponent[OverlayProps with RefAttributes[HTMLDivElement]] = js.native
}
