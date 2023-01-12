package typings.reactFileUtils

import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactFileUtils.distComponentsFileIconFileIconSetV1Mod.IconPropsV1
import typings.reactFileUtils.distComponentsFileIconFileIconSetV2Mod.IconPropsV2
import typings.reactFileUtils.distComponentsFileIconIconMapMod.IconType
import typings.reactFileUtils.distComponentsFileIconIconMapMod.IconVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsFileIconFileIconMod {
  
  @JSImport("react-file-utils/dist/components/FileIcon/FileIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FileIcon(props: FileIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def mimeTypeToIcon(): ComponentType[IconPropsV1 | IconPropsV2] = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeTypeToIcon")().asInstanceOf[ComponentType[IconPropsV1 | IconPropsV2]]
  inline def mimeTypeToIcon(`type`: Unit, version: Unit, mimeType: String): ComponentType[IconPropsV1 | IconPropsV2] = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeTypeToIcon")(`type`.asInstanceOf[js.Any], version.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[ComponentType[IconPropsV1 | IconPropsV2]]
  inline def mimeTypeToIcon(`type`: Unit, version: IconVersion): ComponentType[IconPropsV1 | IconPropsV2] = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeTypeToIcon")(`type`.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[ComponentType[IconPropsV1 | IconPropsV2]]
  inline def mimeTypeToIcon(`type`: Unit, version: IconVersion, mimeType: String): ComponentType[IconPropsV1 | IconPropsV2] = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeTypeToIcon")(`type`.asInstanceOf[js.Any], version.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[ComponentType[IconPropsV1 | IconPropsV2]]
  inline def mimeTypeToIcon(`type`: IconType): ComponentType[IconPropsV1 | IconPropsV2] = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeTypeToIcon")(`type`.asInstanceOf[js.Any]).asInstanceOf[ComponentType[IconPropsV1 | IconPropsV2]]
  inline def mimeTypeToIcon(`type`: IconType, version: Unit, mimeType: String): ComponentType[IconPropsV1 | IconPropsV2] = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeTypeToIcon")(`type`.asInstanceOf[js.Any], version.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[ComponentType[IconPropsV1 | IconPropsV2]]
  inline def mimeTypeToIcon(`type`: IconType, version: IconVersion): ComponentType[IconPropsV1 | IconPropsV2] = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeTypeToIcon")(`type`.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[ComponentType[IconPropsV1 | IconPropsV2]]
  inline def mimeTypeToIcon(`type`: IconType, version: IconVersion, mimeType: String): ComponentType[IconPropsV1 | IconPropsV2] = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeTypeToIcon")(`type`.asInstanceOf[js.Any], version.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[ComponentType[IconPropsV1 | IconPropsV2]]
  
  trait FileIconProps extends StObject {
    
    var big: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var mimeType: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sizeSmall: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[IconType] = js.undefined
    
    var version: js.UndefOr[IconVersion] = js.undefined
  }
  object FileIconProps {
    
    inline def apply(): FileIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileIconProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileIconProps] (val x: Self) extends AnyVal {
      
      inline def setBig(value: Boolean): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
      
      inline def setBigUndefined: Self = StObject.set(x, "big", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeSmall(value: Double): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      inline def setSizeSmallUndefined: Self = StObject.set(x, "sizeSmall", js.undefined)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: IconType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVersion(value: IconVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
