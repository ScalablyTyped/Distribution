package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport. */
trait IntersectionObserver extends js.Object {
  val root: Element | scala.Null
  val rootMargin: java.lang.String
  val thresholds: js.Array[scala.Double]
  def disconnect(): scala.Unit
  def observe(target: Element): scala.Unit
  def takeRecords(): js.Array[IntersectionObserverEntry]
  def unobserve(target: Element): scala.Unit
}

@JSGlobal("IntersectionObserver")
@js.native
class IntersectionObserverCls protected () extends IntersectionObserver {
  def this(callback: IntersectionObserverCallback) = this()
  def this(callback: IntersectionObserverCallback, options: IntersectionObserverInit) = this()
  /* CompleteClass */
  override val root: Element | scala.Null = js.native
  /* CompleteClass */
  override val rootMargin: java.lang.String = js.native
  /* CompleteClass */
  override val thresholds: js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def disconnect(): scala.Unit = js.native
  /* CompleteClass */
  override def observe(target: Element): scala.Unit = js.native
  /* CompleteClass */
  override def takeRecords(): js.Array[IntersectionObserverEntry] = js.native
  /* CompleteClass */
  override def unobserve(target: Element): scala.Unit = js.native
}

@JSGlobal("IntersectionObserver")
@js.native
object IntersectionObserver
  extends org.scalablytyped.runtime.Instantiable1[/* callback */ IntersectionObserverCallback, IntersectionObserver]
     with org.scalablytyped.runtime.Instantiable2[
      /* callback */ IntersectionObserverCallback, 
      /* options */ IntersectionObserverInit, 
      IntersectionObserver
    ]

