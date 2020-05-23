package typings.snykJavaCallGraphBuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/java-call-graph-builder/dist/mvn-wrapper", JSImport.Namespace)
@js.native
object mvnWrapperMod extends js.Object {
  def getClassPathFromMvn(targetPath: String): js.Promise[String] = js.native
  def mergeMvnClassPaths(classPaths: js.Array[String]): String = js.native
  def parseMvnDependencyPluginCommandOutput(mvnCommandOutput: String): js.Array[String] = js.native
  def parseMvnExecCommandOutput(mvnCommandOutput: String): js.Array[String] = js.native
}

