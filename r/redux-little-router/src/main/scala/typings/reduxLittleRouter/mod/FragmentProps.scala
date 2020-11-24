package typings.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentProps extends js.Object {
  
  var forNoMatch: js.UndefOr[Boolean] = js.native
  
  var forRoute: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[Location] = js.native
  
  var matchRoute: js.UndefOr[js.Function] = js.native
  
  var matchWildcardRoute: js.UndefOr[js.Function] = js.native
  
  var parentId: js.UndefOr[String] = js.native
  
  var parentRoute: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[ObjectLiteral[_]] = js.native
  
  var withConditions: js.UndefOr[js.Function1[/* location */ Location, Boolean]] = js.native
}
object FragmentProps {
  
  @scala.inline
  def apply(): FragmentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FragmentProps]
  }
  
  @scala.inline
  implicit class FragmentPropsOps[Self <: FragmentProps] (val x: Self) extends AnyVal {
    
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
    def setForNoMatch(value: Boolean): Self = this.set("forNoMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForNoMatch: Self = this.set("forNoMatch", js.undefined)
    
    @scala.inline
    def setForRoute(value: String): Self = this.set("forRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForRoute: Self = this.set("forRoute", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMatchRoute(value: js.Function): Self = this.set("matchRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchRoute: Self = this.set("matchRoute", js.undefined)
    
    @scala.inline
    def setMatchWildcardRoute(value: js.Function): Self = this.set("matchWildcardRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchWildcardRoute: Self = this.set("matchWildcardRoute", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setParentRoute(value: String): Self = this.set("parentRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentRoute: Self = this.set("parentRoute", js.undefined)
    
    @scala.inline
    def setStyle(value: ObjectLiteral[_]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWithConditions(value: /* location */ Location => Boolean): Self = this.set("withConditions", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWithConditions: Self = this.set("withConditions", js.undefined)
  }
}
