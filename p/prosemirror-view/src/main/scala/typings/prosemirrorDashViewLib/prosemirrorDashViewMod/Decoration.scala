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

/* static members */
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
    spec: prosemirrorDashViewLib.Anon_Event
  ): prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration = js.native
  def widget(pos: scala.Double, toDOM: stdLib.Node): prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration = js.native
  def widget(pos: scala.Double, toDOM: stdLib.Node, spec: prosemirrorDashViewLib.Anon_Event): prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration = js.native
}

