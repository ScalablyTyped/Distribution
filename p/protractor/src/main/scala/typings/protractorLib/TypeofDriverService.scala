package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofDriverService extends js.Object {
  /**
    * Creates {@link DriverService} objects that manage a WebDriver server in a
    * child process.
    */
  var Builder: org.scalablytyped.runtime.Instantiable1[
    /* exe */ java.lang.String, 
    seleniumDashWebdriverLib.remoteMod.DriverServiceNs.Builder
  ]
}

object TypeofDriverService {
  @scala.inline
  def apply(
    Builder: org.scalablytyped.runtime.Instantiable1[
      /* exe */ java.lang.String, 
      seleniumDashWebdriverLib.remoteMod.DriverServiceNs.Builder
    ]
  ): TypeofDriverService = {
    val __obj = js.Dynamic.literal(Builder = Builder)
  
    __obj.asInstanceOf[TypeofDriverService]
  }
}

