package typings.react.mod

import typings.std.Document_
import typings.std.StyleMedia_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Browser Interfaces
// https://github.com/nikeee/2048-typescript/blob/master/2048/js/touch.d.ts
// ----------------------------------------------------------------------
trait AbstractView extends js.Object {
  var document: Document_
  var styleMedia: StyleMedia_
}

object AbstractView {
  @scala.inline
  def apply(document: Document_, styleMedia: StyleMedia_): AbstractView = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], styleMedia = styleMedia.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbstractView]
  }
}

