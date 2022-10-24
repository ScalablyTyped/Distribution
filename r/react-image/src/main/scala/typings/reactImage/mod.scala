package typings.reactImage

import typings.react.mod.global.JSX.Element
import typings.reactImage.anon.Error
import typings.reactImage.imgMod.ImgProps
import typings.reactImage.useImageMod.useImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Img(param0: ImgProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Img")(param0.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def useImage(param0: useImageProps): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("useImage")(param0.asInstanceOf[js.Any]).asInstanceOf[Error]
}
