package typings.protractor.anon

import org.scalablytyped.runtime.Instantiable0
import typings.seleniumWebdriver.chromeMod.ServiceBuilder
import typings.seleniumWebdriver.remoteMod.DriverService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofchrome extends js.Object {
  var Driver: TypeofDriverInstantiable
  var Options: TypeofOptions
  var ServiceBuilder: Instantiable0[typings.seleniumWebdriver.chromeMod.ServiceBuilder]
  def getDefaultService(): DriverService
  def setDefaultService(service: DriverService): Unit
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
}

