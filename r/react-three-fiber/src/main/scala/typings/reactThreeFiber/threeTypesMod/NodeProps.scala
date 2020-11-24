package typings.reactThreeFiber.threeTypesMod

import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeProps[T, P] extends js.Object {
  
  var args: js.UndefOr[Args[P]] = js.native
  
  var attach: js.UndefOr[String] = js.native
  
  var attachArray: js.UndefOr[String] = js.native
  
  var attachObject: js.UndefOr[NamedArrayTuple[js.Function2[/* target */ String, /* name */ String, Unit]]] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var onUpdate: js.UndefOr[js.Function1[/* self */ T, Unit]] = js.native
  
  var ref: js.UndefOr[Ref[ReactNode]] = js.native
}
object NodeProps {
  
  @scala.inline
  def apply[T, P](): NodeProps[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeProps[T, P]]
  }
  
  @scala.inline
  implicit class NodePropsOps[Self <: NodeProps[_, _], T, P] (val x: Self with (NodeProps[T, P])) extends AnyVal {
    
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
    def setArgs(value: Args[P]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setAttach(value: String): Self = this.set("attach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttach: Self = this.set("attach", js.undefined)
    
    @scala.inline
    def setAttachArray(value: String): Self = this.set("attachArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachArray: Self = this.set("attachArray", js.undefined)
    
    @scala.inline
    def setAttachObject(value: NamedArrayTuple[js.Function2[/* target */ String, /* name */ String, Unit]]): Self = this.set("attachObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachObject: Self = this.set("attachObject", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: /* self */ T => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setRefFunction1(value: /* instance */ ReactNode | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[ReactNode]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
}
