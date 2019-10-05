package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A MutationRecord represents an individual DOM mutation. It is the object that is passed to MutationObserver's callback. */
trait MutationRecord extends js.Object {
  /**
    * Return the nodes added and removed respectively.
    */
  val addedNodes: NodeList
  /**
    * Returns the local name of the changed attribute, and null otherwise.
    */
  val attributeName: java.lang.String | Null
  /**
    * Returns the namespace of the changed attribute, and null otherwise.
    */
  val attributeNamespace: java.lang.String | Null
  /**
    * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
    */
  val nextSibling: Node | Null
  /**
    * The return value depends on type. For "attributes", it is the value of the changed attribute before the change. For "characterData", it is the data of the changed node before the change. For "childList", it is null.
    */
  val oldValue: java.lang.String | Null
  /**
    * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
    */
  val previousSibling: Node | Null
  /**
    * Return the nodes added and removed respectively.
    */
  val removedNodes: NodeList
  /**
    * Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed.
    */
  val target: Node
  /**
    * Returns "attributes" if it was an attribute mutation. "characterData" if it was a mutation to a CharacterData node. And "childList" if it was a mutation to the tree of nodes.
    */
  val `type`: MutationRecordType
}

@JSGlobal("MutationRecord")
@js.native
object MutationRecord extends Instantiable0[MutationRecord]

