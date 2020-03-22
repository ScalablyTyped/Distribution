package typings.reactFromDom.mod

import typings.react.mod.ReactNode
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-from-dom", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(input: String): ReactNode | Node = js.native
  def apply(input: String, options: Options): ReactNode | Node = js.native
  def apply(input: Node): ReactNode | Node = js.native
  def apply(input: Node, options: Options): ReactNode | Node = js.native
}

