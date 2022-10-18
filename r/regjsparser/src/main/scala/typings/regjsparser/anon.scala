package typings.regjsparser

import typings.regjsparser.mod.Features
import typings.regjsparser.mod.Identifier
import typings.regjsparser.mod.RootNode
import typings.regjsparser.regjsparserStrings.ignore
import typings.regjsparser.regjsparserStrings.lookahead
import typings.regjsparser.regjsparserStrings.lookbehind
import typings.regjsparser.regjsparserStrings.negativeLookahead
import typings.regjsparser.regjsparserStrings.negativeLookbehind
import typings.regjsparser.regjsparserStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Behavior[F /* <: Features */] extends StObject {
    
    var behavior: normal
    
    var body: js.Array[RootNode[F]]
  }
  object Behavior {
    
    inline def apply[F /* <: Features */](body: js.Array[RootNode[F]]): Behavior[F] = {
      val __obj = js.Dynamic.literal(behavior = "normal", body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Behavior[F]]
    }
    
    extension [Self <: Behavior[?], F /* <: Features */](x: Self & Behavior[F]) {
      
      inline def setBehavior(value: normal): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBody(value: js.Array[RootNode[F]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: RootNode[F]*): Self = StObject.set(x, "body", js.Array(value*))
    }
  }
  
  trait BehaviorBody[F /* <: Features */] extends StObject {
    
    var behavior: ignore
    
    var body: js.Array[RootNode[F]]
  }
  object BehaviorBody {
    
    inline def apply[F /* <: Features */](body: js.Array[RootNode[F]]): BehaviorBody[F] = {
      val __obj = js.Dynamic.literal(behavior = "ignore", body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[BehaviorBody[F]]
    }
    
    extension [Self <: BehaviorBody[?], F /* <: Features */](x: Self & BehaviorBody[F]) {
      
      inline def setBehavior(value: ignore): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBody(value: js.Array[RootNode[F]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: RootNode[F]*): Self = StObject.set(x, "body", js.Array(value*))
    }
  }
  
  trait Body[F /* <: Features */] extends StObject {
    
    var behavior: lookahead | lookbehind | negativeLookahead | negativeLookbehind
    
    var body: js.Array[RootNode[F]]
  }
  object Body {
    
    inline def apply[F /* <: Features */](
      behavior: lookahead | lookbehind | negativeLookahead | negativeLookbehind,
      body: js.Array[RootNode[F]]
    ): Body[F] = {
      val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body[F]]
    }
    
    extension [Self <: Body[?], F /* <: Features */](x: Self & Body[F]) {
      
      inline def setBehavior(value: lookahead | lookbehind | negativeLookahead | negativeLookbehind): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBody(value: js.Array[RootNode[F]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: RootNode[F]*): Self = StObject.set(x, "body", js.Array(value*))
    }
  }
  
  trait ModifierFlags extends StObject {
    
    var modifierFlags: js.UndefOr[typings.regjsparser.mod.ModifierFlags] = js.undefined
  }
  object ModifierFlags {
    
    inline def apply(): ModifierFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifierFlags]
    }
    
    extension [Self <: ModifierFlags](x: Self) {
      
      inline def setModifierFlags(value: typings.regjsparser.mod.ModifierFlags): Self = StObject.set(x, "modifierFlags", value.asInstanceOf[js.Any])
      
      inline def setModifierFlagsUndefined: Self = StObject.set(x, "modifierFlags", js.undefined)
    }
  }
  
  trait ModifierFlagsUndefined extends StObject {
    
    var modifierFlags: Unit
  }
  object ModifierFlagsUndefined {
    
    inline def apply(modifierFlags: Unit): ModifierFlagsUndefined = {
      val __obj = js.Dynamic.literal(modifierFlags = modifierFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModifierFlagsUndefined]
    }
    
    extension [Self <: ModifierFlagsUndefined](x: Self) {
      
      inline def setModifierFlags(value: Unit): Self = StObject.set(x, "modifierFlags", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[Identifier] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: Identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait NameUndefined extends StObject {
    
    var name: Unit
  }
  object NameUndefined {
    
    inline def apply(name: Unit): NameUndefined = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameUndefined]
    }
    
    extension [Self <: NameUndefined](x: Self) {
      
      inline def setName(value: Unit): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
