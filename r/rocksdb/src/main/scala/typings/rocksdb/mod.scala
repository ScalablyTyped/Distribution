package typings.rocksdb

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.abstractLeveldown.mod.AbstractBatch
import typings.abstractLeveldown.mod.AbstractChainedBatch
import typings.abstractLeveldown.mod.AbstractGetOptions
import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractIteratorOptions
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.abstractLeveldown.mod.AbstractOpenOptions
import typings.abstractLeveldown.mod.AbstractOptions
import typings.abstractLeveldown.mod.ErrorCallback
import typings.abstractLeveldown.mod.ErrorKeyValueCallback
import typings.abstractLeveldown.mod.ErrorValueCallback
import typings.node.Buffer
import typings.rocksdb.mod.RocksDB.BatchOptions
import typings.rocksdb.mod.RocksDB.Bytes
import typings.rocksdb.mod.RocksDB.Constructor
import typings.rocksdb.mod.RocksDB.DelOptions
import typings.rocksdb.mod.RocksDB.ErrorSizeCallback
import typings.rocksdb.mod.RocksDB.GetOptions
import typings.rocksdb.mod.RocksDB.Iterator
import typings.rocksdb.mod.RocksDB.IteratorOptions
import typings.rocksdb.mod.RocksDB.PutOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rocksdb", JSImport.Default)
    @js.native
    class ^ protected ()
      extends StObject
         with RocksDB {
      def this(location: String) = this()
    }
    
    @JSImport("rocksdb", JSImport.Default)
    @js.native
    val ^ : Constructor = js.native
    
    type _To = Constructor
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Constructor = ^
  }
  
  @js.native
  trait RocksDB
    extends StObject
       with AbstractLevelDOWN[Bytes, Bytes] {
    
    def approximateSize(start: Bytes, end: Bytes, cb: ErrorSizeCallback): Unit = js.native
    
    def batch(array: js.Array[AbstractBatch[js.Any, js.Any]], options: BatchOptions, cb: ErrorCallback): AbstractChainedBatch[Bytes, Bytes] = js.native
    
    def compactRange(start: Bytes, end: Bytes, cb: ErrorCallback): Unit = js.native
    
    def del(key: Bytes, options: DelOptions, cb: ErrorCallback): Unit = js.native
    
    def destroy(location: String, cb: ErrorCallback): Unit = js.native
    
    def get(key: Bytes, options: GetOptions, cb: ErrorValueCallback[Bytes]): Unit = js.native
    
    def getProperty(property: String): String = js.native
    
    def iterator(options: IteratorOptions): Iterator = js.native
    
    def put(key: Bytes, value: Bytes, options: PutOptions, cb: ErrorCallback): Unit = js.native
    
    def repair(location: String, cb: ErrorCallback): Unit = js.native
  }
  object RocksDB {
    
    trait BatchOptions
      extends StObject
         with AbstractOptions {
      
      var sync: js.UndefOr[Boolean] = js.undefined
    }
    object BatchOptions {
      
      inline def apply(): BatchOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchOptions]
      }
      
      extension [Self <: BatchOptions](x: Self) {
        
        inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
        
        inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      }
    }
    
    type Bytes = String | Buffer
    
    @js.native
    trait Constructor
      extends StObject
         with Instantiable1[/* location */ String, RocksDB] {
      
      def apply(location: String): RocksDB = js.native
    }
    
    trait DelOptions
      extends StObject
         with AbstractOptions {
      
      var sync: js.UndefOr[Boolean] = js.undefined
    }
    object DelOptions {
      
      inline def apply(): DelOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DelOptions]
      }
      
      extension [Self <: DelOptions](x: Self) {
        
        inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
        
        inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      }
    }
    
    type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[Error], /* size */ Double, Unit]
    
    trait GetOptions
      extends StObject
         with AbstractGetOptions {
      
      var fillCache: js.UndefOr[Boolean] = js.undefined
    }
    object GetOptions {
      
      inline def apply(): GetOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetOptions]
      }
      
      extension [Self <: GetOptions](x: Self) {
        
        inline def setFillCache(value: Boolean): Self = StObject.set(x, "fillCache", value.asInstanceOf[js.Any])
        
        inline def setFillCacheUndefined: Self = StObject.set(x, "fillCache", js.undefined)
      }
    }
    
    trait Iterator
      extends StObject
         with AbstractIterator[Bytes, Bytes] {
      
      var binding: js.Any
      
      var cache: js.Any
      
      var fastFuture: js.Any
      
      var finished: js.Any
      
      def seek(key: Bytes): Unit
    }
    object Iterator {
      
      inline def apply(
        binding: js.Any,
        cache: js.Any,
        db: AbstractLevelDOWN[Bytes, Bytes],
        end: ErrorCallback => Unit,
        fastFuture: js.Any,
        finished: js.Any,
        next: ErrorKeyValueCallback[Bytes, Bytes] => Iterator,
        seek: Bytes => Unit
      ): Iterator = {
        val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), fastFuture = fastFuture.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], next = js.Any.fromFunction1(next), seek = js.Any.fromFunction1(seek))
        __obj.asInstanceOf[Iterator]
      }
      
      extension [Self <: Iterator](x: Self) {
        
        inline def setBinding(value: js.Any): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
        
        inline def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        inline def setFastFuture(value: js.Any): Self = StObject.set(x, "fastFuture", value.asInstanceOf[js.Any])
        
        inline def setFinished(value: js.Any): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
        
        inline def setSeek(value: Bytes => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
      }
    }
    
    trait IteratorOptions
      extends StObject
         with AbstractIteratorOptions[Bytes] {
      
      var fillCache: js.UndefOr[Boolean] = js.undefined
    }
    object IteratorOptions {
      
      inline def apply(): IteratorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IteratorOptions]
      }
      
      extension [Self <: IteratorOptions](x: Self) {
        
        inline def setFillCache(value: Boolean): Self = StObject.set(x, "fillCache", value.asInstanceOf[js.Any])
        
        inline def setFillCacheUndefined: Self = StObject.set(x, "fillCache", js.undefined)
      }
    }
    
    // tslint:disable-next-line:no-empty-interface
    type OpenOptions = AbstractOpenOptions
    
    trait PutOptions
      extends StObject
         with AbstractOptions {
      
      var sync: js.UndefOr[Boolean] = js.undefined
    }
    object PutOptions {
      
      inline def apply(): PutOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PutOptions]
      }
      
      extension [Self <: PutOptions](x: Self) {
        
        inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
        
        inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      }
    }
  }
}
