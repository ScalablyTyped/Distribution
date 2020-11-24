package typings.snowpackEnv.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  
  val MODE: String = js.native
  
  val NODE_ENV: String = js.native
  
  val SNOWPACK_PUBLIC_API_URL: String = js.native
  
  val SSR: js.UndefOr[Boolean] = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(MODE: String, NODE_ENV: String, SNOWPACK_PUBLIC_API_URL: String): Dictkey = {
    val __obj = js.Dynamic.literal(MODE = MODE.asInstanceOf[js.Any], NODE_ENV = NODE_ENV.asInstanceOf[js.Any], SNOWPACK_PUBLIC_API_URL = SNOWPACK_PUBLIC_API_URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    
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
    def setMODE(value: String): Self = this.set("MODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNODE_ENV(value: String): Self = this.set("NODE_ENV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNOWPACK_PUBLIC_API_URL(value: String): Self = this.set("SNOWPACK_PUBLIC_API_URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSR(value: Boolean): Self = this.set("SSR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSR: Self = this.set("SSR", js.undefined)
  }
}
