package typings.sinonjsCommons

import typings.sinonjsCommons.typesCalledInOrderMod.SinonProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sinonjs/commons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sinonjs/commons", "calledInOrder")
  @js.native
  val calledInOrder: js.Function2[/* spies */ js.Array[SinonProxy] | SinonProxy, /* repeated */ Any, Boolean] = js.native
  
  @JSImport("@sinonjs/commons", "className")
  @js.native
  val className: js.Function1[/* value */ js.Object, String | Null] = js.native
  
  object deprecated {
    
    @JSImport("@sinonjs/commons", "deprecated")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultMsg(packageName: String, funcName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultMsg")(packageName.asInstanceOf[js.Any], funcName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def printWarning(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printWarning")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def wrap(func: js.Function, msg: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(func.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  }
  
  inline def every(obj: Any, fn: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def functionName(func: js.Function): String = ^.asInstanceOf[js.Dynamic].applyDynamic("functionName")(func.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@sinonjs/commons", "global")
  @js.native
  val global: Any = js.native
  
  @JSImport("@sinonjs/commons", "orderByFirstCall")
  @js.native
  val orderByFirstCall: js.Function1[
    /* spies */ js.Array[typings.sinonjsCommons.typesOrderByFirstCallMod.SinonProxy] | typings.sinonjsCommons.typesOrderByFirstCallMod.SinonProxy, 
    js.Array[typings.sinonjsCommons.typesOrderByFirstCallMod.SinonProxy]
  ] = js.native
  
  object prototypes {
    
    @JSImport("@sinonjs/commons", "prototypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@sinonjs/commons", "prototypes.array")
    @js.native
    def array: Any = js.native
    inline def array_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("array")(x.asInstanceOf[js.Any])
    
    @JSImport("@sinonjs/commons", "prototypes.function")
    @js.native
    def function: Any = js.native
    inline def function_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("function")(x.asInstanceOf[js.Any])
    
    @JSImport("@sinonjs/commons", "prototypes.map")
    @js.native
    def map: Any = js.native
    inline def map_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    @JSImport("@sinonjs/commons", "prototypes.object")
    @js.native
    val `object`: Any = js.native
    
    @JSImport("@sinonjs/commons", "prototypes.set")
    @js.native
    def set: Any = js.native
    inline def set_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
    
    @JSImport("@sinonjs/commons", "prototypes.string")
    @js.native
    def string: Any = js.native
    inline def string_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
  }
  
  inline def typeOf(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@sinonjs/commons", "valueToString")
  @js.native
  val valueToString: js.Function1[/* value */ Any, String] = js.native
}
