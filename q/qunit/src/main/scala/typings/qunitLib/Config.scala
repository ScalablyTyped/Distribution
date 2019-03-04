package typings
package qunitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var altertitle: scala.Boolean
  var autostart: scala.Boolean
  var collapse: scala.Boolean
  var current: js.Any
  var filter: java.lang.String | stdLib.RegExp
  var fixture: java.lang.String
  var hidepassed: scala.Boolean
  var maxDepth: scala.Double
  var module: java.lang.String
  var moduleId: js.Array[java.lang.String]
  var noglobals: scala.Boolean
  var notrycatch: scala.Boolean
  var reorder: scala.Boolean
  var requireExpects: scala.Boolean
  var scrolltop: scala.Boolean
  var seed: java.lang.String
  var testId: js.Array[java.lang.String]
  var testTimeout: scala.Double
  var urlConfig: js.Array[Anon_Id]
}

object Config {
  @scala.inline
  def apply(
    altertitle: scala.Boolean,
    autostart: scala.Boolean,
    collapse: scala.Boolean,
    current: js.Any,
    filter: java.lang.String | stdLib.RegExp,
    fixture: java.lang.String,
    hidepassed: scala.Boolean,
    maxDepth: scala.Double,
    module: java.lang.String,
    moduleId: js.Array[java.lang.String],
    noglobals: scala.Boolean,
    notrycatch: scala.Boolean,
    reorder: scala.Boolean,
    requireExpects: scala.Boolean,
    scrolltop: scala.Boolean,
    seed: java.lang.String,
    testId: js.Array[java.lang.String],
    testTimeout: scala.Double,
    urlConfig: js.Array[Anon_Id]
  ): Config = {
    val __obj = js.Dynamic.literal(altertitle = altertitle, autostart = autostart, collapse = collapse, current = current, filter = filter.asInstanceOf[js.Any], fixture = fixture, hidepassed = hidepassed, maxDepth = maxDepth, module = module, moduleId = moduleId, noglobals = noglobals, notrycatch = notrycatch, reorder = reorder, requireExpects = requireExpects, scrolltop = scrolltop, seed = seed, testId = testId, testTimeout = testTimeout, urlConfig = urlConfig)
  
    __obj.asInstanceOf[Config]
  }
}

