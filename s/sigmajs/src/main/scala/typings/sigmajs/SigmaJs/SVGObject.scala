package typings.sigmajs.SigmaJs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGObject[T] extends js.Object {
  
  def create(`object`: T, a: js.Any*): Element = js.native
  
  def update(`object`: T, a: js.Any*): Unit = js.native
}
object SVGObject {
  
  @scala.inline
  def apply[T](create: (T, /* repeated */ js.Any) => Element, update: (T, /* repeated */ js.Any) => Unit): SVGObject[T] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[SVGObject[T]]
  }
  
  @scala.inline
  implicit class SVGObjectOps[Self <: SVGObject[_], T] (val x: Self with SVGObject[T]) extends AnyVal {
    
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
    def setCreate(value: (T, /* repeated */ js.Any) => Element): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(value: (T, /* repeated */ js.Any) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
  }
}
