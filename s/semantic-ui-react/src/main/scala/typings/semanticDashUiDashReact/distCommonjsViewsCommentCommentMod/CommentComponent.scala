package typings.semanticDashUiDashReact.distCommonjsViewsCommentCommentMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.StatelessComponent
import typings.semanticDashUiDashReact.distCommonjsViewsCommentCommentActionMod.CommentActionProps
import typings.semanticDashUiDashReact.distCommonjsViewsCommentCommentActionsMod.CommentActionsProps
import typings.semanticDashUiDashReact.distCommonjsViewsCommentCommentAuthorMod.CommentAuthorProps
import typings.semanticDashUiDashReact.distCommonjsViewsCommentCommentAvatarMod.CommentAvatarProps
import typings.semanticDashUiDashReact.distCommonjsViewsCommentCommentContentMod.CommentContentProps
import typings.semanticDashUiDashReact.distCommonjsViewsCommentCommentGroupMod.CommentGroupProps
import typings.semanticDashUiDashReact.distCommonjsViewsCommentCommentMetadataMod.CommentMetadataProps
import typings.semanticDashUiDashReact.distCommonjsViewsCommentCommentTextMod.CommentTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentComponent extends FunctionComponent[CommentProps] {
  var Action: ComponentClass[CommentActionProps, ComponentState] = js.native
  var Actions: StatelessComponent[CommentActionsProps] = js.native
  var Author: StatelessComponent[CommentAuthorProps] = js.native
  var Avatar: StatelessComponent[CommentAvatarProps] = js.native
  var Content: StatelessComponent[CommentContentProps] = js.native
  var Group: StatelessComponent[CommentGroupProps] = js.native
  var Metadata: StatelessComponent[CommentMetadataProps] = js.native
  var Text: StatelessComponent[CommentTextProps] = js.native
}

