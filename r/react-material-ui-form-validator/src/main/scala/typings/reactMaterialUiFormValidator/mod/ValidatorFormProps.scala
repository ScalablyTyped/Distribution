package typings.reactMaterialUiFormValidator.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FormEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatorFormProps
  extends /* key */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.native
  
  var debounceTime: js.UndefOr[Double] = js.native
  
  var instantValidate: js.UndefOr[Boolean] = js.native
  
  var onError: js.UndefOr[js.Function1[/* errors */ js.Array[_], Unit]] = js.native
  
  def onSubmit(event: FormEvent[Element]): Unit = js.native
}
object ValidatorFormProps {
  
  @scala.inline
  def apply(onSubmit: FormEvent[Element] => Unit): ValidatorFormProps = {
    val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
    __obj.asInstanceOf[ValidatorFormProps]
  }
  
  @scala.inline
  implicit class ValidatorFormPropsOps[Self <: ValidatorFormProps] (val x: Self) extends AnyVal {
    
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
    def setOnSubmit(value: FormEvent[Element] => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDebounceTime(value: Double): Self = this.set("debounceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebounceTime: Self = this.set("debounceTime", js.undefined)
    
    @scala.inline
    def setInstantValidate(value: Boolean): Self = this.set("instantValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstantValidate: Self = this.set("instantValidate", js.undefined)
    
    @scala.inline
    def setOnError(value: /* errors */ js.Array[_] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
  }
}
