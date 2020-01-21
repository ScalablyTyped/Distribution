package typings.scriptExtHtmlWebpackPlugin.mod

import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.async
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.defer
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * script names that should have an async attribute (default: `[]`)
    */
  var async: js.UndefOr[ScriptMatchingPattern] = js.undefined
  /**
    * scripts that should have a custom attribute(s) added, the attribute(s), and the value(s)
    */
  var custom: js.UndefOr[Custom | js.Array[Custom]] = js.undefined
  /**
    * the default attribute to set - 'sync' actually results in no attribute (default: 'sync')
    */
  var defaultAttribute: js.UndefOr[sync | async | defer] = js.undefined
  /**
    * script names that should have a defer attribute (default: `[]`)
    */
  var defer: js.UndefOr[ScriptMatchingPattern] = js.undefined
  /**
    * scripts that should be inlined in the html (default: `[]`)
    */
  var `inline`: js.UndefOr[ScriptMatchingPattern] = js.undefined
  /**
    * script names that should have a type="module" attribute (default: `[]`)
    */
  var module: js.UndefOr[ScriptMatchingPattern] = js.undefined
  /**
    * scripts that should have accompanying prefetch resource hints (default: `[]`)
    */
  var prefetch: js.UndefOr[ScriptMatchingPatternPre] = js.undefined
  /**
    * scripts that should have accompanying preload resource hints (default: `[]`)
    */
  var preload: js.UndefOr[ScriptMatchingPatternPre] = js.undefined
  /**
    * script names that should have no attribute (default: `[]`)
    */
  var sync: js.UndefOr[ScriptMatchingPattern] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    async: ScriptMatchingPattern = null,
    custom: Custom | js.Array[Custom] = null,
    defaultAttribute: sync | async | defer = null,
    defer: ScriptMatchingPattern = null,
    `inline`: ScriptMatchingPattern = null,
    module: ScriptMatchingPattern = null,
    prefetch: ScriptMatchingPatternPre = null,
    preload: ScriptMatchingPatternPre = null,
    sync: ScriptMatchingPattern = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (defaultAttribute != null) __obj.updateDynamic("defaultAttribute")(defaultAttribute.asInstanceOf[js.Any])
    if (defer != null) __obj.updateDynamic("defer")(defer.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (prefetch != null) __obj.updateDynamic("prefetch")(prefetch.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (sync != null) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

