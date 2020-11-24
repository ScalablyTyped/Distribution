package typings.server.optionsMod

import typings.expressSession.mod.SessionOptions
import typings.server.anon.Body
import typings.server.anon.Csurf
import typings.server.anon.Level
import typings.server.commonMod.LogLevel
import typings.server.serverBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var engine: js.UndefOr[String] = js.native
  
  var env: js.UndefOr[String] = js.native
  
  var favicon: js.UndefOr[String] = js.native
  
  var log: js.UndefOr[LogLevel | Level] = js.native
  
  var parser: js.UndefOr[Body] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var public: js.UndefOr[String] = js.native
  
  var secret: js.UndefOr[String] = js.native
  
  var security: js.UndefOr[
    `false` | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify helmet.IHelmetConfiguration */ js.Any) with Csurf)
  ] = js.native
  
  var session: js.UndefOr[SessionOptions] = js.native
  
  var views: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setFavicon(value: String): Self = this.set("favicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavicon: Self = this.set("favicon", js.undefined)
    
    @scala.inline
    def setLog(value: LogLevel | Level): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setParser(value: Body): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPublic(value: String): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    
    @scala.inline
    def setSecurity(
      value: `false` | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify helmet.IHelmetConfiguration */ js.Any) with Csurf)
    ): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    
    @scala.inline
    def setSession(value: SessionOptions): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setViews(value: String): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
}
