package typings.protractor.anon

import org.scalablytyped.runtime.Instantiable0
import typings.seleniumWebdriver.chromeMod.ServiceBuilder
import typings.seleniumWebdriver.remoteMod.DriverService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofchrome extends js.Object {
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
  implicit class TypeofchromeOps[Self <: Typeofchrome] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDriver(value: TypeofDriverInstantiable): Self = this.set("Driver", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: TypeofOptions): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceBuilder(value: Instantiable0[ServiceBuilder]): Self = this.set("ServiceBuilder", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDefaultService(value: () => DriverService): Self = this.set("getDefaultService", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDefaultService(value: DriverService => Unit): Self = this.set("setDefaultService", js.Any.fromFunction1(value))
  }
  
}

