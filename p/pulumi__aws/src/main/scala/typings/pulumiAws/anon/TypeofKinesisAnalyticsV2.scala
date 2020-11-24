package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofKinesisAnalyticsV2 extends js.Object {
  
  val Types: this.type = js.native
}
object TypeofKinesisAnalyticsV2 {
  
  @scala.inline
  def apply(Types: TypeofKinesisAnalyticsV2): TypeofKinesisAnalyticsV2 = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofKinesisAnalyticsV2]
  }
  
  @scala.inline
  implicit class TypeofKinesisAnalyticsV2Ops[Self <: TypeofKinesisAnalyticsV2] (val x: Self) extends AnyVal {
    
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
    def setTypes(value: TypeofKinesisAnalyticsV2): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
}
