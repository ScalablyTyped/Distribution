package typings.reactLive

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactLiveComponents extends reactLiveProps {
  @scala.inline
  def Editor: ComponentType[EditorProps] = js.constructorOf[typings.reactLive.mod.Editor].asInstanceOf[ComponentType[EditorProps]]
  @scala.inline
  def LiveEditor: ComponentType[LiveEditorProps] = js.constructorOf[typings.reactLive.mod.LiveEditor].asInstanceOf[ComponentType[LiveEditorProps]]
  @scala.inline
  def LiveError: ComponentType[LiveErrorProps] = js.constructorOf[typings.reactLive.mod.LiveError].asInstanceOf[ComponentType[LiveErrorProps]]
  @scala.inline
  def LivePreview: ComponentType[LivePreviewProps] = js.constructorOf[typings.reactLive.mod.LivePreview].asInstanceOf[ComponentType[LivePreviewProps]]
  @scala.inline
  def LiveProvider: ComponentType[LiveProviderProps] = js.constructorOf[typings.reactLive.mod.LiveProvider].asInstanceOf[ComponentType[LiveProviderProps]]
}

