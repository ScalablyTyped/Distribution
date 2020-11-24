package typings.storybookApi.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Headline extends js.Object {
  
  var headline: String = js.native
  
  var subHeadline: js.UndefOr[String | ReactNode] = js.native
}
object Headline {
  
  @scala.inline
  def apply(headline: String): Headline = {
    val __obj = js.Dynamic.literal(headline = headline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headline]
  }
  
  @scala.inline
  implicit class HeadlineOps[Self <: Headline] (val x: Self) extends AnyVal {
    
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
    def setHeadline(value: String): Self = this.set("headline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubHeadline(value: String | ReactNode): Self = this.set("subHeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubHeadline: Self = this.set("subHeadline", js.undefined)
  }
}
