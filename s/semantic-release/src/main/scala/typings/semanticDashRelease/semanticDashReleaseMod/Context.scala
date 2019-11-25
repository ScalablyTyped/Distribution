package typings.semanticDashRelease.semanticDashReleaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.semanticDashRelease.Anon_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /**
  		 * Environment variables.
  		 */
  var env: StringDictionary[String]
  /**
  		 * The previous release details.
  		 */
  var lastRelease: js.UndefOr[LastRelease] = js.undefined
  /**
  		 * The shared logger instance of semantic release.
  		 */
  var logger: Anon_Error
  /**
  		 * The next release details.
  		 */
  var nextRelease: js.UndefOr[NextRelease] = js.undefined
  /**
  		 * The semantic release configuration itself.
  		 */
  var options: js.UndefOr[GlobalConfig] = js.undefined
}

object Context {
  @scala.inline
  def apply(
    env: StringDictionary[String],
    logger: Anon_Error,
    lastRelease: LastRelease = null,
    nextRelease: NextRelease = null,
    options: GlobalConfig = null
  ): Context = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    if (lastRelease != null) __obj.updateDynamic("lastRelease")(lastRelease.asInstanceOf[js.Any])
    if (nextRelease != null) __obj.updateDynamic("nextRelease")(nextRelease.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

