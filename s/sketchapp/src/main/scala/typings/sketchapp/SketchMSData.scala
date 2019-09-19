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
    val __obj = js.Dynamic.literal(document = document, meta = meta, pages = pages, previews = previews, user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSData]
  }
}

