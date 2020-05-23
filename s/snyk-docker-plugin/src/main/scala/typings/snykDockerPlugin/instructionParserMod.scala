package typings.snykDockerPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.dockerfileAst.mod.Dockerfile
import typings.snykDockerPlugin.anon.Instruction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/instruction-parser", JSImport.Namespace)
@js.native
object instructionParserMod extends js.Object {
  /**
    * Return the image name of the last from stage, after resolving all aliases
    * @param dockerfile Dockerfile to use for retrieving the last stage image name
    */
  def getDockerfileBaseImageName(dockerfile: Dockerfile): js.UndefOr[String] = js.native
  def getDockerfileLayers(dockerfilePkgs: DockerFilePackages): DockerFileLayers = js.native
  def getPackagesFromRunInstructions(dockerfile: Dockerfile): DockerFilePackages = js.native
  def instructionDigest(instruction: js.Any): String = js.native
  type DockerFileLayers = StringDictionary[Instruction]
  type DockerFilePackages = StringDictionary[Instruction]
}

