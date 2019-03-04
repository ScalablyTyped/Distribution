package typings
package shopifyDashPrimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var Accept: java.lang.String
  var `User-Agent`: java.lang.String
}

object Anon_Accept {
  @scala.inline
  def apply(Accept: java.lang.String, `User-Agent`: java.lang.String): Anon_Accept = {
    val __obj = js.Dynamic.literal(Accept = Accept)
    __obj.updateDynamic("User-Agent")(`User-Agent`)
    __obj.asInstanceOf[Anon_Accept]
  }
}

