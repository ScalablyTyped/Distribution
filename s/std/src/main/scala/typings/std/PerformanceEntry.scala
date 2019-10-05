package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a single performance metric that is part of the performance timeline. A performance entry can be directly created by making a performance mark or measure (for example by calling the mark() method) at an explicit point in an application. Performance entries are also created in indirect ways such as loading a resource (such as an image). */
trait PerformanceEntry extends js.Object {
  val duration: Double
  val entryType: java.lang.String
  val name: java.lang.String
  val startTime: Double
  def toJSON(): js.Any
}

@JSGlobal("PerformanceEntry")
@js.native
object PerformanceEntry extends Instantiable0[PerformanceEntry]

