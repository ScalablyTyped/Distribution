package typings.semanticDashRelease

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object semanticDashReleaseMod {
  /**
  	 * Specifies a plugin to use.
  	 *
  	 * The plugin is specified by its module name.
  	 *
  	 * To pass options to a plugin, specify an array containing the plugin module
  	 * name and an options object.
  	 */
  type PluginSpec = String | (js.Tuple2[String, js.Any])
}
