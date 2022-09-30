package typings.storybookPreviewWeb

import typings.storybookPreviewWeb.storyRenderMod.RenderPhase
import typings.storybookPreviewWeb.webViewMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storybookPreviewWebStrings {
  
  @js.native
  sealed trait aborted
    extends StObject
       with RenderPhase
  inline def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait centered
    extends StObject
       with Layout
  inline def centered: centered = "centered".asInstanceOf[centered]
  
  @js.native
  sealed trait completed
    extends StObject
       with RenderPhase
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait errored
    extends StObject
       with RenderPhase
  inline def errored: errored = "errored".asInstanceOf[errored]
  
  @js.native
  sealed trait fullscreen
    extends StObject
       with Layout
  inline def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @js.native
  sealed trait loading
    extends StObject
       with RenderPhase
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait none
    extends StObject
       with Layout
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait padded
    extends StObject
       with Layout
  inline def padded: padded = "padded".asInstanceOf[padded]
  
  @js.native
  sealed trait played
    extends StObject
       with RenderPhase
  inline def played: played = "played".asInstanceOf[played]
  
  @js.native
  sealed trait playing
    extends StObject
       with RenderPhase
  inline def playing: playing = "playing".asInstanceOf[playing]
  
  @js.native
  sealed trait preparing
    extends StObject
       with RenderPhase
  inline def preparing: preparing = "preparing".asInstanceOf[preparing]
  
  @js.native
  sealed trait rendering
    extends StObject
       with RenderPhase
  inline def rendering: rendering = "rendering".asInstanceOf[rendering]
  
  @js.native
  sealed trait `sb-main-centered` extends StObject
  inline def `sb-main-centered`: `sb-main-centered` = "sb-main-centered".asInstanceOf[`sb-main-centered`]
  
  @js.native
  sealed trait `sb-main-fullscreen` extends StObject
  inline def `sb-main-fullscreen`: `sb-main-fullscreen` = "sb-main-fullscreen".asInstanceOf[`sb-main-fullscreen`]
  
  @js.native
  sealed trait `sb-main-padded` extends StObject
  inline def `sb-main-padded`: `sb-main-padded` = "sb-main-padded".asInstanceOf[`sb-main-padded`]
}
