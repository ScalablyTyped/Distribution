package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver)
  */
trait IntersectionObserver extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/disconnect) */
  /* standard dom */
  def disconnect(): Unit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/observe) */
  /* standard dom */
  def observe(target: Element): Unit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/root) */
  /* standard dom */
  val root: Element | Document | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/rootMargin) */
  /* standard dom */
  val rootMargin: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/takeRecords) */
  /* standard dom */
  def takeRecords(): js.Array[IntersectionObserverEntry]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/thresholds) */
  /* standard dom */
  val thresholds: js.Array[Double]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/unobserve) */
  /* standard dom */
  def unobserve(target: Element): Unit
}
object IntersectionObserver {
  
  inline def apply(
    disconnect: () => Unit,
    observe: Element => Unit,
    rootMargin: java.lang.String,
    takeRecords: () => js.Array[IntersectionObserverEntry],
    thresholds: js.Array[Double],
    unobserve: Element => Unit
  ): IntersectionObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), rootMargin = rootMargin.asInstanceOf[js.Any], takeRecords = js.Any.fromFunction0(takeRecords), thresholds = thresholds.asInstanceOf[js.Any], unobserve = js.Any.fromFunction1(unobserve), root = null)
    __obj.asInstanceOf[IntersectionObserver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntersectionObserver] (val x: Self) extends AnyVal {
    
    inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    inline def setObserve(value: Element => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
    
    inline def setRoot(value: Element | Document): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootMargin(value: java.lang.String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setTakeRecords(value: () => js.Array[IntersectionObserverEntry]): Self = StObject.set(x, "takeRecords", js.Any.fromFunction0(value))
    
    inline def setThresholds(value: js.Array[Double]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    inline def setThresholdsVarargs(value: Double*): Self = StObject.set(x, "thresholds", js.Array(value*))
    
    inline def setUnobserve(value: Element => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction1(value))
  }
}
