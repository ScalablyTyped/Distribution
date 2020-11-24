package typings.promClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Histogram[T /* <: java.lang.String */] = typings.promClient.mod.Histogram_[T]
  
  type LabelValues[T /* <: java.lang.String */] = typings.std.Partial[typings.std.Record[T, java.lang.String | scala.Double]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.promClient.mod.Counter[T]
    - typings.promClient.mod.Gauge[T]
    - typings.promClient.mod.Summary[T]
    - typings.promClient.mod.Histogram[T]
  */
  type Metric_[T /* <: java.lang.String */] = typings.promClient.mod._Metric_[T] | typings.promClient.mod.Summary[T] | typings.promClient.mod.Histogram[T]
  
  type Pushgateway = typings.promClient.mod.Pushgateway_
  
  type Summary[T /* <: java.lang.String */] = typings.promClient.mod.Summary_[T]
}
