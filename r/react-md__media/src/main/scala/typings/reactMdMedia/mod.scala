package typings.reactMdMedia

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdMedia.mediaContainerMod.MediaContainerProps
import typings.reactMdMedia.mediaContainerMod.MediaContainerWithAspectRatioProps
import typings.reactMdMedia.mediaOverlayMod.MediaOverlayProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/media", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The `MediaContainer` component is used to make responsive images and videos
    * within your app. This component also allows for focing a specific aspect
    * ratio for these elements with both the `height` and `width` props are
    * provided.
    */
  val MediaContainer: ForwardRefExoticComponent[
    (MediaContainerProps with RefAttributes[HTMLDivElement]) | (MediaContainerWithAspectRatioProps with RefAttributes[HTMLDivElement])
  ] = js.native
  /**
    * The `MediaOverlay` component is used to create an overlay over specific media
    * items within the `MediaContainer` component. You will need to apply most of
    * your own styles as this is really just used for positioning.
    */
  val MediaOverlay: ForwardRefExoticComponent[MediaOverlayProps with RefAttributes[HTMLDivElement]] = js.native
}

