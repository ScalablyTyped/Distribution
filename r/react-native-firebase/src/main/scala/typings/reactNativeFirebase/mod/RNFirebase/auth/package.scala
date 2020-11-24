package typings.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object auth {
  
  type AuthListenerCallback = js.Function1[
    /* user */ typings.reactNativeFirebase.mod.RNFirebase.auth.OrNull[typings.reactNativeFirebase.mod.RNFirebase.User], 
    scala.Unit
  ]
  
  type AuthResult = typings.reactNativeFirebase.anon.Authenticated | scala.Null
  
  type OrNull[T] = T | scala.Null
}
