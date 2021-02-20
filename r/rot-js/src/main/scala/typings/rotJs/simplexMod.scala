package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simplexMod {
  
  @JSImport("rot-js/lib/noise/simplex", JSImport.Default)
  @js.native
  /**
    * @param gradients Random gradients
    */
  class default () extends Simplex {
    def this(gradients: Double) = this()
  }
  
  @js.native
  trait Simplex
    extends typings.rotJs.noiseNoiseMod.default {
    
    var _gradients: js.Array[js.Array[Double]] = js.native
    
    var _indexes: js.Array[Double] = js.native
    
    var _perms: js.Array[Double] = js.native
  }
}
