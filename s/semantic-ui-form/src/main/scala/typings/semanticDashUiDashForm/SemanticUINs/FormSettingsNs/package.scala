package typings.semanticDashUiDashForm.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FormSettingsNs {
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`inline`
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.className
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.debug
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.defaults
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.delay
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.duration
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.error
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.fields
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.keyboardShortcuts
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.metadata
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.name
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.namespace
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.on
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.onFailure
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.onInvalid
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.onSuccess
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.onValid
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.performance
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.prompt
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.revalidate
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.rules
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.selector
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.silent
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.templates
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.text
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.transition
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    keyboardShortcuts | on | revalidate | delay | `inline` | transition | duration | fields | text | prompt | onValid | onInvalid | onSuccess | onFailure | templates | rules | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      defaults | keyboardShortcuts | on | revalidate | delay | `inline` | transition | duration | fields | text | prompt | templates | rules | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
