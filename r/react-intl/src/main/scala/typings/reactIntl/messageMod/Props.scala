package typings.reactIntl.messageMod

import typings.formatjsIntl.srcTypesMod.MessageDescriptor
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props[V /* <: Record[String, _] */] extends MessageDescriptor {
  
  var children: js.UndefOr[js.Function1[/* nodes */ ReactNodeArray, ReactNode]] = js.native
  
  var tagName: js.UndefOr[ElementType[_]] = js.native
  
  var values: js.UndefOr[V] = js.native
}
object Props {
  
  @scala.inline
  def apply[V /* <: Record[String, _] */](): Props[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props[V]]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props[_], V /* <: Record[String, _] */] (val x: Self with Props[V]) extends AnyVal {
    
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
    def setChildren(value: /* nodes */ ReactNodeArray => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setTagName(value: ElementType[_]): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    
    @scala.inline
    def setValues(value: V): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
