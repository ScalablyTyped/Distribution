package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Driver extends js.Object {
  var Driver: Anon_CreateSessionOptconfig
  var Options: Anon_Capabilities
  var ServiceBuilder: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.chromeMod.ServiceBuilder]
  def getDefaultService(): seleniumDashWebdriverLib.remoteMod.DriverService
  def setDefaultService(service: seleniumDashWebdriverLib.remoteMod.DriverService): scala.Unit
}

object Anon_Driver {
  @scala.inline
  def apply(
    Driver: Anon_CreateSessionOptconfig,
    Options: Anon_Capabilities,
    ServiceBuilder: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.chromeMod.ServiceBuilder],
    getDefaultService: js.Function0[seleniumDashWebdriverLib.remoteMod.DriverService],
    setDefaultService: js.Function1[seleniumDashWebdriverLib.remoteMod.DriverService, scala.Unit]
  ): Anon_Driver = {
    val __obj = js.Dynamic.literal(Driver = Driver, Options = Options, ServiceBuilder = ServiceBuilder, getDefaultService = getDefaultService, setDefaultService = setDefaultService)
  
    __obj.asInstanceOf[Anon_Driver]
  }
}

