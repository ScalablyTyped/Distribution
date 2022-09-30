package typings.reduxSagaCore

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: js.Array[Any]
    
    var effectId: Double
    
    var saga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ Any
  }
  object Args {
    
    inline def apply(
      args: js.Array[Any],
      effectId: Double,
      saga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ Any
    ): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], effectId = effectId.asInstanceOf[js.Any], saga = saga.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setEffectId(value: Double): Self = StObject.set(x, "effectId", value.asInstanceOf[js.Any])
      
      inline def setSaga(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ Any
      ): Self = StObject.set(x, "saga", value.asInstanceOf[js.Any])
    }
  }
  
  trait Context[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.Context & TopLevel[Any] */, Name /* <: String */] extends StObject {
    
    var context: Ctx
    
    var fn: Name
  }
  object Context {
    
    inline def apply[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in Name ]: (this : Ctx, args : ...any): any}
      */ typings.reduxSagaCore.reduxSagaCoreStrings.Context & TopLevel[Any] */, Name /* <: String */](context: Ctx, fn: Name): Context[Ctx, Name] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[Ctx, Name]]
    }
    
    extension [Self <: Context[?, ?], Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in Name ]: (this : Ctx, args : ...any): any}
      */ typings.reduxSagaCore.reduxSagaCoreStrings.Context & TopLevel[Any] */, Name /* <: String */](x: Self & (Context[Ctx, Name])) {
      
      inline def setContext(value: Ctx): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setFn(value: Name): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextCtx[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Unit] */] extends StObject {
    
    var context: Ctx
    
    var fn: Fn
  }
  object ContextCtx {
    
    inline def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Unit] */](context: Ctx, fn: Fn): ContextCtx[Ctx, Fn] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextCtx[Ctx, Fn]]
    }
    
    extension [Self <: ContextCtx[?, ?], Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Unit] */](x: Self & (ContextCtx[Ctx, Fn])) {
      
      inline def setContext(value: Ctx): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setFn(value: Fn): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextFn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */] extends StObject {
    
    var context: Ctx
    
    var fn: Fn
  }
  object ContextFn {
    
    inline def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](context: Ctx, fn: Fn): ContextFn[Ctx, Fn] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextFn[Ctx, Fn]]
    }
    
    extension [Self <: ContextFn[?, ?], Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](x: Self & (ContextFn[Ctx, Fn])) {
      
      inline def setContext(value: Ctx): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setFn(value: Fn): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
  
  trait Effect extends StObject {
    
    var effect: Any
    
    var effectId: Double
    
    var label: js.UndefOr[String] = js.undefined
    
    var parentEffectId: Double
  }
  object Effect {
    
    inline def apply(effect: Any, effectId: Double, parentEffectId: Double): Effect = {
      val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], effectId = effectId.asInstanceOf[js.Any], parentEffectId = parentEffectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Effect]
    }
    
    extension [Self <: Effect](x: Self) {
      
      inline def setEffect(value: Any): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectId(value: Double): Self = StObject.set(x, "effectId", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setParentEffectId(value: Double): Self = StObject.set(x, "parentEffectId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fn[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.Fn & TopLevel[Any] */, Name /* <: String */] extends StObject {
    
    var context: Ctx
    
    var fn: Name
  }
  object Fn {
    
    inline def apply[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in Name ]: (this : Ctx, args : ...any): void}
      */ typings.reduxSagaCore.reduxSagaCoreStrings.Fn & TopLevel[Any] */, Name /* <: String */](context: Ctx, fn: Name): Fn[Ctx, Name] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fn[Ctx, Name]]
    }
    
    extension [Self <: Fn[?, ?], Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in Name ]: (this : Ctx, args : ...any): void}
      */ typings.reduxSagaCore.reduxSagaCoreStrings.Fn & TopLevel[Any] */, Name /* <: String */](x: Self & (Fn[Ctx, Name])) {
      
      inline def setContext(value: Ctx): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setFn(value: Name): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
}
