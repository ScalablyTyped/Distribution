package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackAnimationOptions extends StObject {
  
  /**
    * Configure animations for the bottom tabs
    */
  var bottomTabs: js.UndefOr[ViewAnimationOptions] = js.native
  
  /**
    * Configure animations for the content (Screen)
    */
  var content: js.UndefOr[ViewAnimationOptions] = js.native
  
  /**
    * Animations to be applied on views in the appearing or disappearing screens
    */
  var elementTransitions: js.UndefOr[js.Array[ElementTransition]] = js.native
  
  /**
    * Enable or disable the animation
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Animations to be applied on elements which are shared between the appearing and disappearing screens
    */
  var sharedElementTransitions: js.UndefOr[js.Array[SharedElementTransition]] = js.native
  
  /**
    * Configure animations for the top bar
    */
  var topBar: js.UndefOr[ViewAnimationOptions] = js.native
  
  /**
    * Wait for the View to render before start animation
    */
  var waitForRender: js.UndefOr[Boolean] = js.native
}
object StackAnimationOptions {
  
  @scala.inline
  def apply(): StackAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackAnimationOptions]
  }
  
  @scala.inline
  implicit class StackAnimationOptionsMutableBuilder[Self <: StackAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomTabs(value: ViewAnimationOptions): Self = StObject.set(x, "bottomTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomTabsUndefined: Self = StObject.set(x, "bottomTabs", js.undefined)
    
    @scala.inline
    def setContent(value: ViewAnimationOptions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setElementTransitions(value: js.Array[ElementTransition]): Self = StObject.set(x, "elementTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTransitionsUndefined: Self = StObject.set(x, "elementTransitions", js.undefined)
    
    @scala.inline
    def setElementTransitionsVarargs(value: ElementTransition*): Self = StObject.set(x, "elementTransitions", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setSharedElementTransitions(value: js.Array[SharedElementTransition]): Self = StObject.set(x, "sharedElementTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedElementTransitionsUndefined: Self = StObject.set(x, "sharedElementTransitions", js.undefined)
    
    @scala.inline
    def setSharedElementTransitionsVarargs(value: SharedElementTransition*): Self = StObject.set(x, "sharedElementTransitions", js.Array(value :_*))
    
    @scala.inline
    def setTopBar(value: ViewAnimationOptions): Self = StObject.set(x, "topBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBarUndefined: Self = StObject.set(x, "topBar", js.undefined)
    
    @scala.inline
    def setWaitForRender(value: Boolean): Self = StObject.set(x, "waitForRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForRenderUndefined: Self = StObject.set(x, "waitForRender", js.undefined)
  }
}
