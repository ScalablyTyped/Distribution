package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomMedia
  extends StObject
     with ICustomControl {
  
  var component: media
  
  var layoutRef: String
}
object ICustomMedia {
  
  @scala.inline
  def apply(label: String, layoutRef: String, ref: String, `type`: String): ICustomMedia = {
    val __obj = js.Dynamic.literal(component = "media", label = label.asInstanceOf[js.Any], layoutRef = layoutRef.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomMedia]
  }
  
  @scala.inline
  implicit class ICustomMediaMutableBuilder[Self <: ICustomMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: media): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutRef(value: String): Self = StObject.set(x, "layoutRef", value.asInstanceOf[js.Any])
  }
}
