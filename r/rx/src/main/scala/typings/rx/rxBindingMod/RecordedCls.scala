package typings.rx.rxBindingMod

import typings.rx.Rx.Comparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.binding", "Recorded")
@js.native
class RecordedCls protected ()
  extends typings.rx.Rx.Recorded {
  /**
    * Creates a new object recording the production of the specified value at the given virtual time.
    *
    * @constructor
    * @param {Number} time Virtual time the value was produced on.
    * @param {Mixed} value Value that was produced.
    * @param {Function} comparer An optional comparer.
    */
  def this(time: Double, value: js.Any) = this()
  def this(time: Double, value: js.Any, equalityComparer: Comparer[_, Boolean]) = this()
}

