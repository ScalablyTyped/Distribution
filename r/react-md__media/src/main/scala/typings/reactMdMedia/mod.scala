package typings.reactMdMedia

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdMedia.typesMediaContainerMod.MediaContainerProps
import typings.reactMdMedia.typesMediaContainerMod.MediaContainerWithAspectRatioProps
import typings.reactMdMedia.typesMediaOverlayMod.MediaOverlayProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/media", "MediaContainer")
  @js.native
  val MediaContainer: ForwardRefExoticComponent[
    (MediaContainerProps & RefAttributes[HTMLDivElement]) | (MediaContainerWithAspectRatioProps & RefAttributes[HTMLDivElement])
  ] = js.native
  
  @JSImport("@react-md/media", "MediaOverlay")
  @js.native
  val MediaOverlay: ForwardRefExoticComponent[MediaOverlayProps & RefAttributes[HTMLDivElement]] = js.native
}
