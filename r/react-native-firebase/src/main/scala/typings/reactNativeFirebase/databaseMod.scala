package typings.reactNativeFirebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseMod {
  
  type DataSnapshot = typings.reactNativeFirebase.mod.RNFirebase.database.DataSnapshot
  
  type Database = typings.reactNativeFirebase.mod.RNFirebase.database.Database
  
  type DatabaseStatics = typings.reactNativeFirebase.mod.RNFirebase.database.DatabaseStatics
  
  type Query = typings.reactNativeFirebase.mod.RNFirebase.database.Query
  
  type QueryErrorCallback = typings.reactNativeFirebase.mod.RNFirebase.database.QueryErrorCallback
  
  type QueryEventType = typings.reactNativeFirebase.mod.RNFirebase.database.QueryEventType
  
  type QuerySuccessCallback = typings.reactNativeFirebase.mod.RNFirebase.database.QuerySuccessCallback
  
  type Reference = typings.reactNativeFirebase.mod.RNFirebase.database.Reference
  
  type RnReference = typings.reactNativeFirebase.mod.RNFirebase.database.RnReference
  
  @js.native
  trait ThenableReference[T]
    extends js.Promise[T]
       with typings.reactNativeFirebase.mod.RNFirebase.database.Reference {
    
    /* InferMemberOverrides */
    override def `then`[B](
      onFulfilled: js.Function1[T, B | js.Thenable[B]],
      onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]
    ): js.Thenable[B] & js.Promise[B] = js.native
    /* InferMemberOverrides */
    override def `then`[B](onFulfilled: Unit, onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]): js.Thenable[B] & js.Promise[B] = js.native
  }
}
