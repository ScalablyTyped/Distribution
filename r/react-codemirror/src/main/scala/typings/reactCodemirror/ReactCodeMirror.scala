package typings.reactCodemirror

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCodeMirror {
  
  trait ReactCodeMirrorProps extends StObject {
    
    /** Automatically focuses the editor when it is mounted (default false) */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Automatically persist changes to underlying textarea (default false) */
    var autoSave: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Adds a custom CSS class to the editor */
    var className: js.UndefOr[String] = js.undefined
    
    /** Provides a specific CodeMirror instance (defaults to `require('codemirror')`) */
    var codeMirrorInstance: js.UndefOr[
        js.Function2[
          /* host */ Any, 
          /* options */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.EditorConfiguration */ Any
          ], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Editor */ Any
        ]
      ] = js.undefined
    
    /** Provides the default (not changed tracked) value to the editor */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /** Set the name of the editor input field */
    var name: js.UndefOr[String] = js.undefined
    
    /** Called when a change is made */
    var onChange: js.UndefOr[
        js.Function2[
          /* newValue */ String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.EditorChange */ /* change */ Any, 
          Any
        ]
      ] = js.undefined
    
    /** Called when the cursor is moved */
    var onCursorActivity: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Editor */ /* codemirror */ Any, 
          Any
        ]
      ] = js.undefined
    
    /** Called when the editor is focused or loses focus */
    var onFocusChange: js.UndefOr[js.Function1[/* focused */ Boolean, Any]] = js.undefined
    
    /** Called when the editor is scrolled */
    var onScroll: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.ScrollInfo */ /* scrollInfo */ Any, 
          Any
        ]
      ] = js.undefined
    
    /** Options passed to the CodeMirror instance */
    var options: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.EditorConfiguration */ Any
      ] = js.undefined
    
    /** (DEPRECATED), use `name` */
    var path: js.UndefOr[String] = js.undefined
    
    /** Preserve previous scroll position after updating value */
    var preserveScrollPosition: js.UndefOr[Boolean] = js.undefined
    
    /** The editor value */
    var value: js.UndefOr[String] = js.undefined
  }
  object ReactCodeMirrorProps {
    
    inline def apply(): ReactCodeMirrorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactCodeMirrorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactCodeMirrorProps] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: Boolean): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCodeMirrorInstance(
        value: (/* host */ Any, /* options */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.EditorConfiguration */ Any
            ]) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Editor */ Any
      ): Self = StObject.set(x, "codeMirrorInstance", js.Any.fromFunction2(value))
      
      inline def setCodeMirrorInstanceUndefined: Self = StObject.set(x, "codeMirrorInstance", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(
        value: (/* newValue */ String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.EditorChange */ /* change */ Any) => Any
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnCursorActivity(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Editor */ /* codemirror */ Any => Any
      ): Self = StObject.set(x, "onCursorActivity", js.Any.fromFunction1(value))
      
      inline def setOnCursorActivityUndefined: Self = StObject.set(x, "onCursorActivity", js.undefined)
      
      inline def setOnFocusChange(value: /* focused */ Boolean => Any): Self = StObject.set(x, "onFocusChange", js.Any.fromFunction1(value))
      
      inline def setOnFocusChangeUndefined: Self = StObject.set(x, "onFocusChange", js.undefined)
      
      inline def setOnScroll(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.ScrollInfo */ /* scrollInfo */ Any => Any
      ): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.EditorConfiguration */ Any
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPreserveScrollPosition(value: Boolean): Self = StObject.set(x, "preserveScrollPosition", value.asInstanceOf[js.Any])
      
      inline def setPreserveScrollPositionUndefined: Self = StObject.set(x, "preserveScrollPosition", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
