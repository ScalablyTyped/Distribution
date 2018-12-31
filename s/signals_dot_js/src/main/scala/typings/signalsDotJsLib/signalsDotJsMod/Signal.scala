package typings
package signalsDotJsLib.signalsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signals.js", "Signal")
@js.native
class Signal protected ()
  extends signalsDotJsLib.libOrgOsflashSignalsSignalMod.Signal {
  /**
    * Creates a Signal instance to dispatch value objects.
    * @param    valueClasses Any number of class references that enable type checks in dispatch().
    * For example, new Signal(String, uint)
    * would allow: signal.dispatch("the Answer", 42)
    * but not: signal.dispatch(true, 42.5)
    * nor: signal.dispatch()
    *
    * NOTE: In AS3, subclasses cannot call super.apply(null, valueClasses),
    * but this constructor has logic to support super(valueClasses).
    */
  def this(valueClasses: js.Any*) = this()
}

