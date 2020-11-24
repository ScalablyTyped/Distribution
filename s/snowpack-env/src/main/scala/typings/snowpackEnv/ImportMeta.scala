package typings.snowpackEnv

import typings.snowpackEnv.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportMeta extends js.Object {
  
  val env: Dictkey = js.native
  
  // TypeScript Bug: https://github.com/microsoft/TypeScript/issues/41468
  // When TS bug is fixed and ecosystem has upgraded, then it will be safe
  // to change `hot` to the more correct "possibly undefined" (hot?: ...).
  val hot: ImportMetaHot = js.native
  
  val url: String = js.native
}
object ImportMeta {
  
  @scala.inline
  def apply(env: Dictkey, hot: ImportMetaHot, url: String): ImportMeta = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportMeta]
  }
  
  @scala.inline
  implicit class ImportMetaOps[Self <: ImportMeta] (val x: Self) extends AnyVal {
    
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
    def setEnv(value: Dictkey): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHot(value: ImportMetaHot): Self = this.set("hot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
