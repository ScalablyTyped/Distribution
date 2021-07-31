package typings.reduxSagaCore

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: js.Array[js.Any]
    
    var effectId: Double
    
    var saga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ js.Any
  }
  object Args {
    
    @scala.inline
    def apply(
      args: js.Array[js.Any],
      effectId: Double,
      saga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ js.Any
    ): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], effectId = effectId.asInstanceOf[js.Any], saga = saga.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setEffectId(value: Double): Self = StObject.set(x, "effectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaga(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ js.Any
      ): Self = StObject.set(x, "saga", value.asInstanceOf[js.Any])
    }
  }
  
  trait Context[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.Context & TopLevel[js.Any] */, Name /* <: String */] extends StObject {
    
    var context: Ctx
    
    var fn: Name
  }
  object Context {
    
    @scala.inline
    def apply[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in Name ]: (this : Ctx, args : ...any): any}
      */ typings.reduxSagaCore.reduxSagaCoreStrings.Context & TopLevel[js.Any] */, Name /* <: String */](context: Ctx, fn: Name): Context[Ctx, Name] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[Ctx, Name]]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context[?, ?], Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in Name ]: (this : Ctx, args : ...any): any}
      */ typings.reduxSagaCore.reduxSagaCoreStrings.Context & TopLevel[js.Any] */, Name /* <: String */] (val x: Self & (Context[Ctx, Name])) extends AnyVal {
      
      @scala.inline
      def setContext(value: Ctx): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFn(value: Name): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextCtx[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */] extends StObject {
    
    var context: Ctx
    
    var fn: Fn
  }
  object ContextCtx {
    
    @scala.inline
    def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](context: Ctx, fn: Fn): ContextCtx[Ctx, Fn] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextCtx[Ctx, Fn]]
    }
    
    @scala.inline
    implicit class ContextCtxMutableBuilder[Self <: ContextCtx[?, ?], Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */] (val x: Self & (ContextCtx[Ctx, Fn])) extends AnyVal {
      
      @scala.inline
      def setContext(value: Ctx): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFn(value: Fn): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextFn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */] extends StObject {
    
    var context: Ctx
    
    var fn: Fn
  }
  object ContextFn {
    
    @scala.inline
    def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](context: Ctx, fn: Fn): ContextFn[Ctx, Fn] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextFn[Ctx, Fn]]
    }
    
    @scala.inline
    implicit class ContextFnMutableBuilder[Self <: ContextFn[?, ?], Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */] (val x: Self & (ContextFn[Ctx, Fn])) extends AnyVal {
      
      @scala.inline
      def setContext(value: Ctx): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFn(value: Fn): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
  
  trait Effect extends StObject {
    
    var effect: js.Any
    
    var effectId: Double
    
    var label: js.UndefOr[String] = js.undefined
    
    var parentEffectId: Double
  }
  object Effect {
    
    @scala.inline
    def apply(effect: js.Any, effectId: Double, parentEffectId: Double): Effect = {
      val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], effectId = effectId.asInstanceOf[js.Any], parentEffectId = parentEffectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Effect]
    }
    
    @scala.inline
    implicit class EffectMutableBuilder[Self <: Effect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEffect(value: js.Any): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectId(value: Double): Self = StObject.set(x, "effectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setParentEffectId(value: Double): Self = StObject.set(x, "parentEffectId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fn[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.Fn & TopLevel[js.Any] */, Name /* <: String */] extends StObject {
    
    var context: Ctx
    
    var fn: Name
  }
  object Fn {
    
    @scala.inline
    def apply[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in Name ]: (this : Ctx, args : ...any): void}
      */ typings.reduxSagaCore.reduxSagaCoreStrings.Fn & TopLevel[js.Any] */, Name /* <: String */](context: Ctx, fn: Name): Fn[Ctx, Name] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fn[Ctx, Name]]
    }
    
    @scala.inline
    implicit class FnMutableBuilder[Self <: Fn[?, ?], Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in Name ]: (this : Ctx, args : ...any): void}
      */ typings.reduxSagaCore.reduxSagaCoreStrings.Fn & TopLevel[js.Any] */, Name /* <: String */] (val x: Self & (Fn[Ctx, Name])) extends AnyVal {
      
      @scala.inline
      def setContext(value: Ctx): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFn(value: Name): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
}
