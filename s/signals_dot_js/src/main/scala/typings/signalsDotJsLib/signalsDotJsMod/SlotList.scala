package typings
package signalsDotJsLib.signalsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signals.js", "SlotList")
@js.native
class SlotList protected ()
  extends signalsDotJsLib.libOrgOsflashSignalsSlotListMod.SlotList {
  /**
    * Creates and returns a new SlotList object.
    *
    * <p>A user never has to create a SlotList manually.
    * Use the <code>NIL</code> element to represent an empty list.
    * <code>NIL.prepend(value)</code> would create a list containing <code>value</code></p>.
    *
    * @param head The first slot in the list.
    * @param tail A list containing all slots except head.
    *
    * @throws ArgumentError <code>ArgumentError</code>: Parameters head and tail are null. Use the NIL element instead.
    * @throws ArgumentError <code>ArgumentError</code>: Parameter head cannot be null.
    */
  def this(head: signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot) = this()
  def this(head: signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot, tail: signalsDotJsLib.libOrgOsflashSignalsSlotListMod.SlotList) = this()
}

/* static members */
@JSImport("signals.js", "SlotList")
@js.native
object SlotList extends js.Object {
  /**
    * Represents an empty list. Used as the list terminator.
    */
  var NIL: signalsDotJsLib.libOrgOsflashSignalsSlotListMod.SlotList = js.native
}

