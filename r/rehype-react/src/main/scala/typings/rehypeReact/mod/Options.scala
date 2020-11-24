package typings.rehypeReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.rehypeReact.anon.Children
import typings.rehypeReact.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var Fragment: js.UndefOr[ComponentType[Children]] = js.native
  
  var components: js.UndefOr[StringDictionary[ComponentType[_]]] = js.native
  
  var createElement: FnCall = js.native
  
  var prefix: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(createElement: FnCall): Options = {
    val __obj = js.Dynamic.literal(createElement = createElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCreateElement(value: FnCall): Self = this.set("createElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragment(value: ComponentType[Children]): Self = this.set("Fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragment: Self = this.set("Fragment", js.undefined)
    
    @scala.inline
    def setComponents(value: StringDictionary[ComponentType[_]]): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
