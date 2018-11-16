package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * NxGroupTail
     */

trait INxGroupTail extends js.Object {
  /**
           * Number of elements that are part of the next tail.
           * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight
           * This parameter is optional. Is not shown if the value is 0.
           */
  var qDown: js.UndefOr[scala.Double] = js.undefined
  /**
           * Number of elements that are part of the previous tail.
           * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight
           * This parameter is optional. Is not shown if the value is 0.
           */
  var qUp: js.UndefOr[scala.Double] = js.undefined
}

