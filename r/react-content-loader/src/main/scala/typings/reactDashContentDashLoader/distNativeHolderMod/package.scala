package typings.reactDashContentDashLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distNativeHolderMod {
  import typings.reactDashContentDashLoader.distNativeInterfaceMod.IContentLoaderProps
  import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.animate
  import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.height
  import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.preserveAspectRatio
  import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.primaryColor
  import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.rtl
  import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.secondaryColor
  import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.speed
  import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.style
  import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.width
  import typings.std.Pick
  import typings.std.Required

  type DefaultProps = Pick[
    Required[IContentLoaderProps], 
    animate | height | preserveAspectRatio | primaryColor | rtl | secondaryColor | speed | style | width
  ]
}
