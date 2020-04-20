package typings.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedSketchDocument extends js.Object {
  var sketchObject: SketchDocument | SketchDocumentData
}

object WrappedSketchDocument {
  @scala.inline
  def apply(sketchObject: SketchDocument | SketchDocumentData): WrappedSketchDocument = {
    val __obj = js.Dynamic.literal(sketchObject = sketchObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedSketchDocument]
  }
}

