package typings.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object auth {
  type AuthListenerCallback = js.Function1[
    /* user */ typings.reactNativeFirebase.mod.RNFirebase.auth.OrNull[typings.reactNativeFirebase.mod.RNFirebase.User], 
    scala.Unit
  ]
  type AuthResult = typings.reactNativeFirebase.AnonAuthenticated | scala.Null
  type OrNull[T] = T | scala.Null
}
