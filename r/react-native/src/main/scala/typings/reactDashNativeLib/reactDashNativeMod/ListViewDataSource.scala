package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViewDataSource
  extends /**
     * You can provide custom extraction and `hasChanged` functions for section
     * headers and rows.  If absent, data will be extracted with the
     * `defaultGetRowData` and `defaultGetSectionHeaderData` functions.
     *
     * The default extractor expects data of one of the following forms:
     *
     *      { sectionID_1: { rowID_1: <rowData1>, ... }, ... }
     *
     *    or
     *
     *      { sectionID_1: [ <rowData1>, <rowData2>, ... ], ... }
     *
     *    or
     *
     *      [ [ <rowData1>, <rowData2>, ... ], ... ]
     *
     * The constructor takes in a params argument that can contain any of the
     * following:
     *
     * - getRowData(dataBlob, sectionID, rowID);
     * - getSectionHeaderData(dataBlob, sectionID);
     * - rowHasChanged(prevRowData, nextRowData);
     * - sectionHeaderHasChanged(prevSectionData, nextSectionData);
     */
ScalablyTyped.runtime.Instantiable1[/* onAsset */ DataSourceAssetCallback, ListViewDataSource] {
  /**
       * Clones this `ListViewDataSource` with the specified `dataBlob` and
       * `rowIdentities`. The `dataBlob` is just an aribitrary blob of data. At
       * construction an extractor to get the interesting informatoin was defined
       * (or the default was used).
       *
       * The `rowIdentities` is is a 2D array of identifiers for rows.
       * ie. [['a1', 'a2'], ['b1', 'b2', 'b3'], ...].  If not provided, it's
       * assumed that the keys of the section data are the row identities.
       *
       * Note: This function does NOT clone the data in this data source. It simply
       * passes the functions defined at construction to a new data source with
       * the data specified. If you wish to maintain the existing data you must
       * handle merging of old and new data separately and then pass that into
       * this function as the `dataBlob`.
       */
  def cloneWithRows(dataBlob: ScalablyTyped.runtime.StringDictionary[js.Any]): ListViewDataSource = js.native
  /**
       * Clones this `ListViewDataSource` with the specified `dataBlob` and
       * `rowIdentities`. The `dataBlob` is just an aribitrary blob of data. At
       * construction an extractor to get the interesting informatoin was defined
       * (or the default was used).
       *
       * The `rowIdentities` is is a 2D array of identifiers for rows.
       * ie. [['a1', 'a2'], ['b1', 'b2', 'b3'], ...].  If not provided, it's
       * assumed that the keys of the section data are the row identities.
       *
       * Note: This function does NOT clone the data in this data source. It simply
       * passes the functions defined at construction to a new data source with
       * the data specified. If you wish to maintain the existing data you must
       * handle merging of old and new data separately and then pass that into
       * this function as the `dataBlob`.
       */
  def cloneWithRows(
    dataBlob: ScalablyTyped.runtime.StringDictionary[js.Any],
    rowIdentities: js.Array[java.lang.String | scala.Double]
  ): ListViewDataSource = js.native
  /**
       * Clones this `ListViewDataSource` with the specified `dataBlob` and
       * `rowIdentities`. The `dataBlob` is just an aribitrary blob of data. At
       * construction an extractor to get the interesting informatoin was defined
       * (or the default was used).
       *
       * The `rowIdentities` is is a 2D array of identifiers for rows.
       * ie. [['a1', 'a2'], ['b1', 'b2', 'b3'], ...].  If not provided, it's
       * assumed that the keys of the section data are the row identities.
       *
       * Note: This function does NOT clone the data in this data source. It simply
       * passes the functions defined at construction to a new data source with
       * the data specified. If you wish to maintain the existing data you must
       * handle merging of old and new data separately and then pass that into
       * this function as the `dataBlob`.
       */
  def cloneWithRows(dataBlob: js.Array[_]): ListViewDataSource = js.native
  /**
       * Clones this `ListViewDataSource` with the specified `dataBlob` and
       * `rowIdentities`. The `dataBlob` is just an aribitrary blob of data. At
       * construction an extractor to get the interesting informatoin was defined
       * (or the default was used).
       *
       * The `rowIdentities` is is a 2D array of identifiers for rows.
       * ie. [['a1', 'a2'], ['b1', 'b2', 'b3'], ...].  If not provided, it's
       * assumed that the keys of the section data are the row identities.
       *
       * Note: This function does NOT clone the data in this data source. It simply
       * passes the functions defined at construction to a new data source with
       * the data specified. If you wish to maintain the existing data you must
       * handle merging of old and new data separately and then pass that into
       * this function as the `dataBlob`.
       */
  def cloneWithRows(dataBlob: js.Array[_], rowIdentities: js.Array[java.lang.String | scala.Double]): ListViewDataSource = js.native
  /**
       * This performs the same function as the `cloneWithRows` function but here
       * you also specify what your `sectionIdentities` are. If you don't care
       * about sections you should safely be able to use `cloneWithRows`.
       *
       * `sectionIdentities` is an array of identifiers for  sections.
       * ie. ['s1', 's2', ...].  If not provided, it's assumed that the
       * keys of dataBlob are the section identities.
       *
       * Note: this returns a new object!
       */
  def cloneWithRowsAndSections(dataBlob: ScalablyTyped.runtime.StringDictionary[js.Any]): ListViewDataSource = js.native
  /**
       * This performs the same function as the `cloneWithRows` function but here
       * you also specify what your `sectionIdentities` are. If you don't care
       * about sections you should safely be able to use `cloneWithRows`.
       *
       * `sectionIdentities` is an array of identifiers for  sections.
       * ie. ['s1', 's2', ...].  If not provided, it's assumed that the
       * keys of dataBlob are the section identities.
       *
       * Note: this returns a new object!
       */
  def cloneWithRowsAndSections(
    dataBlob: ScalablyTyped.runtime.StringDictionary[js.Any],
    sectionIdentities: js.Array[java.lang.String | scala.Double]
  ): ListViewDataSource = js.native
  /**
       * This performs the same function as the `cloneWithRows` function but here
       * you also specify what your `sectionIdentities` are. If you don't care
       * about sections you should safely be able to use `cloneWithRows`.
       *
       * `sectionIdentities` is an array of identifiers for  sections.
       * ie. ['s1', 's2', ...].  If not provided, it's assumed that the
       * keys of dataBlob are the section identities.
       *
       * Note: this returns a new object!
       */
  def cloneWithRowsAndSections(
    dataBlob: ScalablyTyped.runtime.StringDictionary[js.Any],
    sectionIdentities: js.Array[java.lang.String | scala.Double],
    rowIdentities: js.Array[js.Array[java.lang.String | scala.Double]]
  ): ListViewDataSource = js.native
  /**
       * This performs the same function as the `cloneWithRows` function but here
       * you also specify what your `sectionIdentities` are. If you don't care
       * about sections you should safely be able to use `cloneWithRows`.
       *
       * `sectionIdentities` is an array of identifiers for  sections.
       * ie. ['s1', 's2', ...].  If not provided, it's assumed that the
       * keys of dataBlob are the section identities.
       *
       * Note: this returns a new object!
       */
  def cloneWithRowsAndSections(dataBlob: js.Array[_]): ListViewDataSource = js.native
  /**
       * This performs the same function as the `cloneWithRows` function but here
       * you also specify what your `sectionIdentities` are. If you don't care
       * about sections you should safely be able to use `cloneWithRows`.
       *
       * `sectionIdentities` is an array of identifiers for  sections.
       * ie. ['s1', 's2', ...].  If not provided, it's assumed that the
       * keys of dataBlob are the section identities.
       *
       * Note: this returns a new object!
       */
  def cloneWithRowsAndSections(dataBlob: js.Array[_], sectionIdentities: js.Array[java.lang.String | scala.Double]): ListViewDataSource = js.native
  /**
       * This performs the same function as the `cloneWithRows` function but here
       * you also specify what your `sectionIdentities` are. If you don't care
       * about sections you should safely be able to use `cloneWithRows`.
       *
       * `sectionIdentities` is an array of identifiers for  sections.
       * ie. ['s1', 's2', ...].  If not provided, it's assumed that the
       * keys of dataBlob are the section identities.
       *
       * Note: this returns a new object!
       */
  def cloneWithRowsAndSections(
    dataBlob: js.Array[_],
    sectionIdentities: js.Array[java.lang.String | scala.Double],
    rowIdentities: js.Array[js.Array[java.lang.String | scala.Double]]
  ): ListViewDataSource = js.native
  def getRowAndSectionCount(): scala.Double = js.native
  def getRowCount(): scala.Double = js.native
  /**
       * Gets the data required to render the row.
       */
  def getRowData(sectionIndex: scala.Double, rowIndex: scala.Double): js.Any = js.native
  /**
       * Gets the rowID at index provided if the dataSource arrays were flattened,
       * or null of out of range indexes.
       */
  def getRowIDForFlatIndex(index: scala.Double): java.lang.String = js.native
  /**
       * Gets the data required to render the section header
       */
  def getSectionHeaderData(sectionIndex: scala.Double): js.Any = js.native
  /**
       * Gets the sectionID at index provided if the dataSource arrays were flattened,
       * or null for out of range indexes.
       */
  def getSectionIDForFlatIndex(index: scala.Double): java.lang.String = js.native
  /**
       * Returns an array containing the number of rows in each section
       */
  def getSectionLengths(): js.Array[scala.Double] = js.native
  /**
       * Returns if the row is dirtied and needs to be rerendered
       */
  def rowShouldUpdate(sectionIndex: scala.Double, rowIndex: scala.Double): scala.Boolean = js.native
  /**
       * Returns if the section header is dirtied and needs to be rerendered
       */
  def sectionHeaderShouldUpdate(sectionIndex: scala.Double): scala.Boolean = js.native
}

