package typings.reactNavigationCore.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanGoBack extends StObject {
  
  def canGoBack(): Boolean = js.native
  
  def dispatch(action: js.Function1[/* state */ ReadonlykeystringindexnumHistory, Readonlytypestringpayload]): Unit = js.native
  def dispatch(action: Readonlytypestringpayload): Unit = js.native
  
  def getId(): js.UndefOr[String] = js.native
  
  def getParent[T](): T = js.native
  def getParent[T](id: String): T = js.native
  
  def getState(): ReadonlykeystringindexnumHistory = js.native
  
  def goBack(): Unit = js.native
  
  def isFocused(): Boolean = js.native
  
  def navigate[RouteName /* <: String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type RouteName extends unknown ? [screen: RouteName] | [screen: RouteName, params: object | undefined] : never is not an array type */ args: (js.Array[/* screen */ RouteName]) | (js.Tuple2[/* screen */ RouteName, /* params */ js.UndefOr[js.Object]])
  ): Unit = js.native
  def navigate[RouteName_1 /* <: String */](options: Merge | KeyMerge[RouteName_1]): Unit = js.native
  
  def reset(state: PartialStateReadonlykeystHistory): Unit = js.native
  def reset(state: ReadonlykeystringindexnumHistory): Unit = js.native
  
  def setParams[RouteName_2 /* <: String */](params: Partial[js.UndefOr[js.Object]]): Unit = js.native
}
