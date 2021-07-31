package typings.reactNavigationCore.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanGoBack extends StObject {
  
  def canGoBack(): Boolean = js.native
  
  def dangerouslyGetParent[T_1](): T_1 = js.native
  @JSName("dangerouslyGetParent")
  def dangerouslyGetParent_T_T[T](): T = js.native
  
  def dangerouslyGetState(): js.Any = js.native
  @JSName("dangerouslyGetState")
  def dangerouslyGetState_ReadonlykeystringindexnumHistory(): ReadonlykeystringindexnumHistory = js.native
  
  def dispatch(
    action: js.Function1[
      (/* state */ js.Any) | (/* state */ ReadonlykeystringindexnumHistory), 
      Readonlytypestringpayload
    ]
  ): Unit = js.native
  def dispatch(action: Readonlytypestringpayload): Unit = js.native
  
  def goBack(): Unit = js.native
  
  def isFocused(): Boolean = js.native
  
  def navigate[RouteName /* <: String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [RouteName] | [RouteName, object | undefined] is not an array type */ args: js.Array[RouteName]
  ): Unit = js.native
  def navigate[RouteName /* <: String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [RouteName] | [RouteName, object | undefined] is not an array type */ args: js.Tuple2[RouteName, js.UndefOr[js.Object]]
  ): Unit = js.native
  def navigate[RouteName_1 /* <: String */](route: KeyName[RouteName_1]): Unit = js.native
  def navigate[RouteName_1 /* <: String */](route: KeyParams): Unit = js.native
  def navigate[RouteName_4 /* <: String */](route: NameParams[RouteName_4]): Unit = js.native
  @JSName("navigate")
  def navigate_RouteName_3_String[RouteName_3 /* <: String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [RouteName_3] | [RouteName_3, object | undefined] is not an array type */ args: js.Array[RouteName_3]
  ): Unit = js.native
  @JSName("navigate")
  def navigate_RouteName_3_String[RouteName_3 /* <: String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [RouteName_3] | [RouteName_3, object | undefined] is not an array type */ args: js.Tuple2[RouteName_3, js.UndefOr[js.Object]]
  ): Unit = js.native
  @JSName("navigate")
  def navigate_RouteName_4_String[RouteName_4 /* <: String */](route: KeyParams): Unit = js.native
  
  def reset(state: js.Any): Unit = js.native
  def reset(state: PartialStateReadonlykeystHistory): Unit = js.native
  def reset(state: ReadonlykeystringindexnumHistory): Unit = js.native
  
  def setOptions(options: Partial[js.Any]): Unit = js.native
  
  def setParams(): Unit = js.native
  def setParams(params: js.Object): Unit = js.native
  @JSName("setParams")
  def setParams_RouteName_2_String[RouteName_2 /* <: String */](): Unit = js.native
  @JSName("setParams")
  def setParams_RouteName_2_String[RouteName_2 /* <: String */](params: js.Object): Unit = js.native
}
