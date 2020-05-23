package typings.simplemde.mod

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
    StringDictionary: /* header */ StringDictionary[js.UndefOr[String]] = null,
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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cleanBlock != null) __obj.updateDynamic("cleanBlock")(cleanBlock.asInstanceOf[js.Any])
    if (drawImage != null) __obj.updateDynamic("drawImage")(drawImage.asInstanceOf[js.Any])
    if (drawLink != null) __obj.updateDynamic("drawLink")(drawLink.asInstanceOf[js.Any])
    if (toggleBlockquote != null) __obj.updateDynamic("toggleBlockquote")(toggleBlockquote.asInstanceOf[js.Any])
    if (toggleBold != null) __obj.updateDynamic("toggleBold")(toggleBold.asInstanceOf[js.Any])
    if (toggleCodeBlock != null) __obj.updateDynamic("toggleCodeBlock")(toggleCodeBlock.asInstanceOf[js.Any])
    if (toggleFullScreen != null) __obj.updateDynamic("toggleFullScreen")(toggleFullScreen.asInstanceOf[js.Any])
    if (toggleHeadingBigger != null) __obj.updateDynamic("toggleHeadingBigger")(toggleHeadingBigger.asInstanceOf[js.Any])
    if (toggleHeadingSmaller != null) __obj.updateDynamic("toggleHeadingSmaller")(toggleHeadingSmaller.asInstanceOf[js.Any])
    if (toggleItalic != null) __obj.updateDynamic("toggleItalic")(toggleItalic.asInstanceOf[js.Any])
    if (toggleOrderedList != null) __obj.updateDynamic("toggleOrderedList")(toggleOrderedList.asInstanceOf[js.Any])
    if (togglePreview != null) __obj.updateDynamic("togglePreview")(togglePreview.asInstanceOf[js.Any])
    if (toggleSideBySide != null) __obj.updateDynamic("toggleSideBySide")(toggleSideBySide.asInstanceOf[js.Any])
    if (toggleUnorderedList != null) __obj.updateDynamic("toggleUnorderedList")(toggleUnorderedList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutsArray]
  }
}

