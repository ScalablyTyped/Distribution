package typings.semanticUiReact.cardCardMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.cardContentMod.CardContentProps
import typings.semanticUiReact.cardDescriptionMod.CardDescriptionProps
import typings.semanticUiReact.cardGroupMod.CardGroupProps
import typings.semanticUiReact.cardHeaderMod.CardHeaderProps
import typings.semanticUiReact.cardMetaMod.CardMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardComponent extends ComponentClass[CardProps, ComponentState] {
  var Content: StatelessComponent[CardContentProps] = js.native
  var Description: StatelessComponent[CardDescriptionProps] = js.native
  var Group: StatelessComponent[CardGroupProps] = js.native
  var Header: StatelessComponent[CardHeaderProps] = js.native
  var Meta: StatelessComponent[CardMetaProps] = js.native
}

