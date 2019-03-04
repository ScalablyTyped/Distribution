package typings
package skatejsLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- skatejsLib.typesMod.WithContext because Inheritance from two classes. Inlined context- skatejsLib.typesMod.WithUpdate because Inheritance from two classes. Inlined props, state, updating, updating, updating, shouldUpdate, shouldUpdate, shouldUpdate, triggerUpdate- skatejsLib.typesMod.WithRenderer because Inheritance from two classes. Inlined renderRoot, updated, updated, updated, rendering, render, render, render, renderer, renderer, renderer, rendered- skatejsLib.typesMod.WithLifecycle because Inheritance from two classes. Inlined connecting, connected, disconnecting, disconnected- skatejsLib.typesMod.WithChildren because Inheritance from two classes. Inlined childrenUpdated */ @JSImport("skatejs/types", "WithComponent")
@js.native
class WithComponent[P, S, C] () extends CustomElement {
  var context: C = js.native
  // Special hack for own components type checking.
  // It works in combination with ElementAttributesProperty. It placed in jsx.d.ts.
  // more detail, see: https://www.typescriptlang.org/docs/handbook/jsx.html
  //               and https://github.com/skatejs/skatejs/pull/952#issuecomment-264500153
  val props: stdLib.Readonly[P] = js.native
  // getter for turning of ShadowDOM
  val renderRoot: js.UndefOr[this.type | Mixed] = js.native
  // called after render
  var rendered: js.UndefOr[js.Function0[scala.Unit]] = js.native
  // called before render
  var rendering: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var state: S = js.native
  def childrenUpdated(): scala.Unit = js.native
  def connected(): scala.Unit = js.native
  def connecting(): scala.Unit = js.native
  def disconnected(): scala.Unit = js.native
  def disconnecting(): scala.Unit = js.native
  def render(): Mixed | scala.Null = js.native
  def render(props: Mixed): Mixed | scala.Null = js.native
  def render(props: Mixed, state: Mixed): Mixed | scala.Null = js.native
  // Default renderer, returns string returned from render and adds it to root via innerHTML
  // -> override to get own renderer
  def renderer(root: stdLib.Element, html: js.Function1[/* props */ js.UndefOr[Mixed], Mixed | scala.Null]): scala.Unit = js.native
  def renderer(root: stdLib.Node, html: js.Function1[/* props */ js.UndefOr[Mixed], Mixed | scala.Null]): scala.Unit = js.native
  def renderer(root: stdLib.ShadowRoot, html: js.Function1[/* props */ js.UndefOr[Mixed], Mixed | scala.Null]): scala.Unit = js.native
  // Called to check whether or not the component should call updated(), much like React's shouldComponentUpdate().
  def shouldUpdate(): scala.Boolean = js.native
  def shouldUpdate(props: P): scala.Boolean = js.native
  def shouldUpdate(props: P, state: S): scala.Boolean = js.native
  // manually force update
  def triggerUpdate(): scala.Unit = js.native
  def updated(): scala.Unit = js.native
  def updated(props: Mixed): scala.Unit = js.native
  def updated(props: Mixed, state: Mixed): scala.Unit = js.native
  // Called when props have been set regardless of if they've changed. much like React's componentWillReceiveProps().
  def updating(): scala.Unit = js.native
  def updating(props: P): scala.Unit = js.native
  def updating(props: P, state: S): scala.Unit = js.native
}

/* static members */
@JSImport("skatejs/types", "WithComponent")
@js.native
object WithComponent extends js.Object {
  val observedAttributes: js.Array[java.lang.String] = js.native
}

