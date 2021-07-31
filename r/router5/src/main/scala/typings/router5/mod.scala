package typings.router5

import typings.routeNode.routeNodeMod.RouteNodeOptions
import typings.router5.anon.PartialOptions
import typings.router5.constantsMod.Constants_
import typings.router5.constantsMod.ErrorCodes_
import typings.router5.routerMod.DefaultDependencies
import typings.router5.routerMod.Route
import typings.router5.routerMod.Router
import typings.router5TransitionPath.transitionPathMod.State
import typings.router5TransitionPath.transitionPathMod.TransitionPath
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("router5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: js.Array[Route[Dependencies]]): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: js.Array[Route[Dependencies]], options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: js.Array[Route[Dependencies]], options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: js.Array[Route[Dependencies]], options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: Unit, options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: Unit, options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: Unit, options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: typings.routeNode.mod.RouteNode): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: typings.routeNode.mod.RouteNode, options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: typings.routeNode.mod.RouteNode, options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: typings.routeNode.mod.RouteNode, options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  
  @JSImport("router5", "RouteNode")
  @js.native
  class RouteNode ()
    extends typings.routeNode.mod.RouteNode {
    def this(name: String) = this()
    def this(name: String, path: String) = this()
    def this(name: Unit, path: String) = this()
    def this(name: String, path: String, childRoutes: js.Array[typings.routeNode.routeNodeMod.Route]) = this()
    def this(name: String, path: Unit, childRoutes: js.Array[typings.routeNode.routeNodeMod.Route]) = this()
    def this(name: Unit, path: String, childRoutes: js.Array[typings.routeNode.routeNodeMod.Route]) = this()
    def this(name: Unit, path: Unit, childRoutes: js.Array[typings.routeNode.routeNodeMod.Route]) = this()
    def this(
      name: String,
      path: String,
      childRoutes: js.Array[typings.routeNode.routeNodeMod.Route],
      options: RouteNodeOptions
    ) = this()
    def this(name: String, path: String, childRoutes: Unit, options: RouteNodeOptions) = this()
    def this(
      name: String,
      path: Unit,
      childRoutes: js.Array[typings.routeNode.routeNodeMod.Route],
      options: RouteNodeOptions
    ) = this()
    def this(name: String, path: Unit, childRoutes: Unit, options: RouteNodeOptions) = this()
    def this(
      name: Unit,
      path: String,
      childRoutes: js.Array[typings.routeNode.routeNodeMod.Route],
      options: RouteNodeOptions
    ) = this()
    def this(name: Unit, path: String, childRoutes: Unit, options: RouteNodeOptions) = this()
    def this(
      name: Unit,
      path: Unit,
      childRoutes: js.Array[typings.routeNode.routeNodeMod.Route],
      options: RouteNodeOptions
    ) = this()
    def this(name: Unit, path: Unit, childRoutes: Unit, options: RouteNodeOptions) = this()
  }
  
  @scala.inline
  def cloneRouter[Dependencies /* <: DefaultDependencies */](router: Router[DefaultDependencies]): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneRouter")(router.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def cloneRouter[Dependencies /* <: DefaultDependencies */](router: Router[DefaultDependencies], dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneRouter")(router.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  
  @JSImport("router5", "constants")
  @js.native
  val constants: Constants_ = js.native
  
  @scala.inline
  def createRouter[Dependencies /* <: Record[String, js.Any] */](): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")().asInstanceOf[Router[Dependencies]]
  @scala.inline
  def createRouter[Dependencies /* <: Record[String, js.Any] */](routes: js.Array[Route[Dependencies]]): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def createRouter[Dependencies /* <: Record[String, js.Any] */](routes: js.Array[Route[Dependencies]], options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def createRouter[Dependencies /* <: Record[String, js.Any] */](routes: js.Array[Route[Dependencies]], options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def createRouter[Dependencies /* <: Record[String, js.Any] */](routes: js.Array[Route[Dependencies]], options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def createRouter[Dependencies /* <: Record[String, js.Any] */](routes: Unit, options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def createRouter[Dependencies /* <: Record[String, js.Any] */](routes: Unit, options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def createRouter[Dependencies /* <: Record[String, js.Any] */](routes: Unit, options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def createRouter[Dependencies /* <: Record[String, js.Any] */](routes: typings.routeNode.mod.RouteNode): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def createRouter[Dependencies /* <: Record[String, js.Any] */](routes: typings.routeNode.mod.RouteNode, options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def createRouter[Dependencies /* <: Record[String, js.Any] */](routes: typings.routeNode.mod.RouteNode, options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def createRouter[Dependencies /* <: Record[String, js.Any] */](routes: typings.routeNode.mod.RouteNode, options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  
  @JSImport("router5", "errorCodes")
  @js.native
  val errorCodes: ErrorCodes_ = js.native
  
  @scala.inline
  def transitionPath(toState: State): TransitionPath = ^.asInstanceOf[js.Dynamic].applyDynamic("transitionPath")(toState.asInstanceOf[js.Any]).asInstanceOf[TransitionPath]
  @scala.inline
  def transitionPath(toState: State, fromState: State): TransitionPath = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionPath")(toState.asInstanceOf[js.Any], fromState.asInstanceOf[js.Any])).asInstanceOf[TransitionPath]
}
