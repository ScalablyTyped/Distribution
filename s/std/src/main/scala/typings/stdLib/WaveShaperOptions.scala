package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WaveShaperOptions extends AudioNodeOptions {
  var curve: js.UndefOr[js.Array[scala.Double] | Float32Array] = js.undefined
  var oversample: js.UndefOr[OverSampleType] = js.undefined
}

