package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvImageInfo extends StObject {
  
  var colorModel: String
  
  var format: String
  
  var height: Double
  
  var width: Double
}
object AvImageInfo {
  
  @scala.inline
  def apply(colorModel: String, format: String, height: Double, width: Double): AvImageInfo = {
    val __obj = js.Dynamic.literal(colorModel = colorModel.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvImageInfo]
  }
  
  @scala.inline
  implicit class AvImageInfoMutableBuilder[Self <: AvImageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorModel(value: String): Self = StObject.set(x, "colorModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
