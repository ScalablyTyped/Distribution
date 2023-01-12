package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBase
  extends StObject
     with IClass {
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  var callOverridden: js.UndefOr[js.Function1[/* args */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  var callParent: js.UndefOr[js.Function1[/* args */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  var callSuper: js.UndefOr[js.Function1[/* args */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method]  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  var getInitialConfig: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], Any]] = js.undefined
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  var initConfig: js.UndefOr[js.Function1[/* instanceConfig */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Property] (Ext.Class) */
  var self: js.UndefOr[IClass] = js.undefined
}
object IBase {
  
  inline def apply(): IBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBase] (val x: Self) extends AnyVal {
    
    inline def setCallOverridden(value: /* args */ js.UndefOr[Any] => Any): Self = StObject.set(x, "callOverridden", js.Any.fromFunction1(value))
    
    inline def setCallOverriddenUndefined: Self = StObject.set(x, "callOverridden", js.undefined)
    
    inline def setCallParent(value: /* args */ js.UndefOr[Any] => Any): Self = StObject.set(x, "callParent", js.Any.fromFunction1(value))
    
    inline def setCallParentUndefined: Self = StObject.set(x, "callParent", js.undefined)
    
    inline def setCallSuper(value: /* args */ js.UndefOr[Any] => Any): Self = StObject.set(x, "callSuper", js.Any.fromFunction1(value))
    
    inline def setCallSuperUndefined: Self = StObject.set(x, "callSuper", js.undefined)
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setGetInitialConfig(value: /* name */ js.UndefOr[java.lang.String] => Any): Self = StObject.set(x, "getInitialConfig", js.Any.fromFunction1(value))
    
    inline def setGetInitialConfigUndefined: Self = StObject.set(x, "getInitialConfig", js.undefined)
    
    inline def setInitConfig(value: /* instanceConfig */ js.UndefOr[Any] => Any): Self = StObject.set(x, "initConfig", js.Any.fromFunction1(value))
    
    inline def setInitConfigUndefined: Self = StObject.set(x, "initConfig", js.undefined)
    
    inline def setSelf(value: IClass): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
  }
}
