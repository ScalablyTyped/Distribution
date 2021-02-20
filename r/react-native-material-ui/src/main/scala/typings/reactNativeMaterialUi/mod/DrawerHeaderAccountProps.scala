package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.anon.AccountContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerHeaderAccountProps extends StObject {
  
  var accounts: js.UndefOr[js.Array[typings.reactNativeMaterialUi.anon.Avatar]] = js.native
  
  var avatar: js.UndefOr[Element] = js.native
  
  var footer: js.UndefOr[js.Object] = js.native
  
  var style: js.UndefOr[AccountContainer] = js.native
}
object DrawerHeaderAccountProps {
  
  @scala.inline
  def apply(): DrawerHeaderAccountProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerHeaderAccountProps]
  }
  
  @scala.inline
  implicit class DrawerHeaderAccountPropsMutableBuilder[Self <: DrawerHeaderAccountProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: js.Array[typings.reactNativeMaterialUi.anon.Avatar]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    @scala.inline
    def setAccountsVarargs(value: typings.reactNativeMaterialUi.anon.Avatar*): Self = StObject.set(x, "accounts", js.Array(value :_*))
    
    @scala.inline
    def setAvatar(value: Element): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    @scala.inline
    def setFooter(value: js.Object): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setStyle(value: AccountContainer): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
