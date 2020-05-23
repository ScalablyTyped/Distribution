package typings.reactMonacoEditor.anon

import typings.monacoEditor.mod.editor.IEditorOverrideServices
import typings.monacoEditor.mod.editor.IStandaloneCodeEditor
import typings.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(domElement: HTMLElement): IStandaloneCodeEditor = js.native
  def apply(domElement: HTMLElement, options: IStandaloneEditorConstructionOptions): IStandaloneCodeEditor = js.native
  def apply(
    domElement: HTMLElement,
    options: IStandaloneEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneCodeEditor = js.native
}

