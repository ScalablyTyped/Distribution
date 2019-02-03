package typings
package signalsDotJsLib.libOrgOsflashSignalsSlotListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signals.js/lib/org/osflash/signals/SlotList", "SlotList")
@js.native
class SlotList protected () extends js.Object {
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
  def this(head: signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot, tail: SlotList) = this()
  var head: signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot = js.native
  /**
    * The number of slots in the list.
    */
  val length: scala.Double = js.native
  var nonEmpty: scala.Boolean = js.native
  var tail: SlotList = js.native
  /**
    * Appends a slot to this list.
    * Note: appending is O(n). Where possible, prepend which is O(1).
    * In some cases, many list items must be cloned to
    * avoid changing existing lists.
    * @param    slot The item to be appended.
    * @return    A list consisting of all elements of this list followed by slot.
    */
  def append(slot: signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot): SlotList = js.native
  /**
    * Determines whether the supplied listener Function is contained within this list
    */
  def contains(listener: js.Function): scala.Boolean = js.native
  /**
    * Returns the slots in this list that do not contain the supplied listener.
    * Note: assumes the listener is not repeated within the list.
    * @param    listener The function to remove.
    * @return A list consisting of all elements of this list that do not have listener.
    */
  def filterNot(listener: js.Function): SlotList = js.native
  /**
    * Retrieves the ISlot associated with a supplied listener within the SlotList.
    * @param   listener The Function being searched for
    * @return  The ISlot in this list associated with the listener parameter through the ISlot.listener property.
    *          Returns null if no such ISlot instance exists or the list is empty.
    */
  def find(listener: js.Function): signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot = js.native
  /**
    * Insert a slot into the list in a position according to its priority.
    * The higher the priority, the closer the item will be inserted to the list head.
    * @params slot The item to be inserted.
    *
    * @throws ArgumentError <code>ArgumentError</code>: Parameters head and tail are null. Use the NIL element instead.
    * @throws ArgumentError <code>ArgumentError</code>: Parameter head cannot be null.
    */
  def insertWithPriority(slot: signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot): SlotList = js.native
  /**
    * Prepends a slot to this list.
    * @param    slot The item to be prepended.
    * @return    A list consisting of slot followed by all elements of this list.
    *
    * @throws ArgumentError <code>ArgumentError</code>: Parameter head cannot be null.
    */
  def prepend(slot: signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot): SlotList = js.native
}

/* static members */
@JSImport("signals.js/lib/org/osflash/signals/SlotList", "SlotList")
@js.native
object SlotList extends js.Object {
  /**
    * Represents an empty list. Used as the list terminator.
    */
  var NIL: signalsDotJsLib.libOrgOsflashSignalsSlotListMod.SlotList = js.native
}

