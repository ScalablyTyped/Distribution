package typings.semanticRelease

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Specifies a git branch holding commits to analyze and code to release.
    *
    * Each branch may be defined either by a string or an object. Specifying
    * a string is a shortcut for specifying that string as the `name` field,
    * for example `"master"` expands to `{name: "master"}`.
    */
  type BranchSpec = java.lang.String | typings.semanticRelease.anon.Channel
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
