package typings.storybookCoreCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgTypeTargetsV7 extends StObject {
  
  /**
    * Filter args with a "target" on the type from the render function (EXPERIMENTAL)
    */
  var argTypeTargetsV7: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use Storybook 7.0 babel config scheme
    */
  var babelModeV7: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable a set of planned breaking changes for SB7.0
    */
  var breakingChangesV7: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Build stories.json automatically on start/build
    */
  var buildStoriesJson: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows to disable emotion webpack alias for emotion packages. (will be removed in 7.0)
    */
  var emotionAlias: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable the step debugger functionality in Addon-interactions.
    */
  var interactionsDebugger: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Activate modern inline rendering
    */
  var modernInlineRender: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows to disable deprecated implicit PostCSS loader. (will be removed in 7.0)
    */
  var postcss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Activate preview of CSF v3.0
    *
    * @deprecated This is always on now from 6.4 regardless of the setting
    */
  var previewCsfV3: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Preview MDX2 support, will become default in 7.0
    */
  var previewMdx2: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Activate on demand story store
    */
  var storyStoreV7: js.UndefOr[Boolean] = js.undefined
  
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
    
    inline def setBabelModeV7(value: Boolean): Self = StObject.set(x, "babelModeV7", value.asInstanceOf[js.Any])
    
    inline def setBabelModeV7Undefined: Self = StObject.set(x, "babelModeV7", js.undefined)
    
    inline def setBreakingChangesV7(value: Boolean): Self = StObject.set(x, "breakingChangesV7", value.asInstanceOf[js.Any])
    
    inline def setBreakingChangesV7Undefined: Self = StObject.set(x, "breakingChangesV7", js.undefined)
    
    inline def setBuildStoriesJson(value: Boolean): Self = StObject.set(x, "buildStoriesJson", value.asInstanceOf[js.Any])
    
    inline def setBuildStoriesJsonUndefined: Self = StObject.set(x, "buildStoriesJson", js.undefined)
    
    inline def setEmotionAlias(value: Boolean): Self = StObject.set(x, "emotionAlias", value.asInstanceOf[js.Any])
    
    inline def setEmotionAliasUndefined: Self = StObject.set(x, "emotionAlias", js.undefined)
    
    inline def setInteractionsDebugger(value: Boolean): Self = StObject.set(x, "interactionsDebugger", value.asInstanceOf[js.Any])
    
    inline def setInteractionsDebuggerUndefined: Self = StObject.set(x, "interactionsDebugger", js.undefined)
    
    inline def setModernInlineRender(value: Boolean): Self = StObject.set(x, "modernInlineRender", value.asInstanceOf[js.Any])
    
    inline def setModernInlineRenderUndefined: Self = StObject.set(x, "modernInlineRender", js.undefined)
    
    inline def setPostcss(value: Boolean): Self = StObject.set(x, "postcss", value.asInstanceOf[js.Any])
    
    inline def setPostcssUndefined: Self = StObject.set(x, "postcss", js.undefined)
    
    inline def setPreviewCsfV3(value: Boolean): Self = StObject.set(x, "previewCsfV3", value.asInstanceOf[js.Any])
    
    inline def setPreviewCsfV3Undefined: Self = StObject.set(x, "previewCsfV3", js.undefined)
    
    inline def setPreviewMdx2(value: Boolean): Self = StObject.set(x, "previewMdx2", value.asInstanceOf[js.Any])
    
    inline def setPreviewMdx2Undefined: Self = StObject.set(x, "previewMdx2", js.undefined)
    
    inline def setStoryStoreV7(value: Boolean): Self = StObject.set(x, "storyStoreV7", value.asInstanceOf[js.Any])
    
    inline def setStoryStoreV7Undefined: Self = StObject.set(x, "storyStoreV7", js.undefined)
    
    inline def setWarnOnLegacyHierarchySeparator(value: Boolean): Self = StObject.set(x, "warnOnLegacyHierarchySeparator", value.asInstanceOf[js.Any])
    
    inline def setWarnOnLegacyHierarchySeparatorUndefined: Self = StObject.set(x, "warnOnLegacyHierarchySeparator", js.undefined)
  }
}
