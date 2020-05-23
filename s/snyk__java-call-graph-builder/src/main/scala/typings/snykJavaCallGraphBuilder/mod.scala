package typings.snykJavaCallGraphBuilder

import typings.snykJavaCallGraphBuilder.metricsMod.Metrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/java-call-graph-builder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getCallGraphMvn(targetPath: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Graph */ _
  ] = js.native
  def getClassGraphGradle(targetPath: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Graph */ _
  ] = js.native
  def runtimeMetrics(): Metrics = js.native
}

