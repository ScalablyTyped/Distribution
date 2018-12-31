package typings
package quixoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuixoteFrameOptions extends js.Object {
  // Height of the iframe. Defaults to a large value (see stability note below)
  var height: js.UndefOr[scala.Double] = js.undefined
  // URL of an HTML document to load into the frame. Must be served from same domain as the enclosing test document, or you could get same-origin policy errors. Defaults to an empty document with <!DOCTYPE html> (to enable standards-mode rendering)
  var src: js.UndefOr[java.lang.String] = js.undefined
  // URL of a CSS stylesheet to load into the frame. Defaults to loading nothing
  var stylesheet: js.UndefOr[java.lang.String] = js.undefined
  // Width of the iframe. Defaults to a large value (see stability note below)
  var width: js.UndefOr[scala.Double] = js.undefined
}

