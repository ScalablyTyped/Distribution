package typings.reactMdMedia

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdMedia.mediaContainerMod.MediaContainerProps
import typings.reactMdMedia.mediaContainerMod.MediaContainerWithAspectRatioProps
import typings.reactMdMedia.mediaOverlayMod.MediaOverlayProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/media", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val MediaContainer: ForwardRefExoticComponent[
    (MediaContainerProps with RefAttributes[HTMLDivElement]) | (MediaContainerWithAspectRatioProps with RefAttributes[HTMLDivElement])
  ] = js.native
  
  val MediaOverlay: ForwardRefExoticComponent[MediaOverlayProps with RefAttributes[HTMLDivElement]] = js.native
}
