package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Driver extends js.Object {
  var Driver: Anon_CreateSessionOptconfigOptservice
  var Options: Anon_Capabilities
  var ServiceBuilder: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.chromeMod.ServiceBuilder]
  def getDefaultService(): seleniumDashWebdriverLib.remoteMod.DriverService
  def setDefaultService(service: seleniumDashWebdriverLib.remoteMod.DriverService): scala.Unit
}

object Anon_Driver {
  @scala.inline
  def apply(
    Driver: Anon_CreateSessionOptconfigOptservice,
    Options: Anon_Capabilities,
    ServiceBuilder: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.chromeMod.ServiceBuilder],
    getDefaultService: () => seleniumDashWebdriverLib.remoteMod.DriverService,
    setDefaultService: seleniumDashWebdriverLib.remoteMod.DriverService => scala.Unit
  ): Anon_Driver = {
    val __obj = js.Dynamic.literal(Driver = Driver, Options = Options, ServiceBuilder = ServiceBuilder, getDefaultService = js.Any.fromFunction0(getDefaultService), setDefaultService = js.Any.fromFunction1(setDefaultService))
  
    __obj.asInstanceOf[Anon_Driver]
  }
}

