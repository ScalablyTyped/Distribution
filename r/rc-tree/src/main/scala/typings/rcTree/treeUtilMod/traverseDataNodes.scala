package typings.rcTree.treeUtilMod

import typings.rcTree.anon.Index
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.GetKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree/es/utils/treeUtil", "traverseDataNodes")
@js.native
object traverseDataNodes extends js.Object {
  def apply(dataNodes: js.Array[DataNode], callback: js.Function1[/* data */ Index, Unit]): Unit = js.native
  def apply(
    dataNodes: js.Array[DataNode],
    callback: js.Function1[/* data */ Index, Unit],
    externalGetKey: String
  ): Unit = js.native
  def apply(
    dataNodes: js.Array[DataNode],
    callback: js.Function1[/* data */ Index, Unit],
    externalGetKey: GetKey[DataNode]
  ): Unit = js.native
}

