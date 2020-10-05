package typings.rcTree.treeUtilMod

import typings.rcTree.anon.InitWrapper
import typings.rcTree.anon.KeyEntities
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.GetKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tree/es/utils/treeUtil", "convertDataToEntities")
@js.native
object convertDataToEntities extends js.Object {
  def apply(dataNodes: js.Array[DataNode]): KeyEntities = js.native
  def apply(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: js.UndefOr[scala.Nothing],
    externalGetKey: String
  ): KeyEntities = js.native
  def apply(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: js.UndefOr[scala.Nothing],
    externalGetKey: GetKey[DataNode]
  ): KeyEntities = js.native
  def apply(dataNodes: js.Array[DataNode], hasInitWrapperProcessEntityOnProcessFinished: InitWrapper): KeyEntities = js.native
  def apply(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: InitWrapper,
    externalGetKey: String
  ): KeyEntities = js.native
  def apply(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: InitWrapper,
    externalGetKey: GetKey[DataNode]
  ): KeyEntities = js.native
}

