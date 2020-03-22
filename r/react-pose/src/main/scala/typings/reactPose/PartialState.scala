package typings.reactPose

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-pose.react-pose/lib/components/Transition/types.State> */
trait PartialState extends js.Object {
  var displayedChildren: js.UndefOr[js.Array[ReactElement]] = js.undefined
  var finishedLeaving: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var hasInitialized: js.UndefOr[Boolean] = js.undefined
  var indexedChildren: js.UndefOr[StringDictionary[ReactElement]] = js.undefined
  var scheduleChildRemoval: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
}

object PartialState {
  @scala.inline
  def apply(
    displayedChildren: js.Array[ReactElement] = null,
    finishedLeaving: StringDictionary[Boolean] = null,
    hasInitialized: js.UndefOr[Boolean] = js.undefined,
    indexedChildren: StringDictionary[ReactElement] = null,
    scheduleChildRemoval: /* key */ String => Unit = null
  ): PartialState = {
    val __obj = js.Dynamic.literal()
    if (displayedChildren != null) __obj.updateDynamic("displayedChildren")(displayedChildren.asInstanceOf[js.Any])
    if (finishedLeaving != null) __obj.updateDynamic("finishedLeaving")(finishedLeaving.asInstanceOf[js.Any])
    if (!js.isUndefined(hasInitialized)) __obj.updateDynamic("hasInitialized")(hasInitialized.asInstanceOf[js.Any])
    if (indexedChildren != null) __obj.updateDynamic("indexedChildren")(indexedChildren.asInstanceOf[js.Any])
    if (scheduleChildRemoval != null) __obj.updateDynamic("scheduleChildRemoval")(js.Any.fromFunction1(scheduleChildRemoval))
    __obj.asInstanceOf[PartialState]
  }
}

