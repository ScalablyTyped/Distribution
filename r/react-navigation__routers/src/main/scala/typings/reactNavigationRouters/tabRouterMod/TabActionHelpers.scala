package typings.reactNavigationRouters.tabRouterMod

import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabActionHelpers[ParamList /* <: ParamListBase */] extends js.Object {
  
  /**
    * Jump to an existing tab.
    *
    * @param name Name of the route for the tab.
    * @param [params] Params object for the route.
    */
  def jumpTo[RouteName /* <: Extract[/* keyof ParamList */ String, String] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
      RouteName, 
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]) | js.Array[RouteName]
  ): Unit = js.native
}
object TabActionHelpers {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */](
    jumpTo: (js.Tuple2[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]) | js.Array[js.Any] => Unit
  ): TabActionHelpers[ParamList] = {
    val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo))
    __obj.asInstanceOf[TabActionHelpers[ParamList]]
  }
  
  @scala.inline
  implicit class TabActionHelpersOps[Self <: TabActionHelpers[_], ParamList /* <: ParamListBase */] (val x: Self with TabActionHelpers[ParamList]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJumpTo(
      value: (js.Tuple2[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[js.Any] => Unit
    ): Self = this.set("jumpTo", js.Any.fromFunction1(value))
  }
}
