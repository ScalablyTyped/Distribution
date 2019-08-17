package typings.scriptDashExtDashHtmlDashWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scriptDashExtDashHtmlDashWebpackDashPluginMod {
  import typings.scriptDashExtDashHtmlDashWebpackDashPlugin.Anon_All
  import typings.std.RegExp

  type ScriptMatchingPattern = ScriptMatchingPatternBase | ScriptMatchingPatternHash
  type ScriptMatchingPatternBase = String | RegExp | (js.Array[String | RegExp])
  type ScriptMatchingPatternPre = ScriptMatchingPatternBase | (ScriptMatchingPatternHash with Anon_All)
}
