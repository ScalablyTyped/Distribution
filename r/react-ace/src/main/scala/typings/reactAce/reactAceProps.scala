package typings.reactAce

import typings.reactAce.aceMod.IAceEditorProps
import typings.reactAce.diffMod.IDiffEditorProps
import typings.reactAce.splitMod.ISplitEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactAceProps {
  @scala.inline
  def AceProps: IAceEditorProps.type = typings.reactAce.aceMod.IAceEditorProps
  type AceProps = IAceEditorProps
  @scala.inline
  def DiffProps: IDiffEditorProps.type = typings.reactAce.diffMod.IDiffEditorProps
  type DiffProps = IDiffEditorProps
  @scala.inline
  def ReactAceProps: IAceEditorProps.type = typings.reactAce.aceMod.IAceEditorProps
  type ReactAceProps = IAceEditorProps
  @scala.inline
  def SplitProps: ISplitEditorProps.type = typings.reactAce.splitMod.ISplitEditorProps
  type SplitProps = ISplitEditorProps
}

