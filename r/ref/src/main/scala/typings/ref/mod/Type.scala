package typings.ref.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends js.Object {
  
  /** The alignment of this datatype when placed inside a struct. */
  var alignment: js.UndefOr[Double] = js.native
  
  /** To invoke when `ref.get` is invoked on a buffer of this type. */
  def get(buffer: Buffer, offset: Double): js.Any = js.native
  
  /** The current level of indirection of the buffer. */
  var indirection: Double = js.native
  
  /** The name to use during debugging for this datatype. */
  var name: js.UndefOr[String] = js.native
  
  /** To invoke when `ref.set` is invoked on a buffer of this type. */
  def set(buffer: Buffer, offset: Double, value: js.Any): Unit = js.native
  
  /** The size in bytes required to hold this datatype. */
  var size: Double = js.native
}
object Type {
  
  @scala.inline
  def apply(
    get: (Buffer, Double) => js.Any,
    indirection: Double,
    set: (Buffer, Double, js.Any) => Unit,
    size: Double
  ): Type = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), indirection = indirection.asInstanceOf[js.Any], set = js.Any.fromFunction3(set), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    
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
    def setGet(value: (Buffer, Double) => js.Any): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIndirection(value: Double): Self = this.set("indirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: (Buffer, Double, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignment(value: Double): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
