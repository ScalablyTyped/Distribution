package typings.recoil.mod

import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  isSnapshot  :boolean,   transactionMetadata  :object,   dirtyAtoms  :std.Set<recoil.recoil.NodeKey>,   atomValues  :recoil.recoil.AtomValues,   nonvalidatedAtoms  :std.Map<recoil.recoil.NodeKey, unknown>,   nodeDeps  :std.Map<recoil.recoil.NodeKey, std.Set<recoil.recoil.NodeKey>>,   nodeToNodeSubscriptions  :std.Map<recoil.recoil.NodeKey, std.Set<recoil.recoil.NodeKey>>,   nodeToComponentSubscriptions  :std.Map<recoil.recoil.NodeKey, std.Map<number, [string, recoil.recoil.ComponentCallback]>>}> */
trait TreeState extends js.Object {
  val atomValues: AtomValues
  val dirtyAtoms: Set[NodeKey]
  val isSnapshot: Boolean
  val nodeDeps: Map[NodeKey, Set[NodeKey]]
  val nodeToComponentSubscriptions: Map[NodeKey, Map[Double, js.Tuple2[String, ComponentCallback]]]
  val nodeToNodeSubscriptions: Map[NodeKey, Set[NodeKey]]
  val nonvalidatedAtoms: Map[NodeKey, _]
  val transactionMetadata: js.Object
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
}

