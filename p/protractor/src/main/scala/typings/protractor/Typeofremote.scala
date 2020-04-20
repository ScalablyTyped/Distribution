package typings.protractor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.seleniumWebdriver.remoteMod.DriverService
import typings.seleniumWebdriver.remoteMod.FileDetector
import typings.seleniumWebdriver.remoteMod.SeleniumServer
import typings.seleniumWebdriver.remoteMod.ServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofremote extends js.Object {
  var DriverService: (Instantiable2[
    /* executable */ String, 
    /* options */ ServiceOptions, 
    typings.seleniumWebdriver.remoteMod.DriverService
  ]) with TypeofDriverService
  var FileDetector: Instantiable0[typings.seleniumWebdriver.remoteMod.FileDetector]
  var SeleniumServer: Instantiable1[/* jar */ String, typings.seleniumWebdriver.remoteMod.SeleniumServer]
}

object Typeofremote {
  @scala.inline
  def apply(
    DriverService: (Instantiable2[/* executable */ String, /* options */ ServiceOptions, DriverService]) with TypeofDriverService,
    FileDetector: Instantiable0[FileDetector],
    SeleniumServer: Instantiable1[/* jar */ String, SeleniumServer]
  ): Typeofremote = {
    val __obj = js.Dynamic.literal(DriverService = DriverService.asInstanceOf[js.Any], FileDetector = FileDetector.asInstanceOf[js.Any], SeleniumServer = SeleniumServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofremote]
  }
}

