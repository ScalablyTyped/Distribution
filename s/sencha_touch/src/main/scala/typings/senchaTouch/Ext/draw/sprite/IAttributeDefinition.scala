package typings.senchaTouch.Ext.draw.sprite

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttributeDefinition
  extends StObject
     with IBase {
  
  /** [Config Option] (Object) */
  var aliases: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var animationProcessors: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var dirty: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns the value of aliases
    * @returns Object
    */
  var getAliases: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of animationProcessors
    * @returns Object
    */
  var getAnimationProcessors: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of defaults
    * @returns Object
    */
  var getDefaults: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of processors
    * @returns Object
    */
  var getProcessors: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of updaters
    * @returns Object
    */
  var getUpdaters: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Normalizes the changes given via their processors before they are applied as attributes
    * @param changes Object The changes given.
    * @returns Object The normalized values.
    */
  var normalize: js.UndefOr[js.Function1[/* changes */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Config Option] (Object) */
  var processors: js.UndefOr[Any] = js.undefined
  
  /** [Method] Sets the value of aliases
    * @param aliases Object The new value.
    */
  var setAliases: js.UndefOr[js.Function1[/* aliases */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of animationProcessors
    * @param animationProcessors Object The new value.
    */
  var setAnimationProcessors: js.UndefOr[js.Function1[/* animationProcessors */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaults
    * @param defaults Object The new value.
    */
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of processors
    * @param processors Object The new value.
    */
  var setProcessors: js.UndefOr[js.Function1[/* processors */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of updaters
    * @param updaters Object The new value.
    */
  var setUpdaters: js.UndefOr[js.Function1[/* updaters */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var updaters: js.UndefOr[Any] = js.undefined
}
object IAttributeDefinition {
  
  inline def apply(): IAttributeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAttributeDefinition]
  }
  
  extension [Self <: IAttributeDefinition](x: Self) {
    
    inline def setAliases(value: Any): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAnimationProcessors(value: Any): Self = StObject.set(x, "animationProcessors", value.asInstanceOf[js.Any])
    
    inline def setAnimationProcessorsUndefined: Self = StObject.set(x, "animationProcessors", js.undefined)
    
    inline def setDefaults(value: Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setDirty(value: Any): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setGetAliases(value: () => Any): Self = StObject.set(x, "getAliases", js.Any.fromFunction0(value))
    
    inline def setGetAliasesUndefined: Self = StObject.set(x, "getAliases", js.undefined)
    
    inline def setGetAnimationProcessors(value: () => Any): Self = StObject.set(x, "getAnimationProcessors", js.Any.fromFunction0(value))
    
    inline def setGetAnimationProcessorsUndefined: Self = StObject.set(x, "getAnimationProcessors", js.undefined)
    
    inline def setGetDefaults(value: () => Any): Self = StObject.set(x, "getDefaults", js.Any.fromFunction0(value))
    
    inline def setGetDefaultsUndefined: Self = StObject.set(x, "getDefaults", js.undefined)
    
    inline def setGetProcessors(value: () => Any): Self = StObject.set(x, "getProcessors", js.Any.fromFunction0(value))
    
    inline def setGetProcessorsUndefined: Self = StObject.set(x, "getProcessors", js.undefined)
    
    inline def setGetUpdaters(value: () => Any): Self = StObject.set(x, "getUpdaters", js.Any.fromFunction0(value))
    
    inline def setGetUpdatersUndefined: Self = StObject.set(x, "getUpdaters", js.undefined)
    
    inline def setNormalize(value: /* changes */ js.UndefOr[Any] => Any): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
    
    inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    inline def setProcessors(value: Any): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsUndefined: Self = StObject.set(x, "processors", js.undefined)
    
    inline def setSetAliases(value: /* aliases */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setAliases", js.Any.fromFunction1(value))
    
    inline def setSetAliasesUndefined: Self = StObject.set(x, "setAliases", js.undefined)
    
    inline def setSetAnimationProcessors(value: /* animationProcessors */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setAnimationProcessors", js.Any.fromFunction1(value))
    
    inline def setSetAnimationProcessorsUndefined: Self = StObject.set(x, "setAnimationProcessors", js.undefined)
    
    inline def setSetDefaults(value: /* defaults */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1(value))
    
    inline def setSetDefaultsUndefined: Self = StObject.set(x, "setDefaults", js.undefined)
    
    inline def setSetProcessors(value: /* processors */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setProcessors", js.Any.fromFunction1(value))
    
    inline def setSetProcessorsUndefined: Self = StObject.set(x, "setProcessors", js.undefined)
    
    inline def setSetUpdaters(value: /* updaters */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setUpdaters", js.Any.fromFunction1(value))
    
    inline def setSetUpdatersUndefined: Self = StObject.set(x, "setUpdaters", js.undefined)
    
    inline def setUpdaters(value: Any): Self = StObject.set(x, "updaters", value.asInstanceOf[js.Any])
    
    inline def setUpdatersUndefined: Self = StObject.set(x, "updaters", js.undefined)
  }
}
