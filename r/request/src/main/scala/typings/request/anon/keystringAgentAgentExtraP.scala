package typings.request.anon

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import typings.request.mod.PoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[key: string] : node.http.Agent | node.https.Agent} & request.request.ExtraPoolOptions */
@js.native
trait keystringAgentAgentExtraP
  extends /* key */ StringDictionary[Agent | typings.node.httpsMod.Agent]
     with PoolOptions {
  
  var maxSockets: js.UndefOr[Double] = js.native
}
object keystringAgentAgentExtraP {
  
  @scala.inline
  def apply(): keystringAgentAgentExtraP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keystringAgentAgentExtraP]
  }
  
  @scala.inline
  implicit class keystringAgentAgentExtraPOps[Self <: keystringAgentAgentExtraP] (val x: Self) extends AnyVal {
    
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
    def setMaxSockets(value: Double): Self = this.set("maxSockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSockets: Self = this.set("maxSockets", js.undefined)
  }
}
