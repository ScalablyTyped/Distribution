package typings.storybookReactDomShim.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgTypeTargetsV7 extends StObject {
  
  /**
    * Filter args with a "target" on the type from the render function (EXPERIMENTAL)
    */
  var argTypeTargetsV7: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Build stories.json automatically on start/build
    */
  var buildStoriesJson: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Apply decorators from preview.js before decorators from addons or frameworks
    */
  var legacyDecoratorFileOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use legacy MDX1, to help smooth migration to 7.0
    */
  var legacyMdx1: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Activate on demand story store
    */
  var storyStoreV7: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not throw errors if using `.mdx` files in SSv7
    * (for internal use in sandboxes)
    */
  var storyStoreV7MdxErrors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Warn when there is a pre-6.0 hierarchy separator ('.' / '|') in the story title.
    * Will be removed in 7.0.
    */
  var warnOnLegacyHierarchySeparator: js.UndefOr[Boolean] = js.undefined
}
object ArgTypeTargetsV7 {
  
  inline def apply(): ArgTypeTargetsV7 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgTypeTargetsV7]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgTypeTargetsV7] (val x: Self) extends AnyVal {
    
    inline def setArgTypeTargetsV7(value: Boolean): Self = StObject.set(x, "argTypeTargetsV7", value.asInstanceOf[js.Any])
    
    inline def setArgTypeTargetsV7Undefined: Self = StObject.set(x, "argTypeTargetsV7", js.undefined)
    
    inline def setBuildStoriesJson(value: Boolean): Self = StObject.set(x, "buildStoriesJson", value.asInstanceOf[js.Any])
    
    inline def setBuildStoriesJsonUndefined: Self = StObject.set(x, "buildStoriesJson", js.undefined)
    
    inline def setLegacyDecoratorFileOrder(value: Boolean): Self = StObject.set(x, "legacyDecoratorFileOrder", value.asInstanceOf[js.Any])
    
    inline def setLegacyDecoratorFileOrderUndefined: Self = StObject.set(x, "legacyDecoratorFileOrder", js.undefined)
    
    inline def setLegacyMdx1(value: Boolean): Self = StObject.set(x, "legacyMdx1", value.asInstanceOf[js.Any])
    
    inline def setLegacyMdx1Undefined: Self = StObject.set(x, "legacyMdx1", js.undefined)
    
    inline def setStoryStoreV7(value: Boolean): Self = StObject.set(x, "storyStoreV7", value.asInstanceOf[js.Any])
    
    inline def setStoryStoreV7MdxErrors(value: Boolean): Self = StObject.set(x, "storyStoreV7MdxErrors", value.asInstanceOf[js.Any])
    
    inline def setStoryStoreV7MdxErrorsUndefined: Self = StObject.set(x, "storyStoreV7MdxErrors", js.undefined)
    
    inline def setStoryStoreV7Undefined: Self = StObject.set(x, "storyStoreV7", js.undefined)
    
    inline def setWarnOnLegacyHierarchySeparator(value: Boolean): Self = StObject.set(x, "warnOnLegacyHierarchySeparator", value.asInstanceOf[js.Any])
    
    inline def setWarnOnLegacyHierarchySeparatorUndefined: Self = StObject.set(x, "warnOnLegacyHierarchySeparator", js.undefined)
  }
}
