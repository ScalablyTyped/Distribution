package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IArea extends IStackedCartesian {
  /** [Method] Render the given visible clip range
  		* @param surface Object
  		* @param ctx Object
  		* @param clip Object
  		* @param clipRegion Object
  		*/
  @JSName("renderClipped")
  var renderClipped_IArea: js.UndefOr[
    js.Function4[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clip */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var step: js.UndefOr[scala.Boolean] = js.undefined
}

