package typings.semanticDashUiDashModal.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ModalSettingsNs {
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.allowMultiple
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.autofocus
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.className
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.closable
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.context
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.debug
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.detachable
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.dimmerSettings
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.duration
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.error
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.keyboardShortcuts
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.name
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.namespace
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.observeChanges
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.offset
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.onApprove
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.onDeny
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.onHidden
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.onHide
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.onShow
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.onVisible
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.performance
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.queue
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.selector
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.silent
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.transition
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    detachable | autofocus | observeChanges | allowMultiple | keyboardShortcuts | offset | context | closable | dimmerSettings | transition | duration | queue | onShow | onVisible | onHide | onHidden | onApprove | onDeny | selector | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      detachable | autofocus | observeChanges | allowMultiple | keyboardShortcuts | offset | context | closable | dimmerSettings | transition | duration | queue | selector | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
