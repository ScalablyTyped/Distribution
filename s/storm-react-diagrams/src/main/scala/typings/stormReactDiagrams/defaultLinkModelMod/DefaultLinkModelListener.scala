package typings.stormReactDiagrams.defaultLinkModelMod

import typings.stormReactDiagrams.anon.BaseEventDefaultLinkModel
import typings.stormReactDiagrams.anon.BaseEventDefaultLinkModelEntity
import typings.stormReactDiagrams.linkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultLinkModelListener extends LinkModelListener {
  
  var colorChanged: js.UndefOr[js.Function1[/* event */ BaseEventDefaultLinkModel, Unit]] = js.native
  
  var widthChanged: js.UndefOr[js.Function1[/* event */ BaseEventDefaultLinkModelEntity, Unit]] = js.native
}
object DefaultLinkModelListener {
  
  @scala.inline
  def apply(): DefaultLinkModelListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultLinkModelListener]
  }
  
  @scala.inline
  implicit class DefaultLinkModelListenerOps[Self <: DefaultLinkModelListener] (val x: Self) extends AnyVal {
    
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
    def setColorChanged(value: /* event */ BaseEventDefaultLinkModel => Unit): Self = this.set("colorChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColorChanged: Self = this.set("colorChanged", js.undefined)
    
    @scala.inline
    def setWidthChanged(value: /* event */ BaseEventDefaultLinkModelEntity => Unit): Self = this.set("widthChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWidthChanged: Self = this.set("widthChanged", js.undefined)
  }
}
