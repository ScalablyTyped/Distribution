package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StaticContentUrlDef...
  *
  * Note: In addition, this structure can contain dynamic properties.
  */
trait IStaticContentUrlDef extends js.Object {
  /**
    * Relative path of the thumbnail.
    */
  var qUrl: java.lang.String
}

object IStaticContentUrlDef {
  @scala.inline
  def apply(qUrl: java.lang.String): IStaticContentUrlDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qUrl")(qUrl)
    __obj.asInstanceOf[IStaticContentUrlDef]
  }
}

