package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used as a response for defineResourceHandler.
  */
@js.native
trait AddonCatalog extends js.Object {
  
  /**
    * Object representing the addon's Manifest Object.
    */
  var manifest: Manifest = js.native
  
  /**
    * only http is currently officially supported.
    */
  var transportName: String = js.native
  
  /**
    * The URL of the addon's manifest.json file.
    */
  var transportUrl: String = js.native
}
object AddonCatalog {
  
  @scala.inline
  def apply(manifest: Manifest, transportName: String, transportUrl: String): AddonCatalog = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], transportName = transportName.asInstanceOf[js.Any], transportUrl = transportUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonCatalog]
  }
  
  @scala.inline
  implicit class AddonCatalogOps[Self <: AddonCatalog] (val x: Self) extends AnyVal {
    
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
    def setManifest(value: Manifest): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportName(value: String): Self = this.set("transportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportUrl(value: String): Self = this.set("transportUrl", value.asInstanceOf[js.Any])
  }
}
