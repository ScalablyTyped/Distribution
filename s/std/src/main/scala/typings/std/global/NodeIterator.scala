package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("NodeIterator")
@js.native
/* standard dom */
open class NodeIterator ()
  extends StObject
     with typings.std.NodeIterator {
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/detach)
    */
  /* standard dom */
  /* CompleteClass */
  override def detach(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/filter) */
  /* standard dom */
  /* CompleteClass */
  override val filter: typings.std.NodeFilter | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/nextNode) */
  /* standard dom */
  /* CompleteClass */
  override def nextNode(): typings.std.Node | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/pointerBeforeReferenceNode) */
  /* standard dom */
  /* CompleteClass */
  override val pointerBeforeReferenceNode: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/previousNode) */
  /* standard dom */
  /* CompleteClass */
  override def previousNode(): typings.std.Node | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/referenceNode) */
  /* standard dom */
  /* CompleteClass */
  override val referenceNode: typings.std.Node = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/root) */
  /* standard dom */
  /* CompleteClass */
  override val root: typings.std.Node = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/whatToShow) */
  /* standard dom */
  /* CompleteClass */
  override val whatToShow: Double = js.native
}
