package typings.rootAsn1

import typings.rootAsn1.anon.Der
import typings.rootAsn1.anon.DerJson
import typings.rootAsn1.anon.Json
import typings.rootAsn1.anon.JsonVerbose
import typings.rootAsn1.anon.Verbose
import typings.rootAsn1.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@root/asn1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Any(hexType: String, hexBytes: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Any")(scala.List(hexType.asInstanceOf[js.Any]).`++`(hexBytes.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  inline def Any(hexType: Double, hexBytes: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Any")(scala.List(hexType.asInstanceOf[js.Any]).`++`(hexBytes.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def BitStr(hexBitStream: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("BitStr")(hexBitStream.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def UInt(hexBigInt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UInt")(hexBigInt.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pack(asn1: ArrInput): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(asn1.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def pack(asn1: ArrInput, opts: Json): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(asn1.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def pack(asn1: ArrInput, opts: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(asn1.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pack(asn1: ElementInput): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(asn1.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def pack(asn1: ElementInput, opts: Json): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(asn1.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def pack(asn1: ElementInput, opts: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(asn1.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parse(opts: Der): ArrJson = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(opts.asInstanceOf[js.Any]).asInstanceOf[ArrJson]
  inline def parse(opts: DerJson): ElementHex = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(opts.asInstanceOf[js.Any]).asInstanceOf[ElementHex]
  inline def parse(opts: JsonVerbose): ElementBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(opts.asInstanceOf[js.Any]).asInstanceOf[ElementBuffer]
  inline def parse(opts: Verbose): ArrBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(opts.asInstanceOf[js.Any]).asInstanceOf[ArrBuffer]
  
  inline def parseVerbose(buf: js.typedarray.Uint8Array): ElementBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parseVerbose")(buf.asInstanceOf[js.Any]).asInstanceOf[ElementBuffer]
  inline def parseVerbose(buf: js.typedarray.Uint8Array, opts: Json): ElementBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("parseVerbose")(buf.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ElementBuffer]
  inline def parseVerbose(buf: js.typedarray.Uint8Array, opts: `0`): ElementHex = (^.asInstanceOf[js.Dynamic].applyDynamic("parseVerbose")(buf.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ElementHex]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ArrBuffer = [number, std.Uint8Array | std.Array<@root/asn1.@root/asn1.ArrBuffer>]
  }}}
  to avoid circular code involving: 
  - @root/asn1.@root/asn1.ArrBuffer
  */
  type ArrBuffer = js.Tuple2[Double, js.typedarray.Uint8Array | js.Array[Any]]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ArrInput = [string | number, string | std.Uint8Array | std.Array<@root/asn1.@root/asn1.ArrInput>]
  }}}
  to avoid circular code involving: 
  - @root/asn1.@root/asn1.ArrInput
  */
  type ArrInput = js.Tuple2[String | Double, String | js.typedarray.Uint8Array | js.Array[Any]]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ArrJson = [string, string | std.Array<@root/asn1.@root/asn1.ArrJson>]
  }}}
  to avoid circular code involving: 
  - @root/asn1.@root/asn1.ArrJson
  */
  type ArrJson = js.Tuple2[String, String | js.Array[Any]]
  
  trait Element[V /* <: String | js.typedarray.Uint8Array */] extends StObject {
    
    var children: js.UndefOr[js.Array[Element[V]]] = js.undefined
    
    var length: Double
    
    var lengthSize: Double
    
    var `type`: Double
    
    var value: js.UndefOr[V] = js.undefined
  }
  object Element {
    
    inline def apply[V /* <: String | js.typedarray.Uint8Array */](length: Double, lengthSize: Double, `type`: Double): Element[V] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], lengthSize = lengthSize.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element[V]]
    }
    
    extension [Self <: Element[?], V /* <: String | js.typedarray.Uint8Array */](x: Self & Element[V]) {
      
      inline def setChildren(value: js.Array[Element[V]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Element[V]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthSize(value: Double): Self = StObject.set(x, "lengthSize", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type ElementBuffer = Element[js.typedarray.Uint8Array]
  
  type ElementHex = Element[String]
  
  trait ElementInput extends StObject {
    
    var children: js.UndefOr[js.Array[ElementInput]] = js.undefined
    
    var `type`: Double
    
    var value: js.UndefOr[String | js.typedarray.Uint8Array] = js.undefined
  }
  object ElementInput {
    
    inline def apply(`type`: Double): ElementInput = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementInput]
    }
    
    extension [Self <: ElementInput](x: Self) {
      
      inline def setChildren(value: js.Array[ElementInput]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ElementInput*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
