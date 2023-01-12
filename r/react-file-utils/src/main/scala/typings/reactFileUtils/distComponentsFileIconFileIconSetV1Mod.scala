package typings.reactFileUtils

import typings.react.mod.SVGProps
import typings.react.mod.global.JSX.Element
import typings.reactFileUtils.anon.Dictx
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsFileIconFileIconSetV1Mod {
  
  @JSImport("react-file-utils/dist/components/FileIcon/FileIconSet/v1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FileAltIcon(param0: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileAltIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileArchiveIcon(param0: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileArchiveIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileAudioIcon(param0: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileAudioIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileCodeIcon(param0: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileCodeIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileExcelIcon(param0: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExcelIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileFallbackIcon(param0: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileFallbackIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileImageIcon(param0: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileImageIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FilePdfIcon(param0: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePdfIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FilePowerPointIcon(param0: Dictx): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePowerPointIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileVideoIcon(param0: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileVideoIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileWordIcon(param0: IconPropsV1): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileWordIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconPropsV1] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
