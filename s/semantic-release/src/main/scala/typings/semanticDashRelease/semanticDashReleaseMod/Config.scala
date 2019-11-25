package typings.semanticDashRelease.semanticDashReleaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** semantic-release configuration specific for API usage. */
trait Config extends js.Object {
  /**
  		 * The current working directory to use. It should be configured to
  		 * the root of the Git repository to release from.
  		 *
  		 * It allows to run semantic-release from a specific path without
  		 * having to change the local process cwd with process.chdir().
  		 *
  		 * @default process.cwd
  		 */
  var cwd: js.UndefOr[String] = js.undefined
  /**
  		 * The environment variables to use.
  		 *
  		 * It allows to run semantic-release with specific environment
  		 * variables without having to modify the local process.env.
  		 *
  		 * @default process.env
  		 */
  var env: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
  		 * The writable stream used to log errors.
  		 *
  		 * It allows to configure semantic-release to write errors to a
  		 * specific stream rather than the local process.stderr.
  		 *
  		 * @default process.stderr
  		 */
  var stderr: js.UndefOr[WriteStream] = js.undefined
  /**
  		 * The writable stream used to log information.
  		 *
  		 * It allows to configure semantic-release to write logs to a specific
  		 * stream rather than the local process.stdout.
  		 *
  		 * @default process.stdout
  		 */
  var stdout: js.UndefOr[WriteStream] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    cwd: String = null,
    env: StringDictionary[String] = null,
    stderr: WriteStream = null,
    stdout: WriteStream = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    if (stdout != null) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

