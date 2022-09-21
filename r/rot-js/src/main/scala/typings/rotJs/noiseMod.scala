package typings.rotJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noiseMod {
  
  object default {
    
    @JSImport("rot-js/lib/noise", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/noise", "default.Simplex")
    @js.native
    /**
      * @param gradients Random gradients
      */
    open class Simplex ()
      extends typings.rotJs.simplexMod.default {
      def this(gradients: Double) = this()
    }
    @JSImport("rot-js/lib/noise", "default.Simplex")
    @js.native
    def Simplex: Instantiable1[/* gradients */ js.UndefOr[Double], typings.rotJs.simplexMod.default] = js.native
    inline def Simplex_=(x: Instantiable1[/* gradients */ js.UndefOr[Double], typings.rotJs.simplexMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Simplex")(x.asInstanceOf[js.Any])
  }
}
