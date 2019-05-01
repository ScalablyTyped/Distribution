package typings
package promDashClientLib.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", "Pushgateway")
@js.native
class Pushgateway protected () extends js.Object {
  /**
  	 * @param url Complete url to the Pushgateway. If port is needed append url with :port
  	 * @param options Options
  	 * @param registry Registry
  	 */
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, options: js.Any) = this()
  def this(url: java.lang.String, options: js.Any, registry: Registry) = this()
  /**
  	 * Delete all metrics for jobName
  	 * @param params Push parameters
  	 * @param callback Callback when request is complete
  	 */
  def delete(
    params: promDashClientLib.promDashClientMod.PushgatewayNs.Parameters,
    callback: js.Function3[
      /* error */ js.UndefOr[stdLib.Error], 
      /* httpResponse */ js.UndefOr[js.Any], 
      /* body */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
  	 * Overwrite all metric (using PUT to Pushgateway)
  	 * @param params Push parameters
  	 * @param callback Callback when request is complete
  	 */
  def push(
    params: promDashClientLib.promDashClientMod.PushgatewayNs.Parameters,
    callback: js.Function3[
      /* error */ js.UndefOr[stdLib.Error], 
      /* httpResponse */ js.UndefOr[js.Any], 
      /* body */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
  	 * Add metric and overwrite old ones
  	 * @param params Push parameters
  	 * @param callback Callback when request is complete
  	 */
  def pushAdd(
    params: promDashClientLib.promDashClientMod.PushgatewayNs.Parameters,
    callback: js.Function3[
      /* error */ js.UndefOr[stdLib.Error], 
      /* httpResponse */ js.UndefOr[js.Any], 
      /* body */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

