package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBase extends IClass {
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  var callOverridden: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  var callParent: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  var callSuper: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method]  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  var getInitialConfig: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], _]] = js.native
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  var initConfig: js.UndefOr[js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Property] (Ext.Class) */
  var self: js.UndefOr[IClass] = js.native
}
object IBase {
  
  @scala.inline
  def apply(): IBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBase]
  }
  
  @scala.inline
  implicit class IBaseOps[Self <: IBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallOverridden(value: /* args */ js.UndefOr[js.Any] => _): Self = this.set("callOverridden", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallOverridden: Self = this.set("callOverridden", js.undefined)
    
    @scala.inline
    def setCallParent(value: /* args */ js.UndefOr[js.Any] => _): Self = this.set("callParent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallParent: Self = this.set("callParent", js.undefined)
    
    @scala.inline
    def setCallSuper(value: /* args */ js.UndefOr[js.Any] => _): Self = this.set("callSuper", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallSuper: Self = this.set("callSuper", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setGetInitialConfig(value: /* name */ js.UndefOr[java.lang.String] => _): Self = this.set("getInitialConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetInitialConfig: Self = this.set("getInitialConfig", js.undefined)
    
    @scala.inline
    def setInitConfig(value: /* instanceConfig */ js.UndefOr[js.Any] => _): Self = this.set("initConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInitConfig: Self = this.set("initConfig", js.undefined)
    
    @scala.inline
    def setSelf(value: IClass): Self = this.set("self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelf: Self = this.set("self", js.undefined)
  }
}
