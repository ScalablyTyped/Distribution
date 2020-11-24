package typings.primereact.pickListMod

import typings.primereact.anon.Source
import typings.primereact.anon.Value
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickListProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.native
  
  var metaKeySelection: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* e */ Source, Unit]] = js.native
  
  var onMoveAllToSource: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  
  var onMoveAllToTarget: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  
  var onMoveToSource: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  
  var onMoveToTarget: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  
  var onSourceSelect: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  
  var onTargetSelect: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  
  var showSourceControls: js.UndefOr[Boolean] = js.native
  
  var showTargetControls: js.UndefOr[Boolean] = js.native
  
  var source: js.UndefOr[js.Array[_]] = js.native
  
  var sourceHeader: js.UndefOr[js.Any] = js.native
  
  var sourceStyle: js.UndefOr[js.Object] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var tabIndex: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[js.Array[_]] = js.native
  
  var targetHeader: js.UndefOr[js.Any] = js.native
  
  var targetStyle: js.UndefOr[js.Object] = js.native
}
object PickListProps {
  
  @scala.inline
  def apply(): PickListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickListProps]
  }
  
  @scala.inline
  implicit class PickListPropsOps[Self <: PickListProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setItemTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = this.set("itemTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    
    @scala.inline
    def setMetaKeySelection(value: Boolean): Self = this.set("metaKeySelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaKeySelection: Self = this.set("metaKeySelection", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ Source => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnMoveAllToSource(value: /* e */ Value => Unit): Self = this.set("onMoveAllToSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMoveAllToSource: Self = this.set("onMoveAllToSource", js.undefined)
    
    @scala.inline
    def setOnMoveAllToTarget(value: /* e */ Value => Unit): Self = this.set("onMoveAllToTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMoveAllToTarget: Self = this.set("onMoveAllToTarget", js.undefined)
    
    @scala.inline
    def setOnMoveToSource(value: /* e */ Value => Unit): Self = this.set("onMoveToSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMoveToSource: Self = this.set("onMoveToSource", js.undefined)
    
    @scala.inline
    def setOnMoveToTarget(value: /* e */ Value => Unit): Self = this.set("onMoveToTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMoveToTarget: Self = this.set("onMoveToTarget", js.undefined)
    
    @scala.inline
    def setOnSourceSelect(value: /* e */ Value => Unit): Self = this.set("onSourceSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSourceSelect: Self = this.set("onSourceSelect", js.undefined)
    
    @scala.inline
    def setOnTargetSelect(value: /* e */ Value => Unit): Self = this.set("onTargetSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTargetSelect: Self = this.set("onTargetSelect", js.undefined)
    
    @scala.inline
    def setShowSourceControls(value: Boolean): Self = this.set("showSourceControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSourceControls: Self = this.set("showSourceControls", js.undefined)
    
    @scala.inline
    def setShowTargetControls(value: Boolean): Self = this.set("showTargetControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTargetControls: Self = this.set("showTargetControls", js.undefined)
    
    @scala.inline
    def setSourceVarargs(value: js.Any*): Self = this.set("source", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: js.Array[_]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceHeader(value: js.Any): Self = this.set("sourceHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceHeader: Self = this.set("sourceHeader", js.undefined)
    
    @scala.inline
    def setSourceStyle(value: js.Object): Self = this.set("sourceStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceStyle: Self = this.set("sourceStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: String): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: js.Any*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[_]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetHeader(value: js.Any): Self = this.set("targetHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetHeader: Self = this.set("targetHeader", js.undefined)
    
    @scala.inline
    def setTargetStyle(value: js.Object): Self = this.set("targetStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetStyle: Self = this.set("targetStyle", js.undefined)
  }
}
