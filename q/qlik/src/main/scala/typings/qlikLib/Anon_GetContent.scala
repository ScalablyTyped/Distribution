package typings
package qlikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_GetContent extends js.Object {
  def getContent(
    variable: java.lang.String,
    callback: js.Function2[/* value */ qlikLib.qlikMod.Variable, /* app */ this.type, scala.Unit]
  ): js.Promise[_]
  def setContent(variable: java.lang.String, value: java.lang.String): scala.Unit
}

