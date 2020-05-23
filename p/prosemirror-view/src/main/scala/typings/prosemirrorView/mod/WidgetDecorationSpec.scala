package typings.prosemirrorView.mod

import typings.prosemirrorModel.mod.Mark
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetDecorationSpec extends js.Object {
  /**
    * When comparing decorations of this type (in order to decide
    * whether it needs to be redrawn), ProseMirror will by default
    * compare the widget DOM node by identity. If you pass a key,
    * that key will be compared instead, which can be useful when
    * you generate decorations on the fly and don't want to store
    * and reuse DOM nodes. Make sure that any widgets with the same
    * key are interchangeable—if widgets differ in, for example,
    * the behavior of some event handler, they should get
    * different keys.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  /**
    * The precise set of marks to draw around the widget.
    */
  var marks: js.UndefOr[js.Array[Mark[_]] | Null] = js.undefined
  /**
    * Controls which side of the document position this widget is
    * associated with. When negative, it is drawn before a cursor
    * at its position, and content inserted at that position ends
    * up after the widget. When zero (the default) or positive, the
    * widget is drawn after the cursor and content inserted there
    * ends up before the widget.
    *
    * When there are multiple widgets at a given position, their
    * `side` values determine the order in which they appear. Those
    * with lower values appear first. The ordering of widgets with
    * the same `side` value is unspecified.
    *
    * When `marks` is null, `side` also determines the marks that
    * the widget is wrapped in—those of the node before when
    * negative, those of the node after when positive.
    */
  var side: js.UndefOr[Double | Null] = js.undefined
  /**
    * Can be used to control which DOM events, when they bubble out
    * of this widget, the editor view should ignore.
    */
  var stopEvent: js.UndefOr[(js.Function1[/* event */ Event, Boolean]) | Null] = js.undefined
}

object WidgetDecorationSpec {
  @scala.inline
  def apply(
    key: js.UndefOr[Null | String] = js.undefined,
    marks: js.UndefOr[Null | js.Array[Mark[_]]] = js.undefined,
    side: js.UndefOr[Null | Double] = js.undefined,
    stopEvent: js.UndefOr[Null | (/* event */ Event => Boolean)] = js.undefined
  ): WidgetDecorationSpec = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(marks)) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (!js.isUndefined(side)) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (!js.isUndefined(stopEvent)) __obj.updateDynamic("stopEvent")(if (stopEvent != null) js.Any.fromFunction1(stopEvent.asInstanceOf[/* event */ Event => Boolean]) else null)
    __obj.asInstanceOf[WidgetDecorationSpec]
  }
}

