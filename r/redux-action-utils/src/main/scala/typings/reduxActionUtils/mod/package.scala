package typings.reduxActionUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ActionCreator_[T] = js.Function1[/* repeated */ js.Any, typings.reduxActionUtils.mod.Action with T]
  
  type OptionsActionCreator_[T] = js.Function1[/* data */ T, typings.reduxActionUtils.mod.Action with T]
}
