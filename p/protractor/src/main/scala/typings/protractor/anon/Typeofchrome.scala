package typings.protractor.anon

import org.scalablytyped.runtime.Instantiable0
import typings.seleniumWebdriver.chromeMod.ServiceBuilder
import typings.seleniumWebdriver.remoteMod.DriverService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofchrome extends StObject {
  
  var Driver: TypeofDriverInstantiable
  
  var Options: TypeofOptions
  
  var ServiceBuilder: Instantiable0[typings.seleniumWebdriver.chromeMod.ServiceBuilder]
  
  def getDefaultService(): DriverService
  
  def locateSynchronously(): String | Null
  
  def setDefaultService(service: DriverService): Unit
}
object Typeofchrome {
  
  inline def apply(
    Driver: TypeofDriverInstantiable,
    Options: TypeofOptions,
    ServiceBuilder: Instantiable0[ServiceBuilder],
    getDefaultService: () => DriverService,
    locateSynchronously: () => String | Null,
    setDefaultService: DriverService => Unit
  ): Typeofchrome = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], ServiceBuilder = ServiceBuilder.asInstanceOf[js.Any], getDefaultService = js.Any.fromFunction0(getDefaultService), locateSynchronously = js.Any.fromFunction0(locateSynchronously), setDefaultService = js.Any.fromFunction1(setDefaultService))
    __obj.asInstanceOf[Typeofchrome]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofchrome] (val x: Self) extends AnyVal {
    
    inline def setDriver(value: TypeofDriverInstantiable): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultService(value: () => DriverService): Self = StObject.set(x, "getDefaultService", js.Any.fromFunction0(value))
    
    inline def setLocateSynchronously(value: () => String | Null): Self = StObject.set(x, "locateSynchronously", js.Any.fromFunction0(value))
    
    inline def setOptions(value: TypeofOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setServiceBuilder(value: Instantiable0[ServiceBuilder]): Self = StObject.set(x, "ServiceBuilder", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultService(value: DriverService => Unit): Self = StObject.set(x, "setDefaultService", js.Any.fromFunction1(value))
  }
}
