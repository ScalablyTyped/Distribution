package typings
package prosemirrorDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  var key: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The precise set of marks to draw around the widget.
    */
  var marks: js.UndefOr[js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[_]] | scala.Null] = js.undefined
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
  var side: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Can be used to control which DOM events, when they bubble out
    * of this widget, the editor view should ignore.
    */
  var stopEvent: js.UndefOr[(js.Function1[/* event */ stdLib.Event, scala.Boolean]) | scala.Null] = js.undefined
}

object Anon_Event {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    key: java.lang.String = null,
    marks: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[_]] = null,
    side: scala.Int | scala.Double = null,
    stopEvent: /* event */ stdLib.Event => scala.Boolean = null
  ): Anon_Event = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (stopEvent != null) __obj.updateDynamic("stopEvent")(js.Any.fromFunction1(stopEvent))
    __obj.asInstanceOf[Anon_Event]
  }
}

