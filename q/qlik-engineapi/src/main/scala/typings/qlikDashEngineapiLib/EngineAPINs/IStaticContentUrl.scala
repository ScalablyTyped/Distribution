package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qUrl: java.lang.String
}

object IStaticContentUrl {
  @scala.inline
  def apply(qUrl: java.lang.String): IStaticContentUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qUrl")(qUrl)
    __obj.asInstanceOf[IStaticContentUrl]
  }
}

