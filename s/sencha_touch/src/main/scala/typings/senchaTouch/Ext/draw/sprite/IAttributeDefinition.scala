package typings.senchaTouch.Ext.draw.sprite

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAttributeDefinition extends IBase {
  
  /** [Config Option] (Object) */
  var aliases: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var animationProcessors: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var dirty: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of aliases
    * @returns Object
    */
  var getAliases: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of animationProcessors
    * @returns Object
    */
  var getAnimationProcessors: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of defaults
    * @returns Object
    */
  var getDefaults: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of processors
    * @returns Object
    */
  var getProcessors: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of updaters
    * @returns Object
    */
  var getUpdaters: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Normalizes the changes given via their processors before they are applied as attributes
    * @param changes Object The changes given.
    * @returns Object The normalized values.
    */
  var normalize: js.UndefOr[js.Function1[/* changes */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Config Option] (Object) */
  var processors: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the value of aliases
    * @param aliases Object The new value.
    */
  var setAliases: js.UndefOr[js.Function1[/* aliases */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of animationProcessors
    * @param animationProcessors Object The new value.
    */
  var setAnimationProcessors: js.UndefOr[js.Function1[/* animationProcessors */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of defaults
    * @param defaults Object The new value.
    */
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of processors
    * @param processors Object The new value.
    */
  var setProcessors: js.UndefOr[js.Function1[/* processors */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of updaters
    * @param updaters Object The new value.
    */
  var setUpdaters: js.UndefOr[js.Function1[/* updaters */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Object) */
  var updaters: js.UndefOr[js.Any] = js.native
}
object IAttributeDefinition {
  
  @scala.inline
  def apply(): IAttributeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAttributeDefinition]
  }
  
  @scala.inline
  implicit class IAttributeDefinitionOps[Self <: IAttributeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAliases(value: js.Any): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setAnimationProcessors(value: js.Any): Self = this.set("animationProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationProcessors: Self = this.set("animationProcessors", js.undefined)
    
    @scala.inline
    def setDefaults(value: js.Any): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setDirty(value: js.Any): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirty: Self = this.set("dirty", js.undefined)
    
    @scala.inline
    def setGetAliases(value: () => _): Self = this.set("getAliases", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAliases: Self = this.set("getAliases", js.undefined)
    
    @scala.inline
    def setGetAnimationProcessors(value: () => _): Self = this.set("getAnimationProcessors", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAnimationProcessors: Self = this.set("getAnimationProcessors", js.undefined)
    
    @scala.inline
    def setGetDefaults(value: () => _): Self = this.set("getDefaults", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaults: Self = this.set("getDefaults", js.undefined)
    
    @scala.inline
    def setGetProcessors(value: () => _): Self = this.set("getProcessors", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetProcessors: Self = this.set("getProcessors", js.undefined)
    
    @scala.inline
    def setGetUpdaters(value: () => _): Self = this.set("getUpdaters", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUpdaters: Self = this.set("getUpdaters", js.undefined)
    
    @scala.inline
    def setNormalize(value: /* changes */ js.UndefOr[js.Any] => _): Self = this.set("normalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    
    @scala.inline
    def setProcessors(value: js.Any): Self = this.set("processors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessors: Self = this.set("processors", js.undefined)
    
    @scala.inline
    def setSetAliases(value: /* aliases */ js.UndefOr[js.Any] => Unit): Self = this.set("setAliases", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAliases: Self = this.set("setAliases", js.undefined)
    
    @scala.inline
    def setSetAnimationProcessors(value: /* animationProcessors */ js.UndefOr[js.Any] => Unit): Self = this.set("setAnimationProcessors", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAnimationProcessors: Self = this.set("setAnimationProcessors", js.undefined)
    
    @scala.inline
    def setSetDefaults(value: /* defaults */ js.UndefOr[js.Any] => Unit): Self = this.set("setDefaults", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDefaults: Self = this.set("setDefaults", js.undefined)
    
    @scala.inline
    def setSetProcessors(value: /* processors */ js.UndefOr[js.Any] => Unit): Self = this.set("setProcessors", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetProcessors: Self = this.set("setProcessors", js.undefined)
    
    @scala.inline
    def setSetUpdaters(value: /* updaters */ js.UndefOr[js.Any] => Unit): Self = this.set("setUpdaters", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUpdaters: Self = this.set("setUpdaters", js.undefined)
    
    @scala.inline
    def setUpdaters(value: js.Any): Self = this.set("updaters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdaters: Self = this.set("updaters", js.undefined)
  }
}
