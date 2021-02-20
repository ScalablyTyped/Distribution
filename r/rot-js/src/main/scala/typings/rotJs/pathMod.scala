package typings.rotJs

import org.scalablytyped.runtime.Instantiable4
import typings.rotJs.anon.PartialOptions
import typings.rotJs.pathPathMod.PassableCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  object default {
    
    @JSImport("rot-js/lib/path", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/path", "default.AStar")
    @js.native
    class AStar protected ()
      extends typings.rotJs.astarMod.default {
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
        typings.rotJs.astarMod.default
      ] = js.native
    @scala.inline
    def AStar_=(
      x: Instantiable4[
          /* toX */ Double, 
          /* toY */ Double, 
          /* passableCallback */ PassableCallback, 
          /* options */ js.UndefOr[PartialOptions], 
          typings.rotJs.astarMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AStar")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/path", "default.Dijkstra")
    @js.native
    class Dijkstra protected ()
      extends typings.rotJs.dijkstraMod.default {
      def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
    }
    @JSImport("rot-js/lib/path", "default.Dijkstra")
    @js.native
    def Dijkstra: Instantiable4[
        /* toX */ Double, 
        /* toY */ Double, 
        /* passableCallback */ PassableCallback, 
        /* options */ PartialOptions, 
        typings.rotJs.dijkstraMod.default
      ] = js.native
    @scala.inline
    def Dijkstra_=(
      x: Instantiable4[
          /* toX */ Double, 
          /* toY */ Double, 
          /* passableCallback */ PassableCallback, 
          /* options */ PartialOptions, 
          typings.rotJs.dijkstraMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dijkstra")(x.asInstanceOf[js.Any])
  }
}
