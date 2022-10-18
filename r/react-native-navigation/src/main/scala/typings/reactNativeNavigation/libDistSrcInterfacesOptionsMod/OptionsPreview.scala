package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPreview extends StObject {
  
  /**
    * List of actions that will appear underneath the preview window.
    * They can be nested for sub actions.
    */
  var actions: js.UndefOr[js.Array[OptionsPreviewAction]] = js.undefined
  
  /**
    * You can control if the users gesture will result in pushing
    * the preview screen into the stack.
    */
  var commit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Height of the preview
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Pass a react node tag to mark a SourceRect for a specific
    * peek and pop preview element.
    */
  var reactTag: js.UndefOr[Double] = js.undefined
  
  /**
    * You can set this property specify the width of the preview.
    * If the width is greater than the device width, it will be zoomed in.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object OptionsPreview {
  
  inline def apply(): OptionsPreview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsPreview]
  }
  
  extension [Self <: OptionsPreview](x: Self) {
    
    inline def setActions(value: js.Array[OptionsPreviewAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: OptionsPreviewAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setReactTag(value: Double): Self = StObject.set(x, "reactTag", value.asInstanceOf[js.Any])
    
    inline def setReactTagUndefined: Self = StObject.set(x, "reactTag", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
