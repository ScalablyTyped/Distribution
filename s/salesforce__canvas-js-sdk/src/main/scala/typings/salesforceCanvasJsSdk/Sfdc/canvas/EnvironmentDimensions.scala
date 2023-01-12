package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://developer.salesforce.com/docs/atlas.en-us.platform_connect.meta/platform_connect/dimensions_object.htm
trait EnvironmentDimensions extends StObject {
  
  val clientHeight: String
  
  val clientWidth: String
  
  val height: String
  
  val maxHeight: String
  
  val maxWidth: String
  
  val width: String
}
object EnvironmentDimensions {
  
  inline def apply(
    clientHeight: String,
    clientWidth: String,
    height: String,
    maxHeight: String,
    maxWidth: String,
    width: String
  ): EnvironmentDimensions = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentDimensions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentDimensions] (val x: Self) extends AnyVal {
    
    inline def setClientHeight(value: String): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    inline def setClientWidth(value: String): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
