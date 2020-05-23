package typings.std

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

object PerformanceEntry {
  @scala.inline
  def apply(
    duration: Double,
    entryType: java.lang.String,
    name: java.lang.String,
    startTime: Double,
    toJSON: () => js.Any
  ): PerformanceEntry = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[PerformanceEntry]
  }
}

