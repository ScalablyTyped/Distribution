package typings.qlik.mod

import typings.qlik.anon.GetContent
import typings.qlik.anon.NoInteraction
import typings.qlik.qlikStrings.CurrentSelections
import typings.qlik.qlikStrings.`0`
import typings.qlik.qlikStrings.`1`
import typings.qlik.qlikStrings.`2`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var variable: GetContent = js.native
  def addAlternateState(qStateName: String): js.Promise[_] = js.native
  def back(): js.Promise[_] = js.native
  def clearrAll(): js.Promise[_] = js.native
  def clearrAll(lockedAlso: js.UndefOr[scala.Nothing], state: String): js.Promise[_] = js.native
  def clearrAll(lockedAlso: Boolean): js.Promise[_] = js.native
  def clearrAll(lockedAlso: Boolean, state: String): js.Promise[_] = js.native
  def close(): Unit = js.native
  def createCube(qHyperCubeDef: HyperCubeDef): js.Promise[_] = js.native
  def createCube(qHyperCubeDef: HyperCubeDef, callback: js.Function1[/* hypercube */ HyperCube, Unit]): js.Promise[_] = js.native
   // TODO: Returns Promise<object Model>
  // TODO: createGenericobject
  // TODO: createList(qListobjectDef: ListobjectDef, callback?: (hypercube: TODO) => void): Promise<any>;
  // TODO: createTable(dimensions: Array<string | NxDimension>, measures: Array<string | NxMeasure>, options?: object): QTable;
  def destroySession(id: String): js.Promise[_] = js.native
  def doReload(): js.Promise[_] = js.native
  def doReload(qMode: js.UndefOr[scala.Nothing], qPartial: js.UndefOr[scala.Nothing], qDebug: Boolean): js.Promise[_] = js.native
  def doReload(qMode: js.UndefOr[scala.Nothing], qPartial: Boolean): js.Promise[_] = js.native
  def doReload(qMode: js.UndefOr[scala.Nothing], qPartial: Boolean, qDebug: Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_0(qMode: `0`): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_0(qMode: `0`, qPartial: js.UndefOr[scala.Nothing], qDebug: Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_0(qMode: `0`, qPartial: Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_0(qMode: `0`, qPartial: Boolean, qDebug: Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_1(qMode: `1`): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_1(qMode: `1`, qPartial: js.UndefOr[scala.Nothing], qDebug: Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_1(qMode: `1`, qPartial: Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_1(qMode: `1`, qPartial: Boolean, qDebug: Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_2(qMode: `2`): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_2(qMode: `2`, qPartial: js.UndefOr[scala.Nothing], qDebug: Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_2(qMode: `2`, qPartial: Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_2(qMode: `2`, qPartial: Boolean, qDebug: Boolean): js.Promise[_] = js.native
  def doSave(): js.Promise[_] = js.native
  def doSave(qFileName: String): js.Promise[_] = js.native
  def field(field: String): QField = js.native
  def field(field: String, state: String): QField = js.native
  def forward(): js.Promise[_] = js.native
  def getAppLayout(callback: js.Function1[/* layout */ Layout, Unit]): js.Promise[_] = js.native
  // getAppobjectList(type: 'sheet' | 'masterobject', callback: (list: ))
  def getFullPropertyTree(id: String): js.Promise[_] = js.native
  def getSnapshot(): js.Promise[_] = js.native
  def getSnapshot(elem: js.UndefOr[scala.Nothing], id: String): js.Promise[_] = js.native
  def getSnapshot(elem: String): js.Promise[_] = js.native
  def getSnapshot(elem: String, id: String): js.Promise[_] = js.native
  def getSnapshot(elem: HTMLElement): js.Promise[_] = js.native
  def getSnapshot(elem: HTMLElement, id: String): js.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(): js.Promise[_] = js.native
  def getobject(elem: js.UndefOr[scala.Nothing], id: js.UndefOr[scala.Nothing], options: NoInteraction): js.Promise[_] = js.native
  def getobject(elem: js.UndefOr[scala.Nothing], id: String): js.Promise[_] = js.native
  def getobject(elem: js.UndefOr[scala.Nothing], id: String, options: NoInteraction): js.Promise[_] = js.native
  def getobject(elem: String): js.Promise[_] = js.native
  def getobject(elem: String, id: js.UndefOr[scala.Nothing], options: NoInteraction): js.Promise[_] = js.native
  def getobject(elem: String, id: String): js.Promise[_] = js.native
  def getobject(elem: String, id: String, options: NoInteraction): js.Promise[_] = js.native
  def getobject(elem: HTMLElement): js.Promise[_] = js.native
  def getobject(elem: HTMLElement, id: js.UndefOr[scala.Nothing], options: NoInteraction): js.Promise[_] = js.native
  def getobject(elem: HTMLElement, id: String): js.Promise[_] = js.native
  def getobject(elem: HTMLElement, id: String, options: NoInteraction): js.Promise[_] = js.native
  def getobjectProperties(id: String): js.Promise[_] = js.native
  @JSName("getobject")
  def getobject_CurrentSelections(elem: js.UndefOr[scala.Nothing], id: CurrentSelections): js.Promise[_] = js.native
  @JSName("getobject")
  def getobject_CurrentSelections(elem: js.UndefOr[scala.Nothing], id: CurrentSelections, options: NoInteraction): js.Promise[_] = js.native
  @JSName("getobject")
  def getobject_CurrentSelections(elem: String, id: CurrentSelections): js.Promise[_] = js.native
  @JSName("getobject")
  def getobject_CurrentSelections(elem: String, id: CurrentSelections, options: NoInteraction): js.Promise[_] = js.native
  @JSName("getobject")
  def getobject_CurrentSelections(elem: HTMLElement, id: CurrentSelections): js.Promise[_] = js.native
  @JSName("getobject")
  def getobject_CurrentSelections(elem: HTMLElement, id: CurrentSelections, options: NoInteraction): js.Promise[_] = js.native
  def lockAll(): js.Promise[_] = js.native
  def lockAll(state: String): js.Promise[_] = js.native
  def removeAlternateState(qStateName: String): js.Promise[_] = js.native
  // searchResults(qTerms: any[], qPage)
  // searchSuggest(qTerms: any[], qOptions: { qSearchFields: any[] }, ): Promise<any>;
  // selectAssociations
  // selectionState(state?: string): QSelectionState;
  def unlockAll(): js.Promise[_] = js.native
  def unlockAll(state: String): js.Promise[_] = js.native
}

