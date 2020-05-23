package typings.snykPythonPlugin

import typings.snykCliInterface.commonMod.DepTree
import typings.snykPythonPlugin.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-python-plugin/dist/dependencies/inspect-implementation", JSImport.Namespace)
@js.native
object inspectImplementationMod extends js.Object {
  def buildArgs(targetFile: String, allowMissing: Boolean, tempDirPath: String, includeDevDeps: Boolean): js.Array[String] = js.native
  def buildArgs(
    targetFile: String,
    allowMissing: Boolean,
    tempDirPath: String,
    includeDevDeps: Boolean,
    extraArgs: js.Array[String]
  ): js.Array[String] = js.native
  def getMetaData(command: String, baseargs: js.Array[String], root: String, targetFile: String): js.Promise[Name] = js.native
  def inspectInstalledDeps(
    command: String,
    baseargs: js.Array[String],
    root: String,
    targetFile: String,
    allowMissing: Boolean,
    includeDevDeps: Boolean
  ): js.Promise[DepTree] = js.native
  def inspectInstalledDeps(
    command: String,
    baseargs: js.Array[String],
    root: String,
    targetFile: String,
    allowMissing: Boolean,
    includeDevDeps: Boolean,
    args: js.Array[String]
  ): js.Promise[DepTree] = js.native
}

