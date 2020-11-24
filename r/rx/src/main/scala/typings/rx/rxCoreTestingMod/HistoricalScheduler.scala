package typings.rx.rxCoreTestingMod

import org.scalablytyped.runtime.Instantiable2
import typings.rx.Rx.Comparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx.core.testing", "HistoricalScheduler")
@js.native
object HistoricalScheduler
  extends /**
  * Creates a new historical scheduler with the specified initial clock value.
  * @constructor
  * @param {Number} initialClock Initial value for the clock.
  * @param {Function} comparer Comparer to determine causality of events based on absolute time.
  */
Instantiable2[
      /* initialClock */ Double, 
      /* comparer */ Comparer[Double, Double], 
      typings.rx.Rx.HistoricalScheduler
    ]
