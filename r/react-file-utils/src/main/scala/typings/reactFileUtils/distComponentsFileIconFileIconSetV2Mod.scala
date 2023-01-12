package typings.reactFileUtils

import typings.react.mod.SVGProps
import typings.react.mod.global.JSX.Element
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsFileIconFileIconSetV2Mod {
  
  @JSImport("react-file-utils/dist/components/FileIcon/FileIconSet/v2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FileArchiveIcon(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileArchiveIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileArchiveIconAlt(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileArchiveIconAlt")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileAudioIcon(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileAudioIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileAudioIconAlt(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileAudioIconAlt")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileCodeIcon(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileCodeIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileCodeIconAlt(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileCodeIconAlt")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileExcelIcon(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExcelIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileExcelIconAlt(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExcelIconAlt")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileFallbackIcon(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileFallbackIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileImageIcon(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileImageIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FilePdfIcon(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePdfIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FilePowerPointIcon(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePowerPointIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FilePowerPointIconAlt(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePowerPointIconAlt")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileVideoIcon(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileVideoIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileVideoIconAlt(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileVideoIconAlt")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileWordIcon(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileWordIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileWordIconAlt(param0: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileWordIconAlt")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait IconPropsV2
    extends StObject
       with SVGProps[SVGSVGElement] {
    
    var mimeType: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    @JSName("type")
    var type_IconPropsV2: js.UndefOr[IconTypeV2] = js.undefined
  }
  object IconPropsV2 {
    
    inline def apply(): IconPropsV2 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconPropsV2]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconPropsV2] (val x: Self) extends AnyVal {
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: IconTypeV2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFileUtils.reactFileUtilsStrings.standard
    - typings.reactFileUtils.reactFileUtilsStrings.alt
  */
  trait IconTypeV2 extends StObject
  object IconTypeV2 {
    
    inline def alt: typings.reactFileUtils.reactFileUtilsStrings.alt = "alt".asInstanceOf[typings.reactFileUtils.reactFileUtilsStrings.alt]
    
    inline def standard: typings.reactFileUtils.reactFileUtilsStrings.standard = "standard".asInstanceOf[typings.reactFileUtils.reactFileUtilsStrings.standard]
  }
}
