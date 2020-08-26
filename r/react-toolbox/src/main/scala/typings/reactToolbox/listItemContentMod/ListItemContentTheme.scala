package typings.reactToolbox.listItemContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemContentTheme extends js.Object {
  /**
    * Added to the content wrapper element if type is "auto".
    */
  var auto: js.UndefOr[String] = js.native
  /**
    * Used for the content wrapper element in list item.
    */
  var itemContentRoot: js.UndefOr[String] = js.native
  /**
    * Added to the content wrapper element if type is "large".
    */
  var large: js.UndefOr[String] = js.native
  /**
    * Added to the content wrapper element if type is "normal".
    */
  var normal: js.UndefOr[String] = js.native
}

object ListItemContentTheme {
  @scala.inline
  def apply(): ListItemContentTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemContentTheme]
  }
  @scala.inline
  implicit class ListItemContentThemeOps[Self <: ListItemContentTheme] (val x: Self) extends AnyVal {
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
    def setAuto(value: String): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    @scala.inline
    def setItemContentRoot(value: String): Self = this.set("itemContentRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemContentRoot: Self = this.set("itemContentRoot", js.undefined)
    @scala.inline
    def setLarge(value: String): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setNormal(value: String): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormal: Self = this.set("normal", js.undefined)
  }
  
}

