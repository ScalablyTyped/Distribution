package typings.semanticUiReact.commentCommentMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.commentActionMod.CommentActionProps
import typings.semanticUiReact.commentActionsMod.CommentActionsProps
import typings.semanticUiReact.commentAuthorMod.CommentAuthorProps
import typings.semanticUiReact.commentAvatarMod.CommentAvatarProps
import typings.semanticUiReact.commentContentMod.CommentContentProps
import typings.semanticUiReact.commentGroupMod.CommentGroupProps
import typings.semanticUiReact.commentMetadataMod.CommentMetadataProps
import typings.semanticUiReact.commentTextMod.CommentTextProps
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

