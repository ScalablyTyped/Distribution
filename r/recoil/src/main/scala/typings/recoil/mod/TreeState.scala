package typings.recoil.mod

import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  isSnapshot :boolean,   transactionMetadata :object,   dirtyAtoms :std.Set<recoil.recoil.NodeKey>,   atomValues :recoil.recoil.AtomValues,   nonvalidatedAtoms :std.Map<recoil.recoil.NodeKey, unknown>,   nodeDeps :std.Map<recoil.recoil.NodeKey, std.Set<recoil.recoil.NodeKey>>,   nodeToNodeSubscriptions :std.Map<recoil.recoil.NodeKey, std.Set<recoil.recoil.NodeKey>>,   nodeToComponentSubscriptions :std.Map<recoil.recoil.NodeKey, std.Map<number, [string, recoil.recoil.ComponentCallback]>>}> */
@js.native
trait TreeState extends js.Object {
  val atomValues: AtomValues = js.native
  val dirtyAtoms: Set[NodeKey] = js.native
  val isSnapshot: Boolean = js.native
  val nodeDeps: Map[NodeKey, Set[NodeKey]] = js.native
  val nodeToComponentSubscriptions: Map[NodeKey, Map[Double, js.Tuple2[String, ComponentCallback]]] = js.native
  val nodeToNodeSubscriptions: Map[NodeKey, Set[NodeKey]] = js.native
  val nonvalidatedAtoms: Map[NodeKey, _] = js.native
  val transactionMetadata: js.Object = js.native
}

object TreeState {
  @scala.inline
  def apply(
    atomValues: AtomValues,
    dirtyAtoms: Set[NodeKey],
    isSnapshot: Boolean,
    nodeDeps: Map[NodeKey, Set[NodeKey]],
    nodeToComponentSubscriptions: Map[NodeKey, Map[Double, js.Tuple2[String, ComponentCallback]]],
    nodeToNodeSubscriptions: Map[NodeKey, Set[NodeKey]],
    nonvalidatedAtoms: Map[NodeKey, _],
    transactionMetadata: js.Object
  ): TreeState = {
    val __obj = js.Dynamic.literal(atomValues = atomValues.asInstanceOf[js.Any], dirtyAtoms = dirtyAtoms.asInstanceOf[js.Any], isSnapshot = isSnapshot.asInstanceOf[js.Any], nodeDeps = nodeDeps.asInstanceOf[js.Any], nodeToComponentSubscriptions = nodeToComponentSubscriptions.asInstanceOf[js.Any], nodeToNodeSubscriptions = nodeToNodeSubscriptions.asInstanceOf[js.Any], nonvalidatedAtoms = nonvalidatedAtoms.asInstanceOf[js.Any], transactionMetadata = transactionMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeState]
  }
  @scala.inline
  implicit class TreeStateOps[Self <: TreeState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAtomValues(value: AtomValues): Self = this.set("atomValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirtyAtoms(value: Set[NodeKey]): Self = this.set("dirtyAtoms", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSnapshot(value: Boolean): Self = this.set("isSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeDeps(value: Map[NodeKey, Set[NodeKey]]): Self = this.set("nodeDeps", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeToComponentSubscriptions(value: Map[NodeKey, Map[Double, js.Tuple2[String, ComponentCallback]]]): Self = this.set("nodeToComponentSubscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeToNodeSubscriptions(value: Map[NodeKey, Set[NodeKey]]): Self = this.set("nodeToNodeSubscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonvalidatedAtoms(value: Map[NodeKey, _]): Self = this.set("nonvalidatedAtoms", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionMetadata(value: js.Object): Self = this.set("transactionMetadata", value.asInstanceOf[js.Any])
  }
  
}

