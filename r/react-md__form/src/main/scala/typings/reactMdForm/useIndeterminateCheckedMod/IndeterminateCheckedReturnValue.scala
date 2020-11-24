package typings.reactMdForm.useIndeterminateCheckedMod

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndeterminateCheckedReturnValue[T /* <: String */] extends js.Object {
  
  var checkedValues: js.Array[T] = js.native
  
  var getProps: GetIndeterminateControlledCheckboxProps[T] = js.native
  
  var rootProps: ProvidedIndeterminateCheckboxProps = js.native
  
  var setCheckedValues: Dispatch[SetStateAction[js.Array[T]]] = js.native
}
object IndeterminateCheckedReturnValue {
  
  @scala.inline
  def apply[T /* <: String */](
    checkedValues: js.Array[T],
    getProps: T => ProvidedIndeterminateControlledCheckboxProps[T],
    rootProps: ProvidedIndeterminateCheckboxProps,
    setCheckedValues: SetStateAction[js.Array[T]] => Unit
  ): IndeterminateCheckedReturnValue[T] = {
    val __obj = js.Dynamic.literal(checkedValues = checkedValues.asInstanceOf[js.Any], getProps = js.Any.fromFunction1(getProps), rootProps = rootProps.asInstanceOf[js.Any], setCheckedValues = js.Any.fromFunction1(setCheckedValues))
    __obj.asInstanceOf[IndeterminateCheckedReturnValue[T]]
  }
  
  @scala.inline
  implicit class IndeterminateCheckedReturnValueOps[Self <: IndeterminateCheckedReturnValue[_], T /* <: String */] (val x: Self with IndeterminateCheckedReturnValue[T]) extends AnyVal {
    
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
    def setCheckedValuesVarargs(value: T*): Self = this.set("checkedValues", js.Array(value :_*))
    
    @scala.inline
    def setCheckedValues(value: js.Array[T]): Self = this.set("checkedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetProps(value: T => ProvidedIndeterminateControlledCheckboxProps[T]): Self = this.set("getProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRootProps(value: ProvidedIndeterminateCheckboxProps): Self = this.set("rootProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCheckedValues(value: SetStateAction[js.Array[T]] => Unit): Self = this.set("setCheckedValues", js.Any.fromFunction1(value))
  }
}
