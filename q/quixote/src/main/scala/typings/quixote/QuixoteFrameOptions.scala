package typings.quixote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuixoteFrameOptions extends js.Object {
  // Height of the iframe. Defaults to a large value (see stability note below)
  var height: js.UndefOr[Double] = js.undefined
  // URL of an HTML document to load into the frame. Must be served from same domain as the enclosing test document, or you could get same-origin policy errors. Defaults to an empty document with <!DOCTYPE html> (to enable standards-mode rendering)
  var src: js.UndefOr[String] = js.undefined
  // URL of a CSS stylesheet to load into the frame. Defaults to loading nothing
  var stylesheet: js.UndefOr[String] = js.undefined
  // Width of the iframe. Defaults to a large value (see stability note below)
  var width: js.UndefOr[Double] = js.undefined
}

object QuixoteFrameOptions {
  @scala.inline
  def apply(
    height: Int | Double = null,
    src: String = null,
    stylesheet: String = null,
    width: Int | Double = null
  ): QuixoteFrameOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src)
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuixoteFrameOptions]
  }
}

