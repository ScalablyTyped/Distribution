package typings
package scriptDashExtDashHtmlDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scriptDashExtDashHtmlDashWebpackDashPluginMod {
  type ScriptExtHtmlWebpackPlugin = webpackLib.webpackMod.Plugin
  type ScriptMatchingPattern = ScriptMatchingPatternBase | ScriptMatchingPatternHash
  type ScriptMatchingPatternBase = java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])
  type ScriptMatchingPatternPre = (ScriptMatchingPatternBase | ScriptMatchingPatternHash) with scriptDashExtDashHtmlDashWebpackDashPluginLib.Anon_All
}
