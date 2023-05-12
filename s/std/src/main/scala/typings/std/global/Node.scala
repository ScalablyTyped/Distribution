package typings.std.global

import typings.std.stdInts.`0x01`
import typings.std.stdInts.`0x02`
import typings.std.stdInts.`0x04`
import typings.std.stdInts.`0x08`
import typings.std.stdInts.`0x10`
import typings.std.stdInts.`0x20`
import typings.std.stdInts.`10`
import typings.std.stdInts.`11`
import typings.std.stdInts.`12`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdInts.`5`
import typings.std.stdInts.`6`
import typings.std.stdInts.`7`
import typings.std.stdInts.`8`
import typings.std.stdInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Node")
@js.native
/* standard dom */
open class Node ()
  extends StObject
     with typings.std.Node
object Node {
  
  /* standard dom */
  @JSGlobal("Node.ATTRIBUTE_NODE")
  @js.native
  val ATTRIBUTE_NODE: `2` = js.native
  
  /** node is a CDATASection node. */
  /* standard dom */
  @JSGlobal("Node.CDATA_SECTION_NODE")
  @js.native
  val CDATA_SECTION_NODE: `4` = js.native
  
  /** node is a Comment node. */
  /* standard dom */
  @JSGlobal("Node.COMMENT_NODE")
  @js.native
  val COMMENT_NODE: `8` = js.native
  
  /** node is a DocumentFragment node. */
  /* standard dom */
  @JSGlobal("Node.DOCUMENT_FRAGMENT_NODE")
  @js.native
  val DOCUMENT_FRAGMENT_NODE: `11` = js.native
  
  /** node is a document. */
  /* standard dom */
  @JSGlobal("Node.DOCUMENT_NODE")
  @js.native
  val DOCUMENT_NODE: `9` = js.native
  
  /** Set when other is a descendant of node. */
  /* standard dom */
  @JSGlobal("Node.DOCUMENT_POSITION_CONTAINED_BY")
  @js.native
  val DOCUMENT_POSITION_CONTAINED_BY: `0x10` = js.native
  
  /** Set when other is an ancestor of node. */
  /* standard dom */
  @JSGlobal("Node.DOCUMENT_POSITION_CONTAINS")
  @js.native
  val DOCUMENT_POSITION_CONTAINS: `0x08` = js.native
  
  /** Set when node and other are not in the same tree. */
  /* standard dom */
  @JSGlobal("Node.DOCUMENT_POSITION_DISCONNECTED")
  @js.native
  val DOCUMENT_POSITION_DISCONNECTED: `0x01` = js.native
  
  /** Set when other is following node. */
  /* standard dom */
  @JSGlobal("Node.DOCUMENT_POSITION_FOLLOWING")
  @js.native
  val DOCUMENT_POSITION_FOLLOWING: `0x04` = js.native
  
  /* standard dom */
  @JSGlobal("Node.DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")
  @js.native
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: `0x20` = js.native
  
  /** Set when other is preceding node. */
  /* standard dom */
  @JSGlobal("Node.DOCUMENT_POSITION_PRECEDING")
  @js.native
  val DOCUMENT_POSITION_PRECEDING: `0x02` = js.native
  
  /** node is a doctype. */
  /* standard dom */
  @JSGlobal("Node.DOCUMENT_TYPE_NODE")
  @js.native
  val DOCUMENT_TYPE_NODE: `10` = js.native
  
  /** node is an element. */
  /* standard dom */
  @JSGlobal("Node.ELEMENT_NODE")
  @js.native
  val ELEMENT_NODE: `1` = js.native
  
  /* standard dom */
  @JSGlobal("Node.ENTITY_NODE")
  @js.native
  val ENTITY_NODE: `6` = js.native
  
  /* standard dom */
  @JSGlobal("Node.ENTITY_REFERENCE_NODE")
  @js.native
  val ENTITY_REFERENCE_NODE: `5` = js.native
  
  /* standard dom */
  @JSGlobal("Node.NOTATION_NODE")
  @js.native
  val NOTATION_NODE: `12` = js.native
  
  /** node is a ProcessingInstruction node. */
  /* standard dom */
  @JSGlobal("Node.PROCESSING_INSTRUCTION_NODE")
  @js.native
  val PROCESSING_INSTRUCTION_NODE: `7` = js.native
  
  /** node is a Text node. */
  /* standard dom */
  @JSGlobal("Node.TEXT_NODE")
  @js.native
  val TEXT_NODE: `3` = js.native
}
