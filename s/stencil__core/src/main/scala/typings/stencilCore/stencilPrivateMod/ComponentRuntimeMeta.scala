package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRuntimeMeta extends StObject {
  
  @JSName("$attrsToReflect$")
  var DollarattrsToReflectDollar: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.undefined
  
  @JSName("$flags$")
  var DollarflagsDollar: Double
  
  @JSName("$lazyBundleId$")
  var DollarlazyBundleIdDollar: js.UndefOr[String] = js.undefined
  
  @JSName("$listeners$")
  var DollarlistenersDollar: js.UndefOr[js.Array[ComponentRuntimeHostListener]] = js.undefined
  
  @JSName("$members$")
  var DollarmembersDollar: js.UndefOr[ComponentRuntimeMembers] = js.undefined
  
  @JSName("$tagName$")
  var DollartagNameDollar: String
  
  @JSName("$watchers$")
  var DollarwatchersDollar: js.UndefOr[ComponentConstructorWatchers] = js.undefined
}
object ComponentRuntimeMeta {
  
  inline def apply(DollarflagsDollar: Double, DollartagNameDollar: String): ComponentRuntimeMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$flags$")(DollarflagsDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$tagName$")(DollartagNameDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentRuntimeMeta]
  }
  
  extension [Self <: ComponentRuntimeMeta](x: Self) {
    
    inline def setDollarattrsToReflectDollar(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "$attrsToReflect$", value.asInstanceOf[js.Any])
    
    inline def setDollarattrsToReflectDollarUndefined: Self = StObject.set(x, "$attrsToReflect$", js.undefined)
    
    inline def setDollarattrsToReflectDollarVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "$attrsToReflect$", js.Array(value*))
    
    inline def setDollarflagsDollar(value: Double): Self = StObject.set(x, "$flags$", value.asInstanceOf[js.Any])
    
    inline def setDollarlazyBundleIdDollar(value: String): Self = StObject.set(x, "$lazyBundleId$", value.asInstanceOf[js.Any])
    
    inline def setDollarlazyBundleIdDollarUndefined: Self = StObject.set(x, "$lazyBundleId$", js.undefined)
    
    inline def setDollarlistenersDollar(value: js.Array[ComponentRuntimeHostListener]): Self = StObject.set(x, "$listeners$", value.asInstanceOf[js.Any])
    
    inline def setDollarlistenersDollarUndefined: Self = StObject.set(x, "$listeners$", js.undefined)
    
    inline def setDollarlistenersDollarVarargs(value: ComponentRuntimeHostListener*): Self = StObject.set(x, "$listeners$", js.Array(value*))
    
    inline def setDollarmembersDollar(value: ComponentRuntimeMembers): Self = StObject.set(x, "$members$", value.asInstanceOf[js.Any])
    
    inline def setDollarmembersDollarUndefined: Self = StObject.set(x, "$members$", js.undefined)
    
    inline def setDollartagNameDollar(value: String): Self = StObject.set(x, "$tagName$", value.asInstanceOf[js.Any])
    
    inline def setDollarwatchersDollar(value: ComponentConstructorWatchers): Self = StObject.set(x, "$watchers$", value.asInstanceOf[js.Any])
    
    inline def setDollarwatchersDollarUndefined: Self = StObject.set(x, "$watchers$", js.undefined)
  }
}
