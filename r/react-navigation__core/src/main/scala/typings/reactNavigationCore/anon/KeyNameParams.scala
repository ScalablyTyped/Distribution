package typings.reactNavigationCore.anon

import typings.reactNavigationRouters.typesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyNameParams[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: ParamListBase */] extends js.Object {
  
  var key: js.UndefOr[String] = js.native
  
  var name: RouteName = js.native
  
  var params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any = js.native
}
object KeyNameParams {
  
  @scala.inline
  def apply[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: ParamListBase */](
    name: RouteName,
    params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ): KeyNameParams[RouteName, ParamList] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyNameParams[RouteName, ParamList]]
  }
  
  @scala.inline
  implicit class KeyNameParamsOps[Self <: KeyNameParams[_, _], RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: ParamListBase */] (val x: Self with (KeyNameParams[RouteName, ParamList])) extends AnyVal {
    
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
    def setName(value: RouteName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
