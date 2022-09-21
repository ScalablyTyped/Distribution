package typings.reactNativeZssRichTextEditor.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.ImageProps
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ColorHandler = js.Function1[/* color */ String, Unit]

type ContentGetHandler = js.Function0[js.Promise[String]]

type ContentSetHandler = js.Function1[/* html */ String, Unit]

type ContentStylesHandler = js.Function1[/* styles */ RichTextStyles, Unit]

type ElementStyles = StyleProp[ViewStyle | TextStyle | ImageStyle]

type FocusHandler = js.Function1[/* callback */ FunctionWithZeroArgs, Unit]

type FunctionWithZeroArgs = js.Function0[Unit]

type IconsMap = StringDictionary[ImageSourcePropType]

type ImageHandler = js.Function1[/* attributes */ ImageProps, Unit]

type LinkDialogHandler = js.Function2[/* optionalTitle */ String, /* optionalUrl */ String, Unit]

type LinkHandler = js.Function2[/* url */ String, /* title */ String, Unit]

type PlaceHolderHandler = js.Function1[/* placeholder */ String, Unit]

type RichTextStyles = StringDictionary[ElementStyles]
