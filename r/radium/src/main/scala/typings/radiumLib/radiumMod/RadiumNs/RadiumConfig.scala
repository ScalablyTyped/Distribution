package typings
package radiumLib.radiumMod.RadiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadiumConfig extends js.Object {
  /**
    * Allow to replace matchMedia function that Radium uses. The default one is window.matchMedia
    * @param mediaQuery
    */
  var matchMedia: js.UndefOr[js.Function1[/* mediaQuery */ java.lang.String, stdLib.MediaQueryList]] = js.undefined
  /**
    * List of plugins
    */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Set the user agent passed to inline-style-prefixer to perform prefixing on style objects.
    * Mainly used during server rendering
    */
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

