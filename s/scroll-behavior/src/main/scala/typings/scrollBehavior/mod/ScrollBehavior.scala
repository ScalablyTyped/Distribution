package typings.scrollBehavior.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollBehavior[TLocation /* <: LocationBase */, TContext] extends js.Object {
  def registerElement(key: String, element: HTMLElement, shouldUpdateScroll: Null, context: TContext): Unit = js.native
  def registerElement(
    key: String,
    element: HTMLElement,
    shouldUpdateScroll: ShouldUpdateScroll[TContext],
    context: TContext
  ): Unit = js.native
  def scrollToTarget(element: HTMLElement, target: String): Unit = js.native
  def scrollToTarget(element: HTMLElement, target: ScrollPosition): Unit = js.native
  def startIgnoringScrollEvents(): Unit = js.native
  def stopIgnoringScrollEvents(): Unit = js.native
  def unregisterElement(key: String): Unit = js.native
  def updateScroll(prevContext: TContext, context: TContext): Unit = js.native
  def updateScroll(prevContext: Null, context: TContext): Unit = js.native
}

