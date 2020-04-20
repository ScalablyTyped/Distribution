package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StaticContentUrl...
  *
  * Note: In addition, this structure can return dynamic properties.
  */
trait IStaticContentUrl extends js.Object {
  /**
    * Relative path of the thumbnail.
    */
  var qUrl: String
}

object IStaticContentUrl {
  @scala.inline
  def apply(qUrl: String): IStaticContentUrl = {
    val __obj = js.Dynamic.literal(qUrl = qUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticContentUrl]
  }
}

