package typings
package skatejsLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs/types", "WithUpdate")
@js.native
class WithUpdate[P, S] ()
  extends stdLib.HTMLElement {
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: stdLib.Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: stdLib.Element | scala.Null = js.native
  // Special hack for own components type checking.
  // It works in combination with ElementAttributesProperty. It placed in jsx.d.ts.
  // more detail, see: https://www.typescriptlang.org/docs/handbook/jsx.html
  //               and https://github.com/skatejs/skatejs/pull/952#issuecomment-264500153
  val props: stdLib.Readonly[P] = js.native
  var state: S = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
  // Called to check whether or not the component should call updated(), much like React's shouldComponentUpdate().
  def shouldUpdate(): scala.Boolean = js.native
  def shouldUpdate(props: P): scala.Boolean = js.native
  def shouldUpdate(props: P, state: S): scala.Boolean = js.native
  // manually force update
  def triggerUpdate(): scala.Unit = js.native
  // Called if shouldUpdate returned true, much like React's componentWillUpdate()
  def updated(): scala.Unit = js.native
  def updated(props: Mixed): scala.Unit = js.native
  def updated(props: Mixed, state: Mixed): scala.Unit = js.native
  // Called when props have been set regardless of if they've changed. much like React's componentWillReceiveProps().
  def updating(): scala.Unit = js.native
  def updating(props: P): scala.Unit = js.native
  def updating(props: P, state: S): scala.Unit = js.native
}

