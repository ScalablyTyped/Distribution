package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeAuth0.anon.Email
import typings.reactNativeAuth0.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def users: Users_ = ^.asInstanceOf[js.Dynamic].selectDynamic("users").asInstanceOf[Users_]

type AuthParams = StringDictionary[String]

type UserInfo[CustomClaims] = Email & CustomClaims
