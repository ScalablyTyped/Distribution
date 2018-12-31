package typings
package prosemirrorDashViewLib.prosemirrorDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-view", "Decoration")
@js.native
class Decoration () extends js.Object {
  /**
    * The start position of the decoration.
    */
  var from: scala.Double = js.native
  /**
    * The spec provided when creating this decoration. Can be useful
    * if you've stored extra information in that object.
    */
  var spec: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * The end position. Will be the same as `from` for [widget
    * decorations](#view.Decoration^widget).
    */
  var to: scala.Double = js.native
}

@JSImport("prosemirror-view", "Decoration")
@js.native
object Decoration extends js.Object {
  /**
    * Creates an inline decoration, which adds the given attributes to
    * each inline node between `from` and `to`.
    */
  def `inline`(
    from: scala.Double,
    to: scala.Double,
    attrs: prosemirrorDashViewLib.prosemirrorDashViewMod.DecorationAttrs
  ): prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration = js.native
  def `inline`(
    from: scala.Double,
    to: scala.Double,
    attrs: prosemirrorDashViewLib.prosemirrorDashViewMod.DecorationAttrs,
    spec: prosemirrorDashViewLib.Anon_InclusiveEnd
  ): prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration = js.native
  /**
    * Creates a node decoration. `from` and `to` should point precisely
    * before and after a node in the document. That node, and only that
    * node, will receive the given attributes.
    */
  def node(
    from: scala.Double,
    to: scala.Double,
    attrs: prosemirrorDashViewLib.prosemirrorDashViewMod.DecorationAttrs
  ): prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration = js.native
  def node(
    from: scala.Double,
    to: scala.Double,
    attrs: prosemirrorDashViewLib.prosemirrorDashViewMod.DecorationAttrs,
    spec: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration = js.native
  /**
    * Creates a widget decoration, which is a DOM node that's shown in
    * the document at the given position. It is recommended that you
    * delay rendering the widget by passing a function that will be
    * called when the widget is actually drawn in a view, but you can
    * also directly pass a DOM node. getPos can be used to find the
    * widget's current document position.
    *
    * @param spec These options are supported:
    * @param spec.side Controls which side of the document position
    * this widget is associated with. When negative, it is drawn before
    * a cursor at its position, and content inserted at that position
    * ends up after the widget. When zero (the default) or positive, the
    * widget is drawn after the cursor and content inserted there ends
    * up before the widget.
    *
    * When there are multiple widgets at a given position, their side
    * values determine the order in which they appear. Those with lower
    * values appear first. The ordering of widgets with the same side
    * value is unspecified.
    *
    * When marks is null, side also determines the marks that the widget
    * is wrapped in—those of the node before when negative, those of
    * the node after when positive.
    * @param spec.marks The precise set of marks to draw around the widget.
    * @param spec.stopEvent Can be used to control which DOM events, when
    * they bubble out of this widget, the editor view should ignore.
    * @param spec.key When comparing decorations of this type (in order to
    * decide whether it needs to be redrawn), ProseMirror will by default
    * compare the widget DOM node by identity. If you pass a key, that key
    * will be compared instead, which can be useful when you generate
    * decorations on the fly and don't want to store and reuse DOM nodes.
    * Make sure that any widgets with the same key are interchangeable—if
    * widgets differ in, for example, the behavior of some event handler,
    * they should get different keys.
    */
  def widget(
    pos: scala.Double,
    toDOM: js.Function2[
      /* view */ prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[_], 
      /* getPos */ js.Function0[scala.Double], 
      stdLib.Node
    ]
  ): prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration = js.native
  def widget(
    pos: scala.Double,
    toDOM: js.Function2[
      /* view */ prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[_], 
      /* getPos */ js.Function0[scala.Double], 
      stdLib.Node
    ],
    spec: prosemirrorDashViewLib.Anon_Marks
  ): prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration = js.native
  def widget(pos: scala.Double, toDOM: stdLib.Node): prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration = js.native
  def widget(pos: scala.Double, toDOM: stdLib.Node, spec: prosemirrorDashViewLib.Anon_Marks): prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration = js.native
}

