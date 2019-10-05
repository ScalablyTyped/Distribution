package typings.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides visibility into a distant room from your script.
  */
trait StructureObserver
  extends OwnedStructure[STRUCTURE_OBSERVER]
     with AnyOwnedStructure {
  /**
    * Provide visibility into a distant room from your script. The target room object will be available on the next tick. The maximum range is 5 rooms.
    * @param roomName The room to observe.
    */
  def observeRoom(roomName: String): ScreepsReturnCode
}

@JSGlobal("StructureObserver")
@js.native
object StructureObserver extends TopLevel[StructureObserverConstructor]

