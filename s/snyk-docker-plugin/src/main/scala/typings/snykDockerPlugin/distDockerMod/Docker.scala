package typings.snykDockerPlugin.distDockerMod

import typings.snykDockerPlugin.anon.Stderr
import typings.snykDockerPlugin.subProcessMod.CmdOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/docker", "Docker")
@js.native
class Docker protected () extends js.Object {
  def this(targetImage: String) = this()
  def this(targetImage: String, options: DockerOptions) = this()
  var optionsList: js.Any = js.native
  var targetImage: js.Any = js.native
  def catSafe(filename: String): js.Promise[Stderr] = js.native
  /**
    * Find files on a docker image according to a given list of glob expressions.
    */
  def findGlobs(globs: js.Array[String]): js.Promise[js.Array[String]] = js.native
  def findGlobs(globs: js.Array[String], exclusionGlobs: js.Array[String]): js.Promise[js.Array[String]] = js.native
  def findGlobs(globs: js.Array[String], exclusionGlobs: js.Array[String], path: String): js.Promise[js.Array[String]] = js.native
  def findGlobs(globs: js.Array[String], exclusionGlobs: js.Array[String], path: String, recursive: Boolean): js.Promise[js.Array[String]] = js.native
  def findGlobs(
    globs: js.Array[String],
    exclusionGlobs: js.Array[String],
    path: String,
    recursive: Boolean,
    excludeRootDirectories: js.Array[String]
  ): js.Promise[js.Array[String]] = js.native
  def inspectImage(targetImage: String): js.Promise[CmdOutput] = js.native
  def lsSafe(path: String): js.Promise[Stderr] = js.native
  def lsSafe(path: String, recursive: Boolean): js.Promise[Stderr] = js.native
  def pull(targetImage: String): js.Promise[CmdOutput] = js.native
  def run(cmd: String): js.Promise[CmdOutput] = js.native
  def run(cmd: String, args: js.Array[String]): js.Promise[CmdOutput] = js.native
  /**
    * Runs the command, catching any expected errors and returning them as normal
    * stderr/stdout result.
    */
  def runSafe(cmd: String): js.Promise[Stderr] = js.native
  def runSafe(cmd: String, args: js.Array[String]): js.Promise[Stderr] = js.native
  def runSafe(cmd: String, args: js.Array[String], ignoreErrors: js.Array[String]): js.Promise[Stderr] = js.native
  def save(targetImage: String, destination: String): js.Promise[CmdOutput] = js.native
}

/* static members */
@JSImport("snyk-docker-plugin/dist/docker", "Docker")
@js.native
object Docker extends js.Object {
  var createOptionsList: js.Any = js.native
  def run(args: js.Array[String]): js.Promise[CmdOutput] = js.native
  def run(args: js.Array[String], options: DockerOptions): js.Promise[CmdOutput] = js.native
}

