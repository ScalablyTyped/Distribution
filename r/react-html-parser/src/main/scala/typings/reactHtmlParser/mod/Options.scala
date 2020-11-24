package typings.reactHtmlParser.mod

import typings.domhandler.mod.DomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var decodeEntities: js.UndefOr[Boolean] = js.native
  
  var preprocessNodes: js.UndefOr[js.Function1[/* nodes */ js.Array[DomElement], _]] = js.native
  
  var transform: js.UndefOr[Transform] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setDecodeEntities(value: Boolean): Self = this.set("decodeEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeEntities: Self = this.set("decodeEntities", js.undefined)
    
    @scala.inline
    def setPreprocessNodes(value: /* nodes */ js.Array[DomElement] => _): Self = this.set("preprocessNodes", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreprocessNodes: Self = this.set("preprocessNodes", js.undefined)
    
    @scala.inline
    def setTransform(value: Transform): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
