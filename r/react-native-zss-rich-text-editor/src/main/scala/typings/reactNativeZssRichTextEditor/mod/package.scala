package typings.reactNativeZssRichTextEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ColorHandler = js.Function1[/* color */ java.lang.String, scala.Unit]
  
  type ContentGetHandler = js.Function0[js.Promise[java.lang.String]]
  
  type ContentSetHandler = js.Function1[/* html */ java.lang.String, scala.Unit]
  
  type ContentStylesHandler = js.Function1[/* styles */ typings.reactNativeZssRichTextEditor.mod.RichTextStyles, scala.Unit]
  
  type ElementStyles = typings.reactNative.mod.StyleProp[
    typings.reactNative.mod.ViewStyle | typings.reactNative.mod.TextStyle | typings.reactNative.mod.ImageStyle
  ]
  
  type FocusHandler = js.Function1[
    /* callback */ typings.reactNativeZssRichTextEditor.mod.FunctionWithZeroArgs, 
    scala.Unit
  ]
  
  type FunctionWithZeroArgs = js.Function0[scala.Unit]
  
  type IconsMap = org.scalablytyped.runtime.StringDictionary[typings.reactNative.mod.ImageSourcePropType]
  
  type ImageHandler = js.Function1[/* attributes */ typings.reactNative.mod.ImageProps, scala.Unit]
  
  type LinkDialogHandler = js.Function2[/* optionalTitle */ java.lang.String, /* optionalUrl */ java.lang.String, scala.Unit]
  
  type LinkHandler = js.Function2[/* url */ java.lang.String, /* title */ java.lang.String, scala.Unit]
  
  type PlaceHolderHandler = js.Function1[/* placeholder */ java.lang.String, scala.Unit]
  
  type RichTextStyles = org.scalablytyped.runtime.StringDictionary[typings.reactNativeZssRichTextEditor.mod.ElementStyles]
}
