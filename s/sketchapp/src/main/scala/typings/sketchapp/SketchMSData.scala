package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSData extends js.Object {
  var document: SketchMSDocumentData
  var meta: SketchMSMetadata
  var pages: js.Array[SketchMSPage]
  var previews: js.Array[SketchMSPreview]
  var user: SketchMSUserData
}

object SketchMSData {
  @scala.inline
  def apply(
    document: SketchMSDocumentData,
    meta: SketchMSMetadata,
    pages: js.Array[SketchMSPage],
    previews: js.Array[SketchMSPreview],
    user: SketchMSUserData
  ): SketchMSData = {
    val __obj = js.Dynamic.literal(document = document, meta = meta, pages = pages, previews = previews, user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSData]
  }
}

