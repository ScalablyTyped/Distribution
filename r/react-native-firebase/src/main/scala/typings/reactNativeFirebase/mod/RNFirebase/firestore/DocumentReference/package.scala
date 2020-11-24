package typings.reactNativeFirebase.mod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object DocumentReference {
  
  type ObserverOnError = js.Function1[
    /* err */ typings.reactNativeFirebase.mod.RNFirebase.firestore.Query.SnapshotError, 
    scala.Unit
  ]
  
  type ObserverOnNext = js.Function1[
    /* documentSnapshot */ typings.reactNativeFirebase.mod.RNFirebase.firestore.DocumentSnapshot, 
    scala.Unit
  ]
}
