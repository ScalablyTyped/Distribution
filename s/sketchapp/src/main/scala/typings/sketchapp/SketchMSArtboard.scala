package typings.sketchapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSArtboard extends StObject {
  
  var backgroundColor: SketchMSColor
  
  var frame: SketchMSRect
  
  var hasBackgroundColor: Boolean
  
  var horizontalRulerData: js.UndefOr[SketchMSRulerData] = js.undefined
  
  var includeBackgroundColorInExport: js.UndefOr[Boolean] = js.undefined
  
  var includeInCloudUpload: js.UndefOr[Boolean] = js.undefined
  
  var isFlowHome: js.UndefOr[Boolean] = js.undefined
  
  var verticalRulerData: js.UndefOr[SketchMSRulerData] = js.undefined
}
object SketchMSArtboard {
  
  @scala.inline
  def apply(backgroundColor: SketchMSColor, frame: SketchMSRect, hasBackgroundColor: Boolean): SketchMSArtboard = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasBackgroundColor = hasBackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSArtboard]
  }
  
  @scala.inline
  implicit class SketchMSArtboardMutableBuilder[Self <: SketchMSArtboard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: SketchMSColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: SketchMSRect): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBackgroundColor(value: Boolean): Self = StObject.set(x, "hasBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalRulerData(value: SketchMSRulerData): Self = StObject.set(x, "horizontalRulerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalRulerDataUndefined: Self = StObject.set(x, "horizontalRulerData", js.undefined)
    
    @scala.inline
    def setIncludeBackgroundColorInExport(value: Boolean): Self = StObject.set(x, "includeBackgroundColorInExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBackgroundColorInExportUndefined: Self = StObject.set(x, "includeBackgroundColorInExport", js.undefined)
    
    @scala.inline
    def setIncludeInCloudUpload(value: Boolean): Self = StObject.set(x, "includeInCloudUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInCloudUploadUndefined: Self = StObject.set(x, "includeInCloudUpload", js.undefined)
    
    @scala.inline
    def setIsFlowHome(value: Boolean): Self = StObject.set(x, "isFlowHome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFlowHomeUndefined: Self = StObject.set(x, "isFlowHome", js.undefined)
    
    @scala.inline
    def setVerticalRulerData(value: SketchMSRulerData): Self = StObject.set(x, "verticalRulerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalRulerDataUndefined: Self = StObject.set(x, "verticalRulerData", js.undefined)
  }
}
