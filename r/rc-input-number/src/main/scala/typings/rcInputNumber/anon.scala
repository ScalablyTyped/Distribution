package typings.rcInputNumber

import typings.rcInputNumber.esUtilsMiniDecimalMod.ValueType
import typings.rcInputNumber.rcInputNumberStrings.down
import typings.rcInputNumber.rcInputNumberStrings.up
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait DecimalStr extends StObject {
    
    var decimalStr: String
    
    var fullStr: String
    
    var integerStr: String
    
    var negative: Boolean
    
    var negativeStr: String
    
    var trimStr: String
  }
  object DecimalStr {
    
    inline def apply(
      decimalStr: String,
      fullStr: String,
      integerStr: String,
      negative: Boolean,
      negativeStr: String,
      trimStr: String
    ): DecimalStr = {
      val __obj = js.Dynamic.literal(decimalStr = decimalStr.asInstanceOf[js.Any], fullStr = fullStr.asInstanceOf[js.Any], integerStr = integerStr.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], negativeStr = negativeStr.asInstanceOf[js.Any], trimStr = trimStr.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecimalStr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecimalStr] (val x: Self) extends AnyVal {
      
      inline def setDecimalStr(value: String): Self = StObject.set(x, "decimalStr", value.asInstanceOf[js.Any])
      
      inline def setFullStr(value: String): Self = StObject.set(x, "fullStr", value.asInstanceOf[js.Any])
      
      inline def setIntegerStr(value: String): Self = StObject.set(x, "integerStr", value.asInstanceOf[js.Any])
      
      inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setNegativeStr(value: String): Self = StObject.set(x, "negativeStr", value.asInstanceOf[js.Any])
      
      inline def setTrimStr(value: String): Self = StObject.set(x, "trimStr", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisplayName extends StObject {
    
    var displayName: js.UndefOr[String] = js.undefined
  }
  object DisplayName {
    
    inline def apply(): DisplayName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    }
  }
  
  trait Input extends StObject {
    
    var input: String
    
    var userTyping: Boolean
  }
  object Input {
    
    inline def apply(input: String, userTyping: Boolean): Input = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], userTyping = userTyping.asInstanceOf[js.Any])
      __obj.asInstanceOf[Input]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setUserTyping(value: Boolean): Self = StObject.set(x, "userTyping", value.asInstanceOf[js.Any])
    }
  }
  
  trait Offset extends StObject {
    
    var offset: ValueType
    
    var `type`: up | down
  }
  object Offset {
    
    inline def apply(offset: ValueType, `type`: up | down): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: ValueType): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setType(value: up | down): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
