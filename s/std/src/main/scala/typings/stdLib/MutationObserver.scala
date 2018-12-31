package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationObserver extends js.Object {
  def disconnect(): scala.Unit = js.native
  /**
    * Instructs the user agent to observe a given target (a node) and report any mutations based on
    * the criteria given by options (an object).
    * The options argument allows for setting mutation
    * observation options via object members. These are the object members that
    * can be used:
    * childList
    * Set to true if mutations to target's children are to be observed.
    * attributes
    * Set to true if mutations to target's attributes are to be observed. Can be omitted if attributeOldValue or attributeFilter is
    * specified.
    * characterData
    * Set to true if mutations to target's data are to be observed. Can be omitted if characterDataOldValue is specified.
    * subtree
    * Set to true if mutations to not just target, but
    * also target's descendants are to be
    * observed.
    * attributeOldValue
    * Set to true if attributes is true or omitted
    * and target's attribute value before the mutation
    * needs to be recorded.
    * characterDataOldValue
    * Set to true if characterData is set to true or omitted and target's data before the mutation
    * needs to be recorded.
    * attributeFilter
    * Set to a list of attribute local names (without namespace) if not all attribute mutations need to be
    * observed and attributes is true
    * or omitted.
    */
  def observe(target: Node): scala.Unit = js.native
  def observe(target: Node, options: MutationObserverInit): scala.Unit = js.native
  /**
    * Empties the record queue and
    * returns what was in there.
    */
  def takeRecords(): js.Array[MutationRecord] = js.native
}

@JSGlobal("MutationObserver")
@js.native
object MutationObserver
  extends org.scalablytyped.runtime.Instantiable1[/* callback */ MutationCallback, MutationObserver]

