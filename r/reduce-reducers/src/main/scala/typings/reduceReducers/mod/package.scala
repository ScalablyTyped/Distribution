package typings.reduceReducers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Reducer[S] = js.Function2[/* state */ S, /* action */ typings.reduceReducers.mod.Action, S]
}
