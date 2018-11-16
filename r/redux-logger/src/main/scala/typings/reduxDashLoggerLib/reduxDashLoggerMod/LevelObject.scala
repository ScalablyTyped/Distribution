package typings
package reduxDashLoggerLib.reduxDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LevelObject extends js.Object {
  var action: js.UndefOr[java.lang.String | scala.Boolean | ActionToString] = js.undefined
  var error: js.UndefOr[java.lang.String | scala.Boolean | ErrorToString] = js.undefined
  var nextState: js.UndefOr[java.lang.String | scala.Boolean | StateToString] = js.undefined
  var prevState: js.UndefOr[java.lang.String | scala.Boolean | StateToString] = js.undefined
}

