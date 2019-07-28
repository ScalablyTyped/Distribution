package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport. */
trait IntersectionObserver extends js.Object {
  val root: Element | Null
  val rootMargin: java.lang.String
  val thresholds: js.Array[Double]
  def disconnect(): Unit
  def observe(target: Element): Unit
  def takeRecords(): js.Array[IntersectionObserverEntry]
  def unobserve(target: Element): Unit
}

@JSGlobal("IntersectionObserver")
@js.native
class IntersectionObserverCls protected () extends IntersectionObserver {
  def this(callback: IntersectionObserverCallback) = this()
  def this(callback: IntersectionObserverCallback, options: IntersectionObserverInit) = this()
  /* CompleteClass */
  override val root: Element | Null = js.native
  /* CompleteClass */
  override val rootMargin: java.lang.String = js.native
  /* CompleteClass */
  override val thresholds: js.Array[Double] = js.native
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  /* CompleteClass */
  override def observe(target: Element): Unit = js.native
  /* CompleteClass */
  override def takeRecords(): js.Array[IntersectionObserverEntry] = js.native
  /* CompleteClass */
  override def unobserve(target: Element): Unit = js.native
}

@JSGlobal("IntersectionObserver")
@js.native
object IntersectionObserver
  extends Instantiable1[/* callback */ IntersectionObserverCallback, IntersectionObserver]
     with Instantiable2[
      /* callback */ IntersectionObserverCallback, 
      /* options */ IntersectionObserverInit, 
      IntersectionObserver
    ]

