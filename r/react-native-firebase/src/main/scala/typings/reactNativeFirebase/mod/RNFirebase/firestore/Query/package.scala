package typings.reactNativeFirebase.mod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Query {
  
  type ObserverOnError = js.Function1[
    /* err */ typings.reactNativeFirebase.mod.RNFirebase.firestore.Query.SnapshotError, 
    scala.Unit
  ]
  
  type ObserverOnNext = js.Function1[
    /* querySnapshot */ typings.reactNativeFirebase.mod.RNFirebase.firestore.QuerySnapshot, 
    scala.Unit
  ]
}
