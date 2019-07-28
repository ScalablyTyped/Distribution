package typings.semanticDashUiDashReact.distCommonjsViewsCardCardMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import typings.semanticDashUiDashReact.distCommonjsViewsCardCardContentMod.CardContentProps
import typings.semanticDashUiDashReact.distCommonjsViewsCardCardDescriptionMod.CardDescriptionProps
import typings.semanticDashUiDashReact.distCommonjsViewsCardCardGroupMod.CardGroupProps
import typings.semanticDashUiDashReact.distCommonjsViewsCardCardHeaderMod.CardHeaderProps
import typings.semanticDashUiDashReact.distCommonjsViewsCardCardMetaMod.CardMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardComponent extends ComponentClass[CardProps, ComponentState] {
  var Content: StatelessComponent[CardContentProps] = js.native
  var Description: StatelessComponent[CardDescriptionProps] = js.native
  var Group: StatelessComponent[CardGroupProps] = js.native
  var Header: StatelessComponent[CardHeaderProps] = js.native
  var Meta: StatelessComponent[CardMetaProps] = js.native
}

