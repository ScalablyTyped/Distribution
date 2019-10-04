package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField
import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationScalarField
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MissingFieldHandler extends js.Object {
  var handle: js.UndefOr[
    js.Function4[
      (/* field */ NormalizationLinkedField) | (/* field */ NormalizationScalarField), 
      /* record */ Record, 
      /* args */ Variables, 
      /* store */ ReadOnlyRecordSourceProxy, 
      _ | js.Array[DataID] | DataID
    ]
  ] = js.native
  var kind: js.UndefOr[String] = js.native
}

