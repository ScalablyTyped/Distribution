package typings.screeps

import org.scalablytyped.runtime.Instantiable6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagConstructor
  extends _Constructor[Flag]
     with Instantiable6[
      /* name */ String, 
      /* color */ ColorConstant, 
      /* secondaryColor */ ColorConstant, 
      /* roomName */ String, 
      /* x */ Double, 
      /* y */ Double, 
      Flag
    ] {
  def apply(
    name: String,
    color: ColorConstant,
    secondaryColor: ColorConstant,
    roomName: String,
    x: Double,
    y: Double
  ): Flag = js.native
}

