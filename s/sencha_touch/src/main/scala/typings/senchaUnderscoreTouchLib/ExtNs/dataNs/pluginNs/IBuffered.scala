package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBuffered
  extends senchaUnderscoreTouchLib.ExtNs.IEvented {
  /** [Method] Returns the value of bufferedCollection
  		* @returns Object
  		*/
  var getBufferedCollection: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of leadingBufferZone
  		* @returns Number
  		*/
  var getLeadingBufferZone: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Determines the page from a record index
  		* @param index Number The record index
  		* @returns Number The page the record belongs to
  		*/
  var getPageFromRecordIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], scala.Double]] = js.undefined
  /** [Method] Returns the value of purgePageCount
  		* @returns Number
  		*/
  var getPurgePageCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of store
  		* @returns Object
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of trailingBufferZone
  		* @returns Number
  		*/
  var getTrailingBufferZone: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of viewSize
  		* @returns Number
  		*/
  var getViewSize: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Prefetches data into the store using its configured proxy
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Prefetches a page of data
  		* @param page Number The page to prefetch
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetchPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[scala.Double], /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var purgePageCount: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the value of bufferedCollection
  		* @param bufferedCollection Object The new value.
  		*/
  var setBufferedCollection: js.UndefOr[js.Function1[/* bufferedCollection */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of leadingBufferZone
  		* @param leadingBufferZone Number The new value.
  		*/
  var setLeadingBufferZone: js.UndefOr[js.Function1[/* leadingBufferZone */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of purgePageCount
  		* @param purgePageCount Number The new value.
  		*/
  var setPurgePageCount: js.UndefOr[js.Function1[/* purgePageCount */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of trailingBufferZone
  		* @param trailingBufferZone Number The new value.
  		*/
  var setTrailingBufferZone: js.UndefOr[js.Function1[/* trailingBufferZone */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of viewSize
  		* @param viewSize Number The new value.
  		*/
  var setViewSize: js.UndefOr[js.Function1[/* viewSize */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[scala.Double] = js.undefined
}

