package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MediaListItem...
  */
trait IMediaListItem extends js.Object {
  /**
    * Relative path to the media file.
    * Media files located:
    *
    * - in the /content/default/ folder are outside the qvf file.
    * - in the /media/ folder are embedded in the qvf file.
    */
  var qUrl: java.lang.String
  /**
    * Relative path to the media file.
    * The URL is static.
    * Media files located:
    *
    * - in the /content/default/ folder are outside the qvf file.
    * - in the /media/ folder are embedded in the qvf file.
    */
  var qUrlDef: java.lang.String
}

object IMediaListItem {
  @scala.inline
  def apply(qUrl: java.lang.String, qUrlDef: java.lang.String): IMediaListItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qUrl")(qUrl)
    __obj.updateDynamic("qUrlDef")(qUrlDef)
    __obj.asInstanceOf[IMediaListItem]
  }
}

