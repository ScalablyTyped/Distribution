package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.balanced
import typings.reactNative.reactNativeStrings.highQuality
import typings.reactNative.reactNativeStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextPropsAndroid extends js.Object {
  /**
    * Lets the user select text, to use the native copy and paste functionality.
    */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
    * The highlight color of the text.
    */
  var selectionColor: js.UndefOr[ColorValue] = js.native
  /**
    * Set text break strategy on Android API Level 23+
    * default is `highQuality`.
    */
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.native
}

object TextPropsAndroid {
  @scala.inline
  def apply(): TextPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPropsAndroid]
  }
  @scala.inline
  implicit class TextPropsAndroidOps[Self <: TextPropsAndroid] (val x: Self) extends AnyVal {
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
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelectionColor(value: ColorValue): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    @scala.inline
    def setTextBreakStrategy(value: simple | highQuality | balanced): Self = this.set("textBreakStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextBreakStrategy: Self = this.set("textBreakStrategy", js.undefined)
  }
  
}

