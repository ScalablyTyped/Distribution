package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("NodeIterator")
@js.native
class NodeIterator ()
  extends StObject
     with typings.std.NodeIterator {
  
  /* CompleteClass */
  override def detach(): Unit = js.native
  
  /* CompleteClass */
  override val filter: typings.std.NodeFilter | Null = js.native
  
  /* CompleteClass */
  override def nextNode(): typings.std.Node | Null = js.native
  
  /* CompleteClass */
  override val pointerBeforeReferenceNode: scala.Boolean = js.native
  
  /* CompleteClass */
  override def previousNode(): typings.std.Node | Null = js.native
  
  /* CompleteClass */
  override val referenceNode: typings.std.Node = js.native
  
  /* CompleteClass */
  override val root: typings.std.Node = js.native
  
  /* CompleteClass */
  override val whatToShow: Double = js.native
}
