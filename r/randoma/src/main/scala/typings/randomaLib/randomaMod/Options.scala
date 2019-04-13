package typings
package randomaLib.randomaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var seed: java.lang.String | scala.Double
}

object Options {
  @scala.inline
  def apply(seed: java.lang.String | scala.Double): Options = {
    val __obj = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

