package typings.screeps

import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlagConstructor
  extends Constructor[Flag]
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
