package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var variable: qlikLib.Anon_GetContent = js.native
  def addAlternateState(qStateName: java.lang.String): js.Promise[_] = js.native
  def back(): js.Promise[_] = js.native
  def clearrAll(): js.Promise[_] = js.native
  def clearrAll(lockedAlso: scala.Boolean): js.Promise[_] = js.native
  def clearrAll(lockedAlso: scala.Boolean, state: java.lang.String): js.Promise[_] = js.native
  def close(): scala.Unit = js.native
  def createCube(qHyperCubeDef: HyperCubeDef): js.Promise[_] = js.native
  def createCube(qHyperCubeDef: HyperCubeDef, callback: js.Function1[/* hypercube */ HyperCube, scala.Unit]): js.Promise[_] = js.native
   // TODO: Returns Promise<object Model>
  // TODO: createGenericobject
  // TODO: createList(qListobjectDef: ListobjectDef, callback?: (hypercube: TODO) => void): Promise<any>;
  // TODO: createTable(dimensions: Array<string | NxDimension>, measures: Array<string | NxMeasure>, options?: object): QTable;
  def destroySession(id: java.lang.String): js.Promise[_] = js.native
  def doReload(): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_0(qMode: qlikLib.qlikLibStrings.`0`): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_0(qMode: qlikLib.qlikLibStrings.`0`, qPartial: scala.Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_0(qMode: qlikLib.qlikLibStrings.`0`, qPartial: scala.Boolean, qDebug: scala.Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_1(qMode: qlikLib.qlikLibStrings.`1`): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_1(qMode: qlikLib.qlikLibStrings.`1`, qPartial: scala.Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_1(qMode: qlikLib.qlikLibStrings.`1`, qPartial: scala.Boolean, qDebug: scala.Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_2(qMode: qlikLib.qlikLibStrings.`2`): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_2(qMode: qlikLib.qlikLibStrings.`2`, qPartial: scala.Boolean): js.Promise[_] = js.native
  @JSName("doReload")
  def doReload_2(qMode: qlikLib.qlikLibStrings.`2`, qPartial: scala.Boolean, qDebug: scala.Boolean): js.Promise[_] = js.native
  def doSave(): js.Promise[_] = js.native
  def doSave(qFileName: java.lang.String): js.Promise[_] = js.native
  def field(field: java.lang.String): QField = js.native
  def field(field: java.lang.String, state: java.lang.String): QField = js.native
  def forward(): js.Promise[_] = js.native
  def getAppLayout(callback: js.Function1[/* layout */ Layout, scala.Unit]): js.Promise[_] = js.native
  // getAppobjectList(type: 'sheet' | 'masterobject', callback: (list: ))
  def getFullPropertyTree(id: java.lang.String): js.Promise[_] = js.native
  def getSnapshot(): js.Promise[_] = js.native
  def getSnapshot(elem: java.lang.String): js.Promise[_] = js.native
  def getSnapshot(elem: java.lang.String, id: java.lang.String): js.Promise[_] = js.native
  def getSnapshot(elem: stdLib.HTMLElement): js.Promise[_] = js.native
  def getSnapshot(elem: stdLib.HTMLElement, id: java.lang.String): js.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(): js.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(elem: java.lang.String): js.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(elem: java.lang.String, id: java.lang.String): js.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(elem: java.lang.String, id: java.lang.String, options: qlikLib.Anon_NoSelections): js.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(elem: stdLib.HTMLElement): js.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(elem: stdLib.HTMLElement, id: java.lang.String): js.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(elem: stdLib.HTMLElement, id: java.lang.String, options: qlikLib.Anon_NoSelections): js.Promise[_] = js.native
  def getobjectProperties(id: java.lang.String): js.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  @JSName("getobject")
  def getobject_CurrentSelections(elem: java.lang.String, id: qlikLib.qlikLibStrings.CurrentSelections): js.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  @JSName("getobject")
  def getobject_CurrentSelections(
    elem: java.lang.String,
    id: qlikLib.qlikLibStrings.CurrentSelections,
    options: qlikLib.Anon_NoSelections
  ): js.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  @JSName("getobject")
  def getobject_CurrentSelections(elem: stdLib.HTMLElement, id: qlikLib.qlikLibStrings.CurrentSelections): js.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  @JSName("getobject")
  def getobject_CurrentSelections(
    elem: stdLib.HTMLElement,
    id: qlikLib.qlikLibStrings.CurrentSelections,
    options: qlikLib.Anon_NoSelections
  ): js.Promise[_] = js.native
  def lockAll(): js.Promise[_] = js.native
  def lockAll(state: java.lang.String): js.Promise[_] = js.native
  def removeAlternateState(qStateName: java.lang.String): js.Promise[_] = js.native
  // searchResults(qTerms: any[], qPage)
  // searchSuggest(qTerms: any[], qOptions: { qSearchFields: any[] }, ): Promise<any>;
  // selectAssociations
  // selectionState(state?: string): QSelectionState;
  def unlockAll(): js.Promise[_] = js.native
  // searchResults(qTerms: any[], qPage)
  // searchSuggest(qTerms: any[], qOptions: { qSearchFields: any[] }, ): Promise<any>;
  // selectAssociations
  // selectionState(state?: string): QSelectionState;
  def unlockAll(state: java.lang.String): js.Promise[_] = js.native
}

