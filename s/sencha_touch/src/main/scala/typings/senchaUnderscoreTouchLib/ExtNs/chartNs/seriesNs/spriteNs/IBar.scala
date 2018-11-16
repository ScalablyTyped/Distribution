package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBar extends IStackedCartesian {
  /** [Config Option] (Number) */
  var inGroupGapWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxBarWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minBarWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minGapWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Render the given visible clip range
  		* @param surface Object
  		* @param ctx Object
  		* @param clip Object
  		*/
  @JSName("renderClipped")
  var renderClipped_IBar: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clip */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

