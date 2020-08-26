package typings.simplemde.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var autoDownloadFontAwesome: js.UndefOr[Boolean] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var autosave: js.UndefOr[AutoSaveOptions] = js.native
  var blockStyles: js.UndefOr[BlockStyleOptions] = js.native
  var element: js.UndefOr[HTMLElement] = js.native
  var forceSync: js.UndefOr[Boolean] = js.native
  var hideIcons: js.UndefOr[js.Array[String]] = js.native
  var indentWithTabs: js.UndefOr[Boolean] = js.native
  var initialValue: js.UndefOr[String] = js.native
  var insertTexts: js.UndefOr[InsertTextOptions] = js.native
  var lineWrapping: js.UndefOr[Boolean] = js.native
  var parsingConfig: js.UndefOr[ParsingOptions] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var previewRender: js.UndefOr[
    js.Function2[/* markdownPlaintext */ String, /* previewElement */ js.UndefOr[HTMLElement], String]
  ] = js.native
  var promptURLs: js.UndefOr[Boolean] = js.native
  var renderingConfig: js.UndefOr[RenderingOptions] = js.native
  var shortcuts: js.UndefOr[ShortcutsArray] = js.native
  var showIcons: js.UndefOr[js.Array[String]] = js.native
  var spellChecker: js.UndefOr[Boolean] = js.native
  var status: js.UndefOr[Boolean | (js.Array[String | StatusBarItem])] = js.native
  var styleSelectedText: js.UndefOr[Boolean] = js.native
  var tabSize: js.UndefOr[Double] = js.native
  var toolbar: js.UndefOr[Boolean | (js.Array[String | ToolbarIcon])] = js.native
  var toolbarTips: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAutoDownloadFontAwesome(value: Boolean): Self = this.set("autoDownloadFontAwesome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDownloadFontAwesome: Self = this.set("autoDownloadFontAwesome", js.undefined)
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    @scala.inline
    def setAutosave(value: AutoSaveOptions): Self = this.set("autosave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutosave: Self = this.set("autosave", js.undefined)
    @scala.inline
    def setBlockStyles(value: BlockStyleOptions): Self = this.set("blockStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockStyles: Self = this.set("blockStyles", js.undefined)
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setForceSync(value: Boolean): Self = this.set("forceSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSync: Self = this.set("forceSync", js.undefined)
    @scala.inline
    def setHideIconsVarargs(value: String*): Self = this.set("hideIcons", js.Array(value :_*))
    @scala.inline
    def setHideIcons(value: js.Array[String]): Self = this.set("hideIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideIcons: Self = this.set("hideIcons", js.undefined)
    @scala.inline
    def setIndentWithTabs(value: Boolean): Self = this.set("indentWithTabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentWithTabs: Self = this.set("indentWithTabs", js.undefined)
    @scala.inline
    def setInitialValue(value: String): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
    @scala.inline
    def setInsertTexts(value: InsertTextOptions): Self = this.set("insertTexts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertTexts: Self = this.set("insertTexts", js.undefined)
    @scala.inline
    def setLineWrapping(value: Boolean): Self = this.set("lineWrapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWrapping: Self = this.set("lineWrapping", js.undefined)
    @scala.inline
    def setParsingConfig(value: ParsingOptions): Self = this.set("parsingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParsingConfig: Self = this.set("parsingConfig", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPreviewRender(value: (/* markdownPlaintext */ String, /* previewElement */ js.UndefOr[HTMLElement]) => String): Self = this.set("previewRender", js.Any.fromFunction2(value))
    @scala.inline
    def deletePreviewRender: Self = this.set("previewRender", js.undefined)
    @scala.inline
    def setPromptURLs(value: Boolean): Self = this.set("promptURLs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromptURLs: Self = this.set("promptURLs", js.undefined)
    @scala.inline
    def setRenderingConfig(value: RenderingOptions): Self = this.set("renderingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderingConfig: Self = this.set("renderingConfig", js.undefined)
    @scala.inline
    def setShortcuts(value: ShortcutsArray): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortcuts: Self = this.set("shortcuts", js.undefined)
    @scala.inline
    def setShowIconsVarargs(value: String*): Self = this.set("showIcons", js.Array(value :_*))
    @scala.inline
    def setShowIcons(value: js.Array[String]): Self = this.set("showIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIcons: Self = this.set("showIcons", js.undefined)
    @scala.inline
    def setSpellChecker(value: Boolean): Self = this.set("spellChecker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellChecker: Self = this.set("spellChecker", js.undefined)
    @scala.inline
    def setStatusVarargs(value: (String | StatusBarItem)*): Self = this.set("status", js.Array(value :_*))
    @scala.inline
    def setStatus(value: Boolean | (js.Array[String | StatusBarItem])): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStyleSelectedText(value: Boolean): Self = this.set("styleSelectedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleSelectedText: Self = this.set("styleSelectedText", js.undefined)
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    @scala.inline
    def setToolbarVarargs(value: (String | ToolbarIcon)*): Self = this.set("toolbar", js.Array(value :_*))
    @scala.inline
    def setToolbar(value: Boolean | (js.Array[String | ToolbarIcon])): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    @scala.inline
    def setToolbarTips(value: Boolean): Self = this.set("toolbarTips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarTips: Self = this.set("toolbarTips", js.undefined)
  }
  
}

