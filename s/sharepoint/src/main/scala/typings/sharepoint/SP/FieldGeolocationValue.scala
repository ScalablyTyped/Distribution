package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldGeolocationValue extends ClientValueObject {
  def get_altitude(): Double
  def get_latitude(): Double
  def get_longitude(): Double
  def get_measure(): Double
  def set_altitude(value: Double): Unit
  def set_latitude(value: Double): Unit
  def set_longitude(value: Double): Unit
  def set_measure(value: Double): Unit
}

object FieldGeolocationValue {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_altitude: () => Double,
    get_latitude: () => Double,
    get_longitude: () => Double,
    get_measure: () => Double,
    get_typeId: () => String,
    set_altitude: Double => Unit,
    set_latitude: Double => Unit,
    set_longitude: Double => Unit,
    set_measure: Double => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FieldGeolocationValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_altitude = js.Any.fromFunction0(get_altitude), get_latitude = js.Any.fromFunction0(get_latitude), get_longitude = js.Any.fromFunction0(get_longitude), get_measure = js.Any.fromFunction0(get_measure), get_typeId = js.Any.fromFunction0(get_typeId), set_altitude = js.Any.fromFunction1(set_altitude), set_latitude = js.Any.fromFunction1(set_latitude), set_longitude = js.Any.fromFunction1(set_longitude), set_measure = js.Any.fromFunction1(set_measure), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FieldGeolocationValue]
  }
}

