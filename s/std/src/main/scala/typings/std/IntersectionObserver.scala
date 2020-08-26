package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport. */
@js.native
trait IntersectionObserver extends js.Object {
  val root: Element | Null = js.native
  val rootMargin: java.lang.String = js.native
  val thresholds: js.Array[Double] = js.native
  def disconnect(): Unit = js.native
  def observe(target: Element): Unit = js.native
  def takeRecords(): js.Array[IntersectionObserverEntry] = js.native
  def unobserve(target: Element): Unit = js.native
}

object IntersectionObserver {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    observe: Element => Unit,
    rootMargin: java.lang.String,
    takeRecords: () => js.Array[IntersectionObserverEntry],
    thresholds: js.Array[Double],
    unobserve: Element => Unit
  ): IntersectionObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), rootMargin = rootMargin.asInstanceOf[js.Any], takeRecords = js.Any.fromFunction0(takeRecords), thresholds = thresholds.asInstanceOf[js.Any], unobserve = js.Any.fromFunction1(unobserve))
    __obj.asInstanceOf[IntersectionObserver]
  }
  @scala.inline
  implicit class IntersectionObserverOps[Self <: IntersectionObserver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def setObserve(value: Element => Unit): Self = this.set("observe", js.Any.fromFunction1(value))
    @scala.inline
    def setRootMargin(value: java.lang.String): Self = this.set("rootMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setTakeRecords(value: () => js.Array[IntersectionObserverEntry]): Self = this.set("takeRecords", js.Any.fromFunction0(value))
    @scala.inline
    def setThresholdsVarargs(value: Double*): Self = this.set("thresholds", js.Array(value :_*))
    @scala.inline
    def setThresholds(value: js.Array[Double]): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnobserve(value: Element => Unit): Self = this.set("unobserve", js.Any.fromFunction1(value))
    @scala.inline
    def setRoot(value: Element): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

