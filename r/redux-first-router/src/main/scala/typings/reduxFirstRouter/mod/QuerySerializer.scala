package typings.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuerySerializer extends js.Object {
  
  def parse(queryString: String): js.Object = js.native
  
  def stringify(params: Params): String = js.native
}
object QuerySerializer {
  
  @scala.inline
  def apply(parse: String => js.Object, stringify: Params => String): QuerySerializer = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[QuerySerializer]
  }
  
  @scala.inline
  implicit class QuerySerializerOps[Self <: QuerySerializer] (val x: Self) extends AnyVal {
    
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
    def setParse(value: String => js.Object): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringify(value: Params => String): Self = this.set("stringify", js.Any.fromFunction1(value))
  }
}
