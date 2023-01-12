package typings.streamx

import typings.streamx.mod.MapFunction
import typings.streamx.mod.Readable
import typings.streamx.mod.ReadableEvents
import typings.streamx.mod.Writable
import typings.streamx.mod.WritableEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[TStream /* <: Writable[TType, TMapType, TByteType, Any, Any, WritableEvents[TType]] */, TType, TMapType, TByteType] extends StObject {
    
    var map: MapFunction[TStream, TType, TMapType]
  }
  object `0` {
    
    inline def apply[TStream /* <: Writable[TType, TMapType, TByteType, Any, Any, WritableEvents[TType]] */, TType, TMapType, TByteType](): `0`[TStream, TType, TMapType, TByteType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[TStream, TType, TMapType, TByteType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`[?, ?, ?, ?], TStream /* <: Writable[TType, TMapType, TByteType, Any, Any, WritableEvents[TType]] */, TType, TMapType, TByteType] (val x: Self & (`0`[TStream, TType, TMapType, TByteType])) extends AnyVal {
      
      inline def setMap(value: MapFunction[TStream, TType, TMapType]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  trait Map[TMapFallback, TStream /* <: Readable[TType, TMapType, TByteType, Any, Any, ReadableEvents[TMapType]] */, TType, TMapType, TByteType] extends StObject {
    
    var map: js.UndefOr[TMapFallback] = js.undefined
    
    var mapReadable: MapFunction[TStream, TType, TMapType]
  }
  object Map {
    
    inline def apply[TMapFallback, TStream /* <: Readable[TType, TMapType, TByteType, Any, Any, ReadableEvents[TMapType]] */, TType, TMapType, TByteType](): Map[TMapFallback, TStream, TType, TMapType, TByteType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Map[TMapFallback, TStream, TType, TMapType, TByteType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Map[?, ?, ?, ?, ?], TMapFallback, TStream /* <: Readable[TType, TMapType, TByteType, Any, Any, ReadableEvents[TMapType]] */, TType, TMapType, TByteType] (val x: Self & (Map[TMapFallback, TStream, TType, TMapType, TByteType])) extends AnyVal {
      
      inline def setMap(value: TMapFallback): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapReadable(value: MapFunction[TStream, TType, TMapType]): Self = StObject.set(x, "mapReadable", value.asInstanceOf[js.Any])
      
      inline def setMapReadableNull: Self = StObject.set(x, "mapReadable", null)
      
      inline def setMapReadableUndefined: Self = StObject.set(x, "mapReadable", js.undefined)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  trait MapMapFunction[TStream /* <: Readable[TType, TMapType, TByteType, Any, Any, ReadableEvents[TMapType]] */, TType, TMapType, TByteType] extends StObject {
    
    var map: MapFunction[TStream, TType, TMapType]
  }
  object MapMapFunction {
    
    inline def apply[TStream /* <: Readable[TType, TMapType, TByteType, Any, Any, ReadableEvents[TMapType]] */, TType, TMapType, TByteType](): MapMapFunction[TStream, TType, TMapType, TByteType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapMapFunction[TStream, TType, TMapType, TByteType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapMapFunction[?, ?, ?, ?], TStream /* <: Readable[TType, TMapType, TByteType, Any, Any, ReadableEvents[TMapType]] */, TType, TMapType, TByteType] (val x: Self & (MapMapFunction[TStream, TType, TMapType, TByteType])) extends AnyVal {
      
      inline def setMap(value: MapFunction[TStream, TType, TMapType]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  trait MapWritable[TMapFallback, TStream /* <: Writable[TType, TMapType, TByteType, Any, Any, WritableEvents[TType]] */, TType, TMapType, TByteType] extends StObject {
    
    var map: js.UndefOr[TMapFallback] = js.undefined
    
    var mapWritable: MapFunction[TStream, TType, TMapType]
  }
  object MapWritable {
    
    inline def apply[TMapFallback, TStream /* <: Writable[TType, TMapType, TByteType, Any, Any, WritableEvents[TType]] */, TType, TMapType, TByteType](): MapWritable[TMapFallback, TStream, TType, TMapType, TByteType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapWritable[TMapFallback, TStream, TType, TMapType, TByteType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapWritable[?, ?, ?, ?, ?], TMapFallback, TStream /* <: Writable[TType, TMapType, TByteType, Any, Any, WritableEvents[TType]] */, TType, TMapType, TByteType] (val x: Self & (MapWritable[TMapFallback, TStream, TType, TMapType, TByteType])) extends AnyVal {
      
      inline def setMap(value: TMapFallback): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMapWritable(value: MapFunction[TStream, TType, TMapType]): Self = StObject.set(x, "mapWritable", value.asInstanceOf[js.Any])
      
      inline def setMapWritableNull: Self = StObject.set(x, "mapWritable", null)
      
      inline def setMapWritableUndefined: Self = StObject.set(x, "mapWritable", js.undefined)
    }
  }
}
