package typings.snykJavaCallGraphBuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/java-call-graph-builder/dist/gradle-wrapper", JSImport.Namespace)
@js.native
object gradleWrapperMod extends js.Object {
  def getCallGraphGradle(targetPath: String): js.Promise[String] = js.native
  def getGradleCommand(targetPath: String): String = js.native
  def getGradleCommandArgs(targetPath: String): js.Array[String] = js.native
}

