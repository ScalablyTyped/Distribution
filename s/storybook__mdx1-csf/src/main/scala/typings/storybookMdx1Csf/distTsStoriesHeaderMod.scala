package typings.storybookMdx1Csf

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTsStoriesHeaderMod {
  
  @JSImport("@storybook/mdx1-csf/dist/ts/stories/Header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Header(param0: HeaderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Header")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait HeaderProps extends StObject {
    
    def onCreateAccount(): Unit
    
    def onLogin(): Unit
    
    def onLogout(): Unit
    
    var user: js.UndefOr[User] = js.undefined
  }
  object HeaderProps {
    
    inline def apply(onCreateAccount: () => Unit, onLogin: () => Unit, onLogout: () => Unit): HeaderProps = {
      val __obj = js.Dynamic.literal(onCreateAccount = js.Any.fromFunction0(onCreateAccount), onLogin = js.Any.fromFunction0(onLogin), onLogout = js.Any.fromFunction0(onLogout))
      __obj.asInstanceOf[HeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderProps] (val x: Self) extends AnyVal {
      
      inline def setOnCreateAccount(value: () => Unit): Self = StObject.set(x, "onCreateAccount", js.Any.fromFunction0(value))
      
      inline def setOnLogin(value: () => Unit): Self = StObject.set(x, "onLogin", js.Any.fromFunction0(value))
      
      inline def setOnLogout(value: () => Unit): Self = StObject.set(x, "onLogout", js.Any.fromFunction0(value))
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait User extends StObject {
    
    var name: String
  }
  object User {
    
    inline def apply(name: String): User = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
