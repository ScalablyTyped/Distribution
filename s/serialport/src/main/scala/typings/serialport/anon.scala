package typings.serialport

import typings.node.bufferMod.global.Buffer
import typings.serialport.serialportStrings.ascii
import typings.serialport.serialportStrings.base64
import typings.serialport.serialportStrings.binary
import typings.serialport.serialportStrings.hex
import typings.serialport.serialportStrings.ucs2
import typings.serialport.serialportStrings.utf16le
import typings.serialport.serialportStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var delimiter: String | Buffer | js.Array[Double]
  }
  object `0` {
    
    inline def apply(delimiter: String | Buffer | js.Array[Double]): `0` = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setDelimiter(value: String | Buffer | js.Array[Double]): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterVarargs(value: Double*): Self = StObject.set(x, "delimiter", js.Array(value*))
    }
  }
  
  trait Cts extends StObject {
    
    var cts: Boolean
    
    var dcd: Boolean
    
    var dsr: Boolean
  }
  object Cts {
    
    inline def apply(cts: Boolean, dcd: Boolean, dsr: Boolean): Cts = {
      val __obj = js.Dynamic.literal(cts = cts.asInstanceOf[js.Any], dcd = dcd.asInstanceOf[js.Any], dsr = dsr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cts]
    }
    
    extension [Self <: Cts](x: Self) {
      
      inline def setCts(value: Boolean): Self = StObject.set(x, "cts", value.asInstanceOf[js.Any])
      
      inline def setDcd(value: Boolean): Self = StObject.set(x, "dcd", value.asInstanceOf[js.Any])
      
      inline def setDsr(value: Boolean): Self = StObject.set(x, "dsr", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delimiter extends StObject {
    
    var delimiter: String | Buffer | js.Array[Double]
    
    var includeDelimiter: js.UndefOr[Boolean] = js.undefined
  }
  object Delimiter {
    
    inline def apply(delimiter: String | Buffer | js.Array[Double]): Delimiter = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delimiter]
    }
    
    extension [Self <: Delimiter](x: Self) {
      
      inline def setDelimiter(value: String | Buffer | js.Array[Double]): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterVarargs(value: Double*): Self = StObject.set(x, "delimiter", js.Array(value*))
      
      inline def setIncludeDelimiter(value: Boolean): Self = StObject.set(x, "includeDelimiter", value.asInstanceOf[js.Any])
      
      inline def setIncludeDelimiterUndefined: Self = StObject.set(x, "includeDelimiter", js.undefined)
    }
  }
  
  trait Encoding extends StObject {
    
    var delimiter: String | Buffer | js.Array[Double]
    
    var encoding: js.UndefOr[ascii | utf8 | utf16le | ucs2 | base64 | binary | hex] = js.undefined
    
    var includeDelimiter: js.UndefOr[Boolean] = js.undefined
  }
  object Encoding {
    
    inline def apply(delimiter: String | Buffer | js.Array[Double]): Encoding = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setDelimiter(value: String | Buffer | js.Array[Double]): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterVarargs(value: Double*): Self = StObject.set(x, "delimiter", js.Array(value*))
      
      inline def setEncoding(value: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setIncludeDelimiter(value: Boolean): Self = StObject.set(x, "includeDelimiter", value.asInstanceOf[js.Any])
      
      inline def setIncludeDelimiterUndefined: Self = StObject.set(x, "includeDelimiter", js.undefined)
    }
  }
  
  trait Length extends StObject {
    
    var length: Double
  }
  object Length {
    
    inline def apply(length: Double): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    extension [Self <: Length](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Regex extends StObject {
    
    var regex: js.RegExp
  }
  object Regex {
    
    inline def apply(regex: js.RegExp): Regex = {
      val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Regex]
    }
    
    extension [Self <: Regex](x: Self) {
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Vmin extends StObject {
    
    var vmin: js.UndefOr[Double] = js.undefined
    
    var vtime: js.UndefOr[Double] = js.undefined
  }
  object Vmin {
    
    inline def apply(): Vmin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Vmin]
    }
    
    extension [Self <: Vmin](x: Self) {
      
      inline def setVmin(value: Double): Self = StObject.set(x, "vmin", value.asInstanceOf[js.Any])
      
      inline def setVminUndefined: Self = StObject.set(x, "vmin", js.undefined)
      
      inline def setVtime(value: Double): Self = StObject.set(x, "vtime", value.asInstanceOf[js.Any])
      
      inline def setVtimeUndefined: Self = StObject.set(x, "vtime", js.undefined)
    }
  }
}
