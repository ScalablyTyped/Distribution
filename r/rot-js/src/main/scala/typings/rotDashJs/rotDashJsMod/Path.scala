package typings.rotDashJs.rotDashJsMod

import org.scalablytyped.runtime.Instantiable4
import typings.rotDashJs.libPathAstarMod.default
import typings.rotDashJs.libPathPathMod.Options
import typings.rotDashJs.libPathPathMod.PassableCallback
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Path")
@js.native
object Path extends js.Object {
  @js.native
  class AStar protected () extends default {
    def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
    def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: Partial[Options]) = this()
  }
  
  @js.native
  class Dijkstra protected ()
    extends typings.rotDashJs.libPathDijkstraMod.default {
    def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: Partial[Options]) = this()
  }
  
  var AStar: Instantiable4[
    /* toX */ Double, 
    /* toY */ Double, 
    /* passableCallback */ PassableCallback, 
    js.UndefOr[/* options */ Partial[Options]], 
    default
  ] = js.native
  var Dijkstra: Instantiable4[
    /* toX */ Double, 
    /* toY */ Double, 
    /* passableCallback */ PassableCallback, 
    /* options */ Partial[Options], 
    typings.rotDashJs.libPathDijkstraMod.default
  ] = js.native
}

