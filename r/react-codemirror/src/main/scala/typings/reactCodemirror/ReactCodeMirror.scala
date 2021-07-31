package typings.reactCodemirror

import typings.codemirror.mod.Editor
import typings.codemirror.mod.EditorChange
import typings.codemirror.mod.EditorConfiguration
import typings.codemirror.mod.ScrollInfo
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCodeMirror {
  
  @js.native
  trait ReactCodeMirror
    extends Component[ReactCodeMirrorProps, js.Object, js.Any] {
    
    /** Focuses the CodeMirror instance. */
    def focus(): Unit = js.native
    
    /** Returns the CodeMirror instance, if available. */
    def getCodeMirror(): Editor = js.native
  }
  
  type ReactCodeMirrorClass = ComponentClass[ReactCodeMirrorProps, ComponentState]
  
  trait ReactCodeMirrorProps
    extends StObject
       with Props[typings.reactCodemirror.ReactCodeMirror.ReactCodeMirror] {
    
    /** Automatically focuses the editor when it is mounted (default false) */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Automatically persist changes to underlying textarea (default false) */
    var autoSave: js.UndefOr[Boolean] = js.undefined
    
    /** Adds a custom CSS class to the editor */
    var className: js.UndefOr[String] = js.undefined
    
    /** Provides a specific CodeMirror instance (defaults to `require('codemirror')`) */
    var codeMirrorInstance: js.UndefOr[
        js.Function2[/* host */ js.Any, /* options */ js.UndefOr[EditorConfiguration], Editor]
      ] = js.undefined
    
    /** Provides the default (not changed tracked) value to the editor */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /** Set the name of the editor input field */
    var name: js.UndefOr[String] = js.undefined
    
    /** Called when a change is made */
    var onChange: js.UndefOr[js.Function2[/* newValue */ String, /* change */ EditorChange, js.Any]] = js.undefined
    
    /** Called when the cursor is moved */
    var onCursorActivity: js.UndefOr[js.Function1[/* codemirror */ Editor, js.Any]] = js.undefined
    
    /** Called when the editor is focused or loses focus */
    var onFocusChange: js.UndefOr[js.Function1[/* focused */ Boolean, js.Any]] = js.undefined
    
    /** Called when the editor is scrolled */
    var onScroll: js.UndefOr[js.Function1[/* scrollInfo */ ScrollInfo, js.Any]] = js.undefined
    
    /** Options passed to the CodeMirror instance */
    var options: js.UndefOr[EditorConfiguration] = js.undefined
    
    /** (DEPRECATED), use `name` */
    var path: js.UndefOr[String] = js.undefined
    
    /** Preserve previous scroll position after updating value */
    var preserveScrollPosition: js.UndefOr[Boolean] = js.undefined
    
    /** The editor value */
    var value: js.UndefOr[String] = js.undefined
  }
  object ReactCodeMirrorProps {
    
    @scala.inline
    def apply(): ReactCodeMirrorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactCodeMirrorProps]
    }
    
    @scala.inline
    implicit class ReactCodeMirrorPropsMutableBuilder[Self <: ReactCodeMirrorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoSave(value: Boolean): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCodeMirrorInstance(value: (/* host */ js.Any, /* options */ js.UndefOr[EditorConfiguration]) => Editor): Self = StObject.set(x, "codeMirrorInstance", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCodeMirrorInstanceUndefined: Self = StObject.set(x, "codeMirrorInstance", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* newValue */ String, /* change */ EditorChange) => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnCursorActivity(value: /* codemirror */ Editor => js.Any): Self = StObject.set(x, "onCursorActivity", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCursorActivityUndefined: Self = StObject.set(x, "onCursorActivity", js.undefined)
      
      @scala.inline
      def setOnFocusChange(value: /* focused */ Boolean => js.Any): Self = StObject.set(x, "onFocusChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusChangeUndefined: Self = StObject.set(x, "onFocusChange", js.undefined)
      
      @scala.inline
      def setOnScroll(value: /* scrollInfo */ ScrollInfo => js.Any): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOptions(value: EditorConfiguration): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPreserveScrollPosition(value: Boolean): Self = StObject.set(x, "preserveScrollPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveScrollPositionUndefined: Self = StObject.set(x, "preserveScrollPosition", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
