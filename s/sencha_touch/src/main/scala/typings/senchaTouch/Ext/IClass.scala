package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClass extends js.Object {
  
  /** [Config Option] (String[]) */
  var alias: js.UndefOr[Array] = js.native
  
  /** [Config Option] (String/String[]) */
  var alternateClassName: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var config: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var extend: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Object) */
  var inheritableStatics: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var mixins: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var platformConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var singleton: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var statics: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String[]) */
  var uses: js.UndefOr[Array] = js.native
}
object IClass {
  
  @scala.inline
  def apply(): IClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClass]
  }
  
  @scala.inline
  implicit class IClassOps[Self <: IClass] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: Array): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setAlternateClassName(value: js.Any): Self = this.set("alternateClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateClassName: Self = this.set("alternateClassName", js.undefined)
    
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setExtend(value: java.lang.String): Self = this.set("extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    
    @scala.inline
    def setInheritableStatics(value: js.Any): Self = this.set("inheritableStatics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritableStatics: Self = this.set("inheritableStatics", js.undefined)
    
    @scala.inline
    def setMixins(value: js.Any): Self = this.set("mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixins: Self = this.set("mixins", js.undefined)
    
    @scala.inline
    def setPlatformConfig(value: js.Any): Self = this.set("platformConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformConfig: Self = this.set("platformConfig", js.undefined)
    
    @scala.inline
    def setSingleton(value: Boolean): Self = this.set("singleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleton: Self = this.set("singleton", js.undefined)
    
    @scala.inline
    def setStatics(value: js.Any): Self = this.set("statics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatics: Self = this.set("statics", js.undefined)
    
    @scala.inline
    def setUses(value: Array): Self = this.set("uses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUses: Self = this.set("uses", js.undefined)
  }
}
