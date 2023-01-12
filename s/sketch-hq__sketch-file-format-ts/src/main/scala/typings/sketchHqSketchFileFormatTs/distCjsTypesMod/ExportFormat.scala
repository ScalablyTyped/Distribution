package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.exportFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportFormat
  extends StObject
     with AnyObject {
  
  var _class: exportFormat
  
  var absoluteSize: Double
  
  var fileFormat: ExportFileFormat
  
  var name: String
  
  var namingScheme: js.UndefOr[ExportFormatNamingScheme] = js.undefined
  
  var scale: Double
  
  var visibleScaleType: VisibleScaleType
}
object ExportFormat {
  
  inline def apply(
    absoluteSize: Double,
    fileFormat: ExportFileFormat,
    name: String,
    scale: Double,
    visibleScaleType: VisibleScaleType
  ): ExportFormat = {
    val __obj = js.Dynamic.literal(_class = "exportFormat", absoluteSize = absoluteSize.asInstanceOf[js.Any], fileFormat = fileFormat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], visibleScaleType = visibleScaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportFormat] (val x: Self) extends AnyVal {
    
    inline def setAbsoluteSize(value: Double): Self = StObject.set(x, "absoluteSize", value.asInstanceOf[js.Any])
    
    inline def setFileFormat(value: ExportFileFormat): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamingScheme(value: ExportFormatNamingScheme): Self = StObject.set(x, "namingScheme", value.asInstanceOf[js.Any])
    
    inline def setNamingSchemeUndefined: Self = StObject.set(x, "namingScheme", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setVisibleScaleType(value: VisibleScaleType): Self = StObject.set(x, "visibleScaleType", value.asInstanceOf[js.Any])
    
    inline def set_class(value: exportFormat): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
