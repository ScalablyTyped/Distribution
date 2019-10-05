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
object IntersectionObserver
  extends Instantiable1[/* callback */ IntersectionObserverCallback, IntersectionObserver]
     with Instantiable2[
      /* callback */ IntersectionObserverCallback, 
      /* options */ IntersectionObserverInit, 
      IntersectionObserver
    ]

