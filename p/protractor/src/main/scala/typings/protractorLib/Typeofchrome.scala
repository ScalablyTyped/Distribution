package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofchrome extends js.Object {
  var Driver: TypeofClassDriverCreateSession
  var Options: TypeofClassOptions
  var ServiceBuilder: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.chromeMod.ServiceBuilder]
  def getDefaultService(): seleniumDashWebdriverLib.remoteMod.DriverService
  def setDefaultService(service: seleniumDashWebdriverLib.remoteMod.DriverService): scala.Unit
}

object Typeofchrome {
  @scala.inline
  def apply(
    Driver: TypeofClassDriverCreateSession,
    Options: TypeofClassOptions,
    ServiceBuilder: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.chromeMod.ServiceBuilder],
    getDefaultService: () => seleniumDashWebdriverLib.remoteMod.DriverService,
    setDefaultService: seleniumDashWebdriverLib.remoteMod.DriverService => scala.Unit
  ): Typeofchrome = {
    val __obj = js.Dynamic.literal(Driver = Driver, Options = Options, ServiceBuilder = ServiceBuilder, getDefaultService = js.Any.fromFunction0(getDefaultService), setDefaultService = js.Any.fromFunction1(setDefaultService))
  
    __obj.asInstanceOf[Typeofchrome]
  }
}

