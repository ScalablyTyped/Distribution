package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnlayerOptions extends StObject {
  
  val appearance: js.UndefOr[AppearanceConfig] = js.undefined
  
  val blocks: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  val customCSS: js.UndefOr[js.Array[String]] = js.undefined
  
  val customJS: js.UndefOr[js.Array[String]] = js.undefined
  
  val designTags: js.UndefOr[StringList] = js.undefined
  
  val designTagsConfig: js.UndefOr[DesignTagConfig] = js.undefined
  
  val displayMode: js.UndefOr[DisplayMode] = js.undefined
  
  val editor: js.UndefOr[EditorConfig] = js.undefined
  
  val features: js.UndefOr[Features] = js.undefined
  
  val id: js.UndefOr[String] = js.undefined
  
  val locale: js.UndefOr[String] = js.undefined
  
  val mergeTags: js.UndefOr[js.Array[MergeTag]] = js.undefined
  
  val projectId: js.UndefOr[Double] = js.undefined
  
  val safeHtml: js.UndefOr[Boolean] = js.undefined
  
  val tools: js.UndefOr[ToolsConfig] = js.undefined
  
  val translations: js.UndefOr[Translations] = js.undefined
  
  val user: js.UndefOr[User] = js.undefined
}
object UnlayerOptions {
  
  @scala.inline
  def apply(): UnlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnlayerOptions]
  }
  
  @scala.inline
  implicit class UnlayerOptionsMutableBuilder[Self <: UnlayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppearance(value: AppearanceConfig): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    @scala.inline
    def setBlocks(value: js.Array[js.Object]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
    
    @scala.inline
    def setBlocksVarargs(value: js.Object*): Self = StObject.set(x, "blocks", js.Array(value :_*))
    
    @scala.inline
    def setCustomCSS(value: js.Array[String]): Self = StObject.set(x, "customCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCSSUndefined: Self = StObject.set(x, "customCSS", js.undefined)
    
    @scala.inline
    def setCustomCSSVarargs(value: String*): Self = StObject.set(x, "customCSS", js.Array(value :_*))
    
    @scala.inline
    def setCustomJS(value: js.Array[String]): Self = StObject.set(x, "customJS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomJSUndefined: Self = StObject.set(x, "customJS", js.undefined)
    
    @scala.inline
    def setCustomJSVarargs(value: String*): Self = StObject.set(x, "customJS", js.Array(value :_*))
    
    @scala.inline
    def setDesignTags(value: StringList): Self = StObject.set(x, "designTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignTagsConfig(value: DesignTagConfig): Self = StObject.set(x, "designTagsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignTagsConfigUndefined: Self = StObject.set(x, "designTagsConfig", js.undefined)
    
    @scala.inline
    def setDesignTagsUndefined: Self = StObject.set(x, "designTags", js.undefined)
    
    @scala.inline
    def setDisplayMode(value: DisplayMode): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    @scala.inline
    def setEditor(value: EditorConfig): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    @scala.inline
    def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMergeTags(value: js.Array[MergeTag]): Self = StObject.set(x, "mergeTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeTagsUndefined: Self = StObject.set(x, "mergeTags", js.undefined)
    
    @scala.inline
    def setMergeTagsVarargs(value: MergeTag*): Self = StObject.set(x, "mergeTags", js.Array(value :_*))
    
    @scala.inline
    def setProjectId(value: Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSafeHtml(value: Boolean): Self = StObject.set(x, "safeHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeHtmlUndefined: Self = StObject.set(x, "safeHtml", js.undefined)
    
    @scala.inline
    def setTools(value: ToolsConfig): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    @scala.inline
    def setTranslations(value: Translations): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
