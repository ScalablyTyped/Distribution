package typings.reactNativeFetchBlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Count extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
  }
  object Count {
    
    @scala.inline
    def apply(): Count = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
  
  trait Decode extends StObject {
    
    def decode(input: String): String
    
    def encode(input: String): String
  }
  object Decode {
    
    @scala.inline
    def apply(decode: String => String, encode: String => String): Decode = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Decode]
    }
    
    @scala.inline
    implicit class DecodeMutableBuilder[Self <: Decode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecode(value: String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncode(value: String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  trait Free extends StObject {
    
    var free: Double
    
    var total: Double
  }
  object Free {
    
    @scala.inline
    def apply(free: Double, total: Double): Free = {
      val __obj = js.Dynamic.literal(free = free.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Free]
    }
    
    @scala.inline
    implicit class FreeMutableBuilder[Self <: Free] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFree(value: Double): Self = StObject.set(x, "free", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
