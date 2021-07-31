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
  
  @scala.inline
  def Img(
    hasDecodeSrcListLoaderUnloaderContainerLoaderContainerUnloaderContainerImgPromiseCrossoriginUseSuspenseImgProps: ImgProps
  ): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Img")(hasDecodeSrcListLoaderUnloaderContainerLoaderContainerUnloaderContainerImgPromiseCrossoriginUseSuspenseImgProps.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @scala.inline
  def useImage(hasSrcListImgPromiseUseSuspense: useImageProps): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("useImage")(hasSrcListImgPromiseUseSuspense.asInstanceOf[js.Any]).asInstanceOf[Error]
}
