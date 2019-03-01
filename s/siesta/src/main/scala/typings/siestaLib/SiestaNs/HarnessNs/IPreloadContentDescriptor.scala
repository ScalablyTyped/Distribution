package typings
package siestaLib.SiestaNs.HarnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreloadContentDescriptor extends js.Object {
  var content: java.lang.String
  var `type`: java.lang.String
}

object IPreloadContentDescriptor {
  @scala.inline
  def apply(content: java.lang.String, `type`: java.lang.String): IPreloadContentDescriptor = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[IPreloadContentDescriptor]
  }
}

