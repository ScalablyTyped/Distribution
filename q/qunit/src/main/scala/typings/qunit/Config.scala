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
  var urlConfig: js.Array[AnonId]
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
    urlConfig: js.Array[AnonId]
  ): Config = {
    val __obj = js.Dynamic.literal(altertitle = altertitle.asInstanceOf[js.Any], autostart = autostart.asInstanceOf[js.Any], collapse = collapse.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], fixture = fixture.asInstanceOf[js.Any], hidepassed = hidepassed.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], noglobals = noglobals.asInstanceOf[js.Any], notrycatch = notrycatch.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any], requireExpects = requireExpects.asInstanceOf[js.Any], scrolltop = scrolltop.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], urlConfig = urlConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
}

