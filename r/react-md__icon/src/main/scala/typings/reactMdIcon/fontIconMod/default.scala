package typings.reactMdIcon.fontIconMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `FontIcon` component is used for rendering a font-icon library's icon.
  * The default is to use the `material-icons` library, but others can be used as
  * well.
  *
  * If you are using another font icon library that does not always create icons
  * with a perfect 1:1 scale (such as font awesome), it is recommended to use the
  * `forceSize` and `forceFontSize` props to fix the sizing issues.
  */
@JSImport("@react-md/icon/types/FontIcon", JSImport.Default)
@js.native
object default extends TopLevel[ForwardRefExoticComponent[FontIconProps with RefAttributes[HTMLElement]]]

