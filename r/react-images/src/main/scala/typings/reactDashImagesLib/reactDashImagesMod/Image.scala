package typings
package reactDashImagesLib.reactDashImagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * The alt text for the image.
    */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The image caption.
    */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The source of the image. Required.
    */
  var src: java.lang.String
  /**
    * array of strings or string
    */
  var srcSet: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

