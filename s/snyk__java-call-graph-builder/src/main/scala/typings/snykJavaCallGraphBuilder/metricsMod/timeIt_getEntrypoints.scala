package typings.snykJavaCallGraphBuilder.metricsMod

import typings.snykJavaCallGraphBuilder.snykJavaCallGraphBuilderStrings.getEntrypoints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/java-call-graph-builder/dist/metrics", "timeIt")
@js.native
object timeIt_getEntrypoints extends js.Object {
  def apply[T](metric: getEntrypoints, fn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
}

