package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.anon.QAxisData
import typings.qlikEngineapi.anon.QDataPages
import typings.qlikEngineapi.enigmaJS.IGeneratedAPI
import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class describes all the methods that apply at generic object level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the generic object.
  */
@js.native
trait IGenericObject extends IGeneratedAPI {
  /**
    * app describes all the methods that apply at app level.
    */
  var app: IApp = js.native
  /**
    * Aborts the results of a search in a list object.
    * Note: This method applies to list objects (objects with one dimension).
    * Note: After an abort on a list object search, the GetLayout method does not
    *       return any more search results but it does return the values in the field.
    * @param qPath - Path to the definition of the list object.
    * For example, /qListObjectDef.
    * @returns -
    */
  def abortListObjectSearch(qPath: String): js.Promise[Unit] = js.native
  /**
    * Accept the results of a search in a list object. The search results become selected in the field.
    *
    * Note: This method applies to list objects (objects with one dimension).
    * Note: The search results are displayed using the GetLayout method.
    * @param qPath - Path to the definition of the list object.
    * For example, /qListObjectDef.
    * @param qToggleMode - Set to true to keep any selections present in the list object.
    * If this parameter is set to false, selections made before accepting the list object search become alternative.
    * >> This parameter is mandatory.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * This parameter is optional.
    * @returns -
    */
  def acceptListObjectSearch(qPath: String, qToggleMode: Boolean): js.Promise[Unit] = js.native
  def acceptListObjectSearch(qPath: String, qToggleMode: Boolean, qSoftLock: Boolean): js.Promise[Unit] = js.native
  /**
    * Applies a patch to the properties of an object. Allows an update to some of the properties.
    * It is possible to apply a patch to the properties of a generic object, that is not persistent.
    * Such a patch is called a soft patch.
    * In that case, the result of the operation on the properties (add, remove or delete) is not shown
    * when doing GetProperties and only a GetLayout call shows the result of the operation.
    * Properties that are not persistent are called soft properties. Once the engine session is over,
    * soft properties are cleared.
    *
    * Note: Soft properties apply only to generic objects.
    * Check: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of patches.
    * @param qSoftPatch - If set to true, it means that the properties to be applied are not persistent.
    * The patch is a soft patch.
    * This parameter is optional.
    * Default is false.
    * @returns -
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[Unit] = js.native
  def applyPatches(qPatches: js.Array[INxPatch], qSoftPatch: Boolean): js.Promise[Unit] = js.native
  /**
    * Begins the selection mode. The app enters the modal state. The specified object enters the selection mode and
    * a modal window is opened. The selection mode can apply to only one object in an app at a time.
    * When a visualization is in selection mode, selections can be made in this visualization. The visualization is not
    * sorted until the selection mode is ended. Once the selection mode is ended and if the selections are accepted,
    * the visualization is sorted according to the sort criteria.
    *
    * For more information about:
    *
    *     - Ending the selection mode, see EndSelections method.
    *     - The sort criteria, see ListObjectDef or HyperCubeDef.
    *
    * Example:
    *
    * A sheet contains a list object and a chart. If the list object is in selection mode then the chart cannot be in selection mode.
    * No selection on the chart can be made until the list object exits the selection mode.
    * @param qPaths - List of the paths to the definition of the objects to enter selection mode.
    * For example, /qListObjectDef.
    * @returns -
    */
  def beginSelections(qPaths: js.Array[String]): js.Promise[Unit] = js.native
  /**
    * Clears the selections in a dimension of a visualization.
    * @param qPath - Path to the definition of the visualization.
    * For example, /qListObjectDef.
    * @param qColIndices - Array of dimension numbers or indexes. The selections are cleared in the specified dimensions.
    * Dimension numbers/indexes start from 0.
    * This parameter is optional. If this parameter is not set, all dimensions are cleared.
    * @returns -
    */
  def clearSelections(qPath: String): js.Promise[Unit] = js.native
  def clearSelections(qPath: String, qColIndices: js.Array[Double]): js.Promise[Unit] = js.native
  /**
    * Clears the soft properties of a generic object.
    * For more information on how to add soft properties to a generic object,
    * @returns -
    */
  def clearSoftPatches(): js.Promise[Unit] = js.native
  /**
    * Collapses the left dimensions of a pivot table. This method applies only to pivot tables that are not always fully expanded.
    * In the definition of the hypercube (in HyperCubeDef), the parameter qAlwaysFullyExpanded must be set to false.
    * @param qPath - Path to the definition of the object to be collapsed
    * For example, /qHyperCubeDef.
    * >> This parameter is mandatory.
    * @param qRow - Row index in the data matrix.
    * Indexing starts from 0.
    * @param qCol - Column index. The index is based on the left dimension indexes.
    * Indexing starts from 0.
    * @param qAll - If set to true, it collapses all cells.
    * Parameters qRow and qCol are not used if qAll is set to true, but they need to be set (for example to 0).
    * @returns -
    */
  def collapseLeft(qPath: String, qRow: Double, qCol: Double, qAll: Boolean): js.Promise[Unit] = js.native
  /**
    * Collapses the top dimensions of a pivot table. This method applies only to pivot tables that are not always fully expanded.
    * In the definition of the hypercube (in HyperCubeDef), the parameter qAlwaysFullyExpanded must be set to false.
    * @param qPath - Path to the definition of the object to be collapsed
    * For example, /qHyperCubeDef.
    * >> This parameter is mandatory.
    * @param qRow - Row index in the data matrix.
    * Indexing starts from 0.
    * @param qCol - Column index. The index is based on the left dimension indexes.
    * Indexing starts from 0.
    * @param qAll - If set to true, it collapses all cells.
    * Parameters qRow and qCol are not used if qAll is set to true, but they need to be set (for example to 0).
    * @returns -
    */
  def collapseTop(qPath: String, qRow: Double, qCol: Double, qAll: Boolean): js.Promise[Unit] = js.native
  /**
    * Copies the properties of a generic object and its children.
    * The source object is specified by the parameter qFromId and the destination object is referenced by its handle.
    *
    * Note: The identifier of the destination object is the same as before the copy takes place.
    * @param qFromId - Identifier of the object to copy.
    * @returns -
    */
  def copyFrom(qFromId: IGenericObjectProperties): js.Promise[Unit] = js.native
  /**
    * Creates a generic object that is a child of another generic object.
    *
    * Note: It is possible to update the properties of the child's parent at the same time that the child is created.
    * Both operations are performed by the same call.
    * Note: It is possible to create a child that is linked to another generic object. The two objects have the same properties.
    *
    * Note: In addition to the parameters specified above, the parameter qProp
    * can get any properties defined in the Generic objects section.
    * @param qProp - Information about the child
    * >> This parameter is mandatory.
    * It is possible to create a child that is linked to another object.
    * @param qPropForThis - This parameter is optional.
    * Identifier of the parent's object.
    * Should be set to update the properties of the parent's object at the same time the child is created.
    * @returns - A Promise of GenericObject
    */
  def createChild(qProp: IGenericObjectProperties): js.Promise[IGenericObject] = js.native
  def createChild(qProp: IGenericObjectProperties, qPropForThis: IGenericObjectProperties): js.Promise[IGenericObject] = js.native
  /**
    * Removes all children and all children to the children on an object.
    * @param qPropForThis - This parameter is optional.
    * Identifier of the parent's object and property to update.
    * Should be set to update the properties of the parent's object at the same time the child is created.
    * @returns -
    */
  def destroyAllChildren(): js.Promise[Unit] = js.native
  def destroyAllChildren(qPropForThis: IGenericObjectProperties): js.Promise[Unit] = js.native
  /**
    * Removes a child object.
    * Note: It is possible to update the properties of the child's parent at the same time that the child is removed.
    * Both operations are performed by the same call.
    *
    * Note: Removing a linked object, invalidate the linking object.
    *
    * @param qid - Identifier of the child to remove.
    * >> This parameter is mandatory.
    * @param qPropForThis - This parameter is optional.
    * Identifier of the parent's object and property to update.
    * Should be set to update the properties of the parent's object at the same time the child is created.
    * @returns - true or false
    */
  def destroyChild(qid: String): js.Promise[Boolean] = js.native
  def destroyChild(qid: String, qPropForThis: IGenericObjectProperties): js.Promise[Boolean] = js.native
  /**
    * You can use the drillUp method with any object that contains a drill-down group as a dimension.
    * This method allows you to move between different levels of information
    * (from a detailed level to a less detailed level of information).
    * You can go back to previous visualizations up to the highest level of the hierarchy.
    * If you try to drill up more steps than there are available levels, the first level of the hierarchy is displayed.
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qHyperCubeDef.
    * >> This parameter is mandatory.
    * @param qDimNo - Dimension number or index starting from 0
    * The default value is 0.
    * @param qNbrSteps - Number of steps you want to drill up.
    * The default value is 0.
    * @returns -
    */
  def drillUp(qPath: String, qDimNo: Double, qNbrSteps: Double): js.Promise[Unit] = js.native
  /**
    * Adds a snapshot to a generic object.
    *
    * Note: Only one snapshot can be embedded in a generic object.
    * Note: If you embed a snapshot in an object that already contains a snapshot,
    * the new snapshot overwrites the previous one.
    * @param qId Identifier of the bookmark. >> This parameter is mandatory.
    * @returns -
    */
  def embedSnapshotObject(qId: String): js.Promise[Unit] = js.native
  /**
    * Ends the selection mode on a visualization. The selections are accepted or aborted when exiting the selection mode,
    * depending on the qAccept parameter value.
    * @param qAccept - Set this parameter to true to accept the selections before exiting the selection mode.
    * @returns -
    */
  def endSelections(qAccept: Boolean): js.Promise[Unit] = js.native
  /**
    * Expands the left dimensions of a pivot table.
    * This method applies only to pivot tables that are not always fully expanded.
    * In the definition of the hypercube (in HyperCubeDef), the parameter qAlwaysFullyExpanded must be set to false.
    * @param qPath - Path to the definition of the object to be collapsed
    * For example, /qHyperCubeDef.
    * >> This parameter is mandatory.
    * @param qRow - Row index in the data matrix.
    * Indexing starts from 0.
    * @param qCol - Column index. The index is based on the left dimension indexes.
    * Indexing starts from 0.
    * @param qAll - If set to true, it collapses all cells.
    * Parameters qRow and qCol are not used if qAll is set to true, but they need to be set (for example to 0).
    * @returns -
    */
  def expandLeft(qPath: String, qRow: Double, qCol: Double, qAll: Boolean): js.Promise[Unit] = js.native
  /**
    * Expands the top dimensions of a pivot table.
    * This method applies only to pivot tables that are not always fully expanded.
    * In the definition of the hypercube (in HyperCubeDef), the parameter qAlwaysFullyExpanded must be set to false.
    * @param qPath - Path to the definition of the object to be collapsed
    * For example, /qHyperCubeDef.
    * >> This parameter is mandatory.
    * @param qRow - Row index in the data matrix.
    * Indexing starts from 0.
    * @param qCol - Column index. The index is based on the left dimension indexes.
    * Indexing starts from 0.
    * @param qAll - If set to true, it collapses all cells.
    * Parameters qRow and qCol are not used if qAll is set to true, but they need to be set (for example to 0).
    * @returns -
    */
  def expandTop(qPath: String, qRow: Double, qCol: Double, qAll: Boolean): js.Promise[Unit] = js.native
  /**
    * Exports the data of any generic object to an Excel file or a open XML file.
    * If the object contains excluded values, those excluded values are not exported.
    * This API has limited functionality and will not support CSV export from all types of objects.
    * Consider using Excel export instead. Treemap and bar chart are not supported.
    *
    * -- Default limitations in number of rows and columns --
    * The default maximum number of rows and columns in the Excel export file is:
    *
    * 1048566 rows per sheet. For pivot tables: 1048566 column dimensions. 10 rows can be added after the export.
    * 16384 columns per sheet. If the number of columns exceeds the limit,
    * the exported file is truncated and a warning message is sent.
    *
    * Note: There is an option to export only the possible values (qExportState is P).
    *
    * -- Default limitation in size --
    * The default size limit of an export file is:
    * 1024*1024*800 for an export to an Excel file.
    * If the exported file is larger than the maximum value, then an out of memory error with code 13000 is returned.
    *
    * Note: Exported files are temporary and are available only for a certain time span and only to the user who created them.
    * @param qFileType - Type of the file to export. >> This parameter is mandatory.
    * @param qPath - Path to the definition of the object to be exported. For example, /qHyperCubeDef.
    * >> This parameter is mandatory if the file type is CSV_C or CSV_T.
    * @param qFileName - Name of the exported file after download from browser.
    * This parameter is optional and only used in Qlik Sense Desktop.
    * @param qExportState - Defines the values to be exported.
    * This parameter is optional.
    * One of:
    *           P to export only the possible values
    *           A to export all values (default)
    *
    * @returns - A Promise of String qUrl: <url of the exported file> and qWarnings: [1000] only if exported data is truncated
    */
  def exportData(qFileType: FileType, qPath: String): js.Promise[String] = js.native
  def exportData(
    qFileType: FileType,
    qPath: String,
    qFileName: js.UndefOr[scala.Nothing],
    qExportState: ExportStateType
  ): js.Promise[String] = js.native
  def exportData(qFileType: FileType, qPath: String, qFileName: String): js.Promise[String] = js.native
  def exportData(qFileType: FileType, qPath: String, qFileName: String, qExportState: ExportStateType): js.Promise[String] = js.native
  /**
    * Returns the type of the object and the corresponding handle.
    * @param qId - Identifier of the object.
    * >> This parameter is mandatory.
    * @returns - A Promise of GenericObject
    */
  def getChild(qId: String): js.Promise[IGenericObject] = js.native
  /**
    * Returns the identifier and the type for each child in an app object.
    * If the child contains extra properties in qInfos,these properties are returned.
    *
    * Note: Full dynamic properties are optional and are returned if they exist in the definition of the object.
    * @returns - A Promise Array of NxInfo
    */
  def getChildInfos(): js.Promise[js.Array[INxInfo]] = js.native
  /**
    * Returns the identifier, the type and the properties of the object.
    * If the object contains some soft properties, the soft properties are returned.
    * If the object is linked to another object, the properties of the linking object are returned.
    * @returns - A Promise of GenericObjectProperties
    */
  def getEffectiveProperties(): js.Promise[IGenericObjectProperties] = js.native
  /**
    * Gets the properties of:
    *       - a generic object
    *       - the children of the generic object
    *       - the bookmarks/embedded snapshots of the generic object
    * @returns - A Promise  GenericObjectEntry
    */
  def getFullPropertyTree(): js.Promise[IGenericObjectEntry] = js.native
  /**
    * This method supports data binning.
    * When a generic object with two or three measures and one dimension contains a lot of data,
    * groups of points (i.e cells) can be rendered instead of points.
    * A zone of interest can be refined (for zooming in) up to a maximum refinement level
    * (set in the qQueryLevel parameter) or coarsened (for zoom out).
    * The grid of cells is adaptive (not static), meaning that it adapts to different length scales.
    * The GetHyperCubeBinnedData method gives information about the adaptive grid and the values of the generic object.
    * The number of points in a cell and the coordinates (expressed in the measure range) of each cell are returned.
    * Dimension values and measure values are rendered at point level (highest detailed level).
    *
    * Note: The generic object should contain two or three measures and one dimension.
    * When the refinement is high, the first two measures are represented on the x-axis and on the y-axis,
    * while the third measure is visualized as color or point size.
    * @param qPath - Path to the definition of the object.
    * For example, /qHyperCubeDef.
    * >> This parameter is mandatory.
    * @param qPages - Array of pages to retrieve.
    * Since the generic object contains two measures and one dimension, qWidth should be set to 3.
    * If the value of a measure is Null, the value cannot be rendered. Therefore, the number of
    * elements rendered in a page can be less than the number defined in the property qHeight.
    * >> This parameter is mandatory.
    * @param qViewport - Defines the canvas and the zoom level.
    * This parameter is not yet used and is optional.
    * @param qDataRanges - Range of the data to render.
    * This range applies to the measure values.
    * The lowest and highest values of a measure can be retrieved
    * by using the GetLayout method ( in /qHyperCube/qMeasureInfo).
    * >> This parameter is mandatory.
    * @param qMaxNbrCells - Maximum number of cells in the grid.
    * >> This parameter is mandatory.
    * @param qQueryLevel - Level of details. The higher the level, the more detailed information you get (zoom-in).
    * When the number of points to render falls below a certain threshold,
    * the values are no longer rendered as cells but as points.
    * The query level should be no greater than 20.
    * This parameter is optional.
    * @param qBinningMethod - Selects the algorithm.
    * The default value is 0.
    * One of:
    *           0: Adaptive grid
    * @returns - A Promise Array of NxDataPage
    */
  def getHyperCubeBinnedData(
    qPath: String,
    qPages: js.Array[INxPage],
    qViewport: INxViewPort,
    qDataRanges: INxDataAreaPage,
    qMaxNbrCells: Double,
    qQueryLevel: Double,
    qBinningMethod: Double
  ): js.Promise[js.Array[INxDataPage]] = js.native
  /**
    * Retrieves and packs compressed hypercube and axis data. It is possible to retrieve specific pages of data.
    *
    * Note: Binning is done on the time stamp data as well as the date.
    * This means that you can zoom in to a level of granularity as low as seconds.
    * @param qPath - Path to the definition of the object.
    * For example, /qHyperCubeDef. >> This parameter is mandatory.
    * @param qOptions - Array of (NxContinuousDataOptions)
    * Options.NbrPoints is number of bins for binning.
    * Options.MaxNbrTicks - maximum number of ticks.
    * @returns - A Promise <Boolean> or <Array of NxDataPage> or <Array of NxAxisData>
    */
  def getHyperCubeContinuousData(qPath: String, qOptions: js.Array[IContinuousDataOptions]): js.Promise[QAxisData] = js.native
  /**
    * Retrieves the values of a chart, a table, or a scatter plot. It is possible to retrieve specific pages of data.
    * Note: This method does not apply to stacked tables.
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qHyperCubeDef.
    * >> This parameter is mandatory.
    * @param qPages - <Array of NxPage> to retrieve.
    * >> This parameter is mandatory.
    * @returns - A data set Array of NxDataPage
    */
  def getHyperCubeData(qPath: String, qPages: js.Array[INxPage]): js.Promise[js.Array[INxDataPage]] = js.native
  /**
    * Retrieves the values of a pivot table. It is possible to retrieve specific pages of data.
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qHyperCubeDef.
    * >> This parameter is mandatory.
    * @param qPages - Array of pages to retrieve
    * >> This parameter is mandatory.
    * @returns - A data set Array of NxPivotPage
    */
  def getHyperCubePivotData(qPath: String, qPages: js.Array[INxPage]): js.Promise[js.Array[INxPivotPage]] = js.native
  /**
    * Reduces the data of a bar chart, a line chart or a scatter plot chart and retrieves them.
    * The reduction is dependent on the zoom factor (parameter qZoomFactor) and on the reduction mode.
    *
    * Note: This method can be used to create mini charts.
    *
    * -- Bar chart or line chart data reduction --
    * For the data reduction to happen, the following conditions must be fulfilled:
    * The values cannot fit in the defined page (parameter qPages).
    * The zoom factor is not 0 (parameter qZoomFactor).
    * The reduction mode must be set to D1. The reduction algorithm keeps the shape of the visualizations and works whatever
    * the number of dimensions in the chart. The global profile of the chart is reduced, and not only a specific dimension.
    * A visualization that has been reduced contains fewer values but its shape is the same. Data of all types can be reduced. Therefore it is hard to relate the
    * values before and after a reduction especially when reducing string values.
    *
    * Example:
    * If you have a chart with 1 million data, and you have set the zoom factor to 5, the GetHyperCubeReducedData
    * method reduces the chart and retrieves 200 000 data.
    *
    * -- Scatter plot chart data reduction--
    * The reduction mode must be set
    * to C. This reduction mechanism follows the 2D K-Means algorithm. Data are reduced into a number of clusters. Each data
    * is assigned to a specific centroid. The number of centroids can be defined in the parameter qZoomFactor.
    *
    * -- Scatter plot chart resolution reduction --
    * The reduction mode must be set to S. The resolution is reduced according
    * to the zoom factor (parameter qZoomFactor).
    *
    * Example:
    * If you have a scatter plot chart and the zoom factor is set to 2, the scatter plot chart resolution is reduced by 4.
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qHyperCubeDef.
    * @param Pages - Array of NxPage.
    * @param qZoomFactor - Defines the zoom factor.
    * If set to -1, the engine decides of the zoom factor.
    * If the reduction mode is D1 or S, the zoom factor is 2n.
    * If the zoom factor is 5, the data are reduced by a factor 32.
    * If the reduction mode is C, the zoom factor defines the number of centroids.
    * @param qReductionMode - Defines the reduction mode.
    * One of:
    *       - N for no data reduction.
    *       - D1 to reduce a bar chart or line chart. The profile of the chart is reduced whatever the number of dimensions in the chart.
    *       - S to reduce the resolution of a scatter plot.
    *       - C to reduce the data of a scatter plot chart.
    *       - ST to reduce the data of a stacked pivot table.
    * @returns - A data set Array of NxDataPage.
    */
  def getHyperCubeReducedData(qPath: String, qPages: js.Array[INxPage], qZoomFactor: Double, qReductionMode: ReductionModeType): js.Promise[js.Array[INxDataPage]] = js.native
  /**
    * Retrieves the values of a stacked pivot table. It is possible to retrieve specific pages of data.
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qHyperCubeDef.
    * @param Pages - Array of pages to retrieve.
    * >> This parameter is mandatory.
    * @param qMaxNbrCells - Maximum number of cells at outer level.
    * >> This parameter is optional. The default value is 10 000.
    * @returns - A data set Array of NxStackPage.
    */
  def getHyperCubeStackData(qPath: String, qPages: js.Array[INxPage]): js.Promise[js.Array[INxStackPage]] = js.native
  def getHyperCubeStackData(qPath: String, qPages: js.Array[INxPage], qMaxNbrCells: Double): js.Promise[js.Array[INxStackPage]] = js.native
  /**
    * Retrieves the values of a stacked pivot table. It is possible to retrieve specific pages of data.
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qHyperCubeDef.
    * @param qNodeOptions - Specifies all the paging filters needed to define the tree to be fetched.
    * @returns - A data set Array of NxTreeNode.
    */
  def getHyperCubeTreeData(qPath: String, qNodeOptions: js.Array[INxTreeDataOption]): js.Promise[INxTreeNode] = js.native
  /**
    * Returns the type and identifier of the object.
    * @returns - A Promise of NxInfo.
    */
  def getInfo(): js.Promise[INxInfo] = js.native
  /* ToCheck!  return value is GenericObjectLayout  */
  /**
    * Evaluates an object and displays its properties including the dynamic properties.
    * If the member delta is set to true in the request object, only the delta is evaluated.
    *
    * Note: In addition to the parameters displayed above, the GetLayout method can return other properties according
    * to what is defined in the generic object. For example, if qHyperCubeDef is defined in the generic object,
    * the GetLayout method returns the properties described in HyperCube.
    * @returns - A Promise of GenericBaseLayout.
    */
  def getLayout(): js.Promise[IGenericBaseLayout] = js.native
  /**
    * Lists the linked objects to a generic object, a dimension or a measure.
    * @returns - Array of NxLinkedObjectInfo
    */
  def getLinkedObjects(): js.Promise[js.Array[INxLinkedObjectInfo]] = js.native
  /**
    * GetListObjectContinuousData method
    * @param qPath - Path to the definition of the object.
    * For example, /qHyperCubeDef.
    * This parameter is mandatory.
    * @param qOptions - Options.NbrPoints is number of bins for binning.
    * - Options.MaxNbrTicks - maximum number of ticks.
    * @returns - A data set Array of (NxDataPage) or (NxAxisData)
    */
  def getListObjectContinuousData(qPath: String, qOptions: IContinuousDataOptions): js.Promise[QDataPages] = js.native
  /**
    * Retrieves the values of a list object.
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qListObjectDef.
    * @param qPages -Array of pages you are interested in.
    * @returns - Array of NxDataPage
    */
  def getListObjectData(qPath: String, qPages: js.Array[INxPage]): js.Promise[js.Array[INxDataPage]] = js.native
  /**
    * Returns the identifier, the type and the properties of the object.
    * Because it is not mandatory to set all properties when you define an object,
    * the GetProperties method may show properties that were not set. In that case, default values are given.
    * If the object contains some soft properties, the soft properties are not returned by the GetProperties method.
    * Use the GetEffectiveProperties method instead.
    * If the object is linked to another object, the properties of the linking object are not returned
    * by the GetProperties method. Use the GetEffectiveProperties method instead.
    *
    * Note: If the member delta is set to true in the request object, only the delta is retrieved.
    * @returns - A Promise of GenericObjectProperties
    */
  def getProperties(): js.Promise[IGenericObjectProperties] = js.native
  /**
    * Returns the type of the object and the corresponding handle.
    * @returns - A Promise of GenericBookmark
    */
  def getSnapshotObject(): js.Promise[IGenericBookmark] = js.native
  /**
    * Locks the selected values of a generic object.
    * @param qPath - Path to the definition of the object.
    * For example, /qListObjectDef.
    * @param qColIndices - Dimension numbers or dimension indexes where the lock should apply.
    * Dimension numbers/indexes start from 0.
    * This parameter is optional. If this parameter is not set, the selected values in all dimensions are locked.
    */
  def lock(qPath: String): js.Promise[Unit] = js.native
  def lock(qPath: String, qColIndices: js.Array[Double]): js.Promise[Unit] = js.native
  /**
    * Make range selections in measures.
    *
    * Note: This method applies to hypercubes. For example, bar charts, tables and scatter plots.
    * @param qPath - Path to the definition of the object.
    * For example, /qListObjectDef.
    * >> This parameter is mandatory.
    * @param qRanges - Ranges of selection.
    * >>This parameter is mandatory.
    * @param qColumnsToSelect - Indicates which dimensions to select.
    * The dimensions numbering starts at 0 (first dimension is 0).
    * If the array is empty, all dimensions are selected.
    * >> This parameter is optional.
    * @param qOrMode - Applies to hypercubes with multiple measures.
    * If set to true, it means that at least one of the measures must be in the range of
    * selections for the group of measures to be selected.
    * If set to false, it means that all measures must be in the range of
    * selections for the group of measures to be selected.
    * This parameter is optional. The default value is false.
    * @param qDeselectOnlyOneSelected - Set this parameter to true to unselect the last
    * single selected value. There must be only one selected value in the field.
    * >> The default value is false.
    * @returns - true or false
    */
  def multiRangeSelectHyperCubeValues(qPath: String, qRanges: INxMultiRangeSelectInfo, qDeselectOnlyOneSelected: Boolean): js.Promise[Boolean] = js.native
  def multiRangeSelectHyperCubeValues(
    qPath: String,
    qRanges: INxMultiRangeSelectInfo,
    qDeselectOnlyOneSelected: Boolean,
    qColumnsToSelect: js.UndefOr[scala.Nothing],
    qOrMode: Boolean
  ): js.Promise[Boolean] = js.native
  def multiRangeSelectHyperCubeValues(
    qPath: String,
    qRanges: INxMultiRangeSelectInfo,
    qDeselectOnlyOneSelected: Boolean,
    qColumnsToSelect: js.Array[Double]
  ): js.Promise[Boolean] = js.native
  def multiRangeSelectHyperCubeValues(
    qPath: String,
    qRanges: INxMultiRangeSelectInfo,
    qDeselectOnlyOneSelected: Boolean,
    qColumnsToSelect: js.Array[Double],
    qOrMode: Boolean
  ): js.Promise[Boolean] = js.native
  /**
    * Publishes a generic object.
    *
    * Note: This operation is possible only in Qlik Sense Enterprise.
    */
  def publish(): js.Promise[Unit] = js.native
  /**
    * Make range selections in measures.
    * Note: This method applies to hypercubes. For example, bar charts, tables and scatter plots.
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qHyperCubeDef.
    * >> This parameter is mandatory.
    * @param qRanges - Ranges of selection.
    * >>This parameter is mandatory.
    * @param qDeselectOnlyOneSelected - Set this parameter to true to unselect the last
    * single selected value. There must be only one selected value in the field.
    * >> The default value is false.
    * @param qColumnsToSelect - Indicates which dimensions to select.
    * The dimensions numbering starts at 0 (first dimension is 0).
    * If the array is empty, all dimensions are selected.
    * >> This parameter is optional.
    * @param qOrMode - Applies to hypercubes with multiple measures.
    * If set to true, it means that at least one of the measures must be in the range of
    * selections for the group of measures to be selected.
    * If set to false, it means that all measures must be in the range of
    * selections for the group of measures to be selected.
    * This parameter is optional. The default value is false.
    * @returns - true or false
    */
  def rangeSelectHyperCubeValues(qPath: String, qRanges: js.Array[INxRangeSelectInfo], qDeselectOnlyOneSelected: Boolean): js.Promise[Boolean] = js.native
  def rangeSelectHyperCubeValues(
    qPath: String,
    qRanges: js.Array[INxRangeSelectInfo],
    qDeselectOnlyOneSelected: Boolean,
    qColumnsToSelect: js.UndefOr[scala.Nothing],
    qOrMode: Boolean
  ): js.Promise[Boolean] = js.native
  def rangeSelectHyperCubeValues(
    qPath: String,
    qRanges: js.Array[INxRangeSelectInfo],
    qDeselectOnlyOneSelected: Boolean,
    qColumnsToSelect: js.Array[Double]
  ): js.Promise[Boolean] = js.native
  def rangeSelectHyperCubeValues(
    qPath: String,
    qRanges: js.Array[INxRangeSelectInfo],
    qDeselectOnlyOneSelected: Boolean,
    qColumnsToSelect: js.Array[Double],
    qOrMode: Boolean
  ): js.Promise[Boolean] = js.native
  /**
    * Resets all selections made in selection mode.
    */
  def resetMadeSelections(): js.Promise[Unit] = js.native
  /**
    * Searches for a string in a list object.
    *
    * Note: This method applies to list objects (objects with one dimension).
    * Note: The search results can be displayed using the GetLayout method.
    * @param qPath - Path to the definition of the list object.
    * For example, /qListObjectDef.
    * @param qMatch - Search string.
    * Wild card characters are allowed. The search is not case sensitive.
    * Examples:
    *        P*U*: retrieves only values that start with P and contain U
    *        P U S: retrieves values that start with P, U or S
    * @returns - The operation is successful if qSuccess is set to true.
    */
  def searchListObjectFor(qPath: String, qMatch: String): js.Promise[Boolean] = js.native
  /**
    * Makes selections in multiple dimensions and measures.
    *
    * Note: This method applies to hypercubes, such as bar charts, tables and scatter plots.
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qHyperCubeDef.
    * This parameter is mandatory.
    * @param qRowIndices - Array of row indexes to select, starting from 0.
    * If the array is empty [ ], all rows are selected.
    * >> This parameter is mandatory.
    * @param qColIndices - Indexes of the columns to select, starting from 0.
    * A column corresponds to a dimension or a measure depending on the definition of the hypercube.
    * Example:
    *   If the hypercube has two dimensions and one measure:
    *        [0] selects the first column (i.e the first dimension)
    *        [1] selects the second column (i.e the second dimension)
    *        [2] selects the third column (i.e the measure)
    *    If the array is empty [ ], all columns are selected.
    * >>This parameter is mandatory.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * >> This parameter is mandatory.
    * @param qDeselectOnlyOneSelected - Set this parameter to true to unselect the last single selected value.
    * There must be only one selected value in the field.
    * The default value is false.
    * @returns - true or false.
    */
  def selectHyperCubeCells(
    qPath: String,
    qRowIndices: js.Array[Double],
    qColIndices: js.Array[Double],
    qSoftLock: Boolean,
    qDeselectOnlyOneSelected: Boolean
  ): js.Promise[Boolean] = js.native
  /**
    * SelectHyperCubeContinuousRange method
    * @param qPath - Path to the definition of the object.
    * For example, /qHyperCubeDef.
    * >>This parameter is mandatory.
    * @param qRanges - Selects ranges in a hypercube in (Ranges[N].Min,Ranges[N].Max) intervals.
    * If either Ranges[N].MinInclEq or Ranges[N].MaxInclEq, or both flags are set to true
    * then Min and Max values will be selected.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * >> This parameter is mandatory.
    * @returns - true or false.
    */
  def selectHyperCubeContinuousRange(qPath: String, qRanges: js.Array[INxContinuousRangeSelectInfo], qSoftLock: Boolean): js.Promise[Boolean] = js.native
  /**
    * Selects some values in one dimension.
    * The values are identified by their element numbers.
    *
    * Note: This method applies to charts, tables and scatter plots.
    * @param qPath - Path to the definition of the object.
    * For example, /qHyperCubeDef.
    * >>This parameter is mandatory.
    * @param qDimNo - Dimension number or index to select.
    * Dimension numbers/index start from 0.
    * >> This parameter is mandatory.
    * @param qValues - Element numbers of the field to select.
    * You can select multiple elements; the separator is the comma.
    * >> This parameter is mandatory.
    * @param qToggleMode - Set to true to toggle.
    * >> This parameter is mandatory.
    * @returns - true or false.
    */
  def selectHyperCubeValues(qPath: String, qDimNo: Double, qValues: js.Array[Double], qToggleMode: Boolean): js.Promise[Boolean] = js.native
  /**
    * Selects all values of a field.
    *
    * Note: This method applies to list objects (objects with one dimension).
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qListObjectDef.
    * >> This parameter is mandatory.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * >> This parameter is optional.
    * @returns - true or false.
    */
  def selectListObjectAll(qPath: String): js.Promise[Boolean] = js.native
  def selectListObjectAll(qPath: String, qSoftLock: Boolean): js.Promise[Boolean] = js.native
  /**
    * Selects all values of a field.
    *
    * Note: This method applies to list objects (objects with one dimension).
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qListObjectDef.
    * >> This parameter is mandatory.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * >> This parameter is optional.
    * @returns - true or false.
    */
  def selectListObjectAlternative(qPath: String): js.Promise[Boolean] = js.native
  def selectListObjectAlternative(qPath: String, qSoftLock: Boolean): js.Promise[Boolean] = js.native
  /**
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qListObjectDef.
    * >> This parameter is mandatory.
    * @param qRanges -Selects ranges in a hypercube in (Ranges[N].Min,Ranges[N].Max) intervals.
    * If either Ranges[N].MinInclEq or Ranges[N].MaxInclEq, or both flags are set to true
    * then Min and Max values will be selected.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * >> This parameter is optional.
    * @returns - true or false.
    */
  def selectListObjectContinuousRange(qPath: String, qRanges: js.Array[Range]): js.Promise[Boolean] = js.native
  def selectListObjectContinuousRange(qPath: String, qRanges: js.Array[Range], qSoftLock: Boolean): js.Promise[Boolean] = js.native
  /**
    * Inverts the current selections in a specific field.
    *
    * Note: This method applies to list objects (objects with one dimension).
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qListObjectDef.
    * >> This parameter is mandatory.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * >> This parameter is optional.
    * @returns - true or false.
    */
  def selectListObjectExcluded(qPath: String): js.Promise[Boolean] = js.native
  def selectListObjectExcluded(qPath: String, qSoftLock: Boolean): js.Promise[Boolean] = js.native
  /**
    * Selects all possible values of a list object.
    *
    * Note: This method applies to list objects (objects with one dimension).
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qListObjectDef.
    * >> This parameter is mandatory.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * >> This parameter is optional.
    * @returns - true or false.
    */
  def selectListObjectPossible(qPath: String): js.Promise[Boolean] = js.native
  def selectListObjectPossible(qPath: String, qSoftLock: Boolean): js.Promise[Boolean] = js.native
  /**
    * Makes single selections in dimensions.
    *
    * Note: This method applies to list objects only.
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qListObjectDef.
    * >> This parameter is mandatory.
    * @param qValues - Element numbers to select.
    * You can select multiple values; the separator is the comma.
    * >> This parameter is mandatory.
    * @param qToggleMode - Set to true to toggle.
    * >> This parameter is mandatory.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * >> This parameter is optional.
    * @returns - true or false.
    */
  def selectListObjectValues(qPath: String, qValues: js.Array[Double], qToggleMode: Boolean): js.Promise[Boolean] = js.native
  def selectListObjectValues(qPath: String, qValues: js.Array[Double], qToggleMode: Boolean, qSoftLock: Boolean): js.Promise[Boolean] = js.native
  /**
    * Note: This method only applies to hypercubes that are not represented as straight tables.
    * The parameter qMode in HyperCubeDef must be set either to P or K.
    *
    * -- Pivot table --
    * Makes selections in the top or left dimension cells of a pivot table or in the data matrix.
    * Only expanded dimensions can be selected.
    *
    * -- Stacked table --
    * Makes selections in the left dimension cells of a stacked table or in the data matrix.
    *
    * Note: There is no top dimensions in a stacked table. A stacked table can only contain one measure.
    * @param qPath - Path to the definition of the object to be selected.
    * For example, /qHyperCubeDef.
    * >> This parameter is mandatory.
    * @param qSelections - Information about the selections to perform
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * >> This parameter is optional.
    * @param qDeselectOnlyOneSelected - Set this parameter to true to unselect the last single selected value.
    * There must be only one selected value in the field.
    * The default value is false.
    * @returns - true or false.
    */
  def selectPivotCells(qPath: String, qSelections: js.Array[INxSelectionCell], qDeselectOnlyOneSelected: Boolean): js.Promise[Boolean] = js.native
  def selectPivotCells(
    qPath: String,
    qSelections: js.Array[INxSelectionCell],
    qDeselectOnlyOneSelected: Boolean,
    qSoftLock: Boolean
  ): js.Promise[Boolean] = js.native
  /**
    * Sets the order of the children in a generic object.
    *
    * Note: To change the order of the children in a generic object, the identifiers of all the children
    * must be included in the list of the identifiers (in qIds).
    * @returns -
    */
  def setChildArrayOrder(qIds: js.Array[String]): js.Promise[Unit] = js.native
  /**
    * Sets the properties of:
    *
    * - a generic object
    * - the children of the generic object
    * - the bookmarks/embedded snapshots of the generic object
    *
    * Note: If the SetFullPropertyTree method is asked to set some properties to a child that does not exist,
    *           it creates the child.
    * Note: The type of an object cannot be updated.
    */
  def setFullPropertyTree(qPropEntry: IGenericObjectEntry): js.Promise[Unit] = js.native
  /**
    * Sets some properties for a generic object.
    *
    * Note: In addition to the parameters specified above, the object can get any properties
    * defined in the Generic objects section.
    */
  def setProperties(qProp: IGenericObjectProperties): js.Promise[Unit] = js.native
  /**
    * Unpublishes a generic object.
    *
    * Note: This operation is possible only in Qlik Sense Enterprise.
    */
  def unPublish(): js.Promise[Unit] = js.native
  /**
    * Unlocks the selected values of a generic object if the target (or handle ) is a generic object
    * @param qPath - Path to the definition of the object.
    * For example, /qListObjectDef.
    * @param qColIndices - Dimension numbers/indexes where the unlock should apply.
    * Dimension numbers/indexes start from 0.
    * This parameter is optional. If this parameter is not set, the locked values in all dimensions are unlocked.
    */
  def unlock(qPath: String): js.Promise[Unit] = js.native
  def unlock(qPath: String, qColIndices: js.Array[Double]): js.Promise[Unit] = js.native
}

