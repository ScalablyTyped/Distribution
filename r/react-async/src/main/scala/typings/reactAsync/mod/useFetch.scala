package typings.reactAsync.mod

import typings.std.RequestInfo
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-async", "useFetch")
@js.native
object useFetch extends js.Object {
  
  def apply[T](resource: RequestInfo, init: RequestInit): AsyncState[T, FetchRun[T]] = js.native
  def apply[T](resource: RequestInfo, init: RequestInit, hasDeferJsonOptions: FetchOptions[T]): AsyncState[T, FetchRun[T]] = js.native
}
