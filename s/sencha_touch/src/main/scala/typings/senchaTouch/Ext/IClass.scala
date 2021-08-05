package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClass extends StObject {
  
  /** [Config Option] (String[]) */
  var alias: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (String/String[]) */
  var alternateClassName: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object) */
  var config: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var extend: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Object) */
  var inheritableStatics: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object) */
  var mixins: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object) */
  var platformConfig: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var singleton: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var statics: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String[]) */
  var uses: js.UndefOr[Array] = js.undefined
}
object IClass {
  
  inline def apply(): IClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClass]
  }
  
  extension [Self <: IClass](x: Self) {
    
    inline def setAlias(value: Array): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAlternateClassName(value: js.Any): Self = StObject.set(x, "alternateClassName", value.asInstanceOf[js.Any])
    
    inline def setAlternateClassNameUndefined: Self = StObject.set(x, "alternateClassName", js.undefined)
    
    inline def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setExtend(value: java.lang.String): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setInheritableStatics(value: js.Any): Self = StObject.set(x, "inheritableStatics", value.asInstanceOf[js.Any])
    
    inline def setInheritableStaticsUndefined: Self = StObject.set(x, "inheritableStatics", js.undefined)
    
    inline def setMixins(value: js.Any): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
    
    inline def setPlatformConfig(value: js.Any): Self = StObject.set(x, "platformConfig", value.asInstanceOf[js.Any])
    
    inline def setPlatformConfigUndefined: Self = StObject.set(x, "platformConfig", js.undefined)
    
    inline def setSingleton(value: Boolean): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
    
    inline def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
    
    inline def setStatics(value: js.Any): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
    
    inline def setStaticsUndefined: Self = StObject.set(x, "statics", js.undefined)
    
    inline def setUses(value: Array): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
    
    inline def setUsesUndefined: Self = StObject.set(x, "uses", js.undefined)
  }
}
