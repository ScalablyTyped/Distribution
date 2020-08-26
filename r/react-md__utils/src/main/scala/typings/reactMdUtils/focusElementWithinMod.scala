package typings.reactMdUtils

import typings.std.Document
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/wia-aria/focusElementWithin", JSImport.Namespace)
@js.native
object focusElementWithinMod extends js.Object {
  trait _Focus extends js.Object
  
  def default(container: Document, focus: Focus): Unit = js.native
  def default(
    container: Document,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def default(container: Document, focus: Focus, programatic: js.UndefOr[scala.Nothing], preventScroll: Boolean): Unit = js.native
  def default(
    container: Document,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def default(container: Document, focus: Focus, programatic: Boolean): Unit = js.native
  def default(
    container: Document,
    focus: Focus,
    programatic: Boolean,
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def default(container: Document, focus: Focus, programatic: Boolean, preventScroll: Boolean): Unit = js.native
  def default(
    container: Document,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def default(container: HTMLElement, focus: Focus): Unit = js.native
  def default(
    container: HTMLElement,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def default(
    container: HTMLElement,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: Boolean
  ): Unit = js.native
  def default(
    container: HTMLElement,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def default(container: HTMLElement, focus: Focus, programatic: Boolean): Unit = js.native
  def default(
    container: HTMLElement,
    focus: Focus,
    programatic: Boolean,
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def default(container: HTMLElement, focus: Focus, programatic: Boolean, preventScroll: Boolean): Unit = js.native
  def default(
    container: HTMLElement,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.first
    - typings.reactMdUtils.reactMdUtilsStrings.last
    - java.lang.String
  */
  type Focus = _Focus | String
}

