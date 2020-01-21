package typings.rotJs

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.TopLevel
import typings.rotJs.pathPathMod.Options
import typings.rotJs.pathPathMod.PassableCallback
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/path", JSImport.Namespace)
@js.native
object pathMod extends js.Object {
  @js.native
  object default extends js.Object {
    @js.native
    class AStar protected ()
      extends typings.rotJs.astarMod.default {
      def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
      def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: Partial[Options]) = this()
    }
    
    @js.native
    class Dijkstra protected ()
      extends typings.rotJs.dijkstraMod.default {
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
                typings.rotJs.astarMod.default
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
                typings.rotJs.dijkstraMod.default
              ]
            ]
    
  }
  
}

