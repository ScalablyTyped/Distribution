package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnlayerOptions extends js.Object {
  val appearance: js.UndefOr[AppearanceConfig] = js.native
  val blocks: js.UndefOr[js.Array[js.Object]] = js.native
  val customCSS: js.UndefOr[js.Array[String]] = js.native
  val customJS: js.UndefOr[js.Array[String]] = js.native
  val designTags: js.UndefOr[StringList] = js.native
  val designTagsConfig: js.UndefOr[DesignTagConfig] = js.native
  val displayMode: js.UndefOr[DisplayMode] = js.native
  val editor: js.UndefOr[EditorConfig] = js.native
  val features: js.UndefOr[Features] = js.native
  val id: js.UndefOr[String] = js.native
  val locale: js.UndefOr[String] = js.native
  val mergeTags: js.UndefOr[js.Array[MergeTag]] = js.native
  val projectId: js.UndefOr[Double] = js.native
  val safeHtml: js.UndefOr[Boolean] = js.native
  val tools: js.UndefOr[ToolsConfig] = js.native
  val translations: js.UndefOr[Translations] = js.native
  val user: js.UndefOr[User] = js.native
}

object UnlayerOptions {
  @scala.inline
  def apply(): UnlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnlayerOptions]
  }
  @scala.inline
  implicit class UnlayerOptionsOps[Self <: UnlayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppearance(value: AppearanceConfig): Self = this.set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    @scala.inline
    def setBlocksVarargs(value: js.Object*): Self = this.set("blocks", js.Array(value :_*))
    @scala.inline
    def setBlocks(value: js.Array[js.Object]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlocks: Self = this.set("blocks", js.undefined)
    @scala.inline
    def setCustomCSSVarargs(value: String*): Self = this.set("customCSS", js.Array(value :_*))
    @scala.inline
    def setCustomCSS(value: js.Array[String]): Self = this.set("customCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomCSS: Self = this.set("customCSS", js.undefined)
    @scala.inline
    def setCustomJSVarargs(value: String*): Self = this.set("customJS", js.Array(value :_*))
    @scala.inline
    def setCustomJS(value: js.Array[String]): Self = this.set("customJS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomJS: Self = this.set("customJS", js.undefined)
    @scala.inline
    def setDesignTags(value: StringList): Self = this.set("designTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesignTags: Self = this.set("designTags", js.undefined)
    @scala.inline
    def setDesignTagsConfig(value: DesignTagConfig): Self = this.set("designTagsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesignTagsConfig: Self = this.set("designTagsConfig", js.undefined)
    @scala.inline
    def setDisplayMode(value: DisplayMode): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    @scala.inline
    def setEditor(value: EditorConfig): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setFeatures(value: Features): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMergeTagsVarargs(value: MergeTag*): Self = this.set("mergeTags", js.Array(value :_*))
    @scala.inline
    def setMergeTags(value: js.Array[MergeTag]): Self = this.set("mergeTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeTags: Self = this.set("mergeTags", js.undefined)
    @scala.inline
    def setProjectId(value: Double): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setSafeHtml(value: Boolean): Self = this.set("safeHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafeHtml: Self = this.set("safeHtml", js.undefined)
    @scala.inline
    def setTools(value: ToolsConfig): Self = this.set("tools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
    @scala.inline
    def setTranslations(value: Translations): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

