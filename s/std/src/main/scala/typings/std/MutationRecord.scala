package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A MutationRecord represents an individual DOM mutation. It is the object that is passed to MutationObserver's callback. */
@js.native
trait MutationRecord extends js.Object {
  
  /**
    * Return the nodes added and removed respectively.
    */
  val addedNodes: NodeList = js.native
  
  /**
    * Returns the local name of the changed attribute, and null otherwise.
    */
  val attributeName: java.lang.String | Null = js.native
  
  /**
    * Returns the namespace of the changed attribute, and null otherwise.
    */
  val attributeNamespace: java.lang.String | Null = js.native
  
  /**
    * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
    */
  val nextSibling: Node | Null = js.native
  
  /**
    * The return value depends on type. For "attributes", it is the value of the changed attribute before the change. For "characterData", it is the data of the changed node before the change. For "childList", it is null.
    */
  val oldValue: java.lang.String | Null = js.native
  
  /**
    * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
    */
  val previousSibling: Node | Null = js.native
  
  /**
    * Return the nodes added and removed respectively.
    */
  val removedNodes: NodeList = js.native
  
  /**
    * Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed.
    */
  val target: Node = js.native
  
  /**
    * Returns "attributes" if it was an attribute mutation. "characterData" if it was a mutation to a CharacterData node. And "childList" if it was a mutation to the tree of nodes.
    */
  val `type`: MutationRecordType = js.native
}
object MutationRecord {
  
  @scala.inline
  def apply(addedNodes: NodeList, removedNodes: NodeList, target: Node, `type`: MutationRecordType): MutationRecord = {
    val __obj = js.Dynamic.literal(addedNodes = addedNodes.asInstanceOf[js.Any], removedNodes = removedNodes.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationRecord]
  }
  
  @scala.inline
  implicit class MutationRecordOps[Self <: MutationRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddedNodes(value: NodeList): Self = this.set("addedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedNodes(value: NodeList): Self = this.set("removedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Node): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MutationRecordType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeName(value: java.lang.String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameNull: Self = this.set("attributeName", null)
    
    @scala.inline
    def setAttributeNamespace(value: java.lang.String): Self = this.set("attributeNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNamespaceNull: Self = this.set("attributeNamespace", null)
    
    @scala.inline
    def setNextSibling(value: Node): Self = this.set("nextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSiblingNull: Self = this.set("nextSibling", null)
    
    @scala.inline
    def setOldValue(value: java.lang.String): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueNull: Self = this.set("oldValue", null)
    
    @scala.inline
    def setPreviousSibling(value: Node): Self = this.set("previousSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSiblingNull: Self = this.set("previousSibling", null)
  }
}
