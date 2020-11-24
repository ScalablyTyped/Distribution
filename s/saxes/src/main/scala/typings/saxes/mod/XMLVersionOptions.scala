package typings.saxes.mod

import typings.saxes.saxesStrings.`1Dot0`
import typings.saxes.saxesStrings.`1Dot1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLVersionOptions extends js.Object {
  
  /**
    * The default XML version to use. If unspecified, and there is no XML
    * encoding declaration, the default version is "1.0".
    */
  var defaultXMLVersion: js.UndefOr[`1Dot0` | `1Dot1`] = js.native
  
  /**
    * A flag indicating whether to force the XML version used for parsing to the
    * value of ``defaultXMLVersion``. When this flag is ``true``,
    * ``defaultXMLVersion`` must be specified. If unspecified, the default value
    * of this flag is ``false``.
    */
  var forceXMLVersion: js.UndefOr[Boolean] = js.native
}
object XMLVersionOptions {
  
  @scala.inline
  def apply(): XMLVersionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLVersionOptions]
  }
  
  @scala.inline
  implicit class XMLVersionOptionsOps[Self <: XMLVersionOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultXMLVersion(value: `1Dot0` | `1Dot1`): Self = this.set("defaultXMLVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultXMLVersion: Self = this.set("defaultXMLVersion", js.undefined)
    
    @scala.inline
    def setForceXMLVersion(value: Boolean): Self = this.set("forceXMLVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceXMLVersion: Self = this.set("forceXMLVersion", js.undefined)
  }
}
