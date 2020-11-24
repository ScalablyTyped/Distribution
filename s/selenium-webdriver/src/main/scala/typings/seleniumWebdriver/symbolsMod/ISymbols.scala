package typings.seleniumWebdriver.symbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISymbols extends js.Object {
  
  /**
    * The serialize symbol specifies a method that returns an object's serialized
    * representation. If an object's serialized form is not immediately
    * available, the serialize method will return a promise that will be resolved
    * with the serialized form.
    *
    * Note that the described method is analogous to objects that define a
    * `toJSON()` method, except the serialized result may be a promise, or
    * another object with a promised property.
    */
  val serialize: js.Symbol = js.native
}
object ISymbols {
  
  @scala.inline
  def apply(serialize: js.Symbol): ISymbols = {
    val __obj = js.Dynamic.literal(serialize = serialize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISymbols]
  }
  
  @scala.inline
  implicit class ISymbolsOps[Self <: ISymbols] (val x: Self) extends AnyVal {
    
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
    def setSerialize(value: js.Symbol): Self = this.set("serialize", value.asInstanceOf[js.Any])
  }
}
