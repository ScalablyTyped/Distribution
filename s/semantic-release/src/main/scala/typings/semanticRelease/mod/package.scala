package typings.semanticRelease

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
  	 * Specifies a plugin to use.
  	 *
  	 * The plugin is specified by its module name.
  	 *
  	 * To pass options to a plugin, specify an array containing the plugin module
  	 * name and an options object.
  	 */
  type PluginSpec = java.lang.String | (js.Tuple2[java.lang.String, js.Any])
}
