package typings.std.global

import typings.std.Document
import typings.std.IntersectionObserverCallback
import typings.std.IntersectionObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IntersectionObserver")
@js.native
open class IntersectionObserver protected ()
  extends StObject
     with typings.std.IntersectionObserver {
  /* standard dom */
  def this(callback: IntersectionObserverCallback) = this()
  def this(callback: IntersectionObserverCallback, options: IntersectionObserverInit) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/disconnect) */
  /* standard dom */
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/observe) */
  /* standard dom */
  /* CompleteClass */
  override def observe(target: typings.std.Element): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/root) */
  /* standard dom */
  /* CompleteClass */
  override val root: typings.std.Element | Document | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/rootMargin) */
  /* standard dom */
  /* CompleteClass */
  override val rootMargin: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/takeRecords) */
  /* standard dom */
  /* CompleteClass */
  override def takeRecords(): js.Array[typings.std.IntersectionObserverEntry] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/thresholds) */
  /* standard dom */
  /* CompleteClass */
  override val thresholds: js.Array[Double] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/unobserve) */
  /* standard dom */
  /* CompleteClass */
  override def unobserve(target: typings.std.Element): Unit = js.native
}
