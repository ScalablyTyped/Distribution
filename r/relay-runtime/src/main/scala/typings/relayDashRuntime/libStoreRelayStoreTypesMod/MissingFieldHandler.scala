package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField
import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationScalarField
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayDashRuntime.relayDashRuntimeStrings.linked
import typings.relayDashRuntime.relayDashRuntimeStrings.pluralLinked
import typings.relayDashRuntime.relayDashRuntimeStrings.scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MissingFieldHandler extends js.Object {
  var handle: js.UndefOr[
    js.Function4[
      (/* field */ NormalizationLinkedField) | (/* field */ NormalizationScalarField), 
      js.UndefOr[Null | Record], 
      /* args */ Variables, 
      /* store */ ReadOnlyRecordSourceProxy, 
      js.UndefOr[_ | (js.Array[js.UndefOr[DataID | Null]]) | DataID | Null]
    ]
  ] = js.native
  var kind: js.UndefOr[linked | pluralLinked | scalar] = js.native
}

