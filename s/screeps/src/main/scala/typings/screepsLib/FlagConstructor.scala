package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagConstructor
  extends _Constructor[Flag]
     with ScalablyTyped.runtime.Instantiable6[
      /* name */ java.lang.String, 
      /* color */ ColorConstant, 
      /* secondaryColor */ ColorConstant, 
      /* roomName */ java.lang.String, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      Flag
    ] {
  def apply(
    name: java.lang.String,
    color: ColorConstant,
    secondaryColor: ColorConstant,
    roomName: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): Flag = js.native
}

