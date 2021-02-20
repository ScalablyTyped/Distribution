package typings.promClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LabelValues[T /* <: java.lang.String */] = typings.std.Partial[typings.std.Record[T, java.lang.String | scala.Double]]
  
  @scala.inline
  def collectDefaultMetrics(): scala.Unit = typings.promClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("collectDefaultMetrics")().asInstanceOf[scala.Unit]
  @scala.inline
  def collectDefaultMetrics(config: typings.promClient.mod.DefaultMetricsCollectorConfiguration): scala.Unit = typings.promClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("collectDefaultMetrics")(config.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def exponentialBuckets(start: scala.Double, factor: scala.Double, count: scala.Double): js.Array[scala.Double] = (typings.promClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exponentialBuckets")(start.asInstanceOf[js.Any], factor.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[scala.Double]]
  
  @scala.inline
  def linearBuckets(start: scala.Double, width: scala.Double, count: scala.Double): js.Array[scala.Double] = (typings.promClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("linearBuckets")(start.asInstanceOf[js.Any], width.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[scala.Double]]
  
  @scala.inline
  def register: typings.promClient.mod.Registry = typings.promClient.mod.^.asInstanceOf[js.Dynamic].selectDynamic("register").asInstanceOf[typings.promClient.mod.Registry]
  
  @scala.inline
  def validateMetricName(name: java.lang.String): scala.Boolean = typings.promClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateMetricName")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
