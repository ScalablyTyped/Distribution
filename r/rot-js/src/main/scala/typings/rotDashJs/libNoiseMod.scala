package typings.rotDashJs

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/noise", JSImport.Namespace)
@js.native
object libNoiseMod extends js.Object {
  @js.native
  object default extends js.Object {
    @js.native
    /**
      * @param gradients Random gradients
      */
    class Simplex ()
      extends typings.rotDashJs.libNoiseSimplexMod.default {
      def this(gradients: Double) = this()
    }
    
    var Simplex: Instantiable1[js.UndefOr[/* gradients */ Double], typings.rotDashJs.libNoiseSimplexMod.default] = js.native
  }
  
}

