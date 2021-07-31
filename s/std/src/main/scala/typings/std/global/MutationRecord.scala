package typings.std.global

import typings.std.MutationRecordType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MutationRecord")
@js.native
class MutationRecord ()
  extends StObject
     with typings.std.MutationRecord {
  
  /**
    * Return the nodes added and removed respectively.
    */
  /* CompleteClass */
  override val addedNodes: typings.std.NodeList = js.native
  
  /**
    * Returns the local name of the changed attribute, and null otherwise.
    */
  /* CompleteClass */
  override val attributeName: java.lang.String | Null = js.native
  
  /**
    * Returns the namespace of the changed attribute, and null otherwise.
    */
  /* CompleteClass */
  override val attributeNamespace: java.lang.String | Null = js.native
  
  /**
    * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
    */
  /* CompleteClass */
  override val nextSibling: typings.std.Node | Null = js.native
  
  /**
    * The return value depends on type. For "attributes", it is the value of the changed attribute before the change. For "characterData", it is the data of the changed node before the change. For "childList", it is null.
    */
  /* CompleteClass */
  override val oldValue: java.lang.String | Null = js.native
  
  /**
    * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
    */
  /* CompleteClass */
  override val previousSibling: typings.std.Node | Null = js.native
  
  /**
    * Return the nodes added and removed respectively.
    */
  /* CompleteClass */
  override val removedNodes: typings.std.NodeList = js.native
  
  /**
    * Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed.
    */
  /* CompleteClass */
  override val target: typings.std.Node = js.native
  
  /**
    * Returns "attributes" if it was an attribute mutation. "characterData" if it was a mutation to a CharacterData node. And "childList" if it was a mutation to the tree of nodes.
    */
  /* CompleteClass */
  override val `type`: MutationRecordType = js.native
}
