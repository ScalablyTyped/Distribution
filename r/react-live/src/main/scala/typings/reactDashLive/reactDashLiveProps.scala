package typings.reactDashLive

import typings.react.reactMod.HTMLProps
import typings.reactDashLive.reactDashLiveMod.DivProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactDashLiveProps {
  type EditorProps = typings.reactDashLive.reactDashLiveMod.EditorProps
  type LiveEditorProps = typings.reactDashLive.reactDashLiveMod.LiveEditorProps
  @scala.inline
  def LiveErrorProps: HTMLProps.type = typings.react.reactMod.HTMLProps
  type LiveErrorProps = DivProps
  @scala.inline
  def LivePreviewProps: HTMLProps.type = typings.react.reactMod.HTMLProps
  type LivePreviewProps = DivProps
  type LiveProviderProps = typings.reactDashLive.reactDashLiveMod.LiveProviderProps
}

