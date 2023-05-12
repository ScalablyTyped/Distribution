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
    
    inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
    inline def apply(value: String): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(value: String, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: String, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: String, replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: String, replacer: Replacer, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: String, replacer: Replacer, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(value: js.Array[Any], replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Array[Any], replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Array[Any], replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Array[Any], replacer: Replacer, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Array[Any], replacer: Replacer, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Function1[/* repeated */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(value: js.Function1[/* repeated */ Any, Any], replacer: Unit, space: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Function1[/* repeated */ Any, Any], replacer: Unit, space: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Function1[/* repeated */ Any, Any], replacer: Replacer): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Function1[/* repeated */ Any, Any], replacer: Replacer, space: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Function1[/* repeated */ Any, Any], replacer: Replacer, space: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Object): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(value: js.Object, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Object, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Object, replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Object, replacer: Replacer, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Object, replacer: Replacer, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(value: js.Symbol, replacer: Unit, space: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Symbol, replacer: Unit, space: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Symbol, replacer: Replacer): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Symbol, replacer: Replacer, space: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Symbol, replacer: Replacer, space: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: Any): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: js.Array[Double | String]): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: js.Array[Double | String], space: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: js.Array[Double | String], space: Double): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any]): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: Double): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: Null, space: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: Null, space: Double): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: Unit, space: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: Unit, space: Double): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Boolean): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(value: Boolean, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Boolean, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Boolean, replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Boolean, replacer: Replacer, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Boolean, replacer: Replacer, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Double): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(value: Double, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Double, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Double, replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Double, replacer: Replacer, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Double, replacer: Replacer, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Null, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Null, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Null, replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Null, replacer: Replacer, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Null, replacer: Replacer, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Unit, replacer: Unit, space: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: Unit, replacer: Unit, space: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: Unit, replacer: Replacer): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: Unit, replacer: Replacer, space: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: Unit, replacer: Replacer, space: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("safe-stable-stringify", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def configure(options: StringifyOptions): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  }
  
  inline def configure(options: StringifyOptions): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  
  object stringify {
    
    inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
    inline def apply(value: String): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(value: String, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: String, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: String, replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: String, replacer: Replacer, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: String, replacer: Replacer, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(value: js.Array[Any], replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Array[Any], replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Array[Any], replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Array[Any], replacer: Replacer, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Array[Any], replacer: Replacer, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Function1[/* repeated */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(value: js.Function1[/* repeated */ Any, Any], replacer: Unit, space: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Function1[/* repeated */ Any, Any], replacer: Unit, space: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Function1[/* repeated */ Any, Any], replacer: Replacer): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Function1[/* repeated */ Any, Any], replacer: Replacer, space: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Function1[/* repeated */ Any, Any], replacer: Replacer, space: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Object): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(value: js.Object, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Object, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Object, replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Object, replacer: Replacer, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Object, replacer: Replacer, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(value: js.Symbol, replacer: Unit, space: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Symbol, replacer: Unit, space: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Symbol, replacer: Replacer): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Symbol, replacer: Replacer, space: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: js.Symbol, replacer: Replacer, space: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: Any): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: js.Array[Double | String]): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: js.Array[Double | String], space: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: js.Array[Double | String], space: Double): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any]): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: Double): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: Null, space: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: Null, space: Double): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: Unit, space: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Any, replacer: Unit, space: Double): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def apply(value: Boolean): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(value: Boolean, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Boolean, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Boolean, replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Boolean, replacer: Replacer, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Boolean, replacer: Replacer, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Double): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(value: Double, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Double, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Double, replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Double, replacer: Replacer, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Double, replacer: Replacer, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Null, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Null, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Null, replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Null, replacer: Replacer, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Null, replacer: Replacer, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(value: Unit, replacer: Unit, space: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: Unit, replacer: Unit, space: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: Unit, replacer: Replacer): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: Unit, replacer: Replacer, space: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(value: Unit, replacer: Replacer, space: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("safe-stable-stringify", "stringify")
    @js.native
    val ^ : js.Any = js.native
    
    inline def configure(options: StringifyOptions): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  }
  
  type Replacer = js.UndefOr[
    (js.Array[Double | String]) | Null | (js.Function2[/* key */ String, /* value */ Any, String | Double | Boolean | Null | js.Object])
  ]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringifyOptions] (val x: Self) extends AnyVal {
      
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
