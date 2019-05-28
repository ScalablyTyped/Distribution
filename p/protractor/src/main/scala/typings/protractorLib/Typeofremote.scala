package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofremote extends js.Object {
  var DriverService: org.scalablytyped.runtime.Instantiable2[
    /* executable */ java.lang.String, 
    /* options */ seleniumDashWebdriverLib.remoteMod.ServiceOptions, 
    seleniumDashWebdriverLib.remoteMod.DriverService
  ]
  val DriverServiceNs: TypeofDriverService
  var FileDetector: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.remoteMod.FileDetector]
  var SeleniumServer: org.scalablytyped.runtime.Instantiable1[/* jar */ java.lang.String, seleniumDashWebdriverLib.remoteMod.SeleniumServer]
  val SeleniumServerNs: js.Any
}

object Typeofremote {
  @scala.inline
  def apply(
    DriverService: org.scalablytyped.runtime.Instantiable2[
      /* executable */ java.lang.String, 
      /* options */ seleniumDashWebdriverLib.remoteMod.ServiceOptions, 
      seleniumDashWebdriverLib.remoteMod.DriverService
    ],
    DriverServiceNs: TypeofDriverService,
    FileDetector: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.remoteMod.FileDetector],
    SeleniumServer: org.scalablytyped.runtime.Instantiable1[/* jar */ java.lang.String, seleniumDashWebdriverLib.remoteMod.SeleniumServer],
    SeleniumServerNs: js.Any
  ): Typeofremote = {
    val __obj = js.Dynamic.literal(DriverService = DriverService, DriverServiceNs = DriverServiceNs, FileDetector = FileDetector, SeleniumServer = SeleniumServer, SeleniumServerNs = SeleniumServerNs)
  
    __obj.asInstanceOf[Typeofremote]
  }
}

