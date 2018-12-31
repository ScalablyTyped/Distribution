package typings
package splunkDashLoggingLib.splunkDashLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var batchInterval: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var maxBatchCount: js.UndefOr[scala.Double] = js.undefined
  var maxBatchSize: js.UndefOr[scala.Double] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[
    splunkDashLoggingLib.splunkDashLoggingLibStrings.http | splunkDashLoggingLib.splunkDashLoggingLibStrings.https
  ] = js.undefined
  var token: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
}

