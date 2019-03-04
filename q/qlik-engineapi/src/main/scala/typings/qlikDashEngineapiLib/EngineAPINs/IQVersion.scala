package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQVersion extends js.Object {
  var qComponentVersion: java.lang.String
}

object IQVersion {
  @scala.inline
  def apply(qComponentVersion: java.lang.String): IQVersion = {
    val __obj = js.Dynamic.literal(qComponentVersion = qComponentVersion)
  
    __obj.asInstanceOf[IQVersion]
  }
}

