package typings.reactDashMonacoDashEditor

import org.scalablytyped.runtime.Instantiable0
import typings.monacoDashEditor.Anon_Model
import typings.monacoDashEditor.Anon_Owner
import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import typings.monacoDashEditor.monacoDashEditorMod.Token
import typings.monacoDashEditor.monacoDashEditorMod.Uri
import typings.monacoDashEditor.monacoDashEditorMod.editor.ICodeEditor
import typings.monacoDashEditor.monacoDashEditorMod.editor.IColorizerElementOptions
import typings.monacoDashEditor.monacoDashEditorMod.editor.IColorizerOptions
import typings.monacoDashEditor.monacoDashEditorMod.editor.IDiffEditorConstructionOptions
import typings.monacoDashEditor.monacoDashEditorMod.editor.IDiffNavigator
import typings.monacoDashEditor.monacoDashEditorMod.editor.IDiffNavigatorOptions
import typings.monacoDashEditor.monacoDashEditorMod.editor.IEditorConstructionOptions
import typings.monacoDashEditor.monacoDashEditorMod.editor.IEditorOverrideServices
import typings.monacoDashEditor.monacoDashEditorMod.editor.IMarker
import typings.monacoDashEditor.monacoDashEditorMod.editor.IMarkerData
import typings.monacoDashEditor.monacoDashEditorMod.editor.IStandaloneCodeEditor
import typings.monacoDashEditor.monacoDashEditorMod.editor.IStandaloneDiffEditor
import typings.monacoDashEditor.monacoDashEditorMod.editor.IStandaloneThemeData
import typings.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import typings.monacoDashEditor.monacoDashEditorMod.editor.IWebWorkerOptions
import typings.monacoDashEditor.monacoDashEditorMod.editor.MonacoWebWorker
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofeditor extends js.Object {
  var BareFontInfo: Instantiable0[typings.monacoDashEditor.monacoDashEditorMod.editor.BareFontInfo] = js.native
  val EditorType: Anon_ICodeEditor = js.native
  var FindMatch: Instantiable0[typings.monacoDashEditor.monacoDashEditorMod.editor.FindMatch] = js.native
  var FontInfo: Instantiable0[typings.monacoDashEditor.monacoDashEditorMod.editor.FontInfo] = js.native
  var InternalEditorOptions: Instantiable0[typings.monacoDashEditor.monacoDashEditorMod.editor.InternalEditorOptions] = js.native
  var TextModelResolvedOptions: Instantiable0[typings.monacoDashEditor.monacoDashEditorMod.editor.TextModelResolvedOptions] = js.native
  def colorize(text: String, languageId: String, options: IColorizerOptions): js.Promise[String] = js.native
  def colorizeElement(domNode: HTMLElement, options: IColorizerElementOptions): js.Promise[Unit] = js.native
  def colorizeModelLine(model: ITextModel, lineNumber: Double): String = js.native
  def colorizeModelLine(model: ITextModel, lineNumber: Double, tabSize: Double): String = js.native
  def create(domElement: HTMLElement): IStandaloneCodeEditor = js.native
  def create(domElement: HTMLElement, options: IEditorConstructionOptions): IStandaloneCodeEditor = js.native
  def create(domElement: HTMLElement, options: IEditorConstructionOptions, `override`: IEditorOverrideServices): IStandaloneCodeEditor = js.native
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
  def getModelMarkers(filter: Anon_Owner): js.Array[IMarker] = js.native
  def getModels(): js.Array[ITextModel] = js.native
  def onDidChangeModelLanguage(listener: js.Function1[/* e */ Anon_Model, Unit]): IDisposable = js.native
  def onDidCreateEditor(listener: js.Function1[/* codeEditor */ ICodeEditor, Unit]): IDisposable = js.native
  def onDidCreateModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
  def onWillDisposeModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
  def remeasureFonts(): Unit = js.native
  def setModelLanguage(model: ITextModel, languageId: String): Unit = js.native
  def setModelMarkers(model: ITextModel, owner: String, markers: js.Array[IMarkerData]): Unit = js.native
  def setTheme(themeName: String): Unit = js.native
  def tokenize(text: String, languageId: String): js.Array[js.Array[Token]] = js.native
}

