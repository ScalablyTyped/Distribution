package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var container: stdLib.HTMLElement
  def refresh(): Sigma
  def render(): Sigma
  def resize(): Sigma
  def settings(settings: Settings): scala.Unit
}

