package typings.prismaBinding.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrismaOptions extends BasePrismaOptions {
  var typeDefs: String = js.native
}

object PrismaOptions {
  @scala.inline
  def apply(typeDefs: String): PrismaOptions = {
    val __obj = js.Dynamic.literal(typeDefs = typeDefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismaOptions]
  }
  @scala.inline
  implicit class PrismaOptionsOps[Self <: PrismaOptions] (val x: Self) extends AnyVal {
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
    def setTypeDefs(value: String): Self = this.set("typeDefs", value.asInstanceOf[js.Any])
  }
  
}

