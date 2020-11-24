package typings.reactCodemirror.ReactCodeMirror

import typings.codemirror.mod.Editor
import typings.codemirror.mod.EditorChange
import typings.codemirror.mod.EditorConfiguration
import typings.codemirror.mod.ScrollInfo
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactCodeMirrorProps
  extends Props[typings.reactCodemirror.ReactCodeMirror.ReactCodeMirror] {
  
  /** Automatically focuses the editor when it is mounted (default false) */
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  /** Automatically persist changes to underlying textarea (default false) */
  var autoSave: js.UndefOr[Boolean] = js.native
  
  /** Adds a custom CSS class to the editor */
  var className: js.UndefOr[String] = js.native
  
  /** Provides a specific CodeMirror instance (defaults to `require('codemirror')`) */
  var codeMirrorInstance: js.UndefOr[
    js.Function2[/* host */ js.Any, /* options */ js.UndefOr[EditorConfiguration], Editor]
  ] = js.native
  
  /** Provides the default (not changed tracked) value to the editor */
  var defaultValue: js.UndefOr[String] = js.native
  
  /** Set the name of the editor input field */
  var name: js.UndefOr[String] = js.native
  
  /** Called when a change is made */
  var onChange: js.UndefOr[js.Function2[/* newValue */ String, /* change */ EditorChange, _]] = js.native
  
  /** Called when the cursor is moved */
  var onCursorActivity: js.UndefOr[js.Function1[/* codemirror */ Editor, _]] = js.native
  
  /** Called when the editor is focused or loses focus */
  var onFocusChange: js.UndefOr[js.Function1[/* focused */ Boolean, _]] = js.native
  
  /** Called when the editor is scrolled */
  var onScroll: js.UndefOr[js.Function1[/* scrollInfo */ ScrollInfo, _]] = js.native
  
  /** Options passed to the CodeMirror instance */
  var options: js.UndefOr[EditorConfiguration] = js.native
  
  /** (DEPRECATED), use `name` */
  var path: js.UndefOr[String] = js.native
  
  /** Preserve previous scroll position after updating value */
  var preserveScrollPosition: js.UndefOr[Boolean] = js.native
  
  /** The editor value */
  var value: js.UndefOr[String] = js.native
}
object ReactCodeMirrorProps {
  
  @scala.inline
  def apply(): ReactCodeMirrorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactCodeMirrorProps]
  }
  
  @scala.inline
  implicit class ReactCodeMirrorPropsOps[Self <: ReactCodeMirrorProps] (val x: Self) extends AnyVal {
    
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setAutoSave(value: Boolean): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCodeMirrorInstance(value: (/* host */ js.Any, /* options */ js.UndefOr[EditorConfiguration]) => Editor): Self = this.set("codeMirrorInstance", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCodeMirrorInstance: Self = this.set("codeMirrorInstance", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* newValue */ String, /* change */ EditorChange) => _): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnCursorActivity(value: /* codemirror */ Editor => _): Self = this.set("onCursorActivity", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCursorActivity: Self = this.set("onCursorActivity", js.undefined)
    
    @scala.inline
    def setOnFocusChange(value: /* focused */ Boolean => _): Self = this.set("onFocusChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocusChange: Self = this.set("onFocusChange", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* scrollInfo */ ScrollInfo => _): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOptions(value: EditorConfiguration): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPreserveScrollPosition(value: Boolean): Self = this.set("preserveScrollPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveScrollPosition: Self = this.set("preserveScrollPosition", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
