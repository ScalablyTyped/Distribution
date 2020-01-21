package typings.radium.mod.Radium

import typings.std.MediaQueryList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadiumConfig extends js.Object {
  /**
    * Allow to replace matchMedia function that Radium uses. The default one is window.matchMedia
    * @param mediaQuery
    */
  var matchMedia: js.UndefOr[js.Function1[/* mediaQuery */ String, MediaQueryList]] = js.undefined
  /**
    * List of plugins
    */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Set the user agent passed to inline-style-prefixer to perform prefixing on style objects.
    * Mainly used during server rendering
    */
  var userAgent: js.UndefOr[String] = js.undefined
}

object RadiumConfig {
  @scala.inline
  def apply(
    matchMedia: /* mediaQuery */ String => MediaQueryList = null,
    plugins: js.Array[_] = null,
    userAgent: String = null
  ): RadiumConfig = {
    val __obj = js.Dynamic.literal()
    if (matchMedia != null) __obj.updateDynamic("matchMedia")(js.Any.fromFunction1(matchMedia))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadiumConfig]
  }
}

