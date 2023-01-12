package typings.reduxSagaCore

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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setEffectId(value: Double): Self = StObject.set(x, "effectId", value.asInstanceOf[js.Any])
      
      inline def setSaga(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ Any
      ): Self = StObject.set(x, "saga", value.asInstanceOf[js.Any])
    }
  }
  
  trait Context[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */] extends StObject {
    
    var context: Ctx
    
    var fn: Name
  }
  object Context {
    
    inline def apply[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](context: Ctx, fn: Name): Context[Ctx, Name] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[Ctx, Name]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context[?, ?], Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */] (val x: Self & (Context[Ctx, Name])) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextCtx[?, ?], Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Unit] */] (val x: Self & (ContextCtx[Ctx, Fn])) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextFn[?, ?], Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */] (val x: Self & (ContextFn[Ctx, Fn])) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Effect] (val x: Self) extends AnyVal {
      
      inline def setEffect(value: Any): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectId(value: Double): Self = StObject.set(x, "effectId", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setParentEffectId(value: Double): Self = StObject.set(x, "parentEffectId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fn[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): void} */ js.Any */, Name /* <: String */] extends StObject {
    
    var context: Ctx
    
    var fn: Name
  }
  object Fn {
    
    inline def apply[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): void} */ js.Any */, Name /* <: String */](context: Ctx, fn: Name): Fn[Ctx, Name] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fn[Ctx, Name]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fn[?, ?], Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): void} */ js.Any */, Name /* <: String */] (val x: Self & (Fn[Ctx, Name])) extends AnyVal {
      
      inline def setContext(value: Ctx): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setFn(value: Name): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
}
