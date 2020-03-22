package typings.scriptExtHtmlWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ScriptMatchingPattern = typings.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternBase | typings.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternHash
  type ScriptMatchingPatternBase = java.lang.String | typings.std.RegExp | (js.Array[java.lang.String | typings.std.RegExp])
  type ScriptMatchingPatternPre = typings.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternBase | typings.scriptExtHtmlWebpackPlugin.ScriptMatchingPatternHash
}
