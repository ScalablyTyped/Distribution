package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.anon.QBookmarkId
import typings.qlikEngineapi.anon.QDownloadInfo
import typings.qlikEngineapi.anon.QFields
import typings.qlikEngineapi.anon.QFormatSpec
import typings.qlikEngineapi.anon.QLineage
import typings.qlikEngineapi.anon.QName
import typings.qlikEngineapi.anon.Qk
import typings.qlikEngineapi.enigmaJS.IGeneratedAPI
import typings.qlikEngineapi.qlikEngineapiStrings.SlashqListObjectDef
import typings.std.MediaList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class describes all the methods that apply at app level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the app.
  */
@js.native
trait IApp
  extends IGeneratedAPI
     with IAppObjectPrototype[IGenericListProperties, IGenericList] {
  var global: IGlobal = js.native
  /**
    * Aborts any selection mode in an app. For more information about selection mode!
    * @param qAccept - Set this parameter to true to accept the selections before exiting the selection mode.
    * @returns - A promise of a Qlik engine reply.
    */
  def abortModal(qAccept: Boolean): js.Promise[Unit] = js.native
  /**
    * You can create multiple states within a Qlik Sense app and apply these states to specific objects within the app.
    * Objects in a given state are not affected by user selections in the other states.
    * @param qStateName - Name of the alternate state. >> This parameter is mandatory.
    * @returns - A promise of a Qlik engine reply.
    */
  def addAlternateState(qStateName: String): js.Promise[Unit] = js.native
  /**
    * Adds a field on the fly. The expression of a field on the fly is persisted but not its values.
    * @param qName - Name of the field.
    * @param qExpr - Expression value. It is not possible to use all aggregation functions.
    * For example, you cannot add a field on the fly with an expression that uses the Sum or Count aggregation functions.
    * @returns - true or false
    */
  def addFieldFromExpression(qName: String, qExpr: String): js.Promise[Boolean] = js.native
  /**
    * Applies a bookmark.
    * @param qId - Identifier of the bookmark.
    * @returns - true or false
    */
  def applyBookmark(qId: String): js.Promise[Boolean] = js.native
  /**
    * Loads the last logical operation (if any).
    * @returns"
    */
  def back(): js.Promise[Unit] = js.native
  /**
    * Returns the number of entries on the Back stack..
    * @returns - "qReturn": <Number of entries in the back stack>
    */
  def backCount(): js.Promise[Double] = js.native
  /**
    * Checks if a given expression is valid.
    *
    * Note: The expression is correct if the parameters qErrorMsg, qBadFieldNames and qDangerousFieldNames are empty.
    * @param qExpr - Expression to check..
    * @param qLabels - (Array of String) List of labels. This parameter is optional.
    * @returns - A promise of a Qlik engine reply.
    */
  def checkExpression(qExpr: String): js.Promise[ICheckExpressionResult] = js.native
  def checkExpression(qExpr: String, qLabels: js.Array[String]): js.Promise[ICheckExpressionResult] = js.native
  /**
    * Checks if:
    *
    * - a given expression is valid
    * - a number is correct according to the locale.
    *
    * Note: The expression is correct if the parameters qErrorMsg and qBadFieldNames are empty.
    * @param qExpr - Expression to check.
    * @returns - A promise of a Qlik engine reply.
    */
  def checkNumberOrExpression(qExpr: String): js.Promise[ICheckNumberOrExpressionResult] = js.native
  /**
    * Checks the syntax of a script.
    * If there are errors, the engine returns the following properties in the response:
    *
    * - qErrLen: (Integer) Length of the word where the error is located
    * - qTabIx: (Integer) Number of the faulty section
    * - qLineInTab: (Integer) Line number in the section where the error is located
    * - qColInLine: (Integer) Position of the erroneous text from the beginning of the line
    * - qTextPos: (Integer) Position of the erroneous text from the beginning of the script.
    * - qSecondaryFailure: (Boolean) The default value is false.
    *
    * Note: The first area is the primary error area, the second area is the secondary error area.
    * The second area is optional and is shown only if qSecondaryFailure is set to true.
    * The second area ends when the next statement in the script begins.
    */
  def checkScriptSyntax(): js.Promise[js.Array[IScriptSyntaxError]] = js.native
  /**
    * Clears all selections in all fields of the current app.
    * @param qLockedAlso - This parameter is optional. Default is false. Selections on locked fields are not cleared.
    *                                Set this parameter to true to clear all selections, including the locked fields.
    * @param qStateName - Name of the alternate state. If an alternate state is defined in qStateName, only the selections
    *                              related to this alternate state are cleared. This parameter is optional.
    *                              Default state is current selections.
    * @returns - A promise of a Qlik engine reply.
    */
  def clearAll(qLockedAlso: Boolean): js.Promise[Unit] = js.native
  def clearAll(qLockedAlso: Boolean, qStateName: String): js.Promise[Unit] = js.native
  @JSName("clearSelections")
  def clearSelections_qListObjectDef(qPath: SlashqListObjectDef): js.Promise[Unit] = js.native
  @JSName("clearSelections")
  def clearSelections_qListObjectDef(qPath: SlashqListObjectDef, qColIndices: js.Array[Double]): js.Promise[Unit] = js.native
  /**
    * Clears entirely the undo and redo buffer.
    * @returns - A promise of a Qlik engine reply.
    */
  def clearUndoBuffer(): js.Promise[Unit] = js.native
  /**
    * Clones a bookmark.
    *
    * @param qId - Identifier of the object to clone
    * @returns - A promise of a Qlik engine reply.
    */
  def cloneBookmark(qId: String): js.Promise[String] = js.native
  /**
    * Clones a dimension.
    *
    * Note: The identifier is set by the engine.
    * @param qId - Identifier of the object to clone
    * @returns - A promise of a Qlik engine reply.
    */
  def cloneDimension(qId: String): js.Promise[String] = js.native
  /**
    * Clones a measure.
    *
    * Note: The identifier is set by the engine.
    * @param qId - Identifier of the object to clone
    * @returns - A promise of a Qlik engine reply.
    */
  def cloneMeasure(qId: String): js.Promise[String] = js.native
  /**
    * Clones any visualizations, sheets and stories. The clone method works for both app objects and child objects.
    * When you clone an object that contains children, the children are cloned as well.
    *
    * Note: The identifier is set by the engine.
    * @param qId - Identifier of the object to clone
    * @returns - A promise of a Qlik engine reply.
    */
  def cloneObject(qId: String): js.Promise[String] = js.native
  /**
    * Commits the draft of an object that was previously created by invoking the CreateDraft method.
    * Committing a draft replaces the corresponding published object.
    *
    * Note: The identifier is set by the engine.
    * @param qId - Identifier of the draft to commit.
    * @returns - A promise of a Qlik engine reply.
    */
  def commitDraft(qId: String): js.Promise[Unit] = js.native
  /**
    * Creates a bookmark.
    * @param qProp - Information about the object. >> This parameter is mandatory.
    * @returns - A promise of a Qlik engine reply.
    */
  def createBookmark(qProp: IGenericBookmarkProperties): js.Promise[IGenericBookmark] = js.native
  /**
    * Creates a connection. A connection indicates from which data source, the data should be taken.
    * @param qConnection - Information about the connection. >> This parameter is mandatory.
    * @returns - returns a ConnectionId
    */
  def createConnection(qConnection: IConnection): js.Promise[String] = js.native
  /**
    * Creates a master dimension.
    * A master dimension is stored in the library of an app and can be used in many objects.
    * Several generic objects can contain the same dimension.
    * @param qProp - Information about the properties. >> This parameter is mandatory.
    * @returns - returns a GenericDimension object
    */
  def createDimension(qProp: IGenericDimensionProperties): js.Promise[IGenericDimension] = js.native
  /**
    * Creates a draft of an object.
    * This method can be used to create a draft of a sheet or a story that is published.
    * This is a way to continue working on a sheet or a story that is published.
    * Replace the published object by the content of the draft by invoking the CommitDraft method.
    *
    * Note: The identifier is set by the engine.
    * @param qId - Identifier of the object to create a draft from.
    * @returns - returns a DraftId
    */
  def createDraft(qId: String): js.Promise[String] = js.native
  /**
    * Creates a master measure.
    * A master measure is stored in the library of an app and can be used in many objects.
    * Several generic objects can contain the same measure.
    * @param gProp - Information about the properties >> This parameter is mandatory.
    * @returns - returns a GenericMeasure
    */
  def createMeasure(qProp: IGenericMeasureProperties): js.Promise[IGenericMeasure] = js.native
  def createObject(qProp: IGenericBookmarkListProperties): js.Promise[IBookmarkListObject] = js.native
  def createObject(qProp: IGenericDimensionsListProperties): js.Promise[IDimensionListObject] = js.native
  def createObject(qProp: IGenericFieldListProperties): js.Promise[IFieldListObject] = js.native
  def createObject(qProp: IGenericHyperCubeProperties): js.Promise[IHyperCubeObject] = js.native
  def createObject(qProp: IGenericMeasureListProperties): js.Promise[IMeassureListObject] = js.native
  /**
    * Creates a generic object at app level.
    * It is possible to create a generic object that is linked to another object.
    * A linked object is an object that points to a linking object.
    * The linking object is defined in the properties of the linked object (in qExtendsId).
    * The linked object has the same properties as the linking object.
    * Notre: The linking object cannot be a transient object.
    * @param gProp - Information about the properties >> This parameter is mandatory.
    * @returns - returns a GenericObject
    */
  def createObject(qProp: IGenericObjectProperties): js.Promise[IGenericObject] = js.native
  def createObject(qProp: IGenericSelectionListProperties): js.Promise[ISelectionListObject] = js.native
  def createObject(qProp: IGenericVariableListProperties): js.Promise[IVariableListObject] = js.native
  def createSessionObject(qProp: IGenericBookmarkListProperties): js.Promise[IBookmarkListObject] = js.native
  def createSessionObject(qProp: IGenericDimensionsListProperties): js.Promise[IDimensionListObject] = js.native
  def createSessionObject(qProp: IGenericFieldListProperties): js.Promise[IFieldListObject] = js.native
  def createSessionObject(qProp: IGenericHyperCubeProperties): js.Promise[IHyperCubeObject] = js.native
  def createSessionObject(qProp: IGenericMeasureListProperties): js.Promise[IMeassureListObject] = js.native
  /**
    * Creates a transient object. For example, you can use a transient object to create an app overview or a story overview.
    * It is possible to create a transient object that is linked to another object.
    * A linked object is an object that points to a linking object.
    * The linking object is defined in the properties of the linked object (in qExtendsId).
    * The linked object has the same properties as the linking object.
    * @param gProp - Information about the properties >> This parameter is mandatory.
    * @returns - returns a GenericObject
    */
  def createSessionObject(qProp: IGenericObjectProperties): js.Promise[IGenericObject] = js.native
  def createSessionObject(qProp: IGenericSelectionListProperties): js.Promise[ISelectionListObject] = js.native
  def createSessionObject(qProp: IGenericVariableListProperties): js.Promise[IVariableListObject] = js.native
  /**
    * Creates a transient variable.
    * @param gProp - Name of the variable. Variable names are case sensitive.
    * >> This parameter is mandatory.
    * @returns - returns a GenericVariable
    */
  def createSessionVariable(qProp: IGenericVariableProperties): js.Promise[IGenericVariable] = js.native
  /**
    * Creates a variable.
    *
    * Note: This method is deprecated (not recommended to use). Use CreateVariableEx method instead.
    * @param qName - Name of the variable. Variable names are case sensitive. >> This parameter is mandatory.
    * @returns - returns a Boolean
    */
  def createVariable(qName: String): js.Promise[Boolean] = js.native
  /**
    * Creates a variable.
    *
    * Note: This method is deprecated (not recommended to use). Use CreateVariableEx method instead.
    * @param qProp - Name of the variable. Variable names are case sensitive and must be unique.
    *                                             >> This parameter is mandatory.
    * @returns - returns a NxInfo. Identifier and type of the object. >> This parameter is mandatory.
    */
  def createVariableEx(qProp: IGenericVariableProperties): js.Promise[INxInfo] = js.native
  /**
    * Deletes a connection.
    * The AttachedFiles connection can only be removed by the administrator of the system.
    *
    * Note: In Qlik Sense Enterprise, there is an additional file connection named AttachedFiles.
    * @param qConnectionId - Identifier of the connection to remove. >> This parameter is mandatory.
    * @returns - A promise of a Qlik engine reply.
    */
  def deleteConnection(qConnectionId: String): js.Promise[Unit] = js.native
  /**
    * Removes a bookmark.
    *
    * Note: The operation is successful if qSuccess is set to true.
    * @param qId - Identifier of the bookmark
    * @returns - A promise of  Boolean
    */
  def destroyBookmark(qId: String): js.Promise[Boolean] = js.native
  /**
    * Removes a dimension.
    *
    * Note: The operation is successful if qSuccess is set to true.
    * @param qId - Identifier of the dimension to remove. >> This parameter is mandatory.
    * @returns - A promise of  Boolean
    */
  def destroyDimension(qId: String): js.Promise[Boolean] = js.native
  /**
    * Removes a dimension.
    *
    * Note: The operation is successful if qSuccess is set to true.
    * @param qId - Identifier of the draft object to remove. >> This parameter is mandatory.
    * @param qSourceId - Identifier of the source object (the object from which a draft was created).
    * @returns - A promise of  Boolean
    */
  def destroyDraft(qId: String, qSourceId: String): js.Promise[Boolean] = js.native
  /**
    * Removes a generic measure.
    *
    * Note: The operation is successful if qSuccess is set to true.
    * @param qId - Identifier of the measure to remove. >> This parameter is mandatory.
    * @returns - A promise of  Boolean
    */
  def destroyMeasure(qId: String): js.Promise[Boolean] = js.native
  /**
    * Removes an app object.
    *
    * Note: The operation is successful if qSuccess is set to true.
    * @param qId - Identifier of the object to remove. >> This parameter is mandatory.
    * @returns - A promise of  Boolean
    */
  def destroyObject(qId: String): js.Promise[Boolean] = js.native
  /**
    * Removes a transient object.
    *
    * Note: The operation is successful if qSuccess is set to true.
    * @param qId - Identifier of the object to remove. >> This parameter is mandatory.
    * @returns - A promise of Boolean
    */
  def destroySessionObject(qId: String): js.Promise[Boolean] = js.native
  /**
    * Removes a transient variable.
    *
    * Note: The operation is successful if qSuccess is set to true.
    * @param qId - Identifier of the object to remove. >> This parameter is mandatory.
    * @returns - A promise of Boolean
    */
  def destroySessionVariable(qId: String): js.Promise[Boolean] = js.native
  /**
    * Removes a variable.
    *
    * Note: The operation is successful if qSuccess is set to true.
    * Script-defined variables cannot be removed using the DestroyVariableById method or the DestroyVariableByName method.
    * @param qId - Identifier of the variable.
    * @returns - A promise of Boolean
    */
  def destroyVariableById(qId: String): js.Promise[Boolean] = js.native
  /**
    * Removes a variable.
    *
    * Note: The operation is successful if qSuccess is set to true.
    * Script-defined variables cannot be removed using the DestroyVariableById method or the DestroyVariableByName method.
    * @param qName - Name of the variable..
    * @returns - A promise of Boolean
    */
  def destroyVariableByName(qName: String): js.Promise[Boolean] = js.native
  /**
    * Reloads the script that is set in an app.
    *
    * Note: The operation is successful if qSuccess is set to true.
    * @param qMode - Error handling mode.
    *
    * 0: for default mode
    * 1: for ABEND; the reload of the script ends if an error occurs
    * 2: for ignore; the reload of the script continues even if an error is detected in the script.
    *
    * This parameter is optional.
    * @param qPartial - Set to true for partial reload. This parameter is optional.
    * The default value is false.
    * @param qDebug - Set to true if debug breakpoints are to be honored.
    * The execution of the script will be in debug mode.
    * This parameter is optional. The default value is false.
    * @returns - A promise of Boolean
    */
  def doReload(): js.Promise[Boolean] = js.native
  def doReload(qMode: Double): js.Promise[Boolean] = js.native
  def doReload(qMode: Double, qPartial: Boolean): js.Promise[Boolean] = js.native
  def doReload(qMode: Double, qPartial: Boolean, qDebug: Boolean): js.Promise[Boolean] = js.native
  /**
    * Reloads the script that is set in an app and returns the path to the script log file.
    *
    * Note: A log file is created per reload.
    * @param qParams - This parameter is optional.
    * @returns - If the data load has successfully finished, no matter how the indexing behaves, true is returned.
    * This happens even if there is a timeout, a memory limit is reached or any other error occurs during the indexing.
    */
  def doReloadEx(): js.Promise[IDoReloadExResult] = js.native
  def doReloadEx(qParams: IDoReloadExParams): js.Promise[IDoReloadExResult] = js.native
  /**
    * Saves an app. All objects and data in the data model are saved.
    * Script-defined variables cannot be removed using the DestroyVariableById method or the DestroyVariableByName method.
    * @param qFileName - Name of the file to save. This parameter is optional.
    * @returns - A promise of a Qlik engine reply.
    */
  def doSave(): js.Promise[Unit] = js.native
  def doSave(qFileName: String): js.Promise[Unit] = js.native
  /**
    * Evaluates an expression as a string.
    * Script-defined variables cannot be removed using the DestroyVariableById method or the DestroyVariableByName method.
    * @param qExpression - Expression to evaluate.
    * @returns - return a expression evaluated as a string
    */
  def evaluate(qExpression: String): js.Promise[String] = js.native
  /**
    * Evaluates an expression as a dual.
    * Script-defined variables cannot be removed using the DestroyVariableById method or the DestroyVariableByName method.
    * @param qExpression - Expression to evaluate.
    * @returns - return a Promise with a FieldValue
    */
  def evaluateEx(qExpression: String): js.Promise[IFieldValue] = js.native
  /**
    * Export an Qlik QVF with a reduced datamodel
    * @param qOptions - qBookmarkId - bookmark to export
    *                   qExpires - download expires in [s]
    * @returns - return a Promise with the qDownloadInfo
    */
  def exportReducedData(): js.Promise[QDownloadInfo] = js.native
  def exportReducedData(qOptions: QBookmarkId): js.Promise[QDownloadInfo] = js.native
  /**
    * Retrieves any fields that belong to the same archipelago as the specified field and
    * that match at least one of the specified tags.
    * Tags set by Qlik Sense are prefixed by the $ sign.
    * @param qFieldName - Name of the field. This method looks for fields that
    * belong to the same archipelago as this specified field.
    * @param qTags - List of tags. This method looks for fields that match at least one of the tags in this list.
    * @returns - A promise of FieldValue.
    */
  def findMatchingFields(qFieldName: String, qTags: js.Array[String]): js.Promise[js.Array[INxMatchingFieldInfo]] = js.native
  /**
    * Loads the next logical operation (if any).
    * @returns - A promise of a Qlik engine reply.
    */
  def forward(): js.Promise[Unit] = js.native
  /**
    * Returns the number of entries on the Forward stack.
    * @returns - A promise and Number of entries in the forward stack
    */
  def forwardCount(): js.Promise[Double] = js.native
  /**
    * Returns the identifier and the type of any generic object in the app.
    * Script-defined variables cannot be removed using the DestroyVariableById method or the DestroyVariableByName method.
    * @param qInfos - (Array of NxInfo) Information about all generic objects in the app.
    * @returns - return a Promise Array of INxInfo
    */
  def getAllInfos(): js.Promise[js.Array[INxInfo]] = js.native
  /**
    * Returns dynamic properties (if any) in addition to the engine (fixed) properties.
    * Script-defined variables cannot be removed using the DestroyVariableById method or the DestroyVariableByName method.
    * @returns - return a Promise  of a data set NxAppLayout
    */
  def getAppLayout(): js.Promise[INxAppLayout] = js.native
  /**
    * Gets the properties of an app.
    * @returns - return a Promise of NxAppProperties qProp. Information about the properties of the app.
    */
  def getAppProperties(): js.Promise[INxAppProperties] = js.native
  /**
    * Computes a set of association scores for each pair of fields between two given tables that have been loaded in an app.
    * @param qTable1 - Name of the first table.
    * @param qTable2 - Name of the second table.
    * @returns - return a Promise of IAssociationScore qScore.
    */
  def getAssociationScores(qTable1: String, qTable2: String): js.Promise[IAssociationScore] = js.native
  /**
    * Returns the handle of a bookmark.
    * @param qId - Identifier of the bookmark.
    * @returns - return a Promise of IGenericBookmark.
    */
  def getBookmark(qId: String): js.Promise[IGenericBookmark] = js.native
  /**
    * Returns a list of bookmarks in the app.
    * @param qOptions - Information about the list of bookmarks.
    * @returns - return a Promise of INxContainerEntry.
    */
  def getBookmarks(qOptions: INxGetBookmarkOptions): js.Promise[INxContainerEntry[_]] = js.native
  /**
    * Retrieves a connection and returns:
    * - The creation time of the connection
    * - The identifier of the connection
    * - The type of the connection
    * - The name of the connection
    * - The connection string
    * @param qConnectionId - Identifier of the connection. >> This parameter is mandatory.
    * @returns - return a Connection.
    */
  def getConnection(qConnectionId: String): js.Promise[IConnection] = js.native
  /**
    * Lists the connections in an app.
    *
    * Note: In Qlik Sense Enterprise, there is an additional file connection named AttachedFiles.
    * This connection is stored in the Qlik Sense repository.
    * @returns - return a Promise of Array of Connection.
    */
  def getConnections(): js.Promise[js.Array[IConnection]] = js.native
  /**
    * Lists the content libraries.
    * To differentiate a global content library from an app specific content library,
    * you can check the property qAppSpecific.
    * If this property is set to true, it means that the content library is app specific.
    *
    * Note: There is always one specific content library per app.
    * @returns - return a Promise of ContentLibraryList.
    */
  def getContentLibraries(): js.Promise[IContentLibraryList] = js.native
  /**
    * Gives information about an ODBC, OLEDB or CUSTOM connection.
    * @param qConnectionId - Identifier of the connection. >> This parameter is mandatory.
    * @returns - return a Promise of DatabaseInfo.
    */
  def getDatabaseInfo(qConnectionId: String): js.Promise[IDatabaseInfo] = js.native
  /**
    * Lists the owners of a database for a ODBC, OLEDB or CUSTOM connection.
    * @param qConnectionId - Identifier of the connection. >> This parameter is mandatory.
    * @param qDatabase - Name of the database. >> This parameter is mandatory.
    * @returns - return a Promise Array of DatabaseOwner.
    */
  def getDatabaseOwners(qConnectionId: String): js.Promise[js.Array[IDatabaseOwner]] = js.native
  def getDatabaseOwners(qConnectionId: String, qDatabase: String): js.Promise[js.Array[IDatabaseOwner]] = js.native
  /**
    * Lists the fields inside a table of a database for a ODBC, OLEDB or CUSTOM connection.
    * @param qConnectionId - Identifier of the connection. >> This parameter is mandatory.
    * @param qDatabase - Name of the database. >> This parameter is mandatory.
    * (If qDatabase is not set then qOwner must be set.)
    * @param qOwner - Owner of the database. >> This parameter is mandatory.
    * (If qOwner is not set then qDatabase must be set.)
    * @param qTable - Name of the table. >> This parameter is mandatory.
    * @returns - return a Promise Array of DataField.
    */
  def getDatabaseTableFields(qConnectionId: String, qTable: String): js.Promise[js.Array[IDataField]] = js.native
  def getDatabaseTableFields(qConnectionId: String, qTable: String, qDatabase: String): js.Promise[js.Array[IDataField]] = js.native
  def getDatabaseTableFields(qConnectionId: String, qTable: String, qDatabase: String, qOwner: String): js.Promise[js.Array[IDataField]] = js.native
  /**
    * Retrieves the values of the specified table of a database for a ODBC, OLEDB or CUSTOM connection.
    * @param qConnectionId - Identifier of the connection. >> This parameter is mandatory.
    * @param qDatabase - Name of the database. >> This parameter is mandatory.
    * (If qDatabase is not set then qOwner must be set.)
    * @param qOwner - Owner of the database. >> This parameter is mandatory.
    * (If qOwner is not set then qDatabase must be set.)
    * @param qTable - Name of the table. >> This parameter is mandatory.
    * @returns - return a Promise Array of DataRecord.
    */
  def getDatabaseTablePreview(qConnectionId: String, qTable: String): js.Promise[js.Array[IDataRecord]] = js.native
  def getDatabaseTablePreview(qConnectionId: String, qTable: String, qDatabase: String): js.Promise[js.Array[IDataRecord]] = js.native
  def getDatabaseTablePreview(qConnectionId: String, qTable: String, qDatabase: String, qOwner: String): js.Promise[js.Array[IDataRecord]] = js.native
  /**
    * Lists the tables inside a database for a ODBC, OLEDB or CUSTOM connection.
    * @param qConnectionId - Identifier of the connection. >> This parameter is mandatory.
    * @param qDatabase - Name of the database. >> This parameter is mandatory.
    * (If qDatabase is not set then qOwner must be set.)
    * @param qOwner - Owner of the database. >> This parameter is mandatory.
    * (If qOwner is not set then qDatabase must be set.)
    * @returns - return a Promise Array of DataTable.
    */
  def getDatabaseTables(qConnectionId: String): js.Promise[js.Array[IDataTable]] = js.native
  def getDatabaseTables(qConnectionId: String, qDatabase: String): js.Promise[js.Array[IDataTable]] = js.native
  def getDatabaseTables(qConnectionId: String, qDatabase: String, qOwner: String): js.Promise[js.Array[IDataTable]] = js.native
  /**
    * Lists the databases inside a ODBC, OLEDB or CUSTOM data source.
    * @param qConnectionId - Identifier of the connection. >> This parameter is mandatory.
    * @returns - return a Promise Array of Database.
    */
  def getDatabases(qConnectionId: String): js.Promise[js.Array[IDatabase]] = js.native
  /**
    * Returns the handle of a dimension.
    * @param qId - Identifier of the dimension. >> This parameter is mandatory.
    * @returns - return a Promise GenericDimension.
    */
  def getDimension(qId: String): js.Promise[IGenericDimension] = js.native
  /**
    * Creates a script that contains one section.
    * This section contains Set statements that give localized information from the regional settings of the computer.
    *
    * Note: The computer regional settings are retrieved when the engine starts.
    * @param qLocalizedMainSection - Name of the script section. The default value is Main. This parameter is optional.
    * @returns - return a Promise <List of script variables>.
    */
  def getEmptyScript(): js.Promise[String] = js.native
  def getEmptyScript(qLocalizedMainSection: String): js.Promise[String] = js.native
  /**
    * Retrieves the variables that are tagged as favorite.
    * @returns - return a Promise     Array of String
    */
  def getFavoriteVariables(): js.Promise[js.Array[String]] = js.native
  /**
    * Retrieves the description of a field.
    * @param qFieldName - Name of the field. >> This parameter is mandatory.
    * @param qStateName - Name of the alternate state. This parameter is optional. Default state is current selections.
    * @returns - return a Promise of FieldDescription.
    */
  def getField(qFieldName: String): js.Promise[IField] = js.native
  def getField(qFieldName: String, qStateName: String): js.Promise[IField] = js.native
  /**
    * Retrieves the description of a field.
    * @param qFieldName - Name of the field. >> This parameter is mandatory
    * @returns - return a Promise of FieldDescription.
    */
  def getFieldDescription(qFieldName: String): js.Promise[IFieldDescription] = js.native
  /**
    * Fetches the Expression behind a Field that is declared with DECLARE FIELD DEFINITIO
    * @param qReadableName: name of a Field that is declared with DECLARE FIELD DEFINITION
    * @returns qname wich contains the expression
    */
  def getFieldOnTheFlyByName(qReadableName: String): js.Promise[QName] = js.native
  /**
    * Lists the fields of a table for a folder connection.
    * @param qConnectionId - Identifier of the connection. >> This parameter is mandatory.
    * @param qRelativePath - Path of the connection file. This parameter is optional.
    * @param qDataFormat - Type of the file.
    * @param qTable - Name of the table. This parameter must be set for XLS, XLSX, HTML and XML files.
    * @returns - return a Promise Array of DataField or String.
    */
  def getFileTableFields(qConnectionId: String, qDataFormat: IFileDataFormat, qTable: String): js.Promise[QFields] = js.native
  def getFileTableFields(qConnectionId: String, qDataFormat: IFileDataFormat, qTable: String, qRelativePath: String): js.Promise[QFields] = js.native
  /**
    * Lists the values in a table for a folder connection.
    * @param qConnectionId - Identifier of the connection. >> This parameter is mandatory.
    * @param qRelativePath - Path of the connection file. This parameter is optional.
    * @param qDataFormat - Type of the file.
    * @param qTable - Name of the table. This parameter must be set for XLS, XLSX, HTML and XML files.
    * @returns - return a Promise <Array of DataField> or <String>.
    */
  def getFileTablePreview(qConnectionId: String, qRelativePath: String, qDataFormat: IFileDataFormat, qTable: String): js.Promise[QFormatSpec] = js.native
  /**
    * Lists the tables for a folder connection.
    * @param qConnectionId - Identifier of the connection. >> This parameter is mandatory.
    * @param qRelativePath - Path of the connection file. This parameter is optional.
    * @param qDataFormat - Type of the file.
    * @returns - return a Promise Array of DataTable.
    */
  def getFileTables(qConnectionId: String, qRelativePath: String, qDataFormat: IFileDataFormat): js.Promise[js.Array[IDataTable]] = js.native
  /**
    * Lists the tables and fields of a JSON or XML file for a folder connection.
    * @param qConnectionId - Identifier of the connection. >> This parameter is mandatory.
    * @param qRelativePath - Path of the connection file. This parameter is optional.
    * @param qDataFormat - Type of the file.
    * @returns - return a Promise Array of DataTableEx.
    */
  def getFileTablesEx(qConnectionId: String, qRelativePath: String, qDataFormat: IFileDataFormat): js.Promise[js.Array[IDataTableEx]] = js.native
  /**
    * There are two ways to specify the directory to retrieve the files from:
    * - Enter the connection identifier; the directory associated to the connection is used.
    * - Enter the connection identifier and a relative path
    * @param qConnectionId - Identifier of the connection. >> This parameter is mandatory.
    * @param qRelativePath - Path of the connection file. This parameter is optional.
    * @returns - return a Promise Array of FolderItem.
    */
  def getFolderItemsForConnection(qConnectionId: String, qRelativePath: String): js.Promise[js.Array[IFolderItem]] = js.native
  /**
    * Gets the content of a file.
    * @param qLibPath - ["lib://CONNECTION_NAME\\<the name of the file you want to use>.txt"] or
    * - ["lib://Connection_Name\\<Folder under your connection>\\<the name of the file you want to use>.txt"]
    * - [ ] should be used when having a lib reference in the first variable.
    * @returns - return a Promise of String.
    */
  def getIncludeFileContent(qLibPath: String): js.Promise[String] = js.native
  /**
    * Returns the content of a library.
    * @param qName - Name of the content library. It corresponds to the property
    * qContentLibraryListItem/qName returned by the GetContentLibraries method.
    * @returns - return a Promise of StaticContentList.
    */
  def getLibraryContent(qName: String): js.Promise[IStaticContentList] = js.native
  /**
    * Returns the lineage of the datamodel.
    * @returns - return a Promise of qLineage.
    */
  def getLineage(): js.Promise[QLineage] = js.native
  /**
    * Retrieves locale information.
    * @returns - return a Promise of LocaleInfo.
    */
  def getLocaleInfo(): js.Promise[ILocaleInfo] = js.native
  /**
    * Returns a vector of loosely coupled state flags, one element for each table in the app.
    * so that the circular references do not create a loop.
    * Where <array of bytes> is an array of state flags, one for each table in the app.
    *
    * 0 means that the table is not loose
    * 1 means that the table is loose
    * 2 means that the table is always loose and cannot be unloose using the Qlik Engine API.
    *
    * Note: The last three values in the vector are extra values. These values are for internal use.
    * Note: In case of circular references, the engine automatically create loosely coupled tables
    * @returns - return a Promise <Array of bytes>.
    */
  def getLooselyCoupledVector(): js.Promise[js.Array[Double]] = js.native
  /**
    * Retrieves any fields that match all or one of the specified tags in the data model of an app.
    *
    * Note: Tags set by Qlik Sense are prefixed by the $ sign.
    * @param qTags - List of tags. Array of String
    * The GetMatchingFields method looks for fields that match one or all of the tags in this list,
    * depending on the value of qMatchingFieldMode.
    * @param qMatchingFieldMode - Matching field mode.
    * This parameter is optional.
    * The default value is 0.
    * @returns - return a Promise Array of NxMatchingFieldInfo.
    */
  def getMatchingFields(qTags: js.Array[String]): js.Promise[js.Array[INxMatchingFieldInfo]] = js.native
  def getMatchingFields(qTags: js.Array[String], qMatchingFieldMode: Boolean): js.Promise[js.Array[INxMatchingFieldInfo]] = js.native
  /**
    * Returns the handle of a measure.
    *
    * @param qId - Identifier of the measure. >> This parameter is mandatory.
    * @returns - return a Promise String GenericMeasure
    */
  def getMeasure(qId: String): js.Promise[IGenericMeasure] = js.native
  /**
    * Lists the media files.
    *
    * Note: This method is deprecated (not recommended to use). Use GetLibraryContent method instead.
    * @returns - return a Promise Boolean or MediaList
    */
  def getMediaList(): js.Promise[js.Array[MediaList]] = js.native
  /**
    * Returns the type of the app object and the corresponding handle.
    *
    * @param qId - Identifier of the measure. >> This parameter is mandatory.
    * @returns - return a Promise String GenericObject
    */
  def getObject(qId: String): js.Promise[IGenericObject] = js.native
  /**
    * Returns a list of objects in the app.
    *
    * @param qOptions - Information about the list of objects.
    * @returns - return a Promise array of NxContainerEntry.
    */
  def getObjects(qOptions: INxGetObjectOptions): js.Promise[INxContainerEntry[_]] = js.native
  /**
    * Shows the properties of an object.
    *
    * Returns the identifier and the definition of the measure.
    *
    * Note: If the member delta is set to true in the request object, only the delta is retrieved.
    * @returns - return a Promise GenericObject
    */
  def getProperties(): js.Promise[INxAppProperties] = js.native
  /**
    * Gets values in script.
    * @returns - return a Promise String <script values>
    */
  def getScript(): js.Promise[String] = js.native
  /**
    * Lists the breakpoints in the script of an app.
    *
    * Returns information about the breakpoints. <Array of EditorBreakpoint>
    * @returns - return a Promise Array of EditorBreakpoint
    */
  def getScriptBreakpoints(): js.Promise[js.Array[IEditorBreakpoint]] = js.native
  /**
    * Retrieves the data of a specific table.
    * @param qOffset - Position from the top
    * starting from 0.
    * If the offset is set to 0,
    * the rows starting from the position/index 0 are shown.
    * @param qRows - Number of rows to show.
    * @param qSyntheticMode - If this parameter is set to true, the internal data/table representation is shown.
    * Synthetic fields are present (if any).
    * @param qTableName - Name of the table.
    * @returns - return a Promise Array of TableRow.
    */
  def getTableData(qOffset: Double, qRows: Double, qSyntheticMode: Boolean, qTableName: String): js.Promise[js.Array[ITableRow]] = js.native
  /**
    * Returns:
    *
    * - the list of tables in an app and the fields inside each table
    * - the list of derived fields
    * - the list of key fields
    *
    * @param qWindowSize - Defines the size of the window that is used to display the results.
    * @param qNullSize - (no infos in help)
    * @param qCellHeight - Height of a cell in a table in pixels.
    * @param qSyntheticMode  One of:
    *   - true for internal table viewer
    *   - false for source table viewer
    *
    * >> This parameter is mandatory.
    * @param qIncludeSysVars - If set to true, the system variables are included.
    * @returns - return a Promise <Array of TableRecord> or <Array of SourceKeyRecord>
    */
  def getTablesAndKeys(
    qWindowSize: ISize,
    qNullSize: ISize,
    qCellHeight: Double,
    qSyntheticMode: Boolean,
    qIncludeSysVars: Boolean
  ): js.Promise[Qk] = js.native
  /**
    * Fetches updated variables after a statement execution.
    *
    * Returns: List of variables. <Array of TextMacro>
    * @returns - return a Promise Array of TextMacro
    */
  def getTextMacros(): js.Promise[js.Array[ITextMacro]] = js.native
  /**
    * Gets the handle of a variable.
    *
    * Note: This method is deprecated (not recommended to use).
    * Use GetVariableById method or GetVariableByName method instead.
    * @param qName - Name of the variable. >> This parameter is mandatory.
    * @returns - return a Promise Variable
    */
  def getVariable(qName: String): js.Promise[IVariable] = js.native
  /**
    * Gets the handle of a variable.
    * @param qId - Identifier of the variable. >> This parameter is mandatory.
    * @returns - return a Promise GenericVariable
    */
  def getVariableById(qId: String): js.Promise[IGenericVariable] = js.native
  /**
    * Gets the handle of a variable.
    * @param qName - Name of the variable. >> This parameter is mandatory.
    * @returns - return a Promise GenericVariable
    */
  def getVariableByName(qName: String): js.Promise[IGenericVariable] = js.native
  /**
    * Retrieves information about the position of the tables in the data model viewer.
    *
    * Note: The position of the broom points and the position of the connection points cannot be retrieved in Qlik Sense.
    * @returns - return a Promise of TableViewDlgSaveInfo
    */
  def getViewDlgSaveInfo(): js.Promise[ITableViewDlgSaveInfo] = js.native
  /**
    * Guesses the data format for a given file.
    * Recognized file formats are:
    *
    * - CSV for Delimited
    * - FIX for Fixed Record
    * - DIF for Data Interchange Format
    * - EXCEL_BIFF for Microsoft Excel (XLS)
    * - EXCEL_OOXML for Microsoft Excel (XLSX)
    * - HTMLfor HTML
    * - QVD for QVD file
    * - XML for XML
    * - QVX for QVX file
    * - JSON for JSON format
    * - KML for KML file
    *
    * @param qConnectionId - Identifier of the connection file. >> This parameter is mandatory.
    * @param qRelativePath - Path of the connection file. This parameter is optional.
    * @returns - return a Promise of FileDataFormat
    */
  def guessFileType(qConnectionId: String): js.Promise[IFileDataFormat] = js.native
  def guessFileType(qConnectionId: String, qRelativePath: String): js.Promise[IFileDataFormat] = js.native
  /**
    * Locks all selections in all fields of the current app.
    *
    * @param qStateName - Alternate state name.
    * If this parameter is set, the method locks all selections that are in the specified state name.
    * This parameter is optional.
    * The default value is an empty string.
    * @returns - A promise of a Qlik engine reply.
    */
  def lockAll(): js.Promise[Unit] = js.native
  def lockAll(qStateName: String): js.Promise[Unit] = js.native
  /**
    * migrateDerivedFields.
    *
    * Note: from shema file
    * @returns - A promise of a Qlik engine reply.
    */
  def migrateDerivedFields(): js.Promise[Unit] = js.native
  /**
    * migrateDerivedFields.
    *
    * Note: from shema file
    * @returns - A promise of a Qlik engine reply.
    */
  def migrateVariables(): js.Promise[Unit] = js.native
  /**
    * Updates a connection.
    *
    * Note: The identifier of a connection cannot be updated. qType cannot be modified with the ModifyConnection method.
    * @param qConnectionId - Identifier of the connection. >> This parameter is mandatory.
    * @param qConnection - Information about the connection.
    * Properties that can be updated.
    * >> This parameter is mandatory.
    * @param qOverrideCredentials - Set this parameter to true to override the user name and password.
    * This parameter is optional.
    * @returns - A promise of a Qlik engine reply.
    */
  def modifyConnection(qConnectionId: String, qConnection: IConnection, qOverrideCredentials: Boolean): js.Promise[Unit] = js.native
  /**
    * Publishes an app. The published app can have a different name than the original app.
    * All app objects are published. Generic objects, bookmarks, dimensions and measures inside the app are published.
    *
    * Note: This operation is possible only in Qlik Sense Enterprise.
    * Note: An app can only be published once and cannot be published to more than one stream.
    * @param qStreamId - Identifier of the stream.
    * @param qName - ame of the published app.
    * This parameter is optional. If this parameter is not set, the engine automatically gives a new name to the published app.
    * @returns - A promise of a Qlik engine reply.
    */
  def publish(qStreamId: String, qName: String): js.Promise[Unit] = js.native
  /**
    * Redoes the previous operation.
    *
    * Note: The operation is successful if qSuccess is set to true.
    * @returns - A promise true or false
    */
  def redo(): js.Promise[Boolean] = js.native
  /**
    * Removes an alternate state in the app.
    * @param qStateName - Name of the alternate state. >> This parameter is mandatory.
    * @returns - A promise of a Qlik engine reply.
    */
  def removeAlternateState(qStateName: String): js.Promise[Unit] = js.native
  /**
    * Removes a variable.
    *
    * Note: This method is deprecated (not recommended to use).
    * Use DestroyVariableById method or DestroyVariableByName method instead.
    * @param qName - Name of the variable. Variable names are case sensitive.
    * >> This parameter is mandatory.
    * @returns - A promise true or false
    */
  def removeVariable(qName: String): js.Promise[Boolean] = js.native
  /**
    * Resumes the app as the user left it.
    * @returns - A promise of a Qlik engine reply.
    */
  def resume(): js.Promise[Unit] = js.native
  /**
    * Saves all objects that were modified in the app.
    *
    * Note: Data from the data model are not saved.
    * Note: This operation is possible only in Qlik Sense Enterprise.
    * @returns - A promise of a Qlik engine reply.
    */
  def saveObjects(): js.Promise[Unit] = js.native
  /**
    * Scramble a field in the qlik datamodel.
    *
    * @param qFieldName - Fieldname
    * @returns - A promise of a Qlik engine reply.
    */
  def scramble(qFieldName: String): js.Promise[Unit] = js.native
  /**
    * Returns the search matches for one or more search terms.
    * The search results depend on the search context.
    *
    * See: SearchCombinationOptions
    *
    * Note: This method is deprecated (not recommended to use). Use SearchResults method instead.
    * @param qOptions - Information about the search fields and the search context.
    * @param qTerms - List of terms to search for.
    * @param qPage - Array of pages to retrieve.
    * >> This parameter is mandatory.
    * @returns - A promise true or false
    */
  def searchAssociations(qOptions: ISearchCombinationOptions, qTerms: js.Array[String], qPage: ISearchPage): js.Promise[Unit] = js.native
  /**
    * Returns the generic objects corresponding to one or more search terms. The search is performed within the title,
    * subtitle, footnote and type. In addition, associated dimension values are also searched in. For example,
    * if the country Japan is selected and the object contains the dimension City, the object will appear in the
    * results for Osaka but not for Johannesburg. The generic objects with the following types will never appear
    * in the results: slideitem, sheet, story, slide, masterobject, snapshot, LoadModel, appprops and searchhistory.
    * @param qOptions - Information about the search fields and the search context.
    * @param qTerms - List of terms to search for.
    * @param qPage - Array of pages to retrieve.
    * >> This parameter is mandatory.
    * @returns - A Promise of SearchResult
    */
  def searchObjects(qOptions: ISearchObjectOptions, qTerms: js.Array[String], qPage: ISearchPage): js.Promise[ISearchResult] = js.native
  /**
    * Returns the search matches for one or more search terms.
    * Search results are organized in search groups. The type of search group indicates
    * where the search matches come from (from data for example).
    * Each search group contains search results that correspond to a combination of search terms.
    * For example, if the search terms are organic, pasta , and America, the possible combination of search groups are:
    *
    * - organic
    * - pasta
    * - America
    * - organic, pasta, America
    * - organic, pasta
    * - organic, America
    * - pasta, America
    *
    * For every search group, there are one or more search group items.
    * Each subgroup item contains results that correspond to an item type (for example a field).
    * For every search group item, there are one or several search matches. The position of the match in each search result is given.
    * @param qOptions - Information about the search fields and the search context.
    * @param qTerms - List of terms to search for.
    * @param qPage - Array of pages to retrieve.
    * >> This parameter is mandatory.
    * @returns - A Promise List of SearchResults
    */
  def searchResults(qOptions: ISearchCombinationOptions, qTerms: js.Array[String], qPage: ISearchPage): js.Promise[ISearchResult] = js.native
  /**
    * For every search group item, there are one or several search matches. The position of the match in each search result is given.
    * @param qOptions - Information about the search combinations.
    * @param qTerms - List of terms to search for. <Array of String>
    * @returns - A Promise List of SearchSuggestionResults
    */
  def searchSuggest(qOptions: ISearchCombinationOptions, qTerms: js.Array[String]): js.Promise[ISearchSuggestionResult] = js.native
  /**
    * Selects all search hits for a specified group.
    * The results depend on the search context.
    * See: SearchCombinationOptions
    * @param qOptions - Information about the search fields and the search context.
    * @param qTerms - List of terms to search for.
    * @param qMatchIx - Index (value of qId) of the search result to select.
    * @param qSoftLock - This parameter is deprecated and should not be set.
    * @returns - A promise of a Qlik engine reply.
    */
  def selectAssociations(
    qOptions: ISearchCombinationOptions,
    qTerms: js.Array[String],
    qMatchIx: Double,
    qSoftLock: Boolean
  ): js.Promise[Unit] = js.native
  /**
    * Sends a generic command to a custom connector.
    * For more information on the commands that can be sent to a custom connector, see the QVX SDK help.
    * @param qProvider - Connector file name. Command to be executed by the connector.
    * @param qCommand  One of:
    *                               - JsonRequest
    *                               - GetCustomCaption
    *                               - IsConnected
    *                               - DisableQlikViewSelectButton
    *                               - HaveStarField
    * @param qMethod - Method name to be used within the command. The available methods depend on the chosen connector.
    * @param qParameters - Parameters of the command. No parameters are required. This parameter is optional.
    * @param qAppendConnection - Name of the connection. This parameter is optional.
    * @returns - A promise of a Qlik engine reply.
    */
  def sendGenericCommandToCustomConnector(
    qProvider: String,
    qCommand: CommandType,
    qMethod: String,
    qParameters: js.Array[String],
    qAppendConnection: js.Array[String]
  ): js.Promise[String] = js.native
  /**
    * Sets properties to an app.
    * @param qProp - Information about the properties of an app. / NxAppProperties
    * @returns - A promise of a Qlik engine reply.
    */
  def setAppProperties(qProp: INxAppProperties): js.Promise[Unit] = js.native
  /**
    * Set some variables as favorite.
    * @param qNames - Variables to set as favorite.
    * @returns - A promise of a Qlik engine reply.
    */
  def setFavoriteVariables(qNames: js.Array[String]): js.Promise[Unit] = js.native
  /**
    * Limits the number of rows of data to load from a data source.
    * This method works when reloading in debug mode.
    * @param qLimit - Fetch limit. Number of rows to load.
    * @returns - A promise of a Qlik engine reply.
    */
  def setFetchLimit(qLimit: Double): js.Promise[Unit] = js.native
  /**
    * Sets a vector of loosely coupled state flags, one element for each table in the app.
    *
    * Note: The last three values in the vector are extra values. These values are for internal use.
    *
    * Note: The engine returns true if the vector has been updated.
    * @param qv - <Array of Byte> Vector of loosely coupled state flags, one element for each table in the app.
    * Set the flag to 1 to loose a table.
    * Set the flag to 0 to not loose a table.
    *
    * @returns - A promise true or false
    */
  def setLooselyCoupledVector(qv: js.Array[Double]): js.Promise[Boolean] = js.native
  /**
    * Sets values in script.
    *
    * @param qScript - Script content
    * @returns - A promise of a Qlik engine reply.
    */
  def setScript(qScript: String): js.Promise[Unit] = js.native
  /**
    * Set some breakpoints in the script of an app.
    *
    * @param qBreakpoints - Information about the breakpoints. <Array of EditorBreakpoint>
    * @returns - A promise of a Qlik engine reply.
    */
  def setScriptBreakpoints(qBreakpoints: js.Array[IEditorBreakpoint]): js.Promise[Unit] = js.native
  /**
    * Sets the positions of the tables in the data model viewer.
    *
    * Note: The position of the broom points and the position of the connection points cannot be set in Qlik Sense.
    * @param qInfo - Information about the table.
    * @returns - A promise of a Qlik engine reply.
    */
  def setViewDlgSaveInfo(qInfo: ITableViewDlgSaveInfo): js.Promise[Unit] = js.native
  /**
    * Undoes the previous operation.
    *
    * Note: The operation is successful if qSuccess is set to true.
    * @returns - A promise true or false
    */
  def undo(): js.Promise[Boolean] = js.native
  /**
    * Unlocks all selections in all fields of the current app.
    *
    * @param qStateName - Alternate state name.
    * If this parameter is set, the method unlocks all selections that are in the specified state name.
    * This parameter is optional.
    * The default value is an empty string.
    * @returns - A promise true or false
    */
  def unlockAll(): js.Promise[Unit] = js.native
  def unlockAll(qStateName: String): js.Promise[Unit] = js.native
}

