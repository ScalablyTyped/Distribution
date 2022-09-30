package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightElementInDOM
  extends StObject
     with ElementAndRendererID {
  
  var displayName: String | Null
  
  var hideAfterTimeout: Boolean
  
  var openNativeElementsPanel: Boolean
  
  var scrollIntoView: Boolean
}
object HighlightElementInDOM {
  
  inline def apply(
    hideAfterTimeout: Boolean,
    id: Double,
    openNativeElementsPanel: Boolean,
    rendererID: RendererID,
    scrollIntoView: Boolean
  ): HighlightElementInDOM = {
    val __obj = js.Dynamic.literal(hideAfterTimeout = hideAfterTimeout.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], openNativeElementsPanel = openNativeElementsPanel.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any], scrollIntoView = scrollIntoView.asInstanceOf[js.Any], displayName = null)
    __obj.asInstanceOf[HighlightElementInDOM]
  }
  
  extension [Self <: HighlightElementInDOM](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setHideAfterTimeout(value: Boolean): Self = StObject.set(x, "hideAfterTimeout", value.asInstanceOf[js.Any])
    
    inline def setOpenNativeElementsPanel(value: Boolean): Self = StObject.set(x, "openNativeElementsPanel", value.asInstanceOf[js.Any])
    
    inline def setScrollIntoView(value: Boolean): Self = StObject.set(x, "scrollIntoView", value.asInstanceOf[js.Any])
  }
}
