package typings.rotJs

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.TopLevel
import typings.rotJs.anon.PartialOptions
import typings.rotJs.pathPathMod.PassableCallback
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
      def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
    }
    
    @js.native
    class Dijkstra protected ()
      extends typings.rotJs.dijkstraMod.default {
      def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
    }
    
    @js.native
    object AStar
      extends TopLevel[
              Instantiable4[
                /* toX */ Double, 
                /* toY */ Double, 
                /* passableCallback */ PassableCallback, 
                /* options */ js.UndefOr[PartialOptions], 
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
                /* options */ PartialOptions, 
                typings.rotJs.dijkstraMod.default
              ]
            ]
    
  }
  
}

