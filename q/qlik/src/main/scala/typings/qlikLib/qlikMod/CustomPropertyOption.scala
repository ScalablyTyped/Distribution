package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyOption extends js.Object {
  var label: java.lang.String
  var value: java.lang.String
}

object CustomPropertyOption {
  @scala.inline
  def apply(label: java.lang.String, value: java.lang.String): CustomPropertyOption = {
    val __obj = js.Dynamic.literal(label = label, value = value)
  
    __obj.asInstanceOf[CustomPropertyOption]
  }
}

