package typings.rx.rxVirtualtimeMod

import typings.rx.Rx.Comparer
import typings.rx.Rx.VirtualTimeScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx.virtualtime", "HistoricalScheduler")
@js.native
class HistoricalSchedulerCls protected () extends VirtualTimeScheduler[Double, Double] {
  /**
    * Creates a new historical scheduler with the specified initial clock value.
    * @constructor
    * @param {Number} initialClock Initial value for the clock.
    * @param {Function} comparer Comparer to determine causality of events based on absolute time.
    */
  def this(initialClock: Double, comparer: Comparer[Double, Double]) = this()
}
