package typings.safeStableStringify

import typings.safeStableStringify.anon.FnCall
import typings.std.ErrorConstructor
import typings.std.TypeErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("safe-stable-stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(value: Any): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(value: Any, replacer: js.Array[Double | String]): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: js.Array[Double | String], space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: js.Array[Double | String], space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any]): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: Null, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: Null, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("safe-stable-stringify", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def configure(options: StringifyOptions): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  }
  
  inline def configure(options: StringifyOptions): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  
  object stringify {
    
    inline def apply(value: Any): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(value: Any, replacer: js.Array[Double | String]): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: js.Array[Double | String], space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: js.Array[Double | String], space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any]): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: Null, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: Null, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("safe-stable-stringify", "stringify")
    @js.native
    val ^ : js.Any = js.native
    
    inline def configure(options: StringifyOptions): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  }
  
  trait StringifyOptions extends StObject {
    
    var bigint: js.UndefOr[Boolean] = js.undefined
    
    var circularValue: js.UndefOr[String | Null | TypeErrorConstructor | ErrorConstructor] = js.undefined
    
    var deterministic: js.UndefOr[Boolean] = js.undefined
    
    var maximumBreadth: js.UndefOr[Double] = js.undefined
    
    var maximumDepth: js.UndefOr[Double] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object StringifyOptions {
    
    inline def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    extension [Self <: StringifyOptions](x: Self) {
      
      inline def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
      
      inline def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
      
      inline def setCircularValue(value: String | TypeErrorConstructor | ErrorConstructor): Self = StObject.set(x, "circularValue", value.asInstanceOf[js.Any])
      
      inline def setCircularValueNull: Self = StObject.set(x, "circularValue", null)
      
      inline def setCircularValueUndefined: Self = StObject.set(x, "circularValue", js.undefined)
      
      inline def setDeterministic(value: Boolean): Self = StObject.set(x, "deterministic", value.asInstanceOf[js.Any])
      
      inline def setDeterministicUndefined: Self = StObject.set(x, "deterministic", js.undefined)
      
      inline def setMaximumBreadth(value: Double): Self = StObject.set(x, "maximumBreadth", value.asInstanceOf[js.Any])
      
      inline def setMaximumBreadthUndefined: Self = StObject.set(x, "maximumBreadth", js.undefined)
      
      inline def setMaximumDepth(value: Double): Self = StObject.set(x, "maximumDepth", value.asInstanceOf[js.Any])
      
      inline def setMaximumDepthUndefined: Self = StObject.set(x, "maximumDepth", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
