package typings.reactHtmlParser.mod

import typings.domhandler.mod.DomElement
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform extends js.Object {
  
  def apply(node: DomElement, index: Double): ReactElement | Unit | Null = js.native
  def apply(node: DomElement, index: Double, transform: Transform): ReactElement | Unit | Null = js.native
}
