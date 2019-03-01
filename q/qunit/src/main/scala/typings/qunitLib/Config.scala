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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("altertitle")(altertitle)
    __obj.updateDynamic("autostart")(autostart)
    __obj.updateDynamic("collapse")(collapse)
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.updateDynamic("fixture")(fixture)
    __obj.updateDynamic("hidepassed")(hidepassed)
    __obj.updateDynamic("maxDepth")(maxDepth)
    __obj.updateDynamic("module")(module)
    __obj.updateDynamic("moduleId")(moduleId)
    __obj.updateDynamic("noglobals")(noglobals)
    __obj.updateDynamic("notrycatch")(notrycatch)
    __obj.updateDynamic("reorder")(reorder)
    __obj.updateDynamic("requireExpects")(requireExpects)
    __obj.updateDynamic("scrolltop")(scrolltop)
    __obj.updateDynamic("seed")(seed)
    __obj.updateDynamic("testId")(testId)
    __obj.updateDynamic("testTimeout")(testTimeout)
    __obj.updateDynamic("urlConfig")(urlConfig)
    __obj.asInstanceOf[Config]
  }
}

