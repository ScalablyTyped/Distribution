package typings.reactNavigationNative.anon

import typings.reactNavigationNative.reactNavigationNativeBooleans.`true`
import typings.reactNavigationRouters.typesMod.PartialRoute
import typings.reactNavigationRouters.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  stale :true | undefined,   routes :std.Array<@react-navigation/core.@react-navigation/core.PartialRoute<@react-navigation/core.@react-navigation/core.Route<string, object | undefined>>>}> */
@js.native
trait Readonlystaletrueundefine extends js.Object {
  
  val routes: js.Array[PartialRoute[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  val stale: js.UndefOr[`true`] = js.native
}
object Readonlystaletrueundefine {
  
  @scala.inline
  def apply(routes: js.Array[PartialRoute[Route[String, js.UndefOr[js.Object]]]]): Readonlystaletrueundefine = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlystaletrueundefine]
  }
  
  @scala.inline
  implicit class ReadonlystaletrueundefineOps[Self <: Readonlystaletrueundefine] (val x: Self) extends AnyVal {
    
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
    def setRoutesVarargs(value: (PartialRoute[Route[String, js.UndefOr[js.Object]]])*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[PartialRoute[Route[String, js.UndefOr[js.Object]]]]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStale(value: `true`): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
  }
}
