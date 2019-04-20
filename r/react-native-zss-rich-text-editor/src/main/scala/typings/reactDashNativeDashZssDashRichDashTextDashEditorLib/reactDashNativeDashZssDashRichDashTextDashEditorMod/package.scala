package typings
package reactDashNativeDashZssDashRichDashTextDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashZssDashRichDashTextDashEditorMod {
  type ColorHandler = js.Function1[/* color */ java.lang.String, scala.Unit]
  type ContentGetHandler = js.Function0[js.Promise[java.lang.String]]
  type ContentSetHandler = js.Function1[/* html */ java.lang.String, scala.Unit]
  type ContentStylesHandler = js.Function1[/* styles */ RichTextStyles, scala.Unit]
  type ElementStyles = reactDashNativeLib.reactDashNativeMod.StyleProp[
    reactDashNativeLib.reactDashNativeMod.ViewStyle | reactDashNativeLib.reactDashNativeMod.TextStyle | reactDashNativeLib.reactDashNativeMod.ImageStyle
  ]
  type FocusHandler = js.Function1[/* callback */ FunctionWithZeroArgs, scala.Unit]
  type FunctionWithZeroArgs = js.Function0[scala.Unit]
  type IconsMap = org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.reactDashNativeMod.ImageSourcePropType]
  type ImageHandler = js.Function1[/* attributes */ reactDashNativeLib.reactDashNativeMod.ImageProps, scala.Unit]
  type LinkDialogHandler = js.Function2[/* optionalTitle */ java.lang.String, /* optionalUrl */ java.lang.String, scala.Unit]
  type LinkHandler = js.Function2[/* url */ java.lang.String, /* title */ java.lang.String, scala.Unit]
  type PlaceHolderHandler = js.Function1[/* placeholder */ java.lang.String, scala.Unit]
  type RichTextStyles = org.scalablytyped.runtime.StringDictionary[ElementStyles]
}
