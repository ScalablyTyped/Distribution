package typings.reduxDuck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ActionCreator[A /* <: typings.reduxDuck.mod.FSAHack */] = js.Function0[A] | (js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: A['payload'] */ /* a */ js.Any, 
    A
  ])
  
  type ActionHandlers[S, A /* <: typings.redux.mod.Action[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in A['type'] ]:? (x : S, y : std.Extract<A, {  type :T}>): S}
    */ typings.reduxDuck.reduxDuckStrings.ActionHandlers with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type ActionName = java.lang.String
  
  type ActionType = java.lang.String
  
  type AppName = java.lang.String
  
  type DuckName = java.lang.String
}
