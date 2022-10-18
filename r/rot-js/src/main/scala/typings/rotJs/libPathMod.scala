package typings.rotJs

import org.scalablytyped.runtime.Instantiable4
import typings.rotJs.anon.PartialOptions
import typings.rotJs.libPathPathMod.PassableCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathMod {
  
  object default {
    
    @JSImport("rot-js/lib/path", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/path", "default.AStar")
    @js.native
    open class AStar protected ()
      extends typings.rotJs.libPathAstarMod.default {
      def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
      def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
    }
    @JSImport("rot-js/lib/path", "default.AStar")
    @js.native
    def AStar: Instantiable4[
        /* toX */ Double, 
        /* toY */ Double, 
        /* passableCallback */ PassableCallback, 
        /* options */ js.UndefOr[PartialOptions], 
        typings.rotJs.libPathAstarMod.default
      ] = js.native
    inline def AStar_=(
      x: Instantiable4[
          /* toX */ Double, 
          /* toY */ Double, 
          /* passableCallback */ PassableCallback, 
          /* options */ js.UndefOr[PartialOptions], 
          typings.rotJs.libPathAstarMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AStar")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/path", "default.Dijkstra")
    @js.native
    open class Dijkstra protected ()
      extends typings.rotJs.libPathDijkstraMod.default {
      def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
    }
    @JSImport("rot-js/lib/path", "default.Dijkstra")
    @js.native
    def Dijkstra: Instantiable4[
        /* toX */ Double, 
        /* toY */ Double, 
        /* passableCallback */ PassableCallback, 
        /* options */ PartialOptions, 
        typings.rotJs.libPathDijkstraMod.default
      ] = js.native
    inline def Dijkstra_=(
      x: Instantiable4[
          /* toX */ Double, 
          /* toY */ Double, 
          /* passableCallback */ PassableCallback, 
          /* options */ PartialOptions, 
          typings.rotJs.libPathDijkstraMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dijkstra")(x.asInstanceOf[js.Any])
  }
}
