package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLSourceElement extends HTMLElement {
  /**
       * Gets or sets the intended media type of the media source.
       */
  var media: java.lang.String = js.native
  var sizes: java.lang.String = js.native
  /**
       * The address or URL of the a media resource that is to be considered.
       */
  var src: java.lang.String = js.native
  var srcset: java.lang.String = js.native
  /**
       * Gets or sets the MIME type of a media resource.
       */
  var `type`: java.lang.String = js.native
}

@JSGlobal("HTMLSourceElement")
@js.native
object HTMLSourceElement
  extends ScalablyTyped.runtime.Instantiable0[HTMLSourceElement]

