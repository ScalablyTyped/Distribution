package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSData extends js.Object {
  var document: SketchMSDocument
  var meta: SketchMSMeta
  var pages: js.Array[SketchMSPageLayer]
  var previews: js.Array[SketchMSPreview]
  var user: SketchMSUser
}

object SketchMSData {
  @scala.inline
  def apply(
    document: SketchMSDocument,
    meta: SketchMSMeta,
    pages: js.Array[SketchMSPageLayer],
    previews: js.Array[SketchMSPreview],
    user: SketchMSUser
  ): SketchMSData = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSData]
  }
}

