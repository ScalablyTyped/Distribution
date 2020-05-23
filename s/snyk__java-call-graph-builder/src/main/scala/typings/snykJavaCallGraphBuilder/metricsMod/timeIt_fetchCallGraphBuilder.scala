package typings.snykJavaCallGraphBuilder.metricsMod

import typings.snykJavaCallGraphBuilder.snykJavaCallGraphBuilderStrings.fetchCallGraphBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/java-call-graph-builder/dist/metrics", "timeIt")
@js.native
object timeIt_fetchCallGraphBuilder extends js.Object {
  def apply[T](metric: fetchCallGraphBuilder, fn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
}

