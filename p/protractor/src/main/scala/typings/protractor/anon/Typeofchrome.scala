package typings.protractor.anon

import org.scalablytyped.runtime.Instantiable0
import typings.seleniumWebdriver.chromeMod.ServiceBuilder
import typings.seleniumWebdriver.remoteMod.DriverService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofchrome extends StObject {
  
  var Driver: TypeofDriverInstantiable = js.native
  
  var Options: TypeofOptions = js.native
  
  var ServiceBuilder: Instantiable0[typings.seleniumWebdriver.chromeMod.ServiceBuilder] = js.native
  
  def getDefaultService(): DriverService = js.native
  
  def setDefaultService(service: DriverService): Unit = js.native
}
object Typeofchrome {
  
  @scala.inline
  def apply(
    Driver: TypeofDriverInstantiable,
    Options: TypeofOptions,
    ServiceBuilder: Instantiable0[ServiceBuilder],
    getDefaultService: () => DriverService,
    setDefaultService: DriverService => Unit
  ): Typeofchrome = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], ServiceBuilder = ServiceBuilder.asInstanceOf[js.Any], getDefaultService = js.Any.fromFunction0(getDefaultService), setDefaultService = js.Any.fromFunction1(setDefaultService))
    __obj.asInstanceOf[Typeofchrome]
  }
  
  @scala.inline
  implicit class TypeofchromeMutableBuilder[Self <: Typeofchrome] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriver(value: TypeofDriverInstantiable): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultService(value: () => DriverService): Self = StObject.set(x, "getDefaultService", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: TypeofOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceBuilder(value: Instantiable0[ServiceBuilder]): Self = StObject.set(x, "ServiceBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDefaultService(value: DriverService => Unit): Self = StObject.set(x, "setDefaultService", js.Any.fromFunction1(value))
  }
}
