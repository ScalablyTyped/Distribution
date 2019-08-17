package typings.semanticDashUiDashTransition.SemanticUINs.TransitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettingsNs {
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.animating
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.disabled
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.hidden
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.inward
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.loading
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.looping
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.outward
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.transition
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.visible
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    animating | disabled | hidden | inward | loading | looping | outward | transition | visible
  ]) with (Partial[
    Pick[
      _Impl, 
      animating | disabled | hidden | inward | loading | looping | outward | transition | visible
    ]
  ])
}
