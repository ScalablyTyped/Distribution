package typings.rxDom.mod

import typings.rx.Rx.Comparer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("rx-dom", "HistoricalSchedulerCls")
@js.native
class HistoricalSchedulerCls protected ()
  extends typings.rx.mod.HistoricalSchedulerCls {
  /**
    * Creates a new historical scheduler with the specified initial clock value.
    * @constructor
    * @param {Number} initialClock Initial value for the clock.
    * @param {Function} comparer Comparer to determine causality of events based on absolute time.
    */
  def this(initialClock: Double, comparer: Comparer[Double, Double]) = this()
}
