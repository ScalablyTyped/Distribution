package typings.reactDashAce

import typings.react.reactMod.ComponentType
import typings.reactDashAce.libAceMod.IAceEditorProps
import typings.reactDashAce.libDiffMod.IDiffEditorProps
import typings.reactDashAce.libSplitMod.ISplitEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashAceComponents extends reactDashAceProps {
  @scala.inline
  def Ace: ComponentType[IAceEditorProps] = js.constructorOf[typings.reactDashAce.libAceMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashAce.libAceMod.IAceEditorProps]]
  @scala.inline
  def Diff: ComponentType[IDiffEditorProps] = js.constructorOf[typings.reactDashAce.libDiffMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashAce.libDiffMod.IDiffEditorProps]]
  @scala.inline
  def ReactDashAce: ComponentType[IAceEditorProps] = js.constructorOf[typings.reactDashAce.reactDashAceMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashAce.libAceMod.IAceEditorProps]]
  @scala.inline
  def Split: ComponentType[ISplitEditorProps] = js.constructorOf[typings.reactDashAce.libSplitMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashAce.libSplitMod.ISplitEditorProps]]
}

