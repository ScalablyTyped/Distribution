package typings.reactMdMedia.mediaContainerMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `MediaContainer` component is used to make responsive images and videos
  * within your app. This component also allows for focing a specific aspect
  * ratio for these elements with both the `height` and `width` props are
  * provided.
  */
@JSImport("@react-md/media/types/MediaContainer", JSImport.Default)
@js.native
object default extends TopLevel[
      ForwardRefExoticComponent[
        (MediaContainerProps with RefAttributes[HTMLDivElement]) | (MediaContainerWithAspectRatioProps with RefAttributes[HTMLDivElement])
      ]
    ]

