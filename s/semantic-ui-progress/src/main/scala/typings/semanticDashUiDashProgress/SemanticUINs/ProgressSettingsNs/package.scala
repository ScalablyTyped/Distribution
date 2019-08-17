package typings.semanticDashUiDashProgress.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ProgressSettingsNs {
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.autoSuccess
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.className
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.debug
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.error
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.label
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.limitValues
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.metadata
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.name
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.namespace
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.onActive
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.onChange
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.onError
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.onSuccess
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.onWarning
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.performance
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.precision
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.random
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.regExp
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.selector
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.showActivity
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.silent
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.text
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.total
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.value
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    autoSuccess | showActivity | limitValues | label | random | precision | total | value | onChange | onSuccess | onActive | onError | onWarning | text | regExp | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      autoSuccess | showActivity | limitValues | label | random | precision | total | value | text | regExp | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
