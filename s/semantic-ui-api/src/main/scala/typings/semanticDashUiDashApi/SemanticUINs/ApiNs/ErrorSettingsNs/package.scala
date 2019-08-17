package typings.semanticDashUiDashApi.SemanticUINs.ApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettingsNs {
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.JSONParse
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.beforeSend
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.error
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.exitConditions
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.legacyParameters
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.missingAction
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.missingSerialize
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.missingURL
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.noReturnedValue
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.parseError
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.requiredParameter
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.statusMessage
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.timeout
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    beforeSend | error | exitConditions | JSONParse | legacyParameters | missingAction | missingSerialize | missingURL | noReturnedValue | parseError | requiredParameter | statusMessage | timeout
  ]) with (Partial[
    Pick[
      _Impl, 
      beforeSend | error | exitConditions | JSONParse | legacyParameters | missingAction | missingSerialize | missingURL | noReturnedValue | parseError | requiredParameter | statusMessage | timeout
    ]
  ])
}
