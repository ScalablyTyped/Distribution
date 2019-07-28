package typings.prosemirrorDashView.prosemirrorDashViewMod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorDashView.Anon_Event
import typings.prosemirrorDashView.Anon_InclusiveEnd
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-view", "Decoration")
@js.native
class Decoration () extends js.Object {
  /**
    * The start position of the decoration.
    */
  var from: Double = js.native
  /**
    * The spec provided when creating this decoration. Can be useful
    * if you've stored extra information in that object.
    */
  var spec: StringDictionary[js.Any] = js.native
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
  def `inline`(from: Double, to: Double, attrs: DecorationAttrs): Decoration = js.native
  def `inline`(from: Double, to: Double, attrs: DecorationAttrs, spec: Anon_InclusiveEnd): Decoration = js.native
  /**
    * Creates a node decoration. `from` and `to` should point precisely
    * before and after a node in the document. That node, and only that
    * node, will receive the given attributes.
    */
  def node(from: Double, to: Double, attrs: DecorationAttrs): Decoration = js.native
  def node(from: Double, to: Double, attrs: DecorationAttrs, spec: StringDictionary[js.Any]): Decoration = js.native
  /**
    * Creates a widget decoration, which is a DOM node that's shown in
    * the document at the given position. It is recommended that you
    * delay rendering the widget by passing a function that will be
    * called when the widget is actually drawn in a view, but you can
    * also directly pass a DOM node. getPos can be used to find the
    * widget's current document position.
    */
  def widget(
    pos: Double,
    toDOM: js.Function2[/* view */ EditorView[_], /* getPos */ js.Function0[Double], Node]
  ): Decoration = js.native
  def widget(
    pos: Double,
    toDOM: js.Function2[/* view */ EditorView[_], /* getPos */ js.Function0[Double], Node],
    spec: Anon_Event
  ): Decoration = js.native
  def widget(pos: Double, toDOM: Node): Decoration = js.native
  def widget(pos: Double, toDOM: Node, spec: Anon_Event): Decoration = js.native
}

