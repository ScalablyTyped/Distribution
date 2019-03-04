package typings
package siestaLib.SiestaNs.HarnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreloadUrlDescriptor extends js.Object {
  var `type`: java.lang.String
  var url: java.lang.String
}

object IPreloadUrlDescriptor {
  @scala.inline
  def apply(`type`: java.lang.String, url: java.lang.String): IPreloadUrlDescriptor = {
    val __obj = js.Dynamic.literal(url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPreloadUrlDescriptor]
  }
}

