package typings.reactLive

import typings.react.mod.HTMLProps
import typings.reactLive.mod.DivProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactLiveProps {
  type EditorProps = typings.reactLive.mod.EditorProps
  type LiveEditorProps = typings.reactLive.mod.LiveEditorProps
  @scala.inline
  def LiveErrorProps: HTMLProps.type = typings.react.mod.HTMLProps
  type LiveErrorProps = DivProps
  @scala.inline
  def LivePreviewProps: HTMLProps.type = typings.react.mod.HTMLProps
  type LivePreviewProps = DivProps
  type LiveProviderProps = typings.reactLive.mod.LiveProviderProps
}

