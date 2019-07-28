package typings.protractor

import org.scalablytyped.runtime.Instantiable0
import typings.seleniumDashWebdriver.chromeMod.ServiceBuilder
import typings.seleniumDashWebdriver.remoteMod.DriverService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofchrome extends js.Object {
  var Driver: TypeofClassDriverCreateSession
  var Options: TypeofClassOptions
  var ServiceBuilder: Instantiable0[typings.seleniumDashWebdriver.chromeMod.ServiceBuilder]
  def getDefaultService(): DriverService
  def setDefaultService(service: DriverService): Unit
}

object Typeofchrome {
  @scala.inline
  def apply(
    Driver: TypeofClassDriverCreateSession,
    Options: TypeofClassOptions,
    ServiceBuilder: Instantiable0[ServiceBuilder],
    getDefaultService: () => DriverService,
    setDefaultService: DriverService => Unit
  ): Typeofchrome = {
    val __obj = js.Dynamic.literal(Driver = Driver, Options = Options, ServiceBuilder = ServiceBuilder, getDefaultService = js.Any.fromFunction0(getDefaultService), setDefaultService = js.Any.fromFunction1(setDefaultService))
  
    __obj.asInstanceOf[Typeofchrome]
  }
}

