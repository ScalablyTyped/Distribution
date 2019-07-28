package typings.scriptDashExtDashHtmlDashWebpackDashPlugin

import typings.scriptDashExtDashHtmlDashWebpackDashPlugin.Anon_All
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scriptDashExtDashHtmlDashWebpackDashPluginMod {
  type ScriptMatchingPattern = ScriptMatchingPatternBase | ScriptMatchingPatternHash
  type ScriptMatchingPatternBase = String | RegExp | (js.Array[String | RegExp])
  type ScriptMatchingPatternPre = ScriptMatchingPatternBase | (ScriptMatchingPatternHash with Anon_All)
}
