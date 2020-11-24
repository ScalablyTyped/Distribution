package typings.reactAuthKit.typesMod

import typings.react.mod.ReactChildren
import typings.reactAuthKit.reactAuthKitStrings.cookie
import typings.reactAuthKit.reactAuthKitStrings.localstorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthProviderProps extends TokenObjectParamsInterface {
  
  var children: ReactChildren = js.native
}
object AuthProviderProps {
  
  @scala.inline
  def apply(
    authStorageName: String,
    authStorageType: cookie | localstorage,
    authTimeStorageName: String,
    children: ReactChildren,
    stateStorageName: String
  ): AuthProviderProps = {
    val __obj = js.Dynamic.literal(authStorageName = authStorageName.asInstanceOf[js.Any], authStorageType = authStorageType.asInstanceOf[js.Any], authTimeStorageName = authTimeStorageName.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], stateStorageName = stateStorageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthProviderProps]
  }
  
  @scala.inline
  implicit class AuthProviderPropsOps[Self <: AuthProviderProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactChildren): Self = this.set("children", value.asInstanceOf[js.Any])
  }
}
