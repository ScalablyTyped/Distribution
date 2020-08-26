package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IFromJson extends js.Object {
  def customFromJson(initValue: js.Any): Boolean = js.native
  def fromJson(initValue: js.Any): Unit = js.native
}

object IFromJson {
  @scala.inline
  def apply(customFromJson: js.Any => Boolean, fromJson: js.Any => Unit): IFromJson = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), fromJson = js.Any.fromFunction1(fromJson))
    __obj.asInstanceOf[IFromJson]
  }
  @scala.inline
  implicit class IFromJsonOps[Self <: IFromJson] (val x: Self) extends AnyVal {
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
    def setCustomFromJson(value: js.Any => Boolean): Self = this.set("customFromJson", js.Any.fromFunction1(value))
    @scala.inline
    def setFromJson(value: js.Any => Unit): Self = this.set("fromJson", js.Any.fromFunction1(value))
  }
  
}

