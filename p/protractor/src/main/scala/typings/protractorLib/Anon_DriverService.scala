package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DriverService extends js.Object {
  var DriverService: org.scalablytyped.runtime.Instantiable2[
    /* executable */ java.lang.String, 
    /* options */ seleniumDashWebdriverLib.remoteMod.ServiceOptions, 
    seleniumDashWebdriverLib.remoteMod.DriverService
  ]
  val DriverServiceNs: Anon_Builder
  var FileDetector: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.remoteMod.FileDetector]
  var SeleniumServer: org.scalablytyped.runtime.Instantiable1[/* jar */ java.lang.String, seleniumDashWebdriverLib.remoteMod.SeleniumServer]
  val SeleniumServerNs: js.Any
}

object Anon_DriverService {
  @scala.inline
  def apply(
    DriverService: org.scalablytyped.runtime.Instantiable2[
      /* executable */ java.lang.String, 
      /* options */ seleniumDashWebdriverLib.remoteMod.ServiceOptions, 
      seleniumDashWebdriverLib.remoteMod.DriverService
    ],
    DriverServiceNs: Anon_Builder,
    FileDetector: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.remoteMod.FileDetector],
    SeleniumServer: org.scalablytyped.runtime.Instantiable1[/* jar */ java.lang.String, seleniumDashWebdriverLib.remoteMod.SeleniumServer],
    SeleniumServerNs: js.Any
  ): Anon_DriverService = {
    val __obj = js.Dynamic.literal(DriverService = DriverService, DriverServiceNs = DriverServiceNs, FileDetector = FileDetector, SeleniumServer = SeleniumServer, SeleniumServerNs = SeleniumServerNs)
  
    __obj.asInstanceOf[Anon_DriverService]
  }
}

