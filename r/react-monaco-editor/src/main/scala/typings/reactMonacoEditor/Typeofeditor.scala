package typings.reactMonacoEditor

import org.scalablytyped.runtime.Instantiable0
import typings.monacoEditor.AnonModel
import typings.monacoEditor.AnonOwner
import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.mod.Token
import typings.monacoEditor.mod.Uri
import typings.monacoEditor.mod.editor.ICodeEditor
import typings.monacoEditor.mod.editor.IColorizerElementOptions
import typings.monacoEditor.mod.editor.IColorizerOptions
import typings.monacoEditor.mod.editor.IDiffEditorConstructionOptions
import typings.monacoEditor.mod.editor.IDiffNavigator
import typings.monacoEditor.mod.editor.IDiffNavigatorOptions
import typings.monacoEditor.mod.editor.IEditorOverrideServices
import typings.monacoEditor.mod.editor.IMarker
import typings.monacoEditor.mod.editor.IMarkerData
import typings.monacoEditor.mod.editor.IStandaloneCodeEditor
import typings.monacoEditor.mod.editor.IStandaloneDiffEditor
import typings.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typings.monacoEditor.mod.editor.IStandaloneThemeData
import typings.monacoEditor.mod.editor.ITextModel
import typings.monacoEditor.mod.editor.IWebWorkerOptions
import typings.monacoEditor.mod.editor.MonacoWebWorker
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofeditor extends js.Object {
  var BareFontInfo: Instantiable0[typings.monacoEditor.mod.editor.BareFontInfo] = js.native
  var ConfigurationChangedEvent: Instantiable0[typings.monacoEditor.mod.editor.ConfigurationChangedEvent] = js.native
  val EditorOptions: AnonAcceptSuggestionOnCommitCharacter = js.native
  val EditorType: AnonICodeEditor = js.native
  var FindMatch: Instantiable0[typings.monacoEditor.mod.editor.FindMatch] = js.native
  var FontInfo: Instantiable0[typings.monacoEditor.mod.editor.FontInfo] = js.native
  var TextModelResolvedOptions: Instantiable0[typings.monacoEditor.mod.editor.TextModelResolvedOptions] = js.native
  def colorize(text: String, languageId: String, options: IColorizerOptions): js.Promise[String] = js.native
  def colorizeElement(domNode: HTMLElement, options: IColorizerElementOptions): js.Promise[Unit] = js.native
  def colorizeModelLine(model: ITextModel, lineNumber: Double): String = js.native
  def colorizeModelLine(model: ITextModel, lineNumber: Double, tabSize: Double): String = js.native
  def create(domElement: HTMLElement): IStandaloneCodeEditor = js.native
  def create(domElement: HTMLElement, options: IStandaloneEditorConstructionOptions): IStandaloneCodeEditor = js.native
  def create(
    domElement: HTMLElement,
    options: IStandaloneEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneCodeEditor = js.native
  def createDiffEditor(domElement: HTMLElement): IStandaloneDiffEditor = js.native
  def createDiffEditor(domElement: HTMLElement, options: IDiffEditorConstructionOptions): IStandaloneDiffEditor = js.native
  def createDiffEditor(
    domElement: HTMLElement,
    options: IDiffEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneDiffEditor = js.native
  def createDiffNavigator(diffEditor: IStandaloneDiffEditor): IDiffNavigator = js.native
  def createDiffNavigator(diffEditor: IStandaloneDiffEditor, opts: IDiffNavigatorOptions): IDiffNavigator = js.native
  def createModel(value: String): ITextModel = js.native
  def createModel(value: String, language: String): ITextModel = js.native
  def createModel(value: String, language: String, uri: Uri): ITextModel = js.native
  def createWebWorker[T](opts: IWebWorkerOptions): MonacoWebWorker[T] = js.native
  def defineTheme(themeName: String, themeData: IStandaloneThemeData): Unit = js.native
  def getModel(uri: Uri): ITextModel | Null = js.native
  def getModelMarkers(filter: AnonOwner): js.Array[IMarker] = js.native
  def getModels(): js.Array[ITextModel] = js.native
  def onDidChangeModelLanguage(listener: js.Function1[/* e */ AnonModel, Unit]): IDisposable = js.native
  def onDidCreateEditor(listener: js.Function1[/* codeEditor */ ICodeEditor, Unit]): IDisposable = js.native
  def onDidCreateModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
  def onWillDisposeModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
  def remeasureFonts(): Unit = js.native
  def setModelLanguage(model: ITextModel, languageId: String): Unit = js.native
  def setModelMarkers(model: ITextModel, owner: String, markers: js.Array[IMarkerData]): Unit = js.native
  def setTheme(themeName: String): Unit = js.native
  def tokenize(text: String, languageId: String): js.Array[js.Array[Token]] = js.native
}

