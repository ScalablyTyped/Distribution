package typings
package stringDashReplaceDashWebpackDashPluginLib.stringDashReplaceDashWebpackDashPluginMod.StringReplacePluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReplacementItem extends js.Object {
  /**
           * a regex to match against the file contents
           */
  var pattern: stdLib.RegExp
  /**
           * an ECMAScript string replacement function
           * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace#Specifying_a_function_as_a_parameter
           */
  def replacement(substring: java.lang.String, args: js.Any*): java.lang.String
}

