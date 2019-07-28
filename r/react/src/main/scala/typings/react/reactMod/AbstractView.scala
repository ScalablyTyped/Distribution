package typings.react.reactMod

import typings.react.Document
import typings.react.StyleMedia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Browser Interfaces
// https://github.com/nikeee/2048-typescript/blob/master/2048/js/touch.d.ts
// ----------------------------------------------------------------------
trait AbstractView extends js.Object {
  var document: Document
  var styleMedia: StyleMedia
}

object AbstractView {
  @scala.inline
  def apply(document: Document, styleMedia: StyleMedia): AbstractView = {
    val __obj = js.Dynamic.literal(document = document, styleMedia = styleMedia)
  
    __obj.asInstanceOf[AbstractView]
  }
}

