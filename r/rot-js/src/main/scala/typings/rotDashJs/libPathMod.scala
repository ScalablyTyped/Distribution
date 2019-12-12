package typings.rotDashJs

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.TopLevel
import typings.rotDashJs.libPathPathMod.Options
import typings.rotDashJs.libPathPathMod.PassableCallback
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/path", JSImport.Namespace)
@js.native
object libPathMod extends js.Object {
  @js.native
  object default extends js.Object {
    @js.native
    class AStar protected ()
      extends typings.rotDashJs.libPathAstarMod.default {
      def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
      def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: Partial[Options]) = this()
    }
    
    @js.native
    class Dijkstra protected ()
      extends typings.rotDashJs.libPathDijkstraMod.default {
      def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: Partial[Options]) = this()
    }
    
    @js.native
    object AStar
      extends TopLevel[
              Instantiable4[
                /* toX */ Double, 
                /* toY */ Double, 
                /* passableCallback */ PassableCallback, 
                js.UndefOr[/* options */ Partial[Options]], 
                typings.rotDashJs.libPathAstarMod.default
              ]
            ]
    
    @js.native
    object Dijkstra
      extends TopLevel[
              Instantiable4[
                /* toX */ Double, 
                /* toY */ Double, 
                /* passableCallback */ PassableCallback, 
                /* options */ Partial[Options], 
                typings.rotDashJs.libPathDijkstraMod.default
              ]
            ]
    
  }
  
}

