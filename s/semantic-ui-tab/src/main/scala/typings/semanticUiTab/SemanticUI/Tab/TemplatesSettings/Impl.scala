package typings.semanticUiTab.SemanticUI.Tab.TemplatesSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * returns page title
    */
  def determineTitle(tabArray: js.Array[_]): String = js.native
}
object Impl {
  
  @scala.inline
  def apply(determineTitle: js.Array[_] => String): Impl = {
    val __obj = js.Dynamic.literal(determineTitle = js.Any.fromFunction1(determineTitle))
    __obj.asInstanceOf[Impl]
  }
  
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    
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
    def setDetermineTitle(value: js.Array[_] => String): Self = this.set("determineTitle", js.Any.fromFunction1(value))
  }
}
