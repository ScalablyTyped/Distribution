package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class describes all the methods that apply at global level.
     * The handle member in the JSON request for all methods listed in this section is -1.
     */
@js.native
trait IGlobal
  extends qlikDashEngineapiLib.enigmaJSNs.IGeneratedAPI {
  /**
           * Sets an abort flag on all pending and ongoing requests in the current engine session.
           * If an abort flag is set on a pending request, the request is aborted.
           * If an abort flag is set on an ongoing request, the engine checks to see if it is possible to abort the request.
           */
  def abortAll(): js.Promise[scala.Unit] = js.native
  /**
           * Aborts a specific request
           * @param qRequestId - Identifier of the request to stop.
           */
  def abortRequest(qRequestId: scala.Double): js.Promise[scala.Unit] = js.native
  /**
           * no / empty docu
           */
  def allowCreateApp(): js.Promise[scala.Boolean] = js.native
  /**
           * Indicates whether or not a user is able to create an app.
           */
  def cancelReload(): js.Promise[scala.Unit] = js.native
  /**
           * Cancels an ongoing reload. The reload of the app is stopped.
           * The indexation can be canceled and true is still the return value of the reload task.
           * @param qRequestId - Identifier of the request to stop.
           */
  def cancelRequest(qRequestId: scala.Double): js.Promise[scala.Unit] = js.native
  /**
           * Configures the engine's behavior during a reload.
           *
           * Note: The ConfigureReload method should be run before the DoReload method.
           * @param qCancelOnScriptError - If set to true, the script execution is halted on error.
           * Otherwise, the engine continues the script execution.
           * This parameter is relevant only if the variable ErrorMode is set to 1.
           * @param qUseErrorData - If set to true, any script execution error
           * is returned in qErrorData by the GetProgress method.
           * @param qInteractOnError - If set to true, the script execution is halted on error and
           * the engine is waiting for an interaction to be performed. If the result from the interaction
           * is 1 (qDef.qResult is 1), the engine continues the script execution otherwise the execution is halted.
           *
           * This parameter is relevant only if the variable ErrorMode is set to 1 and the script is run in
           * debug mode (qDebug is set to true when calling the DoReload method).
           */
  def configureReload(qCancelOnScriptError: scala.Boolean, qUseErrorData: scala.Boolean, qInteractOnError: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
           * Copies an app that is in the Qlik Sense repository.
           * The engine copies the app into an app entity that was previously created by the repository. See the QRS API (REST API) help for more information.
           *
           * Note: This operation is possible only in Qlik Sense Enterprise.
           * @param qTargetAppId - Identifier (GUID) of the app entity in the Qlik Sense repository.
           * The app entity must have been previously created by the repository (via the REST API).
           * >> This parameter is mandatory.
           * @param qSrcAppId - Identifier (GUID) of the source app in the Qlik Sense repository.
           * >> This parameter is mandatory.
           * @param qIds - Array of QRS identifiers.
           * The list of all the objects in the app to be copied must be given. This list must contain the GUIDs of all these objects.
           * If the list of the QRS identifiers is empty, the CopyApp method copies all objects to the target app.
           * Script-defined variables are automatically copied when copying an app. To be able to copy variables not created via script,
           * the GUID of each variable must be provided in the list of QRS identifiers.
           * To get the QRS identifiers of the objects in an app, you can use the QRS API.
           * The GET method (from the QRS API) returns the identifiers of the objects in the app.
           * The following example returns the QRS identifiers of all the objects in a specified app:
           * GET /qrs/app/9c3f8634-6191-4a34-a114-a39102058d13
           * Where 9c3f8634-6191-4a34-a114-a39102058d13 is the identifier of the app.
           * @returns - true or false
           * Note: The operation is successful if qSuccess is set to true.
           */
  def copyApp(qTargetAppId: java.lang.String, qSrcAppId: java.lang.String, qIds: js.Array[java.lang.String]): js.Promise[scala.Boolean] = js.native
  /**
           * Creates an app.
           * @param qAppName - Name of the app.
           * >> This parameter is mandatory.
           * @param qLocalizedScriptMainSection - Name of the first section in the script editor.
           * >> This parameter is optional.
           * >> The default value is Main.
           */
  def createApp(qAppName: java.lang.String): js.Promise[_] = js.native
  /**
           * Creates an app.
           * @param qAppName - Name of the app.
           * >> This parameter is mandatory.
           * @param qLocalizedScriptMainSection - Name of the first section in the script editor.
           * >> This parameter is optional.
           * >> The default value is Main.
           */
  def createApp(qAppName: java.lang.String, qLocalizedScriptMainSection: java.lang.String): js.Promise[_] = js.native
   // ?Result
  /**
           * Creates an app and opens an engine session.
           * This operation is possible only in Qlik Sense Desktop.
           * @param qDocName - Name of the app.
           * >> This parameter is mandatory.
           * @param qUserName - Name of the user.
           * >> This parameter is optional.
           * @param qPassword - Password of the user.
           * >> This parameter is optional.
           * @param qSerial - Current Qlik Sense serial number
           * >> This parameter is optional.
           * @param qLocalizedScriptMainSection - Name of the first section in the script editor.
           * >> This parameter is optional.
           * >> The default value is Main.
           * @returns - A Promise of App
           */
  def createDocEx(qDocName: java.lang.String): js.Promise[IApp] = js.native
   // ?Result
  /**
           * Creates an app and opens an engine session.
           * This operation is possible only in Qlik Sense Desktop.
           * @param qDocName - Name of the app.
           * >> This parameter is mandatory.
           * @param qUserName - Name of the user.
           * >> This parameter is optional.
           * @param qPassword - Password of the user.
           * >> This parameter is optional.
           * @param qSerial - Current Qlik Sense serial number
           * >> This parameter is optional.
           * @param qLocalizedScriptMainSection - Name of the first section in the script editor.
           * >> This parameter is optional.
           * >> The default value is Main.
           * @returns - A Promise of App
           */
  def createDocEx(qDocName: java.lang.String, qUserName: java.lang.String): js.Promise[IApp] = js.native
   // ?Result
  /**
           * Creates an app and opens an engine session.
           * This operation is possible only in Qlik Sense Desktop.
           * @param qDocName - Name of the app.
           * >> This parameter is mandatory.
           * @param qUserName - Name of the user.
           * >> This parameter is optional.
           * @param qPassword - Password of the user.
           * >> This parameter is optional.
           * @param qSerial - Current Qlik Sense serial number
           * >> This parameter is optional.
           * @param qLocalizedScriptMainSection - Name of the first section in the script editor.
           * >> This parameter is optional.
           * >> The default value is Main.
           * @returns - A Promise of App
           */
  def createDocEx(qDocName: java.lang.String, qUserName: java.lang.String, qPassword: java.lang.String): js.Promise[IApp] = js.native
   // ?Result
  /**
           * Creates an app and opens an engine session.
           * This operation is possible only in Qlik Sense Desktop.
           * @param qDocName - Name of the app.
           * >> This parameter is mandatory.
           * @param qUserName - Name of the user.
           * >> This parameter is optional.
           * @param qPassword - Password of the user.
           * >> This parameter is optional.
           * @param qSerial - Current Qlik Sense serial number
           * >> This parameter is optional.
           * @param qLocalizedScriptMainSection - Name of the first section in the script editor.
           * >> This parameter is optional.
           * >> The default value is Main.
           * @returns - A Promise of App
           */
  def createDocEx(
    qDocName: java.lang.String,
    qUserName: java.lang.String,
    qPassword: java.lang.String,
    qSerial: java.lang.String
  ): js.Promise[IApp] = js.native
   // ?Result
  /**
           * Creates an app and opens an engine session.
           * This operation is possible only in Qlik Sense Desktop.
           * @param qDocName - Name of the app.
           * >> This parameter is mandatory.
           * @param qUserName - Name of the user.
           * >> This parameter is optional.
           * @param qPassword - Password of the user.
           * >> This parameter is optional.
           * @param qSerial - Current Qlik Sense serial number
           * >> This parameter is optional.
           * @param qLocalizedScriptMainSection - Name of the first section in the script editor.
           * >> This parameter is optional.
           * >> The default value is Main.
           * @returns - A Promise of App
           */
  def createDocEx(
    qDocName: java.lang.String,
    qUserName: java.lang.String,
    qPassword: java.lang.String,
    qSerial: java.lang.String,
    qLocalizedScriptMainSection: java.lang.String
  ): js.Promise[IApp] = js.native
  /**
           * Creates an empty session app.
           * The following applies:
           *
           * The name of a session app cannot be chosen. The engine automatically assigns a unique identifier to the session app.
           * A session app is not persisted and cannot be saved. Everything created during a session app is non-persisted;
           * for example: objects, data connections.
           * @returns - A Promise of App
           */
  def createSessionApp(): js.Promise[IApp] = js.native
  /**
           * Creates a session app from a source app.
           * The following applies:
           *
           * - The objects in the source app are copied into the session app but contain no data.
           * - The script of the session app can be edited and reloaded.
           * - The name of a session app cannot be chosen. The engine automatically assigns a unique identifier to the session app.
           * - A session app is not persisted and cannot be saved. Everything created during a session app is non-persisted;
           *   for example: objects, data connections.
           * @param qSrcAppId - App identifier of the source app.
           * It corresponds to qAppId returned by the CreateApp method when creating the source app.
           * This parameter is mandatory.
           * @returns - A Promise of App
           */
  def createSessionAppFromApp(qSrcAppId: java.lang.String): js.Promise[IApp] = js.native
  /**
           * Deletes an app from the Qlik Sense repository or from the file system.
           *
           * -- Qlik Sense Enterprise --
           * In addition to being removed from the repository, the app is removed from the directory as well:
           * <installation_directory>\Qlik\Sense\Apps
           * The default installation directory is ProgramData.
           *
           * -- Qlik Sense Desktop --
           * The app is deleted from the directory %userprofile%\Documents\Qlik\Sense\Apps.
           * @param qAppId - Identifier of the app to delete.
           * In Qlik Sense Enterprise, the identifier of the app is a GUID in the Qlik Sense repository.
           * In Qlik Sense Desktop, the identifier of the app is the name of the app,
           * as defined in the apps folder %userprofile%\Documents\Qlik\Sense\Apps.
           * >> This parameter is mandatory.
           * @returns - true or false
           *
           * Note: The operation is successful if qSuccess is set to true.
           */
  def deleteApp(qAppId: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
           * Get the current EngineVersion
           * @returns - qVersion
           */
  def engineVersion(): js.Promise[IQVersion] = js.native
  /**
           * Exports an app from the Qlik Sense repository to the file system.
           *
           * Note: This operation is possible only in Qlik Sense Enterprise.
           * @param qTargetPath - Path and name of the target app.
           * >> This parameter is mandatory.
           * @param qSrcAppId - Identifier of the source app.
           * The identifier is a GUID from the Qlik Sense repository.
           * >> This parameter is mandatory.
           * @param qIds - Array of identifiers.
           * The list of all the objects in the app to be exported must be given.
           * This list must contain the GUIDs of all these objects.
           * @returns The operation is successful if qSuccess is set to true.
           */
  def exportApp(qTargetPath: java.lang.String, qSrcAppId: java.lang.String, qIds: js.Array[java.lang.String]): js.Promise[scala.Boolean] = js.native
  /**
           * Returns the handle of the current app.
           *
           * Note: If no app is opened, an error message is returned:
           * For example code: 1007 and No active document and App invalid
           */
  def getActiveDoc(): js.Promise[IApp | java.lang.String] = js.native
   // ?Result
  /**
           * Retrieves the meta data of an app.
           * @param qAppID - Identifier of the app, as returned by the CreateApp method.
           * One of:
           *           - Path and name of the app (Qlik Sense Desktop)
           *           - GUID (Qlik Sense Enterprise)
           *
           * >> This parameter is mandatory.
           * @returns A Promise of AppEntry
           */
  def getAppEntry(qAppID: java.lang.String): js.Promise[IAppEntry] = js.native
  /**
           * Retrieves information about the authenticated user.
           * @returns Returns UserDirectory=<directory>; UserId=<identifier>
           */
  def getAuthenticatedUser(): js.Promise[java.lang.String] = js.native
  /**
           * @deprecated since version 12.20.0
           * Returns a set of rules defining the Qlik Sense scripting language grammar.
           * These rules define the syntax for the script statements and the script or chart functions.
           *
           * Note: A way to retrieve the list of script statements, script functions or chart functions is to call the GetBNF method.
           *
           * -- Terminology --
           * BNF stands for Backus-Naur Form.
           * A token is a string of one or more characters that is significant as a group.
           * For example, a token can be a function name, a parenthesis '('.
           * @param qBnfType - Returns a set of rules defining the syntax for:
           * - the script statements and the script functions if qBnfType is set to S.
           * - the chart functions if qBnfType is set to E.
           * @returns A Promise of  Array of BNFDef
           */
  def getBNF(qBnfType: BnfType): js.Promise[IBNFDef] = js.native
  /**
           * Returns a set of rules defining the Qlik Sense scripting language grammar.
           * These rules define the syntax for the script statements and the script or chart functions.
           *
           * Note: A way to retrieve the list of script statements, script functions or chart functions is to call the GetBNF method.
           *
           * --Terminology --
           * BNF stands for Backus- Naur Form.
           * A token is a string of one or more characters that is significant as a group.
           * For example, a token can be a function name, a parenthesis '('.
           * @param qBnfType - Returns a set of rules defining the syntax for:
           * - the script statements and the script functions if qBnfType is set to S.
           * - the chart functions if qBnfType is set to E.
           * @returns A Promise of IBNFDefResult
           */
  def getBaseBNF(qBnfType: BnfType): js.Promise[IBNFDefResult] = js.native
  /**
           * Gets a string hash calculated from the current Backus-Naur Form (BNF) grammar
           * of the Qlik engine scripting language. If the hash changes between subsequent
           * calls to this method, this indicates that the BNF grammar has changed.
           *
           * @param qBnfType - Returns a set of rules defining the syntax for:
           * - the script statements and the script functions if qBnfType is set to S.
           * - the chart functions if qBnfType is set to E.
           * @returns A Promise qBnfHash
           */
  def getBaseBNFHash(qBnfType: BnfType): js.Promise[qlikDashEngineapiLib.Anon_QBnfHash] = js.native
  /**
           * Gets the current Backus-Naur Form (BNF) grammar of the Qlik engine scripting language,
           * as well as a string hash calculated from that grammar. The BNF rules define the syntax
           * for the script statements and the script or chart functions. If the hash changes between
           * subsequent calls to this method, this indicates that the BNF has changed.
           *
           * In the Qlik engine grammars, a token is a string of one or more characters that is significant as a group.
           * For example, a token could be a function name, a number, a letter, a parenthesis, and so on.
           * @param qBnfType The type of grammar to return:
           *                   S: returns the script statements and the script functions.
           *                   E: returns the chart functions.
           * @returns qBnfDefs and qBnfHash
           */
  def getBaseBNFString(qBnfType: BnfType): js.Promise[qlikDashEngineapiLib.Anon_QBnfDefs] = js.native
  /**
           * Get a Config Object
           * @returns A Promise qConfig
           */
  def getConfiguration(): js.Promise[IQConfig] = js.native
  /**
           * List the custom connectors available in the system.
           * @param qReloadList Sets if the list of custom connectors should be reloaded or not.
           * This parameter is optional and the default value is false.
           * If set to false, only the connectors that were returned the previous time are returned.
           * If new connectors have been added since the last call to the GetCustomConnectors method was made,
           * the new connectors are not returned.
           * If set to true, the GetCustomConnectors method looks for new connectors in the file system.
           * @returns A Promise Array of CustomConnector
           */
  def getCustomConnectors(): js.Promise[js.Array[ICustomConnector]] = js.native
  /**
           * List the custom connectors available in the system.
           * @param qReloadList Sets if the list of custom connectors should be reloaded or not.
           * This parameter is optional and the default value is false.
           * If set to false, only the connectors that were returned the previous time are returned.
           * If new connectors have been added since the last call to the GetCustomConnectors method was made,
           * the new connectors are not returned.
           * If set to true, the GetCustomConnectors method looks for new connectors in the file system.
           * @returns A Promise Array of CustomConnector
           */
  def getCustomConnectors(qReloadList: scala.Boolean): js.Promise[js.Array[ICustomConnector]] = js.native
  /**
           * Lists the databases in a ODBC, OLEDB or CUSTOM data source.
           * @param qConnection Information about the connection.
           * @returns A Promise Array of Database
           */
  def getDatabasesFromConnectionString(qConnection: IConnection): js.Promise[js.Array[IDatabase]] = js.native
  /**
           * Returns the folder where the apps are stored.
           *
           * Note: This method applies only if running Qlik Sense Desktop.
           * @returns Returns a path of the folder where the apps are stored.
           */
  def getDefaultAppFolder(): js.Promise[java.lang.String] = js.native
  /**
           * Returns the list of apps.
           * -- In Qlik Sense Enterprise:
           * The list is generated by the QRS. The GetDocList method only returns documents the current user is allowed to access.
           * -- In Qlik Sense Desktop:
           * The apps are located in C:\Users\<user name>\Documents\Qlik\Sense\Apps.
           * @returns A Promise Array of DocListEntry
           */
  def getDocList(): js.Promise[IDocListEntry] = js.native
  /**
           * Returns the files and folders located at a specified path.
           * @param qPath Absolute or relative path.
           * Relative paths are relative to the default Apps folder.
           *
           * In Qlik Sense Enterprise:
           * The list is generated by the QRS. The GetDocList method only returns documents the current user is allowed to access.
           *
           * In Qlik Sense Desktop:
           * The apps are located in C:\Users\<user name>\Documents\Qlik\Sense\Apps.
           * @returns Path of the folder where the apps are stored.
           */
  def getFolderItemsForPath(qPath: java.lang.String): js.Promise[js.Array[IFolderItem]] = js.native
  /**
           * Gets the list of all the script functions.
           * @param qGroup Name of the group
           * >> This parameter is optional.
           * >> Default is all groups.
           * @returns A Promise <Function> or undefined
           */
  def getFunctions(): js.Promise[js.UndefOr[IFunction]] = js.native
  /**
           * Gets the list of all the script functions.
           * @param qGroup Name of the group
           * >> This parameter is optional.
           * >> Default is all groups.
           * @returns A Promise <Function> or undefined
           */
  def getFunctions(qGroup: FunctionGroupType): js.Promise[js.UndefOr[IFunction]] = js.native
  /**
           * Retrieves information on the user interaction that is requested by the engine.
           * Engine can request user interactions only during script reload and when the reload is performed in debug mode
           * (qDebug is set to true when using the DoReload method).
           * When running reload in debug mode, the engine pauses the script execution to receive data about user interaction.
           *
           * The engine can pause:
           * - before executing a new script statement
           * - when an error occurs while executing the script
           * - when the script execution is finished.
           *
           * To know if the engine is paused and waits for a response to an interaction request,
           * the GetProgress method should be used. The engine waits for a response if the property qUserInteractionWanted
           * is set to true in the response of the GetProgress request.
           * @param qRequestId Identifier of the request.
           * Corresponds to the identifier of the DoReload request.
           * @returns A Promise of InteractDef
           */
  def getInteract(qRequestId: scala.Double): js.Promise[IInteractDef] = js.native
  /**
           * Lists the logical drives in the system.
           *
           * Note: This method applies only if running Qlik Sense Desktop.
           * @returns A Promise Array of DriveInfo
           */
  def getLogicalDriveStrings(): js.Promise[js.Array[IDriveInfo]] = js.native
  /**
           * Gets the MyDocumenstFolder Path in the system.
           * @returns A Promise of the MyDocumenstFolder Path
           */
  def getMyDocumentsFolder(): js.Promise[qlikDashEngineapiLib.Anon_QFolder] = js.native
  /**
           * Returns the list of the ODBC connectors that are installed in the system.
           * @returns A Promise Array of OdbcDsn
           */
  def getOdbcDsns(): js.Promise[js.Array[IOdbcDsn]] = js.native
  /**
           * Returns the list of the OLEDB providers installed on the system.
           * @returns A Promise Array of OleDbProvider
           */
  def getOleDbProviders(): js.Promise[js.Array[IOleDbProvider]] = js.native
  /**
           * Gives information about the progress of the DoReload and DoSave calls.
           *
           * Note: For more information on DoReload and DoSave, see the DoReload method and DoSave method.
           * @param qRequestId Identifier of the DoReload or DoSave request or 0.
           * Complete information is returned if the identifier of the request is given.
           * If the identifier is 0, less information is given. Progress messages and
           * error messages are returned but information like when the request started and finished is not returned.
           * @returns Information about the progress of the request.
           */
  def getProgress(qRequestId: scala.Double): js.Promise[IProgressData] = js.native
  /**
           * Lists the streams.
           *
           * Note: This method is deprecated (not recommended to use).
           * Use general purpose endpoint in QRS API: GET qrs/stream/ instead.
           * @returns Array of NxStreamListEntry
           */
  def getStreamList(): js.Promise[js.Array[INxStreamListEntry]] = js.native
  /**
           * Lists the supported code pages.
           */
  def getSupportedCodePages(): js.Promise[js.Array[ICodePage]] = js.native
  /**
           * Returns the unique identifier of the endpoint for the current user in the current app.
           *
           * Note: This unique identifier can be used for logging purposes.
           * @returns Identifier of the endpoint.
           * This identifier is unique.
           */
  def getUniqueID(): js.Promise[java.lang.String] = js.native
  /**
           * Import an App
           * @param qAppId - new AppId
           * @param qSrcPath - source path
           * @param qIds - ???
           * Note: from shema file
           * Note: This operation is possible only in Qlik Sense Enterprise.
           */
  def importApp(qAppId: java.lang.String, qSrcPath: java.lang.String, qIds: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  /**
           * Import an App Extended
           * @param qAppId - new AppId
           * @param qSrcPath - source path
           * @param qIds - ???
           * @param qExcludeConnections - true to exclude the embedded connection from import
           * Note: from shema file
           * Note: This operation is possible only in Qlik Sense Enterprise.
           */
  def importAppEx(
    qAppId: java.lang.String,
    qSrcPath: java.lang.String,
    qIds: js.Array[java.lang.String],
    qExcludeConnections: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  /**
           * Informs the engine that a user interaction (which was earlier requested by the engine)
           * was performed and indicates the engine what to do next.
           * @param qRequestId Identifier of the request.
           * Corresponds to the identifier of the DoReload request.
           * @param qDef User response to the current interaction.
           */
  def interactDone(qRequestId: scala.Double, qDef: IInteractDef): js.Promise[scala.Unit] = js.native
  /**
           * Indicates whether the user is working in Qlik Sense Desktop.
           */
  def isDesktopMode(): js.Promise[scala.Boolean] = js.native
  /**
           * Indicates whether or not the user is working in personal mode (Qlik Sense Desktop).
           *
           * Note: This method is deprecated.
           * @returns The engine returns true if the user is working with Qlik Sense Desktop.
           */
  def isPersonalMode(): js.Promise[scala.Boolean] = js.native
  /**
           * Checks if a connection string is valid.
           * @param qConnection Information about the connection.
           * @returns True means that the connection string is correct.
           */
  def isValidConnectionString(qConnection: IConnection): js.Promise[scala.Boolean] = js.native
  /**
           * Returns the name of the operating system.
           */
  def oSName(): js.Promise[java.lang.String] = js.native
  /**
           * Returns the version number of the operating system.
           */
  def oSVersion(): js.Promise[java.lang.String] = js.native
  /**
           * Opens an app and checks if the app needs to be migrated (if the app is deprecated).
           * The OpenDoc method compares the version of the app with the version of Qlik Sense and
           * migrates the app to the current version of Qlik Sense if necessary. Once the migration is done, the app is opened.
           * If no migration is needed, the app is opened immediately.
           * The following applies:
           *
           * - The app version is lower than 0.95: no migration is done. Apps older than the version 0.95 are not supported.
           * - The app version is at least 0.95 and less than the Qlik Sense version: the app is migrated and then opened.
           * - Qlik Sense and the app have the same version: the app is opened, no migration is needed.
           *
           * Note: If the app is read-only, the app migration cannot occur. An error message is sent.
           *
           * -- Backups --
           * In Qlik Sense Desktop, apps are automatically backed up before a migration.
           * The backup files are located in %userprofile%\Documents\Qlik\Sense\AppsBackup\<Qlik Sense Desktop version>.
           * In Qlik Sense Enterprise, no automatic back up is run. The back up should be done manually.
           * @param qDocName The GUID (in Qlik Sense Enterprise) or Name (in Qlik Sense Desktop) of the app to retrieve.
           * @param qUserName Name of the user that opens the app.
           * >> This parameter is optional.
           * @param qPassword Password of the user.
           * >> This parameter is optional.
           * @param qSerial Current Qlik Sense serial number.
           * >> This parameter is optional.
           * @param qNoData Set this parameter to true to be able to open an app without loading its data.
           * When this parameter is set to true, the objects in the app are present but contain no data.
           * The script can be edited and reloaded.
           * >> This parameter is optional
           * >> The default value is false.
           * @returns A Promise of App
           */
  def openDoc(qDocName: java.lang.String): js.Promise[IApp] = js.native
  /**
           * Opens an app and checks if the app needs to be migrated (if the app is deprecated).
           * The OpenDoc method compares the version of the app with the version of Qlik Sense and
           * migrates the app to the current version of Qlik Sense if necessary. Once the migration is done, the app is opened.
           * If no migration is needed, the app is opened immediately.
           * The following applies:
           *
           * - The app version is lower than 0.95: no migration is done. Apps older than the version 0.95 are not supported.
           * - The app version is at least 0.95 and less than the Qlik Sense version: the app is migrated and then opened.
           * - Qlik Sense and the app have the same version: the app is opened, no migration is needed.
           *
           * Note: If the app is read-only, the app migration cannot occur. An error message is sent.
           *
           * -- Backups --
           * In Qlik Sense Desktop, apps are automatically backed up before a migration.
           * The backup files are located in %userprofile%\Documents\Qlik\Sense\AppsBackup\<Qlik Sense Desktop version>.
           * In Qlik Sense Enterprise, no automatic back up is run. The back up should be done manually.
           * @param qDocName The GUID (in Qlik Sense Enterprise) or Name (in Qlik Sense Desktop) of the app to retrieve.
           * @param qUserName Name of the user that opens the app.
           * >> This parameter is optional.
           * @param qPassword Password of the user.
           * >> This parameter is optional.
           * @param qSerial Current Qlik Sense serial number.
           * >> This parameter is optional.
           * @param qNoData Set this parameter to true to be able to open an app without loading its data.
           * When this parameter is set to true, the objects in the app are present but contain no data.
           * The script can be edited and reloaded.
           * >> This parameter is optional
           * >> The default value is false.
           * @returns A Promise of App
           */
  def openDoc(qDocName: java.lang.String, qUserName: java.lang.String): js.Promise[IApp] = js.native
  /**
           * Opens an app and checks if the app needs to be migrated (if the app is deprecated).
           * The OpenDoc method compares the version of the app with the version of Qlik Sense and
           * migrates the app to the current version of Qlik Sense if necessary. Once the migration is done, the app is opened.
           * If no migration is needed, the app is opened immediately.
           * The following applies:
           *
           * - The app version is lower than 0.95: no migration is done. Apps older than the version 0.95 are not supported.
           * - The app version is at least 0.95 and less than the Qlik Sense version: the app is migrated and then opened.
           * - Qlik Sense and the app have the same version: the app is opened, no migration is needed.
           *
           * Note: If the app is read-only, the app migration cannot occur. An error message is sent.
           *
           * -- Backups --
           * In Qlik Sense Desktop, apps are automatically backed up before a migration.
           * The backup files are located in %userprofile%\Documents\Qlik\Sense\AppsBackup\<Qlik Sense Desktop version>.
           * In Qlik Sense Enterprise, no automatic back up is run. The back up should be done manually.
           * @param qDocName The GUID (in Qlik Sense Enterprise) or Name (in Qlik Sense Desktop) of the app to retrieve.
           * @param qUserName Name of the user that opens the app.
           * >> This parameter is optional.
           * @param qPassword Password of the user.
           * >> This parameter is optional.
           * @param qSerial Current Qlik Sense serial number.
           * >> This parameter is optional.
           * @param qNoData Set this parameter to true to be able to open an app without loading its data.
           * When this parameter is set to true, the objects in the app are present but contain no data.
           * The script can be edited and reloaded.
           * >> This parameter is optional
           * >> The default value is false.
           * @returns A Promise of App
           */
  def openDoc(qDocName: java.lang.String, qUserName: java.lang.String, qPassword: java.lang.String): js.Promise[IApp] = js.native
  /**
           * Opens an app and checks if the app needs to be migrated (if the app is deprecated).
           * The OpenDoc method compares the version of the app with the version of Qlik Sense and
           * migrates the app to the current version of Qlik Sense if necessary. Once the migration is done, the app is opened.
           * If no migration is needed, the app is opened immediately.
           * The following applies:
           *
           * - The app version is lower than 0.95: no migration is done. Apps older than the version 0.95 are not supported.
           * - The app version is at least 0.95 and less than the Qlik Sense version: the app is migrated and then opened.
           * - Qlik Sense and the app have the same version: the app is opened, no migration is needed.
           *
           * Note: If the app is read-only, the app migration cannot occur. An error message is sent.
           *
           * -- Backups --
           * In Qlik Sense Desktop, apps are automatically backed up before a migration.
           * The backup files are located in %userprofile%\Documents\Qlik\Sense\AppsBackup\<Qlik Sense Desktop version>.
           * In Qlik Sense Enterprise, no automatic back up is run. The back up should be done manually.
           * @param qDocName The GUID (in Qlik Sense Enterprise) or Name (in Qlik Sense Desktop) of the app to retrieve.
           * @param qUserName Name of the user that opens the app.
           * >> This parameter is optional.
           * @param qPassword Password of the user.
           * >> This parameter is optional.
           * @param qSerial Current Qlik Sense serial number.
           * >> This parameter is optional.
           * @param qNoData Set this parameter to true to be able to open an app without loading its data.
           * When this parameter is set to true, the objects in the app are present but contain no data.
           * The script can be edited and reloaded.
           * >> This parameter is optional
           * >> The default value is false.
           * @returns A Promise of App
           */
  def openDoc(
    qDocName: java.lang.String,
    qUserName: java.lang.String,
    qPassword: java.lang.String,
    qSerial: java.lang.String
  ): js.Promise[IApp] = js.native
  /**
           * Opens an app and checks if the app needs to be migrated (if the app is deprecated).
           * The OpenDoc method compares the version of the app with the version of Qlik Sense and
           * migrates the app to the current version of Qlik Sense if necessary. Once the migration is done, the app is opened.
           * If no migration is needed, the app is opened immediately.
           * The following applies:
           *
           * - The app version is lower than 0.95: no migration is done. Apps older than the version 0.95 are not supported.
           * - The app version is at least 0.95 and less than the Qlik Sense version: the app is migrated and then opened.
           * - Qlik Sense and the app have the same version: the app is opened, no migration is needed.
           *
           * Note: If the app is read-only, the app migration cannot occur. An error message is sent.
           *
           * -- Backups --
           * In Qlik Sense Desktop, apps are automatically backed up before a migration.
           * The backup files are located in %userprofile%\Documents\Qlik\Sense\AppsBackup\<Qlik Sense Desktop version>.
           * In Qlik Sense Enterprise, no automatic back up is run. The back up should be done manually.
           * @param qDocName The GUID (in Qlik Sense Enterprise) or Name (in Qlik Sense Desktop) of the app to retrieve.
           * @param qUserName Name of the user that opens the app.
           * >> This parameter is optional.
           * @param qPassword Password of the user.
           * >> This parameter is optional.
           * @param qSerial Current Qlik Sense serial number.
           * >> This parameter is optional.
           * @param qNoData Set this parameter to true to be able to open an app without loading its data.
           * When this parameter is set to true, the objects in the app are present but contain no data.
           * The script can be edited and reloaded.
           * >> This parameter is optional
           * >> The default value is false.
           * @returns A Promise of App
           */
  def openDoc(
    qDocName: java.lang.String,
    qUserName: java.lang.String,
    qPassword: java.lang.String,
    qSerial: java.lang.String,
    qNoData: scala.Boolean
  ): js.Promise[IApp] = js.native
  /**
           * @deprecated since version 12.20.0
           * Returns the Qlik Sense version number.
           */
  def productVersion(): js.Promise[java.lang.String] = js.native
  /**
           * Publish an App to a Stream
           * @param qStreamId - Id of the stream there it should published
           * @param qName - new name
           * Note: from shema file
           * Note: This operation is possible only in Qlik Sense Enterprise.
           */
  def publishApp(qStreamId: java.lang.String, qName: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
           * Returns the Qlik product name.
           */
  def qTProduct(): js.Promise[java.lang.String] = js.native
  /**
           * Returns the Qlik Sense version number.
           *
           * Note: This method is deprecated (not recommended to use). Use ProductVersion method instead.
           */
  def qvVersion(): js.Promise[java.lang.String] = js.native
  /**
           * Reloads the list of extensions.
           */
  def reloadExtensionList(): js.Promise[scala.Unit] = js.native
  /**
           * Replaces an app with the objects from a source app.
           * The list of objects in the app to be replaced must be defined in qIds.
           * Note: The data model of the app cannot be updated.
           * Note: This operation is possible only in Qlik Sense Enterprise.
           * @param qTargetAppId Identifier (GUID) of the target app.
           * The target app is the app to be replaced.
           * >> This parameter is mandatory.
           * @param qSrcAppID Identifier (GUID) of the source app.
           * The objects in the source app will replace the objects in the target app.
           * >> This parameter is mandatory.
           * @param qIds QRS identifiers (GUID) of the objects in the target app to be replaced.
           * Only QRS-approved GUIDs are applicable.
           * An object that is QRS-approved, is for example an object that has been published (i.e not private anymore).
           * If an object is private, it should not be included in this list.
           * If qIds is empty, the engine automatically creates a list that contains all QRS-approved objects.
           * If the array of identifiers contains objects that are not present in the source app,
           * the objects related to these identifiers are removed from the target app.
           * @returns The operation is successful if qSuccess is set to true.
           */
  def replaceAppFromID(qTargetAppId: java.lang.String, qSrcAppID: java.lang.String, qIds: js.Array[java.lang.String]): js.Promise[scala.Boolean] = js.native
  /**
           * Shuts down the Qlik engine.
           *
           * Note: This operation is possible only in Qlik Sense Desktop.
           */
  def shutdownProcess(): js.Promise[scala.Unit] = js.native
}

