package typings.rotJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.rotJs.discreteShadowcastingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "FOV")
@js.native
object FOV extends js.Object {
  @js.native
  class DiscreteShadowcasting () extends default
  
  @js.native
  class PreciseShadowcasting ()
    extends typings.rotJs.preciseShadowcastingMod.default
  
  @js.native
  class RecursiveShadowcasting ()
    extends typings.rotJs.recursiveShadowcastingMod.default
  
  @js.native
  object DiscreteShadowcasting extends TopLevel[Instantiable0[default]]
  
  @js.native
  object PreciseShadowcasting
    extends TopLevel[Instantiable0[typings.rotJs.preciseShadowcastingMod.default]]
  
  @js.native
  object RecursiveShadowcasting
    extends TopLevel[Instantiable0[typings.rotJs.recursiveShadowcastingMod.default]]
  
}

