package typings.reactFileUtils

import typings.react.mod.SVGProps
import typings.react.mod.global.JSX.Element
import typings.reactFileUtils.anon.Dictx
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1Mod {
  
  @JSImport("react-file-utils/dist/components/FileIcon/FileIconSet/v1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FileAltIcon(hasSizeProps: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileAltIcon")(hasSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileArchiveIcon(hasSizeProps: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileArchiveIcon")(hasSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileAudioIcon(hasSizeProps: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileAudioIcon")(hasSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileCodeIcon(hasSizeProps: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileCodeIcon")(hasSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileExcelIcon(hasSizeProps: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExcelIcon")(hasSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileFallbackIcon(hasSizeProps: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileFallbackIcon")(hasSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileImageIcon(hasSizeProps: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileImageIcon")(hasSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FilePdfIcon(hasSizeProps: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePdfIcon")(hasSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FilePowerPointIcon(hasSizeProps: Dictx): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePowerPointIcon")(hasSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileVideoIcon(hasSizeProps: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileVideoIcon")(hasSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileWordIcon(hasSizeProps: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileWordIcon")(hasSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait IconPropsV1
    extends StObject
       with SVGProps[SVGSVGElement] {
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object IconPropsV1 {
    
    inline def apply(): IconPropsV1 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconPropsV1]
    }
    
    extension [Self <: IconPropsV1](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
