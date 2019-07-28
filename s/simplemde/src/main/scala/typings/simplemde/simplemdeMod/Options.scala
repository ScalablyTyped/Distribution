package typings.simplemde.simplemdeMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoDownloadFontAwesome: js.UndefOr[Boolean] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var autosave: js.UndefOr[AutoSaveOptions] = js.undefined
  var blockStyles: js.UndefOr[BlockStyleOptions] = js.undefined
  var element: js.UndefOr[HTMLElement] = js.undefined
  var forceSync: js.UndefOr[Boolean] = js.undefined
  var hideIcons: js.UndefOr[js.Array[String]] = js.undefined
  var indentWithTabs: js.UndefOr[Boolean] = js.undefined
  var initialValue: js.UndefOr[String] = js.undefined
  var insertTexts: js.UndefOr[InsertTextOptions] = js.undefined
  var lineWrapping: js.UndefOr[Boolean] = js.undefined
  var parsingConfig: js.UndefOr[ParsingOptions] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var previewRender: js.UndefOr[
    js.Function2[/* markdownPlaintext */ String, /* previewElement */ js.UndefOr[HTMLElement], String]
  ] = js.undefined
  var promptURLs: js.UndefOr[Boolean] = js.undefined
  var renderingConfig: js.UndefOr[RenderingOptions] = js.undefined
  var shortcuts: js.UndefOr[ShortcutsArray] = js.undefined
  var showIcons: js.UndefOr[js.Array[String]] = js.undefined
  var spellChecker: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[Boolean | (js.Array[String | StatusBarItem])] = js.undefined
  var styleSelectedText: js.UndefOr[Boolean] = js.undefined
  var tabSize: js.UndefOr[Double] = js.undefined
  var toolbar: js.UndefOr[Boolean | (js.Array[String | ToolbarIcon])] = js.undefined
  var toolbarTips: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoDownloadFontAwesome: js.UndefOr[Boolean] = js.undefined,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    autosave: AutoSaveOptions = null,
    blockStyles: BlockStyleOptions = null,
    element: HTMLElement = null,
    forceSync: js.UndefOr[Boolean] = js.undefined,
    hideIcons: js.Array[String] = null,
    indentWithTabs: js.UndefOr[Boolean] = js.undefined,
    initialValue: String = null,
    insertTexts: InsertTextOptions = null,
    lineWrapping: js.UndefOr[Boolean] = js.undefined,
    parsingConfig: ParsingOptions = null,
    placeholder: String = null,
    previewRender: (/* markdownPlaintext */ String, /* previewElement */ js.UndefOr[HTMLElement]) => String = null,
    promptURLs: js.UndefOr[Boolean] = js.undefined,
    renderingConfig: RenderingOptions = null,
    shortcuts: ShortcutsArray = null,
    showIcons: js.Array[String] = null,
    spellChecker: js.UndefOr[Boolean] = js.undefined,
    status: Boolean | (js.Array[String | StatusBarItem]) = null,
    styleSelectedText: js.UndefOr[Boolean] = js.undefined,
    tabSize: Int | Double = null,
    toolbar: Boolean | (js.Array[String | ToolbarIcon]) = null,
    toolbarTips: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDownloadFontAwesome)) __obj.updateDynamic("autoDownloadFontAwesome")(autoDownloadFontAwesome)
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus)
    if (autosave != null) __obj.updateDynamic("autosave")(autosave)
    if (blockStyles != null) __obj.updateDynamic("blockStyles")(blockStyles)
    if (element != null) __obj.updateDynamic("element")(element)
    if (!js.isUndefined(forceSync)) __obj.updateDynamic("forceSync")(forceSync)
    if (hideIcons != null) __obj.updateDynamic("hideIcons")(hideIcons)
    if (!js.isUndefined(indentWithTabs)) __obj.updateDynamic("indentWithTabs")(indentWithTabs)
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue)
    if (insertTexts != null) __obj.updateDynamic("insertTexts")(insertTexts)
    if (!js.isUndefined(lineWrapping)) __obj.updateDynamic("lineWrapping")(lineWrapping)
    if (parsingConfig != null) __obj.updateDynamic("parsingConfig")(parsingConfig)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (previewRender != null) __obj.updateDynamic("previewRender")(js.Any.fromFunction2(previewRender))
    if (!js.isUndefined(promptURLs)) __obj.updateDynamic("promptURLs")(promptURLs)
    if (renderingConfig != null) __obj.updateDynamic("renderingConfig")(renderingConfig)
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts)
    if (showIcons != null) __obj.updateDynamic("showIcons")(showIcons)
    if (!js.isUndefined(spellChecker)) __obj.updateDynamic("spellChecker")(spellChecker)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(styleSelectedText)) __obj.updateDynamic("styleSelectedText")(styleSelectedText)
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarTips)) __obj.updateDynamic("toolbarTips")(toolbarTips)
    __obj.asInstanceOf[Options]
  }
}

