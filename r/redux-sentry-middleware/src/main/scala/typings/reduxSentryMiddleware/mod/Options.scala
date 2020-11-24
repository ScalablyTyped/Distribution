package typings.reduxSentryMiddleware.mod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.Action
import typings.sentryTypes.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[T] extends js.Object {
  
  var actionTransformer: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.native
  
  var breadcrumbCategory: js.UndefOr[String] = js.native
  
  var breadcrumbDataFromAction: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.native
  
  var breadcrumbMessageFromAction: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.native
  
  var filterBreadcrumbActions: js.UndefOr[js.Function1[/* action */ Action[_], Boolean]] = js.native
  
  var getTags: js.UndefOr[js.Function1[/* state */ T, js.UndefOr[StringDictionary[String]]]] = js.native
  
  var getUserContext: js.UndefOr[js.Function1[/* state */ T, User]] = js.native
  
  var stateTransformer: js.UndefOr[js.Function1[/* state */ T, _]] = js.native
}
object Options {
  
  @scala.inline
  def apply[T](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
    
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
    def setActionTransformer(value: /* action */ Action[_] => _): Self = this.set("actionTransformer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionTransformer: Self = this.set("actionTransformer", js.undefined)
    
    @scala.inline
    def setBreadcrumbCategory(value: String): Self = this.set("breadcrumbCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreadcrumbCategory: Self = this.set("breadcrumbCategory", js.undefined)
    
    @scala.inline
    def setBreadcrumbDataFromAction(value: /* action */ Action[_] => _): Self = this.set("breadcrumbDataFromAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBreadcrumbDataFromAction: Self = this.set("breadcrumbDataFromAction", js.undefined)
    
    @scala.inline
    def setBreadcrumbMessageFromAction(value: /* action */ Action[_] => _): Self = this.set("breadcrumbMessageFromAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBreadcrumbMessageFromAction: Self = this.set("breadcrumbMessageFromAction", js.undefined)
    
    @scala.inline
    def setFilterBreadcrumbActions(value: /* action */ Action[_] => Boolean): Self = this.set("filterBreadcrumbActions", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilterBreadcrumbActions: Self = this.set("filterBreadcrumbActions", js.undefined)
    
    @scala.inline
    def setGetTags(value: /* state */ T => js.UndefOr[StringDictionary[String]]): Self = this.set("getTags", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetTags: Self = this.set("getTags", js.undefined)
    
    @scala.inline
    def setGetUserContext(value: /* state */ T => User): Self = this.set("getUserContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetUserContext: Self = this.set("getUserContext", js.undefined)
    
    @scala.inline
    def setStateTransformer(value: /* state */ T => _): Self = this.set("stateTransformer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStateTransformer: Self = this.set("stateTransformer", js.undefined)
  }
}
