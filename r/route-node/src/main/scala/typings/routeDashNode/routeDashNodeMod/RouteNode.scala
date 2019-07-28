package typings.routeDashNode.routeDashNodeMod

import typings.pathDashParser.pathDashParserMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteNode extends Route {
  var absolute: Boolean = js.native
  var children: js.Array[RouteNode] = js.native
  var name: String = js.native
  var parent: js.UndefOr[RouteNode] = js.native
  var parser: Path | Null = js.native
  var path: String = js.native
  def add(route: js.Array[Route]): this.type = js.native
  def add(route: js.Array[Route], cb: Callback): this.type = js.native
  def add(route: js.Array[Route], cb: Callback, sort: Boolean): this.type = js.native
  def add(route: Route): this.type = js.native
  def add(route: Route, cb: Callback): this.type = js.native
  def add(route: Route, cb: Callback, sort: Boolean): this.type = js.native
  def addNode(name: String, path: String): this.type = js.native
  /* private */ def addRouteNode(route: js.Any): js.Any = js.native
  /* private */ def addRouteNode(route: js.Any, sort: js.Any): js.Any = js.native
  def buildPath(routeName: String): String = js.native
  def buildPath(routeName: String, params: js.Object): String = js.native
  def buildPath(routeName: String, params: js.Object, options: BuildOptions): String = js.native
  def buildState(name: String): RouteNodeState | Null = js.native
  def buildState(name: String, params: js.Object): RouteNodeState | Null = js.native
  /* private */ def checkParents(): js.Any = js.native
  /* private */ def findAbsoluteChildren(): js.Any = js.native
  /* private */ def findSlashChild(): js.Any = js.native
  def getNonAbsoluteChildren(): js.Array[RouteNode] = js.native
  def getParentSegments(): js.Array[RouteNode] = js.native
  def getParentSegments(segments: js.Array[RouteNode]): js.Array[RouteNode] = js.native
  def getPath(routeName: String): String = js.native
  /* private */ def getSegmentsByName(routeName: js.Any): js.Any = js.native
  /* private */ def getSegmentsMatchingPath(path: js.Any, options: js.Any): js.Any = js.native
  /* private */ def hasParentsParams(): js.Any = js.native
  def matchPath(path: String): RouteNodeState | Null = js.native
  def matchPath(path: String, options: MatchOptions): RouteNodeState | Null = js.native
  def setParent(parent: js.Any): Unit = js.native
  def setPath(): Unit = js.native
  def setPath(path: String): Unit = js.native
  def sortChildren(): Unit = js.native
  def sortDescendants(): Unit = js.native
}

