package typings.rotDashJs.rotDashJsMod

import org.scalablytyped.runtime.Instantiable0
import typings.rotDashJs.libFovDiscreteDashShadowcastingMod.default
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
    extends typings.rotDashJs.libFovPreciseDashShadowcastingMod.default
  
  @js.native
  class RecursiveShadowcasting ()
    extends typings.rotDashJs.libFovRecursiveDashShadowcastingMod.default
  
  var DiscreteShadowcasting: Instantiable0[default] = js.native
  var PreciseShadowcasting: Instantiable0[typings.rotDashJs.libFovPreciseDashShadowcastingMod.default] = js.native
  var RecursiveShadowcasting: Instantiable0[typings.rotDashJs.libFovRecursiveDashShadowcastingMod.default] = js.native
}

