package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * DoReloadExParams...
     */

trait IDoReloadExParams extends js.Object {
  /**
           * Set to true if debug breakpoints are to be honored.
           * The execution of the script will be in debug mode.
           * >> This parameter is optional.
           * >> The default value is false.
           */
  var qDebug: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Error handling mode
           * One of:
           *    0: for default mode
           *    1: for ABEND; the reload of the script ends if an error occurs.
           *    2: for ignore; the reload of the script continues even if an error is detected in the script.
           * >> This parameter is optional.
           */
  var qMode: js.UndefOr[scala.Double] = js.undefined
  /**
           * Set to true for partial reload
           * >> This parameter is optional.
           * >> The default value is false.
           */
  var qPartial: js.UndefOr[scala.Boolean] = js.undefined
}

