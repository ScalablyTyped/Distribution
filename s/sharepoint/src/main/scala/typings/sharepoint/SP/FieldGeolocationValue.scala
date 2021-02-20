package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldGeolocationValue extends ClientValueObject {
  
  def get_altitude(): Double = js.native
  
  def get_latitude(): Double = js.native
  
  def get_longitude(): Double = js.native
  
  def get_measure(): Double = js.native
  
  def set_altitude(value: Double): Unit = js.native
  
  def set_latitude(value: Double): Unit = js.native
  
  def set_longitude(value: Double): Unit = js.native
  
  def set_measure(value: Double): Unit = js.native
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
  
  @scala.inline
  implicit class FieldGeolocationValueMutableBuilder[Self <: FieldGeolocationValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_altitude(value: () => Double): Self = StObject.set(x, "get_altitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_latitude(value: () => Double): Self = StObject.set(x, "get_latitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_longitude(value: () => Double): Self = StObject.set(x, "get_longitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_measure(value: () => Double): Self = StObject.set(x, "get_measure", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_altitude(value: Double => Unit): Self = StObject.set(x, "set_altitude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_latitude(value: Double => Unit): Self = StObject.set(x, "set_latitude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_longitude(value: Double => Unit): Self = StObject.set(x, "set_longitude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_measure(value: Double => Unit): Self = StObject.set(x, "set_measure", js.Any.fromFunction1(value))
  }
}
