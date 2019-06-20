package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MissingFieldHandler extends js.Object {
  var handle: js.UndefOr[
    js.Function4[
      (/* field */ NormalizationLinkedField) | (/* field */ NormalizationScalarField), 
      js.UndefOr[scala.Null | Record], 
      /* args */ Variables, 
      /* store */ ReadonlyRecordSourceProxy, 
      js.UndefOr[_ | (js.Array[js.UndefOr[DataID | scala.Null]]) | DataID | scala.Null]
    ]
  ] = js.native
  var kind: js.UndefOr[
    relayDashRuntimeLib.relayDashRuntimeLibStrings.linked | relayDashRuntimeLib.relayDashRuntimeLibStrings.pluralLinked | relayDashRuntimeLib.relayDashRuntimeLibStrings.scalar
  ] = js.native
}

