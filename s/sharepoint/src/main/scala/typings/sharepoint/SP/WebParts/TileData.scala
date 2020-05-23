package typings.sharepoint.SP.WebParts

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileData extends ClientValueObject {
  def get_backgroundImageLocation(): String
  def get_description(): String
  def get_iD(): Double
  def get_linkLocation(): String
  def get_tileOrder(): Double
  def get_title(): String
  def set_backgroundImageLocation(value: String): Unit
  def set_description(value: String): Unit
  def set_iD(value: Double): Unit
  def set_linkLocation(value: String): Unit
  def set_tileOrder(value: Double): Unit
  def set_title(value: String): Unit
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
}

