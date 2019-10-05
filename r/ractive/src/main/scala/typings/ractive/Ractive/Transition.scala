package typings.ractive.Ractive

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transition extends js.Object {
  var isIntro: Boolean = js.native
  var name: String = js.native
  var node: HTMLElement = js.native
  def animateStyle(prop: String, value: js.Any, options: TransitionAnimateOptions, complete: js.Function): Unit = js.native
  def animateStyle(props: js.Object, options: TransitionAnimateOptions, complete: js.Function): Unit = js.native
  // Default false
  def complete(): Unit = js.native
  def complete(noReset: Boolean): Unit = js.native
  def getStyle(prop: String): String = js.native
  def getStyle(props: js.Array[String]): js.Object = js.native
  def processParams(params: js.Any): js.Object = js.native
  def processParams(params: js.Any, defaults: js.Object): js.Object = js.native
  def resetStyle(): Unit = js.native
  def setStyle(prop: String, value: js.Any): Transition = js.native
  def setStyle(props: js.Object): Transition = js.native
}

