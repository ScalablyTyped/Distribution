package typings.reactIsDeprecated.mod

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deprecatable[T] extends js.Object {
  
  def isDeprecated(message: String): Validator[T] = js.native
}
object Deprecatable {
  
  @scala.inline
  def apply[T](isDeprecated: String => Validator[T]): Deprecatable[T] = {
    val __obj = js.Dynamic.literal(isDeprecated = js.Any.fromFunction1(isDeprecated))
    __obj.asInstanceOf[Deprecatable[T]]
  }
  
  @scala.inline
  implicit class DeprecatableOps[Self <: Deprecatable[_], T] (val x: Self with Deprecatable[T]) extends AnyVal {
    
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
    def setIsDeprecated(value: String => Validator[T]): Self = this.set("isDeprecated", js.Any.fromFunction1(value))
  }
}
