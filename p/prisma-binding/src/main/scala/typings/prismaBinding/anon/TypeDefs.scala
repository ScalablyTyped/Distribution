package typings.prismaBinding.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeDefs extends js.Object {
  var typeDefs: String = js.native
}

object TypeDefs {
  @scala.inline
  def apply(typeDefs: String): TypeDefs = {
    val __obj = js.Dynamic.literal(typeDefs = typeDefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefs]
  }
  @scala.inline
  implicit class TypeDefsOps[Self <: TypeDefs] (val x: Self) extends AnyVal {
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

