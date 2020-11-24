package typings.rss.mod.NodeRSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlOptions extends js.Object {
  
  /**
    * What to use as a tab. Defaults to no tabs (compressed).
    * For example you can use '\t' for tab character, or ' '
    * for two-space tabs. If you set it to true it will use
    * four spaces.
    */
  var indent: js.UndefOr[Boolean | String] = js.native
}
object XmlOptions {
  
  @scala.inline
  def apply(): XmlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlOptions]
  }
  
  @scala.inline
  implicit class XmlOptionsOps[Self <: XmlOptions] (val x: Self) extends AnyVal {
    
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
    def setIndent(value: Boolean | String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
  }
}
