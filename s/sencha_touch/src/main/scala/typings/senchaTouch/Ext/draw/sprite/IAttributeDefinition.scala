package typings.senchaTouch.Ext.draw.sprite

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttributeDefinition
  extends StObject
     with IBase {
  
  /** [Config Option] (Object) */
  var aliases: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object) */
  var animationProcessors: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object) */
  var dirty: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Returns the value of aliases
    * @returns Object
    */
  var getAliases: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of animationProcessors
    * @returns Object
    */
  var getAnimationProcessors: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of defaults
    * @returns Object
    */
  var getDefaults: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of processors
    * @returns Object
    */
  var getProcessors: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of updaters
    * @returns Object
    */
  var getUpdaters: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Normalizes the changes given via their processors before they are applied as attributes
    * @param changes Object The changes given.
    * @returns Object The normalized values.
    */
  var normalize: js.UndefOr[js.Function1[/* changes */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Config Option] (Object) */
  var processors: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Sets the value of aliases
    * @param aliases Object The new value.
    */
  var setAliases: js.UndefOr[js.Function1[/* aliases */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of animationProcessors
    * @param animationProcessors Object The new value.
    */
  var setAnimationProcessors: js.UndefOr[js.Function1[/* animationProcessors */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaults
    * @param defaults Object The new value.
    */
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of processors
    * @param processors Object The new value.
    */
  var setProcessors: js.UndefOr[js.Function1[/* processors */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of updaters
    * @param updaters Object The new value.
    */
  var setUpdaters: js.UndefOr[js.Function1[/* updaters */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var updaters: js.UndefOr[js.Any] = js.undefined
}
object IAttributeDefinition {
  
  @scala.inline
  def apply(): IAttributeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAttributeDefinition]
  }
  
  @scala.inline
  implicit class IAttributeDefinitionMutableBuilder[Self <: IAttributeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Any): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAnimationProcessors(value: js.Any): Self = StObject.set(x, "animationProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationProcessorsUndefined: Self = StObject.set(x, "animationProcessors", js.undefined)
    
    @scala.inline
    def setDefaults(value: js.Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    @scala.inline
    def setDirty(value: js.Any): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    @scala.inline
    def setGetAliases(value: () => js.Any): Self = StObject.set(x, "getAliases", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAliasesUndefined: Self = StObject.set(x, "getAliases", js.undefined)
    
    @scala.inline
    def setGetAnimationProcessors(value: () => js.Any): Self = StObject.set(x, "getAnimationProcessors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAnimationProcessorsUndefined: Self = StObject.set(x, "getAnimationProcessors", js.undefined)
    
    @scala.inline
    def setGetDefaults(value: () => js.Any): Self = StObject.set(x, "getDefaults", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultsUndefined: Self = StObject.set(x, "getDefaults", js.undefined)
    
    @scala.inline
    def setGetProcessors(value: () => js.Any): Self = StObject.set(x, "getProcessors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProcessorsUndefined: Self = StObject.set(x, "getProcessors", js.undefined)
    
    @scala.inline
    def setGetUpdaters(value: () => js.Any): Self = StObject.set(x, "getUpdaters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpdatersUndefined: Self = StObject.set(x, "getUpdaters", js.undefined)
    
    @scala.inline
    def setNormalize(value: /* changes */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    @scala.inline
    def setProcessors(value: js.Any): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorsUndefined: Self = StObject.set(x, "processors", js.undefined)
    
    @scala.inline
    def setSetAliases(value: /* aliases */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAliases", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAliasesUndefined: Self = StObject.set(x, "setAliases", js.undefined)
    
    @scala.inline
    def setSetAnimationProcessors(value: /* animationProcessors */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAnimationProcessors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAnimationProcessorsUndefined: Self = StObject.set(x, "setAnimationProcessors", js.undefined)
    
    @scala.inline
    def setSetDefaults(value: /* defaults */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultsUndefined: Self = StObject.set(x, "setDefaults", js.undefined)
    
    @scala.inline
    def setSetProcessors(value: /* processors */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setProcessors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProcessorsUndefined: Self = StObject.set(x, "setProcessors", js.undefined)
    
    @scala.inline
    def setSetUpdaters(value: /* updaters */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setUpdaters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUpdatersUndefined: Self = StObject.set(x, "setUpdaters", js.undefined)
    
    @scala.inline
    def setUpdaters(value: js.Any): Self = StObject.set(x, "updaters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatersUndefined: Self = StObject.set(x, "updaters", js.undefined)
  }
}
