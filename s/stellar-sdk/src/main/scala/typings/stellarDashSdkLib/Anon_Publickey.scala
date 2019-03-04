package typings
package stellarDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Publickey extends js.Object {
  var public_key: java.lang.String
  var weight: scala.Double
}

object Anon_Publickey {
  @scala.inline
  def apply(public_key: java.lang.String, weight: scala.Double): Anon_Publickey = {
    val __obj = js.Dynamic.literal(public_key = public_key, weight = weight)
  
    __obj.asInstanceOf[Anon_Publickey]
  }
}

