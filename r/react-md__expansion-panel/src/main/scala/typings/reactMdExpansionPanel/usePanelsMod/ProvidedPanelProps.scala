package typings.reactMdExpansionPanel.usePanelsMod

import typings.react.mod.RefObject
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvidedPanelProps extends js.Object {
  
  /**
    * Boolean if the panel's expansion state should be disabled. This will only
    * be true when the `preventAllClosed` option has been enabled and the panel
    * is the last remaining expanded panel.
    */
  var disabled: Boolean = js.native
  
  /**
    * Boolean if the panel is corrently expanded.
    */
  var expanded: Boolean = js.native
  
  /**
    * A ref object for the panel. This is required so that the parent keyboard
    * event handler can focus the next/previous/first/last panel when the correct
    * arrow key or home/end key is pressed. If there is only one panel and the
    * keydown event handler isn't being used, this prop is not required to be
    * passed to the expansion panel.
    */
  var headerRef: RefObject[HTMLButtonElement] = js.native
  
  /**
    * The DOM id for the panel which is really just `${idPrefix}-${index + 1}`.
    */
  var id: String = js.native
  
  /**
    * This will be `true` when the panel is expanded or the previous panel was
    * expanded and the panel is not the first panel in the list.
    */
  var marginTop: Boolean = js.native
  
  /**
    * A function that will toggle the expansion of this panel in the list.
    */
  def onExpandClick(): Unit = js.native
}
object ProvidedPanelProps {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    expanded: Boolean,
    headerRef: RefObject[HTMLButtonElement],
    id: String,
    marginTop: Boolean,
    onExpandClick: () => Unit
  ): ProvidedPanelProps = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], headerRef = headerRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], onExpandClick = js.Any.fromFunction0(onExpandClick))
    __obj.asInstanceOf[ProvidedPanelProps]
  }
  
  @scala.inline
  implicit class ProvidedPanelPropsOps[Self <: ProvidedPanelProps] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRef(value: RefObject[HTMLButtonElement]): Self = this.set("headerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTop(value: Boolean): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExpandClick(value: () => Unit): Self = this.set("onExpandClick", js.Any.fromFunction0(value))
  }
}
