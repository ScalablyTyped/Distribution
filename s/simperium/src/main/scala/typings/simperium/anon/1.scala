package typings.simperium.anon

import org.scalablytyped.runtime.NumberDictionary
import typings.simperium.mod.DiffOp
import typings.simperium.simperiumStrings.L
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1`[T] extends DiffOp[T] {
  
  var o: L = js.native
  
  var v: NumberDictionary[js.Any] = js.native
}
object `1` {
  
  @scala.inline
  def apply[T](o: L, v: NumberDictionary[js.Any]): `1`[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[T]]
  }
  
  @scala.inline
  implicit class `1Ops`[Self <: `1`[_], T] (val x: Self with `1`[T]) extends AnyVal {
    
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
    def setO(value: L): Self = this.set("o", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: NumberDictionary[js.Any]): Self = this.set("v", value.asInstanceOf[js.Any])
  }
}
