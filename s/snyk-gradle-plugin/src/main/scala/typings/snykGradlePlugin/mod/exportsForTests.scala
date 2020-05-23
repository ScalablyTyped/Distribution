package typings.snykGradlePlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-gradle-plugin/dist", "exportsForTests")
@js.native
object exportsForTests extends js.Object {
  @JSName("buildArgs")
  var buildArgs_Original: js.Function4[
    /* root */ String, 
    /* targetFile */ String | Null, 
    /* initGradlePath */ String, 
    /* options */ Options, 
    js.Array[String]
  ] = js.native
  @JSName("extractJsonFromScriptOutput")
  var extractJsonFromScriptOutput_Original: js.Function1[/* stdoutText */ String, JsonDepsScriptResult] = js.native
  @JSName("getVersionBuildInfo")
  var getVersionBuildInfo_Original: js.Function1[/* gradleVersionOutput */ String, js.UndefOr[VersionBuildInfo]] = js.native
  @JSName("toCamelCase")
  var toCamelCase_Original: js.Function1[/* input */ String, String] = js.native
  def buildArgs(root: String, targetFile: String, initGradlePath: String, options: Options): js.Array[String] = js.native
  def buildArgs(root: String, targetFile: Null, initGradlePath: String, options: Options): js.Array[String] = js.native
  def extractJsonFromScriptOutput(stdoutText: String): JsonDepsScriptResult = js.native
  def getVersionBuildInfo(gradleVersionOutput: String): js.UndefOr[VersionBuildInfo] = js.native
  def toCamelCase(input: String): String = js.native
}

