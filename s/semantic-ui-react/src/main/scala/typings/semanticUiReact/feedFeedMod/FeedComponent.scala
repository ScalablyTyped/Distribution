package typings.semanticUiReact.feedFeedMod

import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.feedContentMod.FeedContentProps
import typings.semanticUiReact.feedDateMod.FeedDateProps
import typings.semanticUiReact.feedEventMod.FeedEventProps
import typings.semanticUiReact.feedExtraMod.FeedExtraProps
import typings.semanticUiReact.feedLabelMod.FeedLabelProps
import typings.semanticUiReact.feedLikeMod.FeedLikeProps
import typings.semanticUiReact.feedMetaMod.FeedMetaProps
import typings.semanticUiReact.feedSummaryMod.FeedSummaryProps
import typings.semanticUiReact.feedUserMod.FeedUserProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedComponent extends FunctionComponent[FeedProps] {
  var Content: StatelessComponent[FeedContentProps] = js.native
  var Date: StatelessComponent[FeedDateProps] = js.native
  var Event: StatelessComponent[FeedEventProps] = js.native
  var Extra: StatelessComponent[FeedExtraProps] = js.native
  var Label: StatelessComponent[FeedLabelProps] = js.native
  var Like: StatelessComponent[FeedLikeProps] = js.native
  var Meta: StatelessComponent[FeedMetaProps] = js.native
  var Summary: StatelessComponent[FeedSummaryProps] = js.native
  var User: StatelessComponent[FeedUserProps] = js.native
}

