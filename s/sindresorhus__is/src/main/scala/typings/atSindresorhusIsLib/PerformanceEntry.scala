package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceEntry extends js.Object {
  val duration: scala.Double
  val entryType: java.lang.String
  val name: java.lang.String
  val startTime: scala.Double
  def toJSON(): js.Any
}

@JSGlobal("PerformanceEntry")
@js.native
object PerformanceEntry
  extends org.scalablytyped.runtime.Instantiable0[PerformanceEntry]

