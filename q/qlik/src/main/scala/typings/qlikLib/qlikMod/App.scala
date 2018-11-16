package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var variable: qlikLib.Anon_GetContent = js.native
  def addAlternateState(qStateName: java.lang.String): stdLib.Promise[_] = js.native
  def back(): stdLib.Promise[_] = js.native
  def clearrAll(): stdLib.Promise[_] = js.native
  def clearrAll(lockedAlso: scala.Boolean): stdLib.Promise[_] = js.native
  def clearrAll(lockedAlso: scala.Boolean, state: java.lang.String): stdLib.Promise[_] = js.native
  def close(): scala.Unit = js.native
  def createCube(qHyperCubeDef: HyperCubeDef): stdLib.Promise[_] = js.native
  def createCube(qHyperCubeDef: HyperCubeDef, callback: js.Function1[/* hypercube */ HyperCube, scala.Unit]): stdLib.Promise[_] = js.native
   // TODO: Returns Promise<object Model>
  // TODO: createGenericobject
  // TODO: createList(qListobjectDef: ListobjectDef, callback?: (hypercube: TODO) => void): Promise<any>;
  // TODO: createTable(dimensions: Array<string | NxDimension>, measures: Array<string | NxMeasure>, options?: object): QTable;
  def destroySession(id: java.lang.String): stdLib.Promise[_] = js.native
  def doReload(): stdLib.Promise[_] = js.native
  @JSName("doReload")
  def doReload_0(qMode: qlikLib.qlikLibStrings.`0`): stdLib.Promise[_] = js.native
  @JSName("doReload")
  def doReload_0(qMode: qlikLib.qlikLibStrings.`0`, qPartial: scala.Boolean): stdLib.Promise[_] = js.native
  @JSName("doReload")
  def doReload_0(qMode: qlikLib.qlikLibStrings.`0`, qPartial: scala.Boolean, qDebug: scala.Boolean): stdLib.Promise[_] = js.native
  @JSName("doReload")
  def doReload_1(qMode: qlikLib.qlikLibStrings.`1`): stdLib.Promise[_] = js.native
  @JSName("doReload")
  def doReload_1(qMode: qlikLib.qlikLibStrings.`1`, qPartial: scala.Boolean): stdLib.Promise[_] = js.native
  @JSName("doReload")
  def doReload_1(qMode: qlikLib.qlikLibStrings.`1`, qPartial: scala.Boolean, qDebug: scala.Boolean): stdLib.Promise[_] = js.native
  @JSName("doReload")
  def doReload_2(qMode: qlikLib.qlikLibStrings.`2`): stdLib.Promise[_] = js.native
  @JSName("doReload")
  def doReload_2(qMode: qlikLib.qlikLibStrings.`2`, qPartial: scala.Boolean): stdLib.Promise[_] = js.native
  @JSName("doReload")
  def doReload_2(qMode: qlikLib.qlikLibStrings.`2`, qPartial: scala.Boolean, qDebug: scala.Boolean): stdLib.Promise[_] = js.native
  def doSave(): stdLib.Promise[_] = js.native
  def doSave(qFileName: java.lang.String): stdLib.Promise[_] = js.native
  def field(field: java.lang.String): QField = js.native
  def field(field: java.lang.String, state: java.lang.String): QField = js.native
  def forward(): stdLib.Promise[_] = js.native
  def getAppLayout(callback: js.Function1[/* layout */ Layout, scala.Unit]): stdLib.Promise[_] = js.native
  // getAppobjectList(type: 'sheet' | 'masterobject', callback: (list: ))
  def getFullPropertyTree(id: java.lang.String): stdLib.Promise[_] = js.native
  def getSnapshot(): stdLib.Promise[_] = js.native
  def getSnapshot(elem: java.lang.String): stdLib.Promise[_] = js.native
  def getSnapshot(elem: java.lang.String, id: java.lang.String): stdLib.Promise[_] = js.native
  def getSnapshot(elem: stdLib.HTMLElement): stdLib.Promise[_] = js.native
  def getSnapshot(elem: stdLib.HTMLElement, id: java.lang.String): stdLib.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(): stdLib.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(elem: java.lang.String): stdLib.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(elem: java.lang.String, id: java.lang.String): stdLib.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(elem: java.lang.String, id: java.lang.String, options: qlikLib.Anon_NoSelections): stdLib.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(elem: stdLib.HTMLElement): stdLib.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(elem: stdLib.HTMLElement, id: java.lang.String): stdLib.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(elem: stdLib.HTMLElement, id: java.lang.String, options: qlikLib.Anon_NoSelections): stdLib.Promise[_] = js.native
  def getobjectProperties(id: java.lang.String): stdLib.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  @JSName("getobject")
  def getobject_CurrentSelections(elem: java.lang.String, id: qlikLib.qlikLibStrings.CurrentSelections): stdLib.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  @JSName("getobject")
  def getobject_CurrentSelections(
    elem: java.lang.String,
    id: qlikLib.qlikLibStrings.CurrentSelections,
    options: qlikLib.Anon_NoSelections
  ): stdLib.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  @JSName("getobject")
  def getobject_CurrentSelections(elem: stdLib.HTMLElement, id: qlikLib.qlikLibStrings.CurrentSelections): stdLib.Promise[_] = js.native
  // getList(type: ListTypes, callback): Promise<any>;
  @JSName("getobject")
  def getobject_CurrentSelections(
    elem: stdLib.HTMLElement,
    id: qlikLib.qlikLibStrings.CurrentSelections,
    options: qlikLib.Anon_NoSelections
  ): stdLib.Promise[_] = js.native
  def lockAll(): stdLib.Promise[_] = js.native
  def lockAll(state: java.lang.String): stdLib.Promise[_] = js.native
  def removeAlternateState(qStateName: java.lang.String): stdLib.Promise[_] = js.native
  // searchResults(qTerms: any[], qPage)
  // searchSuggest(qTerms: any[], qOptions: { qSearchFields: any[] }, ): Promise<any>;
  // selectAssociations
  // selectionState(state?: string): QSelectionState;
  def unlockAll(): stdLib.Promise[_] = js.native
  // searchResults(qTerms: any[], qPage)
  // searchSuggest(qTerms: any[], qOptions: { qSearchFields: any[] }, ): Promise<any>;
  // selectAssociations
  // selectionState(state?: string): QSelectionState;
  def unlockAll(state: java.lang.String): stdLib.Promise[_] = js.native
}

