package typings.reactMdOverlay

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdOverlay.overlayMod.OverlayProps
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition.CSSTransitionClassNamesObject> */
  object DEFAULT_OVERLAY_CLASSNAMES {
    
    @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_CLASSNAMES.appear")
    @js.native
    val appear: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_CLASSNAMES.appearActive")
    @js.native
    val appearActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_CLASSNAMES.appearDone")
    @js.native
    val appearDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_CLASSNAMES.enter")
    @js.native
    val enter: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_CLASSNAMES.enterActive")
    @js.native
    val enterActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_CLASSNAMES.enterDone")
    @js.native
    val enterDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_CLASSNAMES.exit")
    @js.native
    val exit: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_CLASSNAMES.exitActive")
    @js.native
    val exitActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_CLASSNAMES.exitDone")
    @js.native
    val exitDone: js.UndefOr[String] = js.native
  }
  
  @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_TIMEOUT")
  @js.native
  val DEFAULT_OVERLAY_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/overlay", "Overlay")
  @js.native
  val Overlay: ForwardRefExoticComponent[OverlayProps & RefAttributes[HTMLDivElement]] = js.native
}
