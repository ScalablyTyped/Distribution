package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.anon.resourceShortManifestReso
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The addonInterface, as returned from builder.getInterface()
  */
@js.native
trait AddonInterface extends js.Object {
  
  def get(args: resourceShortManifestReso): js.Promise[_] = js.native
  
  var manifest: Manifest = js.native
}
object AddonInterface {
  
  @scala.inline
  def apply(get: resourceShortManifestReso => js.Promise[_], manifest: Manifest): AddonInterface = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonInterface]
  }
  
  @scala.inline
  implicit class AddonInterfaceOps[Self <: AddonInterface] (val x: Self) extends AnyVal {
    
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
    def setGet(value: resourceShortManifestReso => js.Promise[_]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setManifest(value: Manifest): Self = this.set("manifest", value.asInstanceOf[js.Any])
  }
}
