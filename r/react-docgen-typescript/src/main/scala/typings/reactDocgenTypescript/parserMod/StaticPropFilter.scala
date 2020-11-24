package typings.reactDocgenTypescript.parserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticPropFilter extends js.Object {
  
  var skipPropsWithName: js.UndefOr[js.Array[String] | String] = js.native
  
  var skipPropsWithoutDoc: js.UndefOr[Boolean] = js.native
}
object StaticPropFilter {
  
  @scala.inline
  def apply(): StaticPropFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticPropFilter]
  }
  
  @scala.inline
  implicit class StaticPropFilterOps[Self <: StaticPropFilter] (val x: Self) extends AnyVal {
    
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
    def setSkipPropsWithNameVarargs(value: String*): Self = this.set("skipPropsWithName", js.Array(value :_*))
    
    @scala.inline
    def setSkipPropsWithName(value: js.Array[String] | String): Self = this.set("skipPropsWithName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipPropsWithName: Self = this.set("skipPropsWithName", js.undefined)
    
    @scala.inline
    def setSkipPropsWithoutDoc(value: Boolean): Self = this.set("skipPropsWithoutDoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipPropsWithoutDoc: Self = this.set("skipPropsWithoutDoc", js.undefined)
  }
}
