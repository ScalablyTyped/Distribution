package typings.reactAce

import typings.reactAce.aceMod.IAceEditorProps
import typings.reactAce.diffMod.IDiffEditorProps
import typings.reactAce.splitMod.ISplitEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactAceProps {
  @scala.inline
  def AceProps: IAceEditorProps.type = IAceEditorProps
  type AceProps = IAceEditorProps
  @scala.inline
  def DiffProps: IDiffEditorProps.type = IDiffEditorProps
  type DiffProps = IDiffEditorProps
  @scala.inline
  def ReactAceProps: IAceEditorProps.type = IAceEditorProps
  type ReactAceProps = IAceEditorProps
  @scala.inline
  def SplitProps: ISplitEditorProps.type = ISplitEditorProps
  type SplitProps = ISplitEditorProps
}

