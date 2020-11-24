package typings.reactHotkeys.mod

import typings.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotKeysOverrideProps extends HTMLAttributes[HotKeys] {
  
  /**
    * The blacklist of keys that keyevents should be not ignored. i.e. if you place
    * a key in this list, all events related to it will be still be observed by react
    * hotkeys
    */
  var except: js.UndefOr[ListOfKeys] = js.native
  
  /**
    * The whitelist of keys that keyevents should be ignored. i.e. if you place
    * a key in this list, all events related to it will be ignored by react hotkeys
    */
  var only: js.UndefOr[ListOfKeys] = js.native
}
object HotKeysOverrideProps {
  
  @scala.inline
  def apply(): HotKeysOverrideProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotKeysOverrideProps]
  }
  
  @scala.inline
  implicit class HotKeysOverridePropsOps[Self <: HotKeysOverrideProps] (val x: Self) extends AnyVal {
    
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
    def setExceptVarargs(value: String*): Self = this.set("except", js.Array(value :_*))
    
    @scala.inline
    def setExcept(value: ListOfKeys): Self = this.set("except", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcept: Self = this.set("except", js.undefined)
    
    @scala.inline
    def setOnlyVarargs(value: String*): Self = this.set("only", js.Array(value :_*))
    
    @scala.inline
    def setOnly(value: ListOfKeys): Self = this.set("only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
  }
}
