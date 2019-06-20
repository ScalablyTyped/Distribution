package typings
package reactDashPoseLib.libComponentsTransitionTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var displayedChildren: js.Array[reactLib.reactMod.ReactElement]
  var finishedLeaving: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var hasInitialized: scala.Boolean
  var indexedChildren: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactElement]
  def scheduleChildRemoval(key: java.lang.String): scala.Unit
}

object State {
  @scala.inline
  def apply(
    displayedChildren: js.Array[reactLib.reactMod.ReactElement],
    finishedLeaving: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    hasInitialized: scala.Boolean,
    indexedChildren: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactElement],
    scheduleChildRemoval: java.lang.String => scala.Unit
  ): State = {
    val __obj = js.Dynamic.literal(displayedChildren = displayedChildren, finishedLeaving = finishedLeaving, hasInitialized = hasInitialized, indexedChildren = indexedChildren, scheduleChildRemoval = js.Any.fromFunction1(scheduleChildRemoval))
  
    __obj.asInstanceOf[State]
  }
}

