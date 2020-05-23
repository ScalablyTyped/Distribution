package typings.snykJavaCallGraphBuilder.metricsMod

import typings.snykJavaCallGraphBuilder.snykJavaCallGraphBuilderStrings.generateCallGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/java-call-graph-builder/dist/metrics", "timeIt")
@js.native
object timeIt_generateCallGraph extends js.Object {
  def apply[T](metric: generateCallGraph, fn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
}

