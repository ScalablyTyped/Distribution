package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: java.lang.String
  var propagateAtLaunch: scala.Boolean
  var value: java.lang.String
}

object Anon_Key {
  @scala.inline
  def apply(key: java.lang.String, propagateAtLaunch: scala.Boolean, value: java.lang.String): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key, propagateAtLaunch = propagateAtLaunch, value = value)
  
    __obj.asInstanceOf[Anon_Key]
  }
}

