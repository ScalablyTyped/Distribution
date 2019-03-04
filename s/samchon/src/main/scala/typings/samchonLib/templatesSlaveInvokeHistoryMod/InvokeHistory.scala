package typings
package samchonLib.templatesSlaveInvokeHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/slave/InvokeHistory", "InvokeHistory")
@js.native
/**
  * Default Constructor.
  */
class InvokeHistory ()
  extends samchonLib.protocolEntityEntityMod.Entity {
  /**
    * Construct from an {@link Invoke} message.
    *
    * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
    */
  def this(invoke: samchonLib.protocolInvokeInvokeMod.Invoke) = this()
  /**
    * @hidden
    */
  var end_time_ : js.Any = js.native
  /**
    * @hidden
    */
  var listener: js.Any = js.native
  /**
    * @hidden
    */
  var start_time_ : js.Any = js.native
  /**
    * @hidden
    */
  var uid: js.Any = js.native
  /**
    * Complete the history.
    *
    * Completes the history and determines the {@link getEndTime end time}.
    */
  def complete(): scala.Unit = js.native
  /**
    * Compute elapsed time.
    *
    * @return nanoseconds.
    */
  def computeElapsedTime(): scala.Double = js.native
  /**
    * Get end time.
    */
  def getEndTime(): stdLib.Date = js.native
  /**
    * Get {@link Invoke.getListener listener} of the {@link Invoke} message.
    */
  def getListener(): java.lang.String = js.native
  /**
    * Get start time.
    */
  def getStartTime(): stdLib.Date = js.native
  /**
    * Get unique ID.
    */
  def getUID(): scala.Double = js.native
  /**
    * Convert to an {@link Invoke} message.
    *
    * Creates and returns an {@link Invoke} message that is used to reporting to the **master**.
    */
  def toInvoke(): samchonLib.protocolInvokeInvokeMod.Invoke = js.native
}

