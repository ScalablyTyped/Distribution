package typings.reactFileUtils

import typings.react.mod.SVGProps
import typings.react.mod.global.JSX.Element
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v2Mod {
  
  @JSImport("react-file-utils/dist/components/FileIcon/FileIconSet/v2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FileArchiveIcon(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileArchiveIcon")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileArchiveIconAlt(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileArchiveIconAlt")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileAudioIcon(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileAudioIcon")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileAudioIconAlt(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileAudioIconAlt")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileCodeIcon(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileCodeIcon")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileCodeIconAlt(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileCodeIconAlt")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileExcelIcon(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExcelIcon")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileExcelIconAlt(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExcelIconAlt")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileFallbackIcon(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileFallbackIcon")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileImageIcon(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileImageIcon")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FilePdfIcon(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePdfIcon")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FilePowerPointIcon(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePowerPointIcon")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FilePowerPointIconAlt(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePowerPointIconAlt")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileVideoIcon(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileVideoIcon")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileVideoIconAlt(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileVideoIconAlt")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileWordIcon(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileWordIcon")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileWordIconAlt(hasClassNameSizeProps: IconPropsV2): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileWordIconAlt")(hasClassNameSizeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
    
    extension [Self <: IconPropsV2](x: Self) {
      
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
