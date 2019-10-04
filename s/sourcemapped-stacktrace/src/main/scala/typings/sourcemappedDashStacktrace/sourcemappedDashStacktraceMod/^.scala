package typings.sourcemappedDashStacktrace.sourcemappedDashStacktraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sourcemapped-stacktrace", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def mapStackTrace(stack: js.UndefOr[scala.Nothing], done: js.Function1[/* mappedStack */ js.Array[String], Unit]): Unit = js.native
  def mapStackTrace(
    stack: js.UndefOr[scala.Nothing],
    done: js.Function1[/* mappedStack */ js.Array[String], Unit],
    opts: MapStackTraceOptions
  ): Unit = js.native
  def mapStackTrace(stack: String, done: js.Function1[/* mappedStack */ js.Array[String], Unit]): Unit = js.native
  def mapStackTrace(
    stack: String,
    done: js.Function1[/* mappedStack */ js.Array[String], Unit],
    opts: MapStackTraceOptions
  ): Unit = js.native
}

