package typings.qunit

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var altertitle: Boolean
  var autostart: Boolean
  var collapse: Boolean
  var current: js.Any
  var filter: String | RegExp
  var fixture: String
  var hidepassed: Boolean
  var maxDepth: Double
  var module: String
  var moduleId: js.Array[String]
  var noglobals: Boolean
  var notrycatch: Boolean
  var reorder: Boolean
  var requireExpects: Boolean
  var scrolltop: Boolean
  var seed: String
  var testId: js.Array[String]
  var testTimeout: Double
  var urlConfig: js.Array[Anon_Id]
}

object Config {
  @scala.inline
  def apply(
    altertitle: Boolean,
    autostart: Boolean,
    collapse: Boolean,
    current: js.Any,
    filter: String | RegExp,
    fixture: String,
    hidepassed: Boolean,
    maxDepth: Double,
    module: String,
    moduleId: js.Array[String],
    noglobals: Boolean,
    notrycatch: Boolean,
    reorder: Boolean,
    requireExpects: Boolean,
    scrolltop: Boolean,
    seed: String,
    testId: js.Array[String],
    testTimeout: Double,
    urlConfig: js.Array[Anon_Id]
  ): Config = {
    val __obj = js.Dynamic.literal(altertitle = altertitle, autostart = autostart, collapse = collapse, current = current, filter = filter.asInstanceOf[js.Any], fixture = fixture, hidepassed = hidepassed, maxDepth = maxDepth, module = module, moduleId = moduleId, noglobals = noglobals, notrycatch = notrycatch, reorder = reorder, requireExpects = requireExpects, scrolltop = scrolltop, seed = seed, testId = testId, testTimeout = testTimeout, urlConfig = urlConfig)
  
    __obj.asInstanceOf[Config]
  }
}

