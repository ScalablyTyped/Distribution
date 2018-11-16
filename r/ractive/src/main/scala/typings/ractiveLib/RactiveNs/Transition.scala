package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transition extends js.Object {
  var isIntro: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var node: stdLib.HTMLElement = js.native
  def animateStyle(prop: java.lang.String, value: js.Any, options: TransitionAnimateOptions, complete: js.Function): scala.Unit = js.native
  def animateStyle(props: js.Object, options: TransitionAnimateOptions, complete: js.Function): scala.Unit = js.native
  // Default false
  def complete(): scala.Unit = js.native
  // Default false
  def complete(noReset: scala.Boolean): scala.Unit = js.native
  def getStyle(prop: java.lang.String): java.lang.String = js.native
  def getStyle(props: js.Array[java.lang.String]): js.Object = js.native
  def processParams(params: js.Any): js.Object = js.native
  def processParams(params: js.Any, defaults: js.Object): js.Object = js.native
  def resetStyle(): scala.Unit = js.native
  def setStyle(prop: java.lang.String, value: js.Any): Transition = js.native
  def setStyle(props: js.Object): Transition = js.native
}

