package typings.std.global

import typings.std.DOMHighResTimeStamp
import typings.std.IntersectionObserverEntryInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IntersectionObserverEntry")
@js.native
open class IntersectionObserverEntry protected ()
  extends StObject
     with typings.std.IntersectionObserverEntry {
  /* standard dom */
  def this(intersectionObserverEntryInit: IntersectionObserverEntryInit) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/boundingClientRect) */
  /* standard dom */
  /* CompleteClass */
  override val boundingClientRect: typings.std.DOMRectReadOnly = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/intersectionRatio) */
  /* standard dom */
  /* CompleteClass */
  override val intersectionRatio: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/intersectionRect) */
  /* standard dom */
  /* CompleteClass */
  override val intersectionRect: typings.std.DOMRectReadOnly = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/isIntersecting) */
  /* standard dom */
  /* CompleteClass */
  override val isIntersecting: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/rootBounds) */
  /* standard dom */
  /* CompleteClass */
  override val rootBounds: typings.std.DOMRectReadOnly | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/target) */
  /* standard dom */
  /* CompleteClass */
  override val target: typings.std.Element = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/time) */
  /* standard dom */
  /* CompleteClass */
  override val time: DOMHighResTimeStamp = js.native
}
