package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IEvented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugin {
  
  trait IBuffered
    extends StObject
       with IEvented {
    
    /** [Method] Returns the value of bufferedCollection
      * @returns Object
      */
    var getBufferedCollection: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of leadingBufferZone
      * @returns Number
      */
    var getLeadingBufferZone: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Determines the page from a record index
      * @param index Number The record index
      * @returns Number The page the record belongs to
      */
    var getPageFromRecordIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Double]] = js.undefined
    
    /** [Method] Returns the value of purgePageCount
      * @returns Number
      */
    var getPurgePageCount: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of store
      * @returns Object
      */
    var getStore: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of trailingBufferZone
      * @returns Number
      */
    var getTrailingBufferZone: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of viewSize
      * @returns Number
      */
    var getViewSize: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Config Option] (Number) */
    var leadingBufferZone: js.UndefOr[Double] = js.undefined
    
    /** [Method] Prefetches data into the store using its configured proxy
      * @param options Object config object, passed into the Ext.data.Operation object before loading. See load
      */
    var prefetch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Prefetches a page of data
      * @param page Number The page to prefetch
      * @param options Object config object, passed into the Ext.data.Operation object before loading. See load
      */
    var prefetchPage: js.UndefOr[
        js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
    /** [Config Option] (Number) */
    var purgePageCount: js.UndefOr[Double] = js.undefined
    
    /** [Method] Sets the value of bufferedCollection
      * @param bufferedCollection Object The new value.
      */
    var setBufferedCollection: js.UndefOr[js.Function1[/* bufferedCollection */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of leadingBufferZone
      * @param leadingBufferZone Number The new value.
      */
    var setLeadingBufferZone: js.UndefOr[js.Function1[/* leadingBufferZone */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of purgePageCount
      * @param purgePageCount Number The new value.
      */
    var setPurgePageCount: js.UndefOr[js.Function1[/* purgePageCount */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of store
      * @param store Object The new value.
      */
    var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of trailingBufferZone
      * @param trailingBufferZone Number The new value.
      */
    var setTrailingBufferZone: js.UndefOr[js.Function1[/* trailingBufferZone */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of viewSize
      * @param viewSize Number The new value.
      */
    var setViewSize: js.UndefOr[js.Function1[/* viewSize */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var trailingBufferZone: js.UndefOr[Double] = js.undefined
  }
  object IBuffered {
    
    @scala.inline
    def apply(): IBuffered = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBuffered]
    }
    
    @scala.inline
    implicit class IBufferedMutableBuilder[Self <: IBuffered] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetBufferedCollection(value: () => js.Any): Self = StObject.set(x, "getBufferedCollection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBufferedCollectionUndefined: Self = StObject.set(x, "getBufferedCollection", js.undefined)
      
      @scala.inline
      def setGetLeadingBufferZone(value: () => Double): Self = StObject.set(x, "getLeadingBufferZone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLeadingBufferZoneUndefined: Self = StObject.set(x, "getLeadingBufferZone", js.undefined)
      
      @scala.inline
      def setGetPageFromRecordIndex(value: /* index */ js.UndefOr[Double] => Double): Self = StObject.set(x, "getPageFromRecordIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPageFromRecordIndexUndefined: Self = StObject.set(x, "getPageFromRecordIndex", js.undefined)
      
      @scala.inline
      def setGetPurgePageCount(value: () => Double): Self = StObject.set(x, "getPurgePageCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPurgePageCountUndefined: Self = StObject.set(x, "getPurgePageCount", js.undefined)
      
      @scala.inline
      def setGetStore(value: () => js.Any): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
      
      @scala.inline
      def setGetTrailingBufferZone(value: () => Double): Self = StObject.set(x, "getTrailingBufferZone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTrailingBufferZoneUndefined: Self = StObject.set(x, "getTrailingBufferZone", js.undefined)
      
      @scala.inline
      def setGetViewSize(value: () => Double): Self = StObject.set(x, "getViewSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewSizeUndefined: Self = StObject.set(x, "getViewSize", js.undefined)
      
      @scala.inline
      def setLeadingBufferZone(value: Double): Self = StObject.set(x, "leadingBufferZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingBufferZoneUndefined: Self = StObject.set(x, "leadingBufferZone", js.undefined)
      
      @scala.inline
      def setPrefetch(value: /* options */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "prefetch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefetchPage(value: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "prefetchPage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrefetchPageUndefined: Self = StObject.set(x, "prefetchPage", js.undefined)
      
      @scala.inline
      def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
      
      @scala.inline
      def setPurgePageCount(value: Double): Self = StObject.set(x, "purgePageCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurgePageCountUndefined: Self = StObject.set(x, "purgePageCount", js.undefined)
      
      @scala.inline
      def setSetBufferedCollection(value: /* bufferedCollection */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBufferedCollection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBufferedCollectionUndefined: Self = StObject.set(x, "setBufferedCollection", js.undefined)
      
      @scala.inline
      def setSetLeadingBufferZone(value: /* leadingBufferZone */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setLeadingBufferZone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLeadingBufferZoneUndefined: Self = StObject.set(x, "setLeadingBufferZone", js.undefined)
      
      @scala.inline
      def setSetPurgePageCount(value: /* purgePageCount */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setPurgePageCount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPurgePageCountUndefined: Self = StObject.set(x, "setPurgePageCount", js.undefined)
      
      @scala.inline
      def setSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setStore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStoreUndefined: Self = StObject.set(x, "setStore", js.undefined)
      
      @scala.inline
      def setSetTrailingBufferZone(value: /* trailingBufferZone */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTrailingBufferZone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTrailingBufferZoneUndefined: Self = StObject.set(x, "setTrailingBufferZone", js.undefined)
      
      @scala.inline
      def setSetViewSize(value: /* viewSize */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setViewSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetViewSizeUndefined: Self = StObject.set(x, "setViewSize", js.undefined)
      
      @scala.inline
      def setTrailingBufferZone(value: Double): Self = StObject.set(x, "trailingBufferZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingBufferZoneUndefined: Self = StObject.set(x, "trailingBufferZone", js.undefined)
    }
  }
}
