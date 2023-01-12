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
    
    var behavior: lookahead | lookbehind | negativeLookahead | negativeLookbehind
    
    var body: js.Array[RootNode[F]]
  }
  object Behavior {
    
    inline def apply[F /* <: Features */](
      behavior: lookahead | lookbehind | negativeLookahead | negativeLookbehind,
      body: js.Array[RootNode[F]]
    ): Behavior[F] = {
      val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Behavior[F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Behavior[?], F /* <: Features */] (val x: Self & Behavior[F]) extends AnyVal {
      
      inline def setBehavior(value: lookahead | lookbehind | negativeLookahead | negativeLookbehind): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBody(value: js.Array[RootNode[F]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: RootNode[F]*): Self = StObject.set(x, "body", js.Array(value*))
    }
  }
  
  trait BehaviorBody[F /* <: Features */] extends StObject {
    
    var behavior: normal
    
    var body: js.Array[RootNode[F]]
  }
  object BehaviorBody {
    
    inline def apply[F /* <: Features */](body: js.Array[RootNode[F]]): BehaviorBody[F] = {
      val __obj = js.Dynamic.literal(behavior = "normal", body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[BehaviorBody[F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BehaviorBody[?], F /* <: Features */] (val x: Self & BehaviorBody[F]) extends AnyVal {
      
      inline def setBehavior(value: normal): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBody(value: js.Array[RootNode[F]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: RootNode[F]*): Self = StObject.set(x, "body", js.Array(value*))
    }
  }
  
  trait Body[F /* <: Features */] extends StObject {
    
    var behavior: ignore
    
    var body: js.Array[RootNode[F]]
  }
  object Body {
    
    inline def apply[F /* <: Features */](body: js.Array[RootNode[F]]): Body[F] = {
      val __obj = js.Dynamic.literal(behavior = "ignore", body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body[F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Body[?], F /* <: Features */] (val x: Self & Body[F]) extends AnyVal {
      
      inline def setBehavior(value: ignore): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModifierFlags] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModifierFlagsUndefined] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NameUndefined] (val x: Self) extends AnyVal {
      
      inline def setName(value: Unit): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
