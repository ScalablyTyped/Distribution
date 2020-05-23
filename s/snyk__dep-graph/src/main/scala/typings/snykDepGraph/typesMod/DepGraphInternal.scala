package typings.snykDepGraph.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepGraphInternal extends DepGraph {
  val rootNodeId: String = js.native
  def getNode(nodeId: String): NodeInfo = js.native
  def getNodeDepsNodeIds(nodeId: String): js.Array[String] = js.native
  def getNodeParentsNodeIds(nodeId: String): js.Array[String] = js.native
  def getNodePkg(nodeId: String): PkgInfo = js.native
  def getPkgNodeIds(pkg: Pkg): js.Array[String] = js.native
  def hasCycles(): Boolean = js.native
}

