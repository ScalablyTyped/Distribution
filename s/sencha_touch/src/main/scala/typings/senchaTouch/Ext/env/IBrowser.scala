package typings.senchaTouch.Ext.env

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBrowser extends IBase {
  
  /** [Property] (String) */
  var engineName: js.UndefOr[String] = js.native
  
  /** [Property] (Ext.Version) */
  var engineVersion: js.UndefOr[IVersion] = js.native
  
  /** [Method] A hybrid property can be either accessed as a method call for example  if Ext browser is IE
    * @param value String The OS name to check.
    * @returns Boolean
    */
  var is: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Boolean]] = js.native
  
  /** [Property] (Boolean) */
  var isSecure: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var isStrict: js.UndefOr[Boolean] = js.native
  
  /** [Property] (String) */
  var name: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var userAgent: js.UndefOr[String] = js.native
  
  /** [Property] (Ext.Version) */
  var version: js.UndefOr[IVersion] = js.native
}
object IBrowser {
  
  @scala.inline
  def apply(): IBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBrowser]
  }
  
  @scala.inline
  implicit class IBrowserOps[Self <: IBrowser] (val x: Self) extends AnyVal {
    
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
    def setEngineName(value: String): Self = this.set("engineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineName: Self = this.set("engineName", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: IVersion): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    
    @scala.inline
    def setIs(value: /* value */ js.UndefOr[String] => Boolean): Self = this.set("is", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    
    @scala.inline
    def setIsSecure(value: Boolean): Self = this.set("isSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSecure: Self = this.set("isSecure", js.undefined)
    
    @scala.inline
    def setIsStrict(value: Boolean): Self = this.set("isStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStrict: Self = this.set("isStrict", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    
    @scala.inline
    def setVersion(value: IVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
