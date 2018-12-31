package typings
package simplemdeLib.simplemdeMod.SimpleMDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoDownloadFontAwesome: js.UndefOr[scala.Boolean] = js.undefined
  var autofocus: js.UndefOr[scala.Boolean] = js.undefined
  var autosave: js.UndefOr[AutoSaveOptions] = js.undefined
  var blockStyles: js.UndefOr[BlockStyleOptions] = js.undefined
  var element: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var forceSync: js.UndefOr[scala.Boolean] = js.undefined
  var hideIcons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var indentWithTabs: js.UndefOr[scala.Boolean] = js.undefined
  var initialValue: js.UndefOr[java.lang.String] = js.undefined
  var insertTexts: js.UndefOr[InsertTextOptions] = js.undefined
  var lineWrapping: js.UndefOr[scala.Boolean] = js.undefined
  var parsingConfig: js.UndefOr[ParsingOptions] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var previewRender: js.UndefOr[
    js.Function2[
      /* markdownPlaintext */ java.lang.String, 
      /* previewElement */ js.UndefOr[stdLib.HTMLElement], 
      java.lang.String
    ]
  ] = js.undefined
  var promptURLs: js.UndefOr[scala.Boolean] = js.undefined
  var renderingConfig: js.UndefOr[RenderingOptions] = js.undefined
  var shortcuts: js.UndefOr[ShortcutsArray] = js.undefined
  var showIcons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var spellChecker: js.UndefOr[scala.Boolean] = js.undefined
  var status: js.UndefOr[scala.Boolean | (js.Array[java.lang.String | StatusBarItem])] = js.undefined
  var styleSelectedText: js.UndefOr[scala.Boolean] = js.undefined
  var tabSize: js.UndefOr[scala.Double] = js.undefined
  var toolbar: js.UndefOr[scala.Boolean | (js.Array[java.lang.String | ToolbarIcon])] = js.undefined
  var toolbarTips: js.UndefOr[scala.Boolean] = js.undefined
}

