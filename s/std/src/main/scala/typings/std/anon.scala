package typings.std

import typings.std.stdStrings.byob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    @JSName(js.Symbol.replace)
    var replace: js.Function2[
        /* string */ java.lang.String, 
        /* replacer */ js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String], 
        java.lang.String
      ] = js.native
  }
  
  trait CopyWithin extends StObject {
    
    var copyWithin: scala.Boolean
    
    var entries: scala.Boolean
    
    var fill: scala.Boolean
    
    var find: scala.Boolean
    
    var findIndex: scala.Boolean
    
    var keys: scala.Boolean
    
    var values: scala.Boolean
  }
  object CopyWithin {
    
    inline def apply(
      copyWithin: scala.Boolean,
      entries: scala.Boolean,
      fill: scala.Boolean,
      find: scala.Boolean,
      findIndex: scala.Boolean,
      keys: scala.Boolean,
      values: scala.Boolean
    ): CopyWithin = {
      val __obj = js.Dynamic.literal(copyWithin = copyWithin.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyWithin]
    }
    
    extension [Self <: CopyWithin](x: Self) {
      
      inline def setCopyWithin(value: scala.Boolean): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      inline def setEntries(value: scala.Boolean): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setFill(value: scala.Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFind(value: scala.Boolean): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindIndex(value: scala.Boolean): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: scala.Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setValues(value: scala.Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait Done[Arr] extends StObject {
    
    var done: Arr
    
    var recur: Arr
  }
  object Done {
    
    inline def apply[Arr](done: Arr, recur: Arr): Done[Arr] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], recur = recur.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[Arr]]
    }
    
    extension [Self <: Done[?], Arr](x: Self & Done[Arr]) {
      
      inline def setDone(value: Arr): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setRecur(value: Arr): Self = StObject.set(x, "recur", value.asInstanceOf[js.Any])
    }
  }
  
  trait HighWaterMark extends StObject {
    
    var highWaterMark: Double
  }
  object HighWaterMark {
    
    inline def apply(highWaterMark: Double): HighWaterMark = {
      val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighWaterMark]
    }
    
    extension [Self <: HighWaterMark](x: Self) {
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    }
  }
  
  trait Item[T] extends StObject {
    
    def Item(index: js.Any): T
  }
  object Item {
    
    inline def apply[T](Item: js.Any => T): Item[T] = {
      val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
      __obj.asInstanceOf[Item[T]]
    }
    
    extension [Self <: Item[?], T](x: Self & Item[T]) {
      
      inline def setItem(value: js.Any => T): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    }
  }
  
  trait Length extends StObject {
    
    def Item(n: Double): java.lang.String
    
    var length: Double
  }
  object Length {
    
    inline def apply(Item: Double => java.lang.String, length: Double): Length = {
      val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    extension [Self <: Length](x: Self) {
      
      inline def setItem(value: Double => java.lang.String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LookupNamespaceURI extends StObject {
    
    def lookupNamespaceURI(): java.lang.String | Null = js.native
    def lookupNamespaceURI(prefix: java.lang.String): java.lang.String | Null = js.native
  }
  
  @js.native
  trait Match extends StObject {
    
    @JSName(js.Symbol.`match`)
    var `match`: js.Function1[/* string */ java.lang.String, RegExpMatchArray | Null] = js.native
  }
  
  trait Mode extends StObject {
    
    var mode: byob
  }
  object Mode {
    
    inline def apply(): Mode = {
      val __obj = js.Dynamic.literal(mode = "byob")
      __obj.asInstanceOf[Mode]
    }
    
    extension [Self <: Mode](x: Self) {
      
      inline def setMode(value: byob): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Proxy[T /* <: js.Object */] extends StObject {
    
    var proxy: T
    
    def revoke(): Unit
  }
  object Proxy {
    
    inline def apply[T /* <: js.Object */](proxy: T, revoke: () => Unit): Proxy[T] = {
      val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any], revoke = js.Any.fromFunction0(revoke))
      __obj.asInstanceOf[Proxy[T]]
    }
    
    extension [Self <: Proxy[?], T /* <: js.Object */](x: Self & Proxy[T]) {
      
      inline def setProxy(value: T): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setRevoke(value: () => Unit): Self = StObject.set(x, "revoke", js.Any.fromFunction0(value))
    }
  }
  
  trait Readable[R, T] extends StObject {
    
    var readable: ReadableStream[T]
    
    var writable: WritableStream[R]
  }
  object Readable {
    
    inline def apply[R, T](readable: ReadableStream[T], writable: WritableStream[R]): Readable[R, T] = {
      val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Readable[R, T]]
    }
    
    extension [Self <: Readable[?, ?], R, T](x: Self & (Readable[R, T])) {
      
      inline def setReadable(value: ReadableStream[T]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setWritable(value: WritableStream[R]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Replace extends StObject {
    
    @JSName(js.Symbol.replace)
    var replace: js.Function2[/* string */ java.lang.String, /* replaceValue */ java.lang.String, java.lang.String] = js.native
  }
  
  @js.native
  trait Search extends StObject {
    
    @JSName(js.Symbol.search)
    var search: js.Function1[/* string */ java.lang.String, Double] = js.native
  }
  
  trait Size extends StObject {
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var size: Unit
  }
  object Size {
    
    inline def apply(size: Unit): Size = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setSize(value: Unit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Split extends StObject {
    
    @JSName(js.Symbol.split)
    var split: js.Function2[
        /* string */ java.lang.String, 
        /* limit */ js.UndefOr[Double], 
        js.Array[java.lang.String]
      ] = js.native
  }
}
