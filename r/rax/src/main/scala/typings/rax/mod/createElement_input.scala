package typings.rax.mod

import typings.rax.raxStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rax", "createElement")
@js.native
object createElement_input extends js.Object {
  /**
    * ======================================================================
    * Rax Top Level API
    * ======================================================================
    */
  // DOM Elements
  // TODO: generalize this to everything in `keyof RaxHTML`, not just "input"
  def apply(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] with ClassAttributes[HTMLInputElement],
    children: RaxNode*
  ): DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply(`type`: input, props: js.UndefOr[scala.Nothing], children: RaxNode*): DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply(`type`: input, props: Null, children: RaxNode*): DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
}

