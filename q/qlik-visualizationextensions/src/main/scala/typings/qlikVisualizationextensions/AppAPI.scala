package typings.qlikVisualizationextensions

import typings.angular.mod.IPromise
import typings.qlikVisualizationextensions.FieldAPI.IQField
import typings.qlikVisualizationextensions.SelectionStateAPI.IQSelectionState
import typings.qlikVisualizationextensions.TableAPI.IQTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppAPI {
  
  @js.native
  trait IApp extends StObject {
    
    /**
      * Adds an alternate state in the app. Multiple states within a Qlik Sense
      * app can be created and applied to specific objects within the app.
      * Objects in a given state are not affected by user selection in the other states.
      * @param qStateName - Mandatory. Alternate state name.
      * @return - A promise of a Qlik engine reply.
      */
    def addAlternateState(qStateName: String): IPromise[js.Any] = js.native
    
    /**
      * Steps back in the list of selections.
      * @return - A promise of a Qlik engine reply.
      */
    def back(): IPromise[js.Any] = js.native
    
    /**
      * Clears all selections in all fields of the current Qlik Sense app.
      * @param [lockedAlso] - Optional. Alternate state name. Default: false Introduced in version 2.1.
      * @param [state] - Optional. Alternate state name. Default: $ Introduced in version 2.1.
      * @return - A promise of a Qlik engine reply.
      */
    def clearAll(): IPromise[js.Any] = js.native
    def clearAll(lockedAlso: Boolean): IPromise[js.Any] = js.native
    def clearAll(lockedAlso: Boolean, state: String): IPromise[js.Any] = js.native
    def clearAll(lockedAlso: Unit, state: String): IPromise[js.Any] = js.native
    
    /**
      * Closes a Qlik Sense app. Also closes the WebSocket and clears out client side data.
      */
    def close(): Unit = js.native
    
    /**
      * Defines a hypercube and registers a callback to receive the data.
      * @param qHyperCubeDef - Cube definition.
      * @param [callback] - Optional. Callback method. Parameter will contain a qHyperCube.
      * @return - A promise of an object model.
      */
    def createCube(qHyperCubeDef: js.Any): IPromise[js.Any] = js.native
    def createCube(qHyperCubeDef: js.Any, callback: js.Any): IPromise[js.Any] = js.native
    
    /**
      * Creates a generic object and registers a callback to receive the data. The generic object can contain the following:
      *       # qHyperCubeDef
      *       # qListObjectDef
      *       # qStringExpression
      *       # qValueExpression
      * The callback method will be called whenever the selection state changes
      * in a way that affects the generic object.
      * The parameter will be the evaluated version of the definition.
      * @param [def] - Optional. Generic object definition
      * @param [callback] - Optional. Callback method.
      * @return - A promise of an object model.
      */
    def createGenericObject(): IPromise[js.Any] = js.native
    def createGenericObject(`def`: js.Any): IPromise[js.Any] = js.native
    def createGenericObject(`def`: js.Any, callback: js.Any): IPromise[js.Any] = js.native
    def createGenericObject(`def`: Unit, callback: js.Any): IPromise[js.Any] = js.native
    
    /**
      * Defines a list of field values and registers a callback to receive the data.
      * @param qListObjectDef - List definition.
      * @param [callback] - Optional. Callback method. Parameter will contain a qListObject.
      * @return - A promise of an object model.
      */
    def createList(qListObjectDef: js.Any): IPromise[js.Any] = js.native
    def createList(qListObjectDef: js.Any, callback: js.Any): IPromise[js.Any] = js.native
    
    /**
      * Defines a hypercube for a table and is the entry point to the Table API.
      * It creates a table object that wraps the hypercube.
      * @param dimensions - Dimensions to use.
      * Should, for each entry, be a field name or a NxDimension structure.
      * @param measures - Measures to use.
      * Should, for each entry, be an expression or a NxMeasure structure.
      * @param [options] - Optional. Options to set.
      * @return - A table object of type QTable, which is initially
      *                    empty but that eventually will contain data.
      *                    The table object will be updated when selection state changes.
      */
    def createTable(dimensions: js.Array[js.Any | String], measures: js.Array[js.Any | String]): IQTable = js.native
    def createTable(dimensions: js.Array[js.Any | String], measures: js.Array[js.Any | String], options: js.Any): IQTable = js.native
    
    /**
      * Destroys a Qlik Sense session object created with the createGenericObject
      * method or any of createCube, createList or getList methods.
      * Calling this method removes the object from the Qlik engine,
      * no more updates are sent to the client and all methods on the object are invalid.
      * @param id - Session object id.
      * @return - A promise of a Qlik engine reply.
      */
    def destroySessionObject(id: String): IPromise[js.Any] = js.native
    
    /**
      * Reloads the data in a Qlik Sense app.
      * @param [qMode] - Optional. Error handling mode:
      *       # 0 = default mode.
      *       # 1 = attempt recovery on all errors.
      *       # 2 = fail on all errors.
      * @param [qPartial] - Optional. Set to true for partial reload.
      * @param [qDebug] - Optional. Set to true if debug breakpoints are honored. Execution of the script will be in debug mode.
      * @return - A promise of a Qlik engine reply.
      */
    def doReload(): IPromise[js.Any] = js.native
    def doReload(qMode: String): IPromise[js.Any] = js.native
    def doReload(qMode: String, qPartial: Boolean): IPromise[js.Any] = js.native
    def doReload(qMode: String, qPartial: Boolean, qDebug: Boolean): IPromise[js.Any] = js.native
    def doReload(qMode: String, qPartial: Unit, qDebug: Boolean): IPromise[js.Any] = js.native
    def doReload(qMode: Unit, qPartial: Boolean): IPromise[js.Any] = js.native
    def doReload(qMode: Unit, qPartial: Boolean, qDebug: Boolean): IPromise[js.Any] = js.native
    def doReload(qMode: Unit, qPartial: Unit, qDebug: Boolean): IPromise[js.Any] = js.native
    
    /**
      * Saves a Qlik Sense app, including all objects and data in the data model.
      * @param [qFileName] - Optional. File name of the file to save.
      * @return - A promise of a Qlik engine reply.
      */
    def doSave(): IPromise[js.Any] = js.native
    def doSave(qFileName: String): IPromise[js.Any] = js.native
    
    /**
      * Gets a field reference with methods that can be used to manipulate the field.
      * @param [field] - Optional. Name of the field.
      * @param [state] - Optional. Alternate state name. Default is $.
      * @return - A QField object with methods and properties that can be used to manipulate the field.
      */
    def field(): IQField = js.native
    def field(field: String): IQField = js.native
    def field(field: String, state: String): IQField = js.native
    def field(field: Unit, state: String): IQField = js.native
    
    /**
      * Step forward in list of selections.
      * @return - A promise of a Qlik engine reply.
      */
    def forward(): IPromise[js.Any] = js.native
    
    /**
      * Gets a layout for this Qlik Sense app and registers a callback to receive the data.
      * Returns the dynamic properties (if any) in addition to the fixed properties.
      * @param [callback] - Optional. Callback method.
      * @return - A promise of a Qlik engine reply.
      */
    def getAppLayout(): IPromise[js.Any] = js.native
    def getAppLayout(callback: js.Any): IPromise[js.Any] = js.native
    
    /**
      * Gets a list of sheets and visualizations and registers a callback to receive the data.
      * @param [field] - Optional. Type of object. One of:
      *        # sheet
      *        # masterobject
      * Default is sheet.
      * @param [callback] - Optional. Callback method.
      */
    def getAppObjectList(): Unit = js.native
    def getAppObjectList(`type`: String): Unit = js.native
    def getAppObjectList(`type`: String, callback: js.Any): Unit = js.native
    def getAppObjectList(`type`: Unit, callback: js.Any): Unit = js.native
    
    /**
      * Gets properties for a generic object, the children of the generic object
      * and the bookmarks and/or embedded snapshots of the generic object.
      * @param id - Object id.
      * @return - A promise of an object model.
      */
    def getFullPropertyTree(id: String): IPromise[js.Any] = js.native
    
    /**
      * Gets a list of internal Qlik Sense objects and registers a callback to receive the data.
      * @param type - Type of object:
      *       # FieldList
      *       # MeasureList
      *       # DimensionList
      *       # BookmarkList
      *       # SelectionObject
      *       # SnapshotList (Introduced in version 1.1)
      *       # MediaList (Introduced in version 1.1)
      *       # Sheet (Introduced in version 1.1)
      *       # MasterObject (Introduced in version 1.1)
      *       # VariableList (Introduced in version 2.0)
      *       # story (Introduced in version 2.1)
      * @param [callback] - Optional. Registers a callback that is executed every time data is returned.
      * @return - A promise of an object model.
      */
    def getList(`type`: String): IPromise[js.Any] = js.native
    def getList(`type`: String, callback: js.Any): IPromise[js.Any] = js.native
    
    /**
      * Retrieves a Qlik Sense object from the Qlik Sense application and inserts
      * it into a HTML element. The object fills the HTML object, so you can size
      * and position the element to determine how large the Qlik Sense object will be.
      * If you supply only one parameter, you get the model without displaying the object.
      * @param id - Object id or 'CurrentSelections' if used for Selections bar.
      * @param [elem] - Optional. HTML element.
      * Since version 1.1 it is also possible to define a string of the HTML element id.
      * @param [options] - Optional.
      * Name | Type | Description
      * noInteraction | Boolean | Set to true if you want to disable interaction,
      *                           including selections, in the visualization.
      *                           Introduced in version 1.1 and updated in version 3.0.
      * noSelections  | Boolean | Set to true if you want to disable selections in the visualization.
      *                           Introduced in version 3.0.
      * @return - A promise of an object model.
      */
    def getObject(id: String): IPromise[js.Any] = js.native
    def getObject(id: String, elem: String): IPromise[js.Any] = js.native
    def getObject(id: String, elem: String, options: js.Any): IPromise[js.Any] = js.native
    def getObject(id: String, elem: js.Any): IPromise[js.Any] = js.native
    def getObject(id: String, elem: js.Any, options: js.Any): IPromise[js.Any] = js.native
    def getObject(id: String, elem: Unit, options: js.Any): IPromise[js.Any] = js.native
    
    /**
      * Gets properties for a Qlik Sense object.
      * @param id - Object id.
      * @return - A promise of an object model.
      */
    def getObjectProperties(id: String): IPromise[js.Any] = js.native
    
    /**
      * Gets the data load script of this app.
      * @return - A promise of an qScript object.
      */
    def getScript(): IPromise[String] = js.native
    
    /**
      * Inserts a Qlik Sense snapshot into a HTML element. The snapshot fills
      * the HTML object so you can size and position the element to determine
      * how large the Qlik Sense object will be. If you only supply one parameter,
      * you will just get the model without displaying the object.
      * @param id - Snapshot ID.
      * @param [elem] - Optional. HTML element or string with HTML element id.
      * @return - A promise of an object model.
      */
    def getSnapshot(id: String): IPromise[js.Any] = js.native
    def getSnapshot(id: String, elem: String): IPromise[js.Any] = js.native
    def getSnapshot(id: String, elem: js.Any): IPromise[js.Any] = js.native
    
    /**
      * Locks all selections.
      * @param [state=$] - Optional. Alternate state name.
      * Default: $
      * Introduced in version 2.1.
      * @return - A promise of a Qlik engine reply.
      */
    def lockAll(): IPromise[js.Any] = js.native
    def lockAll(state: String): IPromise[js.Any] = js.native
    
    /**
      * Removes an alternate state in the app.
      * @param qStateName - Alternate state name.
      * @return - A promise of a Qlik engine reply.
      */
    def removeAlternateState(qStateName: String): IPromise[js.Any] = js.native
    
    /**
      * Searches for one or more terms in the values of a Qlik Sense app.
      * @param qTerms - Terms to search for.
      * @param qPage - Properties:
      * Name | Type | Description
      * qOffset | Number | Position from the top, starting from 0.
      * qCount | Number | Number of search results to return.
      * qMaxNbrFieldMatches | Number | Maximum number of matching values to return per search result.
      * @param qOptions - Properties
      * Name | Type | Description
      * qSearchFields | Array | List of search fields.
      * qContext | | Search context. Can be one of:
      *       # Cleared: In this mode, the first step is to clear any current selections in the app.
      *                  The second step is to search for one or more terms in the values of the app.
      *       # LockedFieldsOnly: In this mode, the search applies only to the values associated
      *                           with the selections made in locked fields, ignoring selections
      *                           in any unlocked field. If no locked fields, the behavior is
      *                           identical to the Cleared context. You cannot make any new selections
      *                           in a locked field. You can get search hits for the associated values
      *                           of a locked field but you cannot get the search hits for the non associative values.
      *       # CurrentSelections:In this mode, the current selections are kept (if any). Search
      *                           for one or more terms in the values of the app. New selections
      *                           are made on top of the current selections. If no selections were
      *                           made before the search, this mode is identical to the Cleared context.
      * | | Default value is LockedFieldsOnly.
      * @param [callback] - Optional. Callback method.
      * @return - A promise of a Qlik engine reply.
      */
    def searchAssociations(qTerms: js.Array[js.Any], qPage: js.Any, qOptions: js.Any): IPromise[js.Any] = js.native
    def searchAssociations(qTerms: js.Array[js.Any], qPage: js.Any, qOptions: js.Any, callback: js.Any): IPromise[js.Any] = js.native
    
    /**
      * Searches for one or more terms in the values of a Qlik Sense app.
      * @param qTerms - Terms to search for.
      * @param qPage - Properties:
      * Name | Type | Description
      * qOffset | Number | Position from the top, starting from 0.
      * qCount | Number | Number of search results to return.
      * qGroupOptions | Array | This parameter is optional. Options of the search groups. If this property is not set, all values are returned.
      * qGroupItemOptions | Array | This parameter is optional. Options of the search group items. If this property is not set, all values are returned.
      * qOptions | Object | Optional. Search options. Properties:
      * Name | Type | Description
      * qSearchFields | Array | List of search fields.
      * qContext | | Search context. Can be one of:
      *       # Cleared: In this mode, the first step is to clear any current selections in the app.
      *                  The second step is to search for one or more terms in the values of the app.
      *       # LockedFieldsOnly: In this mode, the search applies only to the values associated
      *                           with the selections made in locked fields, ignoring selections
      *                           in any unlocked field. If no locked fields, the behavior is
      *                           identical to the Cleared context. You cannot make any new selections
      *                           in a locked field. You can get search hits for the associated values
      *                           of a locked field but you cannot get the search hits for the non associative values.
      *       # CurrentSelections:In this mode, the current selections are kept (if any). Search
      *                           for one or more terms in the values of the app. New selections
      *                           are made on top of the current selections. If no selections were
      *                           made before the search, this mode is identical to the Cleared context.
      * | | Default value is LockedFieldsOnly.
      * @param [callback] - Optional. Callback method.
      * @return - A promise of a Qlik engine reply.
      */
    def searchResults(qTerms: js.Array[js.Any], qPage: js.Any): IPromise[js.Any] = js.native
    def searchResults(qTerms: js.Array[js.Any], qPage: js.Any, qOptions: js.Any): IPromise[js.Any] = js.native
    def searchResults(qTerms: js.Array[js.Any], qPage: js.Any, qOptions: js.Any, callback: js.Any): IPromise[js.Any] = js.native
    def searchResults(qTerms: js.Array[js.Any], qPage: js.Any, qOptions: Unit, callback: js.Any): IPromise[js.Any] = js.native
    
    /**
      * Returns suggestions of words from the values entered in the search. Acts as a helper for the searchAssociations method.
      * @param qTerms - Terms to search for.
      * @param [qOptions] - Optional. Search options. Properties:
      * Name | Type | Description
      * qSearchFields | Array | List of search fields.
      * @param [callback] - Optional. Callback method.
      * @return - A promise of a Qlik engine reply.
      */
    def searchSuggest(qTerms: js.Array[js.Any]): IPromise[js.Any] = js.native
    def searchSuggest(qTerms: js.Array[js.Any], qOptions: js.Any): IPromise[js.Any] = js.native
    def searchSuggest(qTerms: js.Array[js.Any], qOptions: js.Any, callback: js.Any): IPromise[js.Any] = js.native
    def searchSuggest(qTerms: js.Array[js.Any], qOptions: Unit, callback: js.Any): IPromise[js.Any] = js.native
    
    /**
      * Makes a selection based on searchAssociation results.
      * @param qMatchIx - Index to search result.
      * @param qTerms - Values to select.
      * @param qOptions - Values to select.
      * @param [qTerms] - Optional. Parameter sent to the Qlik engine containing information about the search fields and the search context.
      * @param [qSoftLock] - Optional. This parameter was deprecated in version 2.0 and is ignored in newer versions. Use the qOtions.qContext parameter instead.
      * @return - A promise of a Qlik engine reply.
      */
    def selectAssociations(qMatchIx: Double, qTerms: js.Array[js.Any]): IPromise[js.Any] = js.native
    def selectAssociations(qMatchIx: Double, qTerms: js.Array[js.Any], qOptions: js.Any): IPromise[js.Any] = js.native
    def selectAssociations(qMatchIx: Double, qTerms: js.Array[js.Any], qOptions: js.Any, qSoftLock: js.Any): IPromise[js.Any] = js.native
    def selectAssociations(qMatchIx: Double, qTerms: js.Array[js.Any], qOptions: Unit, qSoftLock: js.Any): IPromise[js.Any] = js.native
    
    /**
      * Sets the data load script of this app. Also validates the script syntax and returns the syntax errors if errors exist.
      * @param [state] - Optional. Sets the state. Default is $.
      */
    def selectionState(): IQSelectionState = js.native
    def selectionState(state: String): IQSelectionState = js.native
    
    /**
      * Creates a QSelectionState object that encapsulates the selection state. Entry point to the Selection API.
      * @param [script] - The script content.
      * @return - A promise of an empty object or a list of syntax errors depending on the validation result.
      */
    def setScript(script: String): IPromise[js.Any] = js.native
    
    /**
      * Unlocks all selections that has previously been locked.
      * @param [state] - Optional. Alternate state name. Default: $ Introduced in version 2.1.
      */
    def unlockAll(): IPromise[js.Any] = js.native
    def unlockAll(state: String): IPromise[js.Any] = js.native
  }
}
