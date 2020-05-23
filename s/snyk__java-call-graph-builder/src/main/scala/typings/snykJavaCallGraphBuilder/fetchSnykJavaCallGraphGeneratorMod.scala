package typings.snykJavaCallGraphBuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/java-call-graph-builder/dist/fetch-snyk-java-call-graph-generator", JSImport.Namespace)
@js.native
object fetchSnykJavaCallGraphGeneratorMod extends js.Object {
  val JAR_NAME: /* "java-call-graph-generator.jar" */ String = js.native
  def fetch(url: String, expectedChecksum: String): js.Promise[String] = js.native
}

