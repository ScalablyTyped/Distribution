package typings
package prosemirrorDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var key: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var marks: js.UndefOr[js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[_]] | scala.Null] = js.undefined
  var side: js.UndefOr[scala.Double | scala.Null] = js.undefined
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

