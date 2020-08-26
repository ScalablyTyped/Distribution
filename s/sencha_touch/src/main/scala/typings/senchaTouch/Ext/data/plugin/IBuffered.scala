package typings.senchaTouch.Ext.data.plugin

import typings.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBuffered extends IEvented {
  /** [Method] Returns the value of bufferedCollection
    * @returns Object
    */
  var getBufferedCollection: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of leadingBufferZone
    * @returns Number
    */
  var getLeadingBufferZone: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Determines the page from a record index
    * @param index Number The record index
    * @returns Number The page the record belongs to
    */
  var getPageFromRecordIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Double]] = js.native
  /** [Method] Returns the value of purgePageCount
    * @returns Number
    */
  var getPurgePageCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of store
    * @returns Object
    */
  var getStore: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of trailingBufferZone
    * @returns Number
    */
  var getTrailingBufferZone: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of viewSize
    * @returns Number
    */
  var getViewSize: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[Double] = js.native
  /** [Method] Prefetches data into the store using its configured proxy
    * @param options Object config object, passed into the Ext.data.Operation object before loading. See load
    */
  var prefetch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Prefetches a page of data
    * @param page Number The page to prefetch
    * @param options Object config object, passed into the Ext.data.Operation object before loading. See load
    */
  var prefetchPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Number) */
  var purgePageCount: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of bufferedCollection
    * @param bufferedCollection Object The new value.
    */
  var setBufferedCollection: js.UndefOr[js.Function1[/* bufferedCollection */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of leadingBufferZone
    * @param leadingBufferZone Number The new value.
    */
  var setLeadingBufferZone: js.UndefOr[js.Function1[/* leadingBufferZone */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of purgePageCount
    * @param purgePageCount Number The new value.
    */
  var setPurgePageCount: js.UndefOr[js.Function1[/* purgePageCount */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of store
    * @param store Object The new value.
    */
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of trailingBufferZone
    * @param trailingBufferZone Number The new value.
    */
  var setTrailingBufferZone: js.UndefOr[js.Function1[/* trailingBufferZone */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of viewSize
    * @param viewSize Number The new value.
    */
  var setViewSize: js.UndefOr[js.Function1[/* viewSize */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[Double] = js.native
}

object IBuffered {
  @scala.inline
  def apply(): IBuffered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBuffered]
  }
  @scala.inline
  implicit class IBufferedOps[Self <: IBuffered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetBufferedCollection(value: () => _): Self = this.set("getBufferedCollection", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBufferedCollection: Self = this.set("getBufferedCollection", js.undefined)
    @scala.inline
    def setGetLeadingBufferZone(value: () => Double): Self = this.set("getLeadingBufferZone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLeadingBufferZone: Self = this.set("getLeadingBufferZone", js.undefined)
    @scala.inline
    def setGetPageFromRecordIndex(value: /* index */ js.UndefOr[Double] => Double): Self = this.set("getPageFromRecordIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPageFromRecordIndex: Self = this.set("getPageFromRecordIndex", js.undefined)
    @scala.inline
    def setGetPurgePageCount(value: () => Double): Self = this.set("getPurgePageCount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPurgePageCount: Self = this.set("getPurgePageCount", js.undefined)
    @scala.inline
    def setGetStore(value: () => _): Self = this.set("getStore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    @scala.inline
    def setGetTrailingBufferZone(value: () => Double): Self = this.set("getTrailingBufferZone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTrailingBufferZone: Self = this.set("getTrailingBufferZone", js.undefined)
    @scala.inline
    def setGetViewSize(value: () => Double): Self = this.set("getViewSize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetViewSize: Self = this.set("getViewSize", js.undefined)
    @scala.inline
    def setLeadingBufferZone(value: Double): Self = this.set("leadingBufferZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeadingBufferZone: Self = this.set("leadingBufferZone", js.undefined)
    @scala.inline
    def setPrefetch(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("prefetch", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrefetch: Self = this.set("prefetch", js.undefined)
    @scala.inline
    def setPrefetchPage(value: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("prefetchPage", js.Any.fromFunction2(value))
    @scala.inline
    def deletePrefetchPage: Self = this.set("prefetchPage", js.undefined)
    @scala.inline
    def setPurgePageCount(value: Double): Self = this.set("purgePageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurgePageCount: Self = this.set("purgePageCount", js.undefined)
    @scala.inline
    def setSetBufferedCollection(value: /* bufferedCollection */ js.UndefOr[js.Any] => Unit): Self = this.set("setBufferedCollection", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBufferedCollection: Self = this.set("setBufferedCollection", js.undefined)
    @scala.inline
    def setSetLeadingBufferZone(value: /* leadingBufferZone */ js.UndefOr[Double] => Unit): Self = this.set("setLeadingBufferZone", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLeadingBufferZone: Self = this.set("setLeadingBufferZone", js.undefined)
    @scala.inline
    def setSetPurgePageCount(value: /* purgePageCount */ js.UndefOr[Double] => Unit): Self = this.set("setPurgePageCount", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPurgePageCount: Self = this.set("setPurgePageCount", js.undefined)
    @scala.inline
    def setSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = this.set("setStore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStore: Self = this.set("setStore", js.undefined)
    @scala.inline
    def setSetTrailingBufferZone(value: /* trailingBufferZone */ js.UndefOr[Double] => Unit): Self = this.set("setTrailingBufferZone", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTrailingBufferZone: Self = this.set("setTrailingBufferZone", js.undefined)
    @scala.inline
    def setSetViewSize(value: /* viewSize */ js.UndefOr[Double] => Unit): Self = this.set("setViewSize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetViewSize: Self = this.set("setViewSize", js.undefined)
    @scala.inline
    def setTrailingBufferZone(value: Double): Self = this.set("trailingBufferZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailingBufferZone: Self = this.set("trailingBufferZone", js.undefined)
  }
  
}

