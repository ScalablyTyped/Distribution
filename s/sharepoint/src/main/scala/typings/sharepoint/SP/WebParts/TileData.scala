package typings.sharepoint.SP.WebParts

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileData extends ClientValueObject {
  def get_backgroundImageLocation(): String = js.native
  def get_description(): String = js.native
  def get_iD(): Double = js.native
  def get_linkLocation(): String = js.native
  def get_tileOrder(): Double = js.native
  def get_title(): String = js.native
  def set_backgroundImageLocation(value: String): Unit = js.native
  def set_description(value: String): Unit = js.native
  def set_iD(value: Double): Unit = js.native
  def set_linkLocation(value: String): Unit = js.native
  def set_tileOrder(value: Double): Unit = js.native
  def set_title(value: String): Unit = js.native
}

object TileData {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_backgroundImageLocation: () => String,
    get_description: () => String,
    get_iD: () => Double,
    get_linkLocation: () => String,
    get_tileOrder: () => Double,
    get_title: () => String,
    get_typeId: () => String,
    set_backgroundImageLocation: String => Unit,
    set_description: String => Unit,
    set_iD: Double => Unit,
    set_linkLocation: String => Unit,
    set_tileOrder: Double => Unit,
    set_title: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): TileData = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_backgroundImageLocation = js.Any.fromFunction0(get_backgroundImageLocation), get_description = js.Any.fromFunction0(get_description), get_iD = js.Any.fromFunction0(get_iD), get_linkLocation = js.Any.fromFunction0(get_linkLocation), get_tileOrder = js.Any.fromFunction0(get_tileOrder), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), set_backgroundImageLocation = js.Any.fromFunction1(set_backgroundImageLocation), set_description = js.Any.fromFunction1(set_description), set_iD = js.Any.fromFunction1(set_iD), set_linkLocation = js.Any.fromFunction1(set_linkLocation), set_tileOrder = js.Any.fromFunction1(set_tileOrder), set_title = js.Any.fromFunction1(set_title), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[TileData]
  }
  @scala.inline
  implicit class TileDataOps[Self <: TileData] (val x: Self) extends AnyVal {
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
    def setGet_backgroundImageLocation(value: () => String): Self = this.set("get_backgroundImageLocation", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_description(value: () => String): Self = this.set("get_description", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_iD(value: () => Double): Self = this.set("get_iD", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_linkLocation(value: () => String): Self = this.set("get_linkLocation", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_tileOrder(value: () => Double): Self = this.set("get_tileOrder", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_title(value: () => String): Self = this.set("get_title", js.Any.fromFunction0(value))
    @scala.inline
    def setSet_backgroundImageLocation(value: String => Unit): Self = this.set("set_backgroundImageLocation", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_description(value: String => Unit): Self = this.set("set_description", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_iD(value: Double => Unit): Self = this.set("set_iD", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_linkLocation(value: String => Unit): Self = this.set("set_linkLocation", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_tileOrder(value: Double => Unit): Self = this.set("set_tileOrder", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_title(value: String => Unit): Self = this.set("set_title", js.Any.fromFunction1(value))
  }
  
}

