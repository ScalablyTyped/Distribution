package typings.q

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IPromise[T] = js.Thenable[T]
  
  type IWhenable[T] = js.Thenable[T] | T
}
