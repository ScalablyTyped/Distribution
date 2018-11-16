package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IType extends INamespace {
  /** Extension ranges */
  var extensions: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  /** Field descriptors */
  var fields: ScalablyTyped.runtime.StringDictionary[IField]
  /** Whether a legacy group or not */
  var group: js.UndefOr[scala.Boolean] = js.undefined
  /** Oneof descriptors */
  var oneofs: js.UndefOr[ScalablyTyped.runtime.StringDictionary[IOneOf]] = js.undefined
  /** Reserved ranges */
  var reserved: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
}

