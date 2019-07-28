package typings.qlikDashEngineapi.EngineAPINs

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
  var qUrl: String
  /**
    * Relative path to the media file.
    * The URL is static.
    * Media files located:
    *
    * - in the /content/default/ folder are outside the qvf file.
    * - in the /media/ folder are embedded in the qvf file.
    */
  var qUrlDef: String
}

object IMediaListItem {
  @scala.inline
  def apply(qUrl: String, qUrlDef: String): IMediaListItem = {
    val __obj = js.Dynamic.literal(qUrl = qUrl, qUrlDef = qUrlDef)
  
    __obj.asInstanceOf[IMediaListItem]
  }
}

