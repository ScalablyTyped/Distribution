package typings.simplemde.simplemdeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcutsArray
  extends /* action */ StringDictionary[js.UndefOr[String]] {
  var cleanBlock: js.UndefOr[String] = js.undefined
  var drawImage: js.UndefOr[String] = js.undefined
  var drawLink: js.UndefOr[String] = js.undefined
  var toggleBlockquote: js.UndefOr[String] = js.undefined
  var toggleBold: js.UndefOr[String] = js.undefined
  var toggleCodeBlock: js.UndefOr[String] = js.undefined
  var toggleFullScreen: js.UndefOr[String] = js.undefined
  var toggleHeadingBigger: js.UndefOr[String] = js.undefined
  var toggleHeadingSmaller: js.UndefOr[String] = js.undefined
  var toggleItalic: js.UndefOr[String] = js.undefined
  var toggleOrderedList: js.UndefOr[String] = js.undefined
  var togglePreview: js.UndefOr[String] = js.undefined
  var toggleSideBySide: js.UndefOr[String] = js.undefined
  var toggleUnorderedList: js.UndefOr[String] = js.undefined
}

object ShortcutsArray {
  @scala.inline
  def apply(
    StringDictionary: /* action */ StringDictionary[js.UndefOr[String]] = null,
    cleanBlock: String = null,
    drawImage: String = null,
    drawLink: String = null,
    toggleBlockquote: String = null,
    toggleBold: String = null,
    toggleCodeBlock: String = null,
    toggleFullScreen: String = null,
    toggleHeadingBigger: String = null,
    toggleHeadingSmaller: String = null,
    toggleItalic: String = null,
    toggleOrderedList: String = null,
    togglePreview: String = null,
    toggleSideBySide: String = null,
    toggleUnorderedList: String = null
  ): ShortcutsArray = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cleanBlock != null) __obj.updateDynamic("cleanBlock")(cleanBlock)
    if (drawImage != null) __obj.updateDynamic("drawImage")(drawImage)
    if (drawLink != null) __obj.updateDynamic("drawLink")(drawLink)
    if (toggleBlockquote != null) __obj.updateDynamic("toggleBlockquote")(toggleBlockquote)
    if (toggleBold != null) __obj.updateDynamic("toggleBold")(toggleBold)
    if (toggleCodeBlock != null) __obj.updateDynamic("toggleCodeBlock")(toggleCodeBlock)
    if (toggleFullScreen != null) __obj.updateDynamic("toggleFullScreen")(toggleFullScreen)
    if (toggleHeadingBigger != null) __obj.updateDynamic("toggleHeadingBigger")(toggleHeadingBigger)
    if (toggleHeadingSmaller != null) __obj.updateDynamic("toggleHeadingSmaller")(toggleHeadingSmaller)
    if (toggleItalic != null) __obj.updateDynamic("toggleItalic")(toggleItalic)
    if (toggleOrderedList != null) __obj.updateDynamic("toggleOrderedList")(toggleOrderedList)
    if (togglePreview != null) __obj.updateDynamic("togglePreview")(togglePreview)
    if (toggleSideBySide != null) __obj.updateDynamic("toggleSideBySide")(toggleSideBySide)
    if (toggleUnorderedList != null) __obj.updateDynamic("toggleUnorderedList")(toggleUnorderedList)
    __obj.asInstanceOf[ShortcutsArray]
  }
}

