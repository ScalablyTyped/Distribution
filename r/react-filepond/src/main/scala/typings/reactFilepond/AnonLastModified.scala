package typings.reactFilepond

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastModified extends js.Object {
  val lastModified: Double
  val name: String
}

object AnonLastModified {
  @scala.inline
  def apply(lastModified: Double, name: String): AnonLastModified = {
    val __obj = js.Dynamic.literal(lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLastModified]
  }
}

