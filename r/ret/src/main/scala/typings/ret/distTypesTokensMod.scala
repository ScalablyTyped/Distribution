package typings.ret

import typings.ret.anon.Type
import typings.ret.distTypesTypesMod.types.CHAR
import typings.ret.distTypesTypesMod.types.GROUP
import typings.ret.distTypesTypesMod.types.POSITION
import typings.ret.distTypesTypesMod.types.RANGE
import typings.ret.distTypesTypesMod.types.REFERENCE
import typings.ret.distTypesTypesMod.types.REPETITION
import typings.ret.distTypesTypesMod.types.ROOT
import typings.ret.distTypesTypesMod.types.SET
import typings.ret.retStrings.$
import typings.ret.retStrings.B
import typings.ret.retStrings.^
import typings.ret.retStrings.b_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensMod {
  
  type Base[T, K] = Type[T] & K
  
  /* Inlined ret.ret/dist/types/tokens.ValueType<ret.ret/dist/types/types.types.CHAR, number> */
  trait Char
    extends StObject
       with Token {
    
    var `type`: CHAR
    
    var value: Double
  }
  object Char {
    
    inline def apply(`type`: CHAR, value: Double): Char = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Char]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Char] (val x: Self) extends AnyVal {
      
      inline def setType(value: CHAR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined ret.ret/dist/types/tokens.Base<ret.ret/dist/types/types.types.GROUP, {  stack :std.Array<ret.ret/dist/types/tokens.Token> | undefined,   options :std.Array<std.Array<ret.ret/dist/types/tokens.Token>> | undefined,   remember :boolean,   followedBy :boolean | undefined,   notFollowedBy :boolean | undefined,   lookBehind :boolean | undefined}> */
  trait Group
    extends StObject
       with Token {
    
    var followedBy: js.UndefOr[Boolean] = js.undefined
    
    var lookBehind: js.UndefOr[Boolean] = js.undefined
    
    var notFollowedBy: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[js.Array[js.Array[Token]]] = js.undefined
    
    var remember: Boolean
    
    var stack: js.UndefOr[js.Array[Token]] = js.undefined
    
    var `type`: GROUP
  }
  object Group {
    
    inline def apply(remember: Boolean, `type`: GROUP): Group = {
      val __obj = js.Dynamic.literal(remember = remember.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      inline def setFollowedBy(value: Boolean): Self = StObject.set(x, "followedBy", value.asInstanceOf[js.Any])
      
      inline def setFollowedByUndefined: Self = StObject.set(x, "followedBy", js.undefined)
      
      inline def setLookBehind(value: Boolean): Self = StObject.set(x, "lookBehind", value.asInstanceOf[js.Any])
      
      inline def setLookBehindUndefined: Self = StObject.set(x, "lookBehind", js.undefined)
      
      inline def setNotFollowedBy(value: Boolean): Self = StObject.set(x, "notFollowedBy", value.asInstanceOf[js.Any])
      
      inline def setNotFollowedByUndefined: Self = StObject.set(x, "notFollowedBy", js.undefined)
      
      inline def setOptions(value: js.Array[js.Array[Token]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: js.Array[Token]*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setRemember(value: Boolean): Self = StObject.set(x, "remember", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Array[Token]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setStackVarargs(value: Token*): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def setType(value: GROUP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined ret.ret/dist/types/tokens.ValueType<ret.ret/dist/types/types.types.POSITION, '$' | '^' | 'b' | 'B'> */
  trait Position
    extends StObject
       with Token {
    
    var `type`: POSITION
    
    var value: $ | ^ | b_ | B
  }
  object Position {
    
    inline def apply(`type`: POSITION, value: $ | ^ | b_ | B): Position = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setType(value: POSITION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: $ | ^ | b_ | B): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined ret.ret/dist/types/tokens.Base<ret.ret/dist/types/types.types.RANGE, {  from :number,   to :number}> */
  trait Range
    extends StObject
       with Token {
    
    var from: Double
    
    var to: Double
    
    var `type`: RANGE
  }
  object Range {
    
    inline def apply(from: Double, to: Double, `type`: RANGE): Range = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: RANGE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined ret.ret/dist/types/tokens.ValueType<ret.ret/dist/types/types.types.REFERENCE, number> */
  trait Reference
    extends StObject
       with Token {
    
    var `type`: REFERENCE
    
    var value: Double
  }
  object Reference {
    
    inline def apply(`type`: REFERENCE, value: Double): Reference = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reference]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
      
      inline def setType(value: REFERENCE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined ret.ret/dist/types/tokens.Base<ret.ret/dist/types/types.types.REPETITION, {  min :number,   max :number,   value :ret.ret/dist/types/tokens.Token}> */
  trait Repetition
    extends StObject
       with Token {
    
    var max: Double
    
    var min: Double
    
    var `type`: REPETITION
    
    var value: Token
  }
  object Repetition {
    
    inline def apply(max: Double, min: Double, `type`: REPETITION, value: Token): Repetition = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Repetition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Repetition] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setType(value: REPETITION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Token): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined ret.ret/dist/types/tokens.Base<ret.ret/dist/types/types.types.ROOT, {  stack :std.Array<ret.ret/dist/types/tokens.Token> | undefined,   options :std.Array<std.Array<ret.ret/dist/types/tokens.Token>> | undefined,   flags :std.Array<string> | undefined}> */
  trait Root
    extends StObject
       with Tokens {
    
    var flags: js.UndefOr[js.Array[String]] = js.undefined
    
    var options: js.UndefOr[js.Array[js.Array[Token]]] = js.undefined
    
    var stack: js.UndefOr[js.Array[Token]] = js.undefined
    
    var `type`: ROOT
  }
  object Root {
    
    inline def apply(`type`: ROOT): Root = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Root]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
      
      inline def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value*))
      
      inline def setOptions(value: js.Array[js.Array[Token]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: js.Array[Token]*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setStack(value: js.Array[Token]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setStackVarargs(value: Token*): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def setType(value: ROOT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined ret.ret/dist/types/tokens.Base<ret.ret/dist/types/types.types.SET, {  set :ret.ret/dist/types/tokens.SetTokens,   not :boolean}> */
  trait Set
    extends StObject
       with Token {
    
    var not: Boolean
    
    var set: SetTokens
    
    var `type`: SET
  }
  object Set {
    
    inline def apply(not: Boolean, set: SetTokens, `type`: SET): Set = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Set]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Set] (val x: Self) extends AnyVal {
      
      inline def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setSet(value: SetTokens): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetVarargs(value: (Range | Char | Set)*): Self = StObject.set(x, "set", js.Array(value*))
      
      inline def setType(value: SET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type SetTokens = js.Array[Range | Char | Set]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ret.distTypesTokensMod.Group
    - typings.ret.distTypesTokensMod.Position
    - typings.ret.distTypesTokensMod.Set
    - typings.ret.distTypesTokensMod.Range
    - typings.ret.distTypesTokensMod.Repetition
    - typings.ret.distTypesTokensMod.Reference
    - typings.ret.distTypesTokensMod.Char
  */
  trait Token
    extends StObject
       with Tokens
  object Token {
    
    inline def Char(`type`: CHAR, value: Double): typings.ret.distTypesTokensMod.Char = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Char]
    }
    
    inline def Group(remember: Boolean, `type`: GROUP): typings.ret.distTypesTokensMod.Group = {
      val __obj = js.Dynamic.literal(remember = remember.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Group]
    }
    
    inline def Position(`type`: POSITION, value: $ | ^ | b_ | B): typings.ret.distTypesTokensMod.Position = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Position]
    }
    
    inline def Range(from: Double, to: Double, `type`: RANGE): typings.ret.distTypesTokensMod.Range = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Range]
    }
    
    inline def Reference(`type`: REFERENCE, value: Double): typings.ret.distTypesTokensMod.Reference = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Reference]
    }
    
    inline def Repetition(max: Double, min: Double, `type`: REPETITION, value: Token): typings.ret.distTypesTokensMod.Repetition = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Repetition]
    }
    
    inline def Set(not: Boolean, set: SetTokens, `type`: SET): typings.ret.distTypesTokensMod.Set = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Set]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ret.distTypesTokensMod.Root
    - typings.ret.distTypesTokensMod.Token
  */
  trait Tokens extends StObject
  object Tokens {
    
    inline def Char(`type`: CHAR, value: Double): typings.ret.distTypesTokensMod.Char = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Char]
    }
    
    inline def Group(remember: Boolean, `type`: GROUP): typings.ret.distTypesTokensMod.Group = {
      val __obj = js.Dynamic.literal(remember = remember.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Group]
    }
    
    inline def Position(`type`: POSITION, value: $ | ^ | b_ | B): typings.ret.distTypesTokensMod.Position = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Position]
    }
    
    inline def Range(from: Double, to: Double, `type`: RANGE): typings.ret.distTypesTokensMod.Range = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Range]
    }
    
    inline def Reference(`type`: REFERENCE, value: Double): typings.ret.distTypesTokensMod.Reference = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Reference]
    }
    
    inline def Repetition(max: Double, min: Double, `type`: REPETITION, value: Token): typings.ret.distTypesTokensMod.Repetition = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Repetition]
    }
    
    inline def Root(`type`: ROOT): typings.ret.distTypesTokensMod.Root = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Root]
    }
    
    inline def Set(not: Boolean, set: SetTokens, `type`: SET): typings.ret.distTypesTokensMod.Set = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ret.distTypesTokensMod.Set]
    }
  }
  
  /* Inlined ret.ret/dist/types/tokens.Base<T, {  value :K}> */
  trait ValueType[T, K] extends StObject {
    
    var `type`: T
    
    var value: K
  }
  object ValueType {
    
    inline def apply[T, K](`type`: T, value: K): ValueType[T, K] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueType[T, K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueType[?, ?], T, K] (val x: Self & (ValueType[T, K])) extends AnyVal {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: K): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
