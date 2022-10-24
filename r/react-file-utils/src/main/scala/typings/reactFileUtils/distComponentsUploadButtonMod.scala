package typings.reactFileUtils

import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.reactFileUtils.anon.OnFileChange
import typings.reactFileUtils.reactFileUtilsStrings.`type`
import typings.reactFileUtils.reactFileUtilsStrings.input
import typings.reactFileUtils.reactFileUtilsStrings.onChange
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsUploadButtonMod {
  
  @JSImport("react-file-utils/dist/components/UploadButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def UploadButton(param0: UploadButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("UploadButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type UploadButtonProps = OnFileChange & (Omit[ComponentProps[input], `type` | onChange])
}
