package typings.reactDashEmailDashEditor.reactDashEmailDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnlayerOptions extends js.Object {
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
  val user: js.UndefOr[User] = js.undefined
}

object UnlayerOptions {
  @scala.inline
  def apply(
    appearance: AppearanceConfig = null,
    blocks: js.Array[js.Object] = null,
    customCSS: js.Array[String] = null,
    customJS: js.Array[String] = null,
    designTags: StringList = null,
    designTagsConfig: DesignTagConfig = null,
    displayMode: DisplayMode = null,
    editor: EditorConfig = null,
    features: Features = null,
    id: String = null,
    locale: String = null,
    mergeTags: js.Array[MergeTag] = null,
    projectId: Int | Double = null,
    safeHtml: js.UndefOr[Boolean] = js.undefined,
    tools: ToolsConfig = null,
    user: User = null
  ): UnlayerOptions = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance)
    if (blocks != null) __obj.updateDynamic("blocks")(blocks)
    if (customCSS != null) __obj.updateDynamic("customCSS")(customCSS)
    if (customJS != null) __obj.updateDynamic("customJS")(customJS)
    if (designTags != null) __obj.updateDynamic("designTags")(designTags)
    if (designTagsConfig != null) __obj.updateDynamic("designTagsConfig")(designTagsConfig)
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (features != null) __obj.updateDynamic("features")(features)
    if (id != null) __obj.updateDynamic("id")(id)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mergeTags != null) __obj.updateDynamic("mergeTags")(mergeTags)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (!js.isUndefined(safeHtml)) __obj.updateDynamic("safeHtml")(safeHtml)
    if (tools != null) __obj.updateDynamic("tools")(tools)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[UnlayerOptions]
  }
}

