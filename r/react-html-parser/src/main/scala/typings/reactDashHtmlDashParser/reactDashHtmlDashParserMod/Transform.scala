package typings.reactDashHtmlDashParser.reactDashHtmlDashParserMod

import typings.domhandler.domhandlerMod.DomElement
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform extends js.Object {
  def apply(node: DomElement, index: Double): ReactElement | Unit | Null = js.native
  def apply(node: DomElement, index: Double, transform: Transform): ReactElement | Unit | Null = js.native
}

