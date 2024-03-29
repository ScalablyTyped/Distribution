package typings.reactHotkeys.mod

import typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HotKeysOverrideProps
  extends StObject
     with HTMLAttributes[HotKeys] {
  
  /**
    * The blacklist of keys that keyevents should be not ignored. i.e. if you place
    * a key in this list, all events related to it will be still be observed by react
    * hotkeys
    */
  var except: js.UndefOr[ListOfKeys] = js.undefined
  
  /**
    * The whitelist of keys that keyevents should be ignored. i.e. if you place
    * a key in this list, all events related to it will be ignored by react hotkeys
    */
  var only: js.UndefOr[ListOfKeys] = js.undefined
}
object HotKeysOverrideProps {
  
  inline def apply(): HotKeysOverrideProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotKeysOverrideProps]
  }
  
  extension [Self <: HotKeysOverrideProps](x: Self) {
    
    inline def setExcept(value: ListOfKeys): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
    
    inline def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
    
    inline def setExceptVarargs(value: String*): Self = StObject.set(x, "except", js.Array(value :_*))
    
    inline def setOnly(value: ListOfKeys): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    inline def setOnlyVarargs(value: String*): Self = StObject.set(x, "only", js.Array(value :_*))
  }
}
