package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Node is an interface from which a number of DOM API object types inherit. It allows those types to be treated similarly; for example, inheriting the same set of methods, or being tested in the same way. */
@js.native
trait Node
  extends StObject
     with EventTarget {
  
  /* standard dom */
  val ATTRIBUTE_NODE: Double = js.native
  
  /** node is a CDATASection node. */
  /* standard dom */
  val CDATA_SECTION_NODE: Double = js.native
  
  /** node is a Comment node. */
  /* standard dom */
  val COMMENT_NODE: Double = js.native
  
  /** node is a DocumentFragment node. */
  /* standard dom */
  val DOCUMENT_FRAGMENT_NODE: Double = js.native
  
  /** node is a document. */
  /* standard dom */
  val DOCUMENT_NODE: Double = js.native
  
  /** Set when other is a descendant of node. */
  /* standard dom */
  val DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
  
  /** Set when other is an ancestor of node. */
  /* standard dom */
  val DOCUMENT_POSITION_CONTAINS: Double = js.native
  
  /** Set when node and other are not in the same tree. */
  /* standard dom */
  val DOCUMENT_POSITION_DISCONNECTED: Double = js.native
  
  /** Set when other is following node. */
  /* standard dom */
  val DOCUMENT_POSITION_FOLLOWING: Double = js.native
  
  /* standard dom */
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
  
  /** Set when other is preceding node. */
  /* standard dom */
  val DOCUMENT_POSITION_PRECEDING: Double = js.native
  
  /** node is a doctype. */
  /* standard dom */
  val DOCUMENT_TYPE_NODE: Double = js.native
  
  /** node is an element. */
  /* standard dom */
  val ELEMENT_NODE: Double = js.native
  
  /* standard dom */
  val ENTITY_NODE: Double = js.native
  
  /* standard dom */
  val ENTITY_REFERENCE_NODE: Double = js.native
  
  /* standard dom */
  val NOTATION_NODE: Double = js.native
  
  /** node is a ProcessingInstruction node. */
  /* standard dom */
  val PROCESSING_INSTRUCTION_NODE: Double = js.native
  
  /** node is a Text node. */
  /* standard dom */
  val TEXT_NODE: Double = js.native
  
  /* standard dom */
  def appendChild[T /* <: Node */](node: T): T = js.native
  
  /** Returns node's node document's document base URL. */
  /* standard dom */
  val baseURI: java.lang.String = js.native
  
  /** Returns the children. */
  /* standard dom */
  val childNodes: NodeListOf[ChildNode] = js.native
  
  /** Returns a copy of node. If deep is true, the copy also includes the node's descendants. */
  /* standard dom */
  def cloneNode(): Node = js.native
  def cloneNode(deep: scala.Boolean): Node = js.native
  
  /** Returns a bitmask indicating the position of other relative to node. */
  /* standard dom */
  def compareDocumentPosition(other: Node): Double = js.native
  
  /** Returns true if other is an inclusive descendant of node, and false otherwise. */
  /* standard dom */
  def contains(): scala.Boolean = js.native
  def contains(other: Node): scala.Boolean = js.native
  
  /** Returns the first child. */
  /* standard dom */
  val firstChild: ChildNode | Null = js.native
  
  /** Returns node's root. */
  /* standard dom */
  def getRootNode(): Node = js.native
  def getRootNode(options: GetRootNodeOptions): Node = js.native
  
  /** Returns whether node has children. */
  /* standard dom */
  def hasChildNodes(): scala.Boolean = js.native
  
  /* standard dom */
  def insertBefore[T /* <: Node */](node: T): T = js.native
  def insertBefore[T /* <: Node */](node: T, child: Node): T = js.native
  
  /** Returns true if node is connected and false otherwise. */
  /* standard dom */
  val isConnected: scala.Boolean = js.native
  
  /* standard dom */
  def isDefaultNamespace(): scala.Boolean = js.native
  def isDefaultNamespace(namespace: java.lang.String): scala.Boolean = js.native
  
  /** Returns whether node and otherNode have the same properties. */
  /* standard dom */
  def isEqualNode(): scala.Boolean = js.native
  def isEqualNode(otherNode: Node): scala.Boolean = js.native
  
  /* standard dom */
  def isSameNode(): scala.Boolean = js.native
  def isSameNode(otherNode: Node): scala.Boolean = js.native
  
  /** Returns the last child. */
  /* standard dom */
  val lastChild: ChildNode | Null = js.native
  
  /* standard dom */
  def lookupNamespaceURI(): java.lang.String | Null = js.native
  def lookupNamespaceURI(prefix: java.lang.String): java.lang.String | Null = js.native
  
  /* standard dom */
  def lookupPrefix(): java.lang.String | Null = js.native
  def lookupPrefix(namespace: java.lang.String): java.lang.String | Null = js.native
  
  /** Returns the next sibling. */
  /* standard dom */
  val nextSibling: ChildNode | Null = js.native
  
  /** Returns a string appropriate for the type of node. */
  /* standard dom */
  val nodeName: java.lang.String = js.native
  
  /** Returns the type of node. */
  /* standard dom */
  val nodeType: Double = js.native
  
  /* standard dom */
  var nodeValue: java.lang.String | Null = js.native
  
  /** Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes. */
  /* standard dom */
  def normalize(): Unit = js.native
  
  /** Returns the node document. Returns null for documents. */
  /* standard dom */
  val ownerDocument: Document | Null = js.native
  
  /** Returns the parent element. */
  /* standard dom */
  val parentElement: HTMLElement | Null = js.native
  
  /** Returns the parent. */
  /* standard dom */
  val parentNode: ParentNode | Null = js.native
  
  /** Returns the previous sibling. */
  /* standard dom */
  val previousSibling: ChildNode | Null = js.native
  
  /* standard dom */
  def removeChild[T /* <: Node */](child: T): T = js.native
  
  /* standard dom */
  def replaceChild[T /* <: Node */](node: Node, child: T): T = js.native
  
  /* standard dom */
  var textContent: java.lang.String | Null = js.native
}
