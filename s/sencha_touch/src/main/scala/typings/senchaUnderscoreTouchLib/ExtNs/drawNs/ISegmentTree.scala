package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISegmentTree
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns the minimum range of data that fits the given range and step size
  		* @param min Number
  		* @param max Number
  		* @param estStep Number
  		* @returns Object The aggregation information.
  		*/
  var getAggregation: js.UndefOr[
    js.Function3[
      /* min */ js.UndefOr[scala.Double], 
      /* max */ js.UndefOr[scala.Double], 
      /* estStep */ js.UndefOr[scala.Double], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the value of strategy
  		* @returns String
  		*/
  var getStrategy: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Sets the data of the segment tree
  		* @param dataX Number
  		* @param dataOpen Number
  		* @param dataHigh Number
  		* @param dataLow Number
  		* @param dataClose Number
  		*/
  var setData: js.UndefOr[
    js.Function5[
      /* dataX */ js.UndefOr[scala.Double], 
      /* dataOpen */ js.UndefOr[scala.Double], 
      /* dataHigh */ js.UndefOr[scala.Double], 
      /* dataLow */ js.UndefOr[scala.Double], 
      /* dataClose */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of strategy
  		* @param strategy String The new value.
  		*/
  var setStrategy: js.UndefOr[js.Function1[/* strategy */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

