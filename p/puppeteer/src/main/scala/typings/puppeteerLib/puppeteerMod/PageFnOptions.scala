package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PageFnOptions extends Timeoutable {
  var polling: js.UndefOr[
    puppeteerLib.puppeteerLibStrings.raf | puppeteerLib.puppeteerLibStrings.mutation | scala.Double
  ] = js.undefined
}

