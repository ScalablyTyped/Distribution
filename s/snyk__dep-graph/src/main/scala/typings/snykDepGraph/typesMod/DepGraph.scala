package typings.snykDepGraph.typesMod

import typings.snykDepGraph.anon.CompareRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepGraph extends js.Object {
  val pkgManager: PkgManager = js.native
  val rootPkg: PkgInfo = js.native
  def countPathsToRoot(pkg: Pkg): Double = js.native
  def directDepsLeadingTo(pkg: Pkg): js.Array[PkgInfo] = js.native
  def equals(other: DepGraph): Boolean = js.native
  def equals(other: DepGraph, options: CompareRoot): Boolean = js.native
  def getDepPkgs(): js.Array[PkgInfo] = js.native
  def getPkgNodes(pkg: Pkg): js.Array[Node] = js.native
  def getPkgs(): js.Array[PkgInfo] = js.native
  def pkgPathsToRoot(pkg: Pkg): js.Array[js.Array[PkgInfo]] = js.native
  def toJSON(): DepGraphData = js.native
}

