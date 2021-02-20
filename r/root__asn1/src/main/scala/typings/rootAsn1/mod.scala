package typings.rootAsn1

import typings.rootAsn1.anon.Der
import typings.rootAsn1.anon.DerJson
import typings.rootAsn1.anon.Json
import typings.rootAsn1.anon.JsonVerbose
import typings.rootAsn1.anon.Verbose
import typings.rootAsn1.anon.`0`
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@root/asn1", "Any")
  @js.native
  def Any(hexType: String, hexBytes: String*): String = js.native
  @JSImport("@root/asn1", "Any")
  @js.native
  def Any(hexType: Double, hexBytes: String*): String = js.native
  
  @JSImport("@root/asn1", "BitStr")
  @js.native
  def BitStr(hexBitStream: String): String = js.native
  
  @JSImport("@root/asn1", "UInt")
  @js.native
  def UInt(hexBigInt: String): String = js.native
  
  @JSImport("@root/asn1", "pack")
  @js.native
  def pack(asn1: ArrInput): Uint8Array = js.native
  @JSImport("@root/asn1", "pack")
  @js.native
  def pack(asn1: ArrInput, opts: Json): Uint8Array = js.native
  @JSImport("@root/asn1", "pack")
  @js.native
  def pack(asn1: ArrInput, opts: `0`): String = js.native
  @JSImport("@root/asn1", "pack")
  @js.native
  def pack(asn1: ElementInput): Uint8Array = js.native
  @JSImport("@root/asn1", "pack")
  @js.native
  def pack(asn1: ElementInput, opts: Json): Uint8Array = js.native
  @JSImport("@root/asn1", "pack")
  @js.native
  def pack(asn1: ElementInput, opts: `0`): String = js.native
  
  @JSImport("@root/asn1", "parse")
  @js.native
  def parse(opts: Der): ArrJson = js.native
  @JSImport("@root/asn1", "parse")
  @js.native
  def parse(opts: DerJson): ElementHex = js.native
  @JSImport("@root/asn1", "parse")
  @js.native
  def parse(opts: JsonVerbose): ElementBuffer = js.native
  @JSImport("@root/asn1", "parse")
  @js.native
  def parse(opts: Verbose): ArrBuffer = js.native
  
  @JSImport("@root/asn1", "parseVerbose")
  @js.native
  def parseVerbose(buf: Uint8Array): ElementBuffer = js.native
  @JSImport("@root/asn1", "parseVerbose")
  @js.native
  def parseVerbose(buf: Uint8Array, opts: Json): ElementBuffer = js.native
  @JSImport("@root/asn1", "parseVerbose")
  @js.native
  def parseVerbose(buf: Uint8Array, opts: `0`): ElementHex = js.native
  
  type ArrBuffer = js.Tuple2[
    Double, 
    Uint8Array | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @root/asn1.@root/asn1.ArrBuffer */ js.Object
    ])
  ]
  
  type ArrInput = js.Tuple2[
    String | Double, 
    String | Uint8Array | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @root/asn1.@root/asn1.ArrInput */ js.Object
    ])
  ]
  
  type ArrJson = js.Tuple2[
    String, 
    String | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @root/asn1.@root/asn1.ArrJson */ js.Object
    ])
  ]
  
  @js.native
  trait Element[V /* <: String | Uint8Array */] extends StObject {
    
    var children: js.UndefOr[js.Array[Element[V]]] = js.native
    
    var length: Double = js.native
    
    var lengthSize: Double = js.native
    
    var `type`: Double = js.native
    
    var value: js.UndefOr[V] = js.native
  }
  object Element {
    
    @scala.inline
    def apply[V /* <: String | Uint8Array */](length: Double, lengthSize: Double, `type`: Double): Element[V] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], lengthSize = lengthSize.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element[V]]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element[_], V /* <: String | Uint8Array */] (val x: Self with Element[V]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[Element[V]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: Element[V]*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthSize(value: Double): Self = StObject.set(x, "lengthSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type ElementBuffer = Element[Uint8Array]
  
  type ElementHex = Element[String]
  
  @js.native
  trait ElementInput extends StObject {
    
    var children: js.UndefOr[js.Array[ElementInput]] = js.native
    
    var `type`: Double = js.native
    
    var value: js.UndefOr[String | Uint8Array] = js.native
  }
  object ElementInput {
    
    @scala.inline
    def apply(`type`: Double): ElementInput = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementInput]
    }
    
    @scala.inline
    implicit class ElementInputMutableBuilder[Self <: ElementInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ElementInput]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ElementInput*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
