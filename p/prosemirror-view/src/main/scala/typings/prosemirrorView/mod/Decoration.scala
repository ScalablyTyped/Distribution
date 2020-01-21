package typings.prosemirrorView.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-view", "Decoration")
@js.native
class Decoration[T /* <: js.Object */] () extends js.Object {
  /**
    * The start position of the decoration.
    */
  var from: Double = js.native
  /**
    * The spec provided when creating this decoration. Can be useful
    * if you've stored extra information in that object.
    */
  var spec: T = js.native
  /**
    * The end position. Will be the same as `from` for [widget
    * decorations](#view.Decoration^widget).
    */
  var to: Double = js.native
}

/* static members */
@JSImport("prosemirror-view", "Decoration")
@js.native
object Decoration extends js.Object {
  /**
    * Creates an inline decoration, which adds the given attributes to
    * each inline node between `from` and `to`.
    */
  def `inline`[T /* <: js.Object */](from: Double, to: Double, attrs: DecorationAttrs): Decoration[T with InlineDecorationSpec] = js.native
  def `inline`[T /* <: js.Object */](from: Double, to: Double, attrs: DecorationAttrs, spec: T with InlineDecorationSpec): Decoration[T with InlineDecorationSpec] = js.native
  /**
    * Creates a node decoration. `from` and `to` should point precisely
    * before and after a node in the document. That node, and only that
    * node, will receive the given attributes.
    */
  def node[T /* <: js.Object */](from: Double, to: Double, attrs: DecorationAttrs): Decoration[T] = js.native
  def node[T /* <: js.Object */](from: Double, to: Double, attrs: DecorationAttrs, spec: T): Decoration[T] = js.native
  /**
    * Creates a widget decoration, which is a DOM node that's shown in
    * the document at the given position. It is recommended that you
    * delay rendering the widget by passing a function that will be
    * called when the widget is actually drawn in a view, but you can
    * also directly pass a DOM node. getPos can be used to find the
    * widget's current document position.
    */
  def widget[T /* <: js.Object */](
    pos: Double,
    toDOM: js.Function2[/* view */ EditorView[_], /* getPos */ js.Function0[Double], Node]
  ): Decoration[T with WidgetDecorationSpec] = js.native
  def widget[T /* <: js.Object */](
    pos: Double,
    toDOM: js.Function2[/* view */ EditorView[_], /* getPos */ js.Function0[Double], Node],
    spec: T with WidgetDecorationSpec
  ): Decoration[T with WidgetDecorationSpec] = js.native
  def widget[T /* <: js.Object */](pos: Double, toDOM: Node): Decoration[T with WidgetDecorationSpec] = js.native
  def widget[T /* <: js.Object */](pos: Double, toDOM: Node, spec: T with WidgetDecorationSpec): Decoration[T with WidgetDecorationSpec] = js.native
}

