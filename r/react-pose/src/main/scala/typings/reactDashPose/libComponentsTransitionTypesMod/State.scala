package typings.reactDashPose.libComponentsTransitionTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var displayedChildren: js.Array[ReactElement]
  var finishedLeaving: StringDictionary[Boolean]
  var hasInitialized: Boolean
  var indexedChildren: StringDictionary[ReactElement]
  def scheduleChildRemoval(key: String): Unit
}

object State {
  @scala.inline
  def apply(
    displayedChildren: js.Array[ReactElement],
    finishedLeaving: StringDictionary[Boolean],
    hasInitialized: Boolean,
    indexedChildren: StringDictionary[ReactElement],
    scheduleChildRemoval: String => Unit
  ): State = {
    val __obj = js.Dynamic.literal(displayedChildren = displayedChildren, finishedLeaving = finishedLeaving, hasInitialized = hasInitialized, indexedChildren = indexedChildren, scheduleChildRemoval = js.Any.fromFunction1(scheduleChildRemoval))
  
    __obj.asInstanceOf[State]
  }
}

