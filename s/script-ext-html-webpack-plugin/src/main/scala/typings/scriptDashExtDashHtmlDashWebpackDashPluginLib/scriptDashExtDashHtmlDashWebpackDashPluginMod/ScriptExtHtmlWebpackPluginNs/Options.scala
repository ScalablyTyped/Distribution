package typings
package scriptDashExtDashHtmlDashWebpackDashPluginLib.scriptDashExtDashHtmlDashWebpackDashPluginMod.ScriptExtHtmlWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * script names that should have an async attribute (default: `[]`)
    */
  var async: js.UndefOr[scriptDashExtDashHtmlDashWebpackDashPluginLib.ScriptMatchingPattern] = js.undefined
  /**
    * scripts that should have a custom attribute(s) added, the attribute(s), and the value(s)
    */
  var custom: js.UndefOr[
    scriptDashExtDashHtmlDashWebpackDashPluginLib.scriptDashExtDashHtmlDashWebpackDashPluginMod.Custom | (js.Array[
      scriptDashExtDashHtmlDashWebpackDashPluginLib.scriptDashExtDashHtmlDashWebpackDashPluginMod.Custom
    ])
  ] = js.undefined
  /**
    * the default attribute to set - 'sync' actually results in no attribute (default: 'sync')
    */
  var defaultAttribute: js.UndefOr[
    scriptDashExtDashHtmlDashWebpackDashPluginLib.scriptDashExtDashHtmlDashWebpackDashPluginLibStrings.sync | scriptDashExtDashHtmlDashWebpackDashPluginLib.scriptDashExtDashHtmlDashWebpackDashPluginLibStrings.async | scriptDashExtDashHtmlDashWebpackDashPluginLib.scriptDashExtDashHtmlDashWebpackDashPluginLibStrings.defer
  ] = js.undefined
  /**
    * script names that should have a defer attribute (default: `[]`)
    */
  var defer: js.UndefOr[scriptDashExtDashHtmlDashWebpackDashPluginLib.ScriptMatchingPattern] = js.undefined
  /**
    * scripts that should be inlined in the html (default: `[]`)
    */
  var `inline`: js.UndefOr[scriptDashExtDashHtmlDashWebpackDashPluginLib.ScriptMatchingPattern] = js.undefined
  /**
    * script names that should have a type="module" attribute (default: `[]`)
    */
  var module: js.UndefOr[scriptDashExtDashHtmlDashWebpackDashPluginLib.ScriptMatchingPattern] = js.undefined
  /**
    * scripts that should have accompanying prefetch resource hints (default: `[]`)
    */
  var prefetch: js.UndefOr[scriptDashExtDashHtmlDashWebpackDashPluginLib.ScriptMatchingPatternPre] = js.undefined
  /**
    * scripts that should have accompanying preload resource hints (default: `[]`)
    */
  var preload: js.UndefOr[scriptDashExtDashHtmlDashWebpackDashPluginLib.ScriptMatchingPatternPre] = js.undefined
  /**
    * script names that should have no attribute (default: `[]`)
    */
  var sync: js.UndefOr[scriptDashExtDashHtmlDashWebpackDashPluginLib.ScriptMatchingPattern] = js.undefined
}

