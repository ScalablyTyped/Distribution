package typings.promClient.mod

import typings.promClient.mod.^
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def collectDefaultMetrics(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("collectDefaultMetrics")().asInstanceOf[Unit]
inline def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("collectDefaultMetrics")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def contentType: String = ^.asInstanceOf[js.Dynamic].selectDynamic("contentType").asInstanceOf[String]

inline def exponentialBuckets(start: Double, factor: Double, count: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentialBuckets")(start.asInstanceOf[js.Any], factor.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]

inline def linearBuckets(start: Double, width: Double, count: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("linearBuckets")(start.asInstanceOf[js.Any], width.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]

inline def register: Registry = ^.asInstanceOf[js.Dynamic].selectDynamic("register").asInstanceOf[Registry]

inline def validateMetricName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateMetricName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]

type CollectFunction[T] = js.ThisFunction0[/* this */ T, Unit | js.Promise[Unit]]

type Collector = js.Function0[Unit]

type LabelValues[T /* <: String */] = Partial[Record[T, String | Double]]
