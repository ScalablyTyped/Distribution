package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAggregative extends ICartesian {
  /** [Config Option] (Object) */
  var dataClose: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var dataHigh: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var dataLow: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var dataOpen: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of aggregator
  		* @returns Object
  		*/
  var getAggregator: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Render the given visible clip range
  		* @param surface Object
  		* @param ctx Object
  		* @param clip Object
  		* @param region Object
  		*/
  @JSName("renderClipped")
  var renderClipped_IAggregative: js.UndefOr[
    js.Function4[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clip */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of aggregator
  		* @param aggregator Object The new value.
  		*/
  var setAggregator: js.UndefOr[js.Function1[/* aggregator */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

