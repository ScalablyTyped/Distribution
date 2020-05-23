package typings.snykDockerPlugin

import typings.snykDockerPlugin.anon.Dependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/dependency-tree", JSImport.Namespace)
@js.native
object dependencyTreeMod extends js.Object {
  def buildTree(targetImage: String, depType: js.Any, depInfosList: js.Any, targetOS: js.Any): Dependencies = js.native
}

