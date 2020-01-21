package typings.skatejs.typesMod

import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.Node
import typings.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.std.EventTarget because Already inherited
- typings.std.Node because Already inherited
- typings.std.Slotable because Already inherited
- typings.std.ParentNode because Already inherited
- typings.std.NonDocumentTypeChildNode because Already inherited
- typings.std.InnerHTML because Already inherited
- typings.std.Animatable because Already inherited
- typings.std.ChildNode because Already inherited
- typings.std.HTMLOrSVGElement because Already inherited
- typings.std.GlobalEventHandlers because Already inherited
- typings.std.ElementContentEditable because Already inherited
- typings.std.ElementCSSInlineStyle because Already inherited
- typings.std.DocumentAndElementEventHandlers because Already inherited
- typings.std.Element because Already inherited
- typings.std.HTMLElement because Already inherited
- typings.skatejs.typesMod.WithContext because Inheritance from two classes. Inlined context
- typings.skatejs.typesMod.WithUpdate because Inheritance from two classes. Inlined props, state, updating, updating, updating, shouldUpdate, shouldUpdate, shouldUpdate, triggerUpdate
- typings.skatejs.typesMod.WithRenderer because Inheritance from two classes. Inlined renderRoot, updated, updated, updated, rendering, render, render, render, renderer, renderer, renderer, rendered
- typings.skatejs.typesMod.WithLifecycle because Inheritance from two classes. Inlined connecting, connected, disconnecting, disconnected
- typings.skatejs.typesMod.WithChildren because Inheritance from two classes. Inlined childrenUpdated */ @JSImport("skatejs/types", "WithComponent")
@js.native
class WithComponent[P, S, C] ()
  extends CustomElement
     with Renderer[Mixed | Null] {
  var context: C = js.native
  // Special hack for own components type checking.
  // It works in combination with ElementAttributesProperty. It placed in jsx.d.ts.
  // more detail, see: https://www.typescriptlang.org/docs/handbook/jsx.html
  //               and https://github.com/skatejs/skatejs/pull/952#issuecomment-264500153
  val props: P = js.native
  // getter for turning of ShadowDOM
  val renderRoot: js.UndefOr[this.type | Mixed] = js.native
  // called after render
  var rendered: js.UndefOr[js.Function0[Unit]] = js.native
  // called before render
  var rendering: js.UndefOr[js.Function0[Unit]] = js.native
  var state: S = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * 
    * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * 
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * 
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
    * 
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
    * 
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  def childrenUpdated(): Unit = js.native
  def connected(): Unit = js.native
  def connecting(): Unit = js.native
  def disconnected(): Unit = js.native
  def disconnecting(): Unit = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  def render(): Mixed | Null = js.native
  def render(props: Mixed): Mixed | Null = js.native
  def render(props: Mixed, state: Mixed): Mixed | Null = js.native
  // Default renderer, returns string returned from render and adds it to root via innerHTML
  // -> override to get own renderer
  def renderer(root: Element, html: js.Function1[/* props */ js.UndefOr[Mixed], Mixed | Null]): Unit = js.native
  def renderer(root: Node, html: js.Function1[/* props */ js.UndefOr[Mixed], Mixed | Null]): Unit = js.native
  def renderer(root: ShadowRoot, html: js.Function1[/* props */ js.UndefOr[Mixed], Mixed | Null]): Unit = js.native
  // Called to check whether or not the component should call updated(), much like React's shouldComponentUpdate().
  def shouldUpdate(): Boolean = js.native
  def shouldUpdate(props: P): Boolean = js.native
  def shouldUpdate(props: P, state: S): Boolean = js.native
  // manually force update
  def triggerUpdate(): Unit = js.native
  def updated(): Unit = js.native
  def updated(props: Mixed): Unit = js.native
  def updated(props: Mixed, state: Mixed): Unit = js.native
  // Called when props have been set regardless of if they've changed. much like React's componentWillReceiveProps().
  def updating(): Unit = js.native
  def updating(props: P): Unit = js.native
  def updating(props: P, state: S): Unit = js.native
}

/* static members */
@JSImport("skatejs/types", "WithComponent")
@js.native
object WithComponent extends js.Object {
  val observedAttributes: js.Array[String] = js.native
}

