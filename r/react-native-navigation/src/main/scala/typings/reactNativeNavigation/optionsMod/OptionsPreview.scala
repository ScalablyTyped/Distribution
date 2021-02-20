package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsPreview extends StObject {
  
  /**
    * List of actions that will appear underneath the preview window.
    * They can be nested for sub actions.
    */
  var actions: js.UndefOr[js.Array[OptionsPreviewAction]] = js.native
  
  /**
    * You can control if the users gesture will result in pushing
    * the preview screen into the stack.
    */
  var commit: js.UndefOr[Boolean] = js.native
  
  /**
    * Height of the preview
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Pass a react node tag to mark a SourceRect for a specific
    * peek and pop preview element.
    */
  var reactTag: js.UndefOr[Double] = js.native
  
  /**
    * You can set this property specify the width of the preview.
    * If the width is greater than the device width, it will be zoomed in.
    */
  var width: js.UndefOr[Double] = js.native
}
object OptionsPreview {
  
  @scala.inline
  def apply(): OptionsPreview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsPreview]
  }
  
  @scala.inline
  implicit class OptionsPreviewMutableBuilder[Self <: OptionsPreview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[OptionsPreviewAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: OptionsPreviewAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setReactTag(value: Double): Self = StObject.set(x, "reactTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactTagUndefined: Self = StObject.set(x, "reactTag", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
