package typings.qlik.mod

import typings.qlik.anon.GetContent
import typings.qlik.anon.NoInteraction
import typings.qlik.qlikStrings.CurrentSelections
import typings.qlik.qlikStrings.`0`
import typings.qlik.qlikStrings.`1`
import typings.qlik.qlikStrings.`2`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends StObject {
  
  def addAlternateState(qStateName: String): js.Promise[Any] = js.native
  
  def back(): js.Promise[Any] = js.native
  
  def clearrAll(): js.Promise[Any] = js.native
  def clearrAll(lockedAlso: Boolean): js.Promise[Any] = js.native
  def clearrAll(lockedAlso: Boolean, state: String): js.Promise[Any] = js.native
  def clearrAll(lockedAlso: Unit, state: String): js.Promise[Any] = js.native
  
  def close(): Unit = js.native
  
  def createCube(qHyperCubeDef: HyperCubeDef): js.Promise[Any] = js.native
  def createCube(qHyperCubeDef: HyperCubeDef, callback: js.Function1[/* hypercube */ HyperCube, Unit]): js.Promise[Any] = js.native
  
  // TODO: Returns Promise<object Model>
  // TODO: createGenericobject
  // TODO: createList(qListobjectDef: ListobjectDef, callback?: (hypercube: TODO) => void): Promise<any>;
  // TODO: createTable(dimensions: Array<string | NxDimension>, measures: Array<string | NxMeasure>, options?: object): QTable;
  def destroySession(id: String): js.Promise[Any] = js.native
  
  def doReload(): js.Promise[Any] = js.native
  def doReload(qMode: `0` | `1` | `2`): js.Promise[Any] = js.native
  def doReload(qMode: `0` | `1` | `2`, qPartial: Boolean): js.Promise[Any] = js.native
  def doReload(qMode: `0` | `1` | `2`, qPartial: Boolean, qDebug: Boolean): js.Promise[Any] = js.native
  def doReload(qMode: `0` | `1` | `2`, qPartial: Unit, qDebug: Boolean): js.Promise[Any] = js.native
  def doReload(qMode: Unit, qPartial: Boolean): js.Promise[Any] = js.native
  def doReload(qMode: Unit, qPartial: Boolean, qDebug: Boolean): js.Promise[Any] = js.native
  def doReload(qMode: Unit, qPartial: Unit, qDebug: Boolean): js.Promise[Any] = js.native
  
  def doSave(): js.Promise[Any] = js.native
  def doSave(qFileName: String): js.Promise[Any] = js.native
  
  def field(field: String): QField = js.native
  def field(field: String, state: String): QField = js.native
  
  def forward(): js.Promise[Any] = js.native
  
  def getAppLayout(callback: js.Function1[/* layout */ Layout, Unit]): js.Promise[Any] = js.native
  
  // getAppobjectList(type: 'sheet' | 'masterobject', callback: (list: ))
  def getFullPropertyTree(id: String): js.Promise[Any] = js.native
  
  def getSnapshot(): js.Promise[Any] = js.native
  def getSnapshot(elem: String): js.Promise[Any] = js.native
  def getSnapshot(elem: String, id: String): js.Promise[Any] = js.native
  def getSnapshot(elem: Unit, id: String): js.Promise[Any] = js.native
  def getSnapshot(elem: HTMLElement): js.Promise[Any] = js.native
  def getSnapshot(elem: HTMLElement, id: String): js.Promise[Any] = js.native
  
  // getList(type: ListTypes, callback): Promise<any>;
  def getobject(): js.Promise[Any] = js.native
  def getobject(elem: String): js.Promise[Any] = js.native
  def getobject(elem: String, id: String): js.Promise[Any] = js.native
  def getobject(elem: String, id: String, options: NoInteraction): js.Promise[Any] = js.native
  def getobject(elem: String, id: Unit, options: NoInteraction): js.Promise[Any] = js.native
  def getobject(elem: Unit, id: String): js.Promise[Any] = js.native
  def getobject(elem: Unit, id: String, options: NoInteraction): js.Promise[Any] = js.native
  def getobject(elem: Unit, id: Unit, options: NoInteraction): js.Promise[Any] = js.native
  def getobject(elem: HTMLElement): js.Promise[Any] = js.native
  def getobject(elem: HTMLElement, id: String): js.Promise[Any] = js.native
  def getobject(elem: HTMLElement, id: String, options: NoInteraction): js.Promise[Any] = js.native
  def getobject(elem: HTMLElement, id: Unit, options: NoInteraction): js.Promise[Any] = js.native
  
  def getobjectProperties(id: String): js.Promise[Any] = js.native
  
  @JSName("getobject")
  def getobject_CurrentSelections(elem: String, id: CurrentSelections): js.Promise[Any] = js.native
  @JSName("getobject")
  def getobject_CurrentSelections(elem: String, id: CurrentSelections, options: NoInteraction): js.Promise[Any] = js.native
  @JSName("getobject")
  def getobject_CurrentSelections(elem: Unit, id: CurrentSelections): js.Promise[Any] = js.native
  @JSName("getobject")
  def getobject_CurrentSelections(elem: Unit, id: CurrentSelections, options: NoInteraction): js.Promise[Any] = js.native
  @JSName("getobject")
  def getobject_CurrentSelections(elem: HTMLElement, id: CurrentSelections): js.Promise[Any] = js.native
  @JSName("getobject")
  def getobject_CurrentSelections(elem: HTMLElement, id: CurrentSelections, options: NoInteraction): js.Promise[Any] = js.native
  
  def lockAll(): js.Promise[Any] = js.native
  def lockAll(state: String): js.Promise[Any] = js.native
  
  def removeAlternateState(qStateName: String): js.Promise[Any] = js.native
  
  // searchResults(qTerms: any[], qPage)
  // searchSuggest(qTerms: any[], qOptions: { qSearchFields: any[] }, ): Promise<any>;
  // selectAssociations
  // selectionState(state?: string): QSelectionState;
  def unlockAll(): js.Promise[Any] = js.native
  def unlockAll(state: String): js.Promise[Any] = js.native
  
  var variable: GetContent = js.native
}
