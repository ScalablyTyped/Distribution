package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.segmenterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait INames extends ISegmenter {
  /** [Method] Add step units to the value
  		* @param value Object
  		* @param step Object
  		* @param unit Object
  		*/
  @JSName("add")
  var add_INames: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Align value with step of units
  		* @param value Object
  		* @param step Object
  		* @param unit Object
  		* @returns * Aligned value.
  		*/
  @JSName("align")
  var align_INames: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Given a start point and estimated step size of a range determine the preferred step size
  		* @param min Object
  		* @param estStepSize Object
  		* @param minIdx Object
  		* @param data Object
  		* @returns Object Return the step size by an object of step x unit.
  		*/
  @JSName("preferredStep")
  var preferredStep_INames: js.UndefOr[
    js.Function4[
      /* min */ js.UndefOr[js.Any], 
      /* estStepSize */ js.UndefOr[js.Any], 
      /* minIdx */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
}

