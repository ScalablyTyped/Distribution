package typings.reactPopper.anon

import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.typesMod.State
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends js.Object {
  
  var attributes: StringDictionary[js.UndefOr[StringDictionary[String]]] = js.native
  
  var forceUpdate: js.Function0[Unit] | Null = js.native
  
  var state: State | Null = js.native
  
  var styles: StringDictionary[CSSProperties] = js.native
  
  var update: js.Function0[js.Promise[typings.popperjsCore.anon.PartialState]] | Null = js.native
}
object Attributes {
  
  @scala.inline
  def apply(
    attributes: StringDictionary[js.UndefOr[StringDictionary[String]]],
    styles: StringDictionary[CSSProperties]
  ): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: StringDictionary[js.UndefOr[StringDictionary[String]]]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: StringDictionary[CSSProperties]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUpdate(value: () => Unit): Self = this.set("forceUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForceUpdateNull: Self = this.set("forceUpdate", null)
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = this.set("state", null)
    
    @scala.inline
    def setUpdate(value: () => js.Promise[typings.popperjsCore.anon.PartialState]): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateNull: Self = this.set("update", null)
  }
}
