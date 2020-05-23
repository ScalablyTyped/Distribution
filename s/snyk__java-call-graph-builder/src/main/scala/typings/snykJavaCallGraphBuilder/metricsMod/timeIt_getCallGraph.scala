package typings.snykJavaCallGraphBuilder.metricsMod

import typings.snykJavaCallGraphBuilder.snykJavaCallGraphBuilderStrings.getCallGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/java-call-graph-builder/dist/metrics", "timeIt")
@js.native
object timeIt_getCallGraph extends js.Object {
  def apply[T](metric: getCallGraph, fn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
}

