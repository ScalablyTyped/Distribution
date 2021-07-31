package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZoneInformation
  extends StObject
     with ClientValueObject {
  
  def get_bias(): Double
  
  def get_daylightBias(): Double
  
  def get_standardBias(): Double
}
object TimeZoneInformation {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_bias: () => Double,
    get_daylightBias: () => Double,
    get_standardBias: () => Double,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): TimeZoneInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_bias = js.Any.fromFunction0(get_bias), get_daylightBias = js.Any.fromFunction0(get_daylightBias), get_standardBias = js.Any.fromFunction0(get_standardBias), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[TimeZoneInformation]
  }
  
  @scala.inline
  implicit class TimeZoneInformationMutableBuilder[Self <: TimeZoneInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_bias(value: () => Double): Self = StObject.set(x, "get_bias", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_daylightBias(value: () => Double): Self = StObject.set(x, "get_daylightBias", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_standardBias(value: () => Double): Self = StObject.set(x, "get_standardBias", js.Any.fromFunction0(value))
  }
}
