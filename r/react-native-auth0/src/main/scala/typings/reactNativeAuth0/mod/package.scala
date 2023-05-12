package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.reactNativeAuth0.anon.Email
import typings.reactNativeAuth0.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Auth0Provider: FC[Auth0Props] = ^.asInstanceOf[js.Dynamic].selectDynamic("Auth0Provider").asInstanceOf[FC[Auth0Props]]

inline def useAuth0(): Auth0ContextInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("useAuth0")().asInstanceOf[Auth0ContextInterface]

inline def users: Users_ = ^.asInstanceOf[js.Dynamic].selectDynamic("users").asInstanceOf[Users_]

type AuthParams = StringDictionary[String]

type UserInfo[CustomClaims] = Email & CustomClaims
