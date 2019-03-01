package typings
package routeDashNodeLib.routeDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteNode extends Route {
  var absolute: scala.Boolean = js.native
  var children: js.Array[RouteNode] = js.native
  var name: java.lang.String = js.native
  var parent: js.UndefOr[RouteNode] = js.native
  var parser: pathDashParserLib.pathDashParserMod.Path | scala.Null = js.native
  var path: java.lang.String = js.native
  def add(route: js.Array[Route]): this.type = js.native
  def add(route: js.Array[Route], cb: Callback): this.type = js.native
  def add(route: js.Array[Route], cb: Callback, sort: scala.Boolean): this.type = js.native
  def add(route: Route): this.type = js.native
  def add(route: Route, cb: Callback): this.type = js.native
  def add(route: Route, cb: Callback, sort: scala.Boolean): this.type = js.native
  def addNode(name: java.lang.String, path: java.lang.String): this.type = js.native
  /* private */ def addRouteNode(route: js.Any): js.Any = js.native
  /* private */ def addRouteNode(route: js.Any, sort: js.Any): js.Any = js.native
  def buildPath(routeName: java.lang.String): java.lang.String = js.native
  def buildPath(routeName: java.lang.String, params: js.Object): java.lang.String = js.native
  def buildPath(routeName: java.lang.String, params: js.Object, options: BuildOptions): java.lang.String = js.native
  def buildState(name: java.lang.String): RouteNodeState | scala.Null = js.native
  def buildState(name: java.lang.String, params: js.Object): RouteNodeState | scala.Null = js.native
  /* private */ def checkParents(): js.Any = js.native
  /* private */ def findAbsoluteChildren(): js.Any = js.native
  /* private */ def findSlashChild(): js.Any = js.native
  def getNonAbsoluteChildren(): js.Array[RouteNode] = js.native
  def getParentSegments(): js.Array[RouteNode] = js.native
  def getParentSegments(segments: js.Array[RouteNode]): js.Array[RouteNode] = js.native
  def getPath(routeName: java.lang.String): java.lang.String = js.native
  /* private */ def getSegmentsByName(routeName: js.Any): js.Any = js.native
  /* private */ def getSegmentsMatchingPath(path: js.Any, options: js.Any): js.Any = js.native
  /* private */ def hasParentsParams(): js.Any = js.native
  def matchPath(path: java.lang.String): RouteNodeState | scala.Null = js.native
  def matchPath(path: java.lang.String, options: MatchOptions): RouteNodeState | scala.Null = js.native
  def setParent(parent: js.Any): scala.Unit = js.native
  def setPath(): scala.Unit = js.native
  def setPath(path: java.lang.String): scala.Unit = js.native
  def sortChildren(): scala.Unit = js.native
  def sortDescendants(): scala.Unit = js.native
}

