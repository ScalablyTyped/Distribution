package typings.sketchapp

import typings.sketchapp.anon.PageListCollapsed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSUserDocument extends js.Object {
  var document: PageListCollapsed
}

object SketchMSUserDocument {
  @scala.inline
  def apply(document: PageListCollapsed): SketchMSUserDocument = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSUserDocument]
  }
}

