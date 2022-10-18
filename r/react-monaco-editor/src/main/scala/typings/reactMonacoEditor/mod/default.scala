package typings.reactMonacoEditor.mod

import typings.propTypes.mod.Requireable
import typings.reactMonacoEditor.libTypesMod.MonacoEditorProps
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-monaco-editor", JSImport.Default)
@js.native
open class default protected ()
  extends typings.reactMonacoEditor.libEditorMod.default {
  def this(props: MonacoEditorProps) = this()
}
object default {
  
  /* static member */
  object defaultProps {
    
    @JSImport("react-monaco-editor", "default.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-monaco-editor", "default.defaultProps.className")
    @js.native
    def className: Any = js.native
    inline def className_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.defaultProps.defaultValue")
    @js.native
    def defaultValue: String = js.native
    inline def defaultValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.defaultProps.editorDidMount")
    @js.native
    def editorDidMount: js.Function0[Unit] = js.native
    inline def editorDidMount_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorDidMount")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.defaultProps.editorWillMount")
    @js.native
    def editorWillMount: js.Function0[Unit] = js.native
    inline def editorWillMount_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorWillMount")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.defaultProps.editorWillUnmount")
    @js.native
    def editorWillUnmount: js.Function0[Unit] = js.native
    inline def editorWillUnmount_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorWillUnmount")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.defaultProps.height")
    @js.native
    def height: String = js.native
    inline def height_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.defaultProps.language")
    @js.native
    def language: String = js.native
    inline def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.defaultProps.onChange")
    @js.native
    def onChange: js.Function0[Unit] = js.native
    inline def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.defaultProps.theme")
    @js.native
    def theme: Any = js.native
    inline def theme_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.defaultProps.value")
    @js.native
    def value: Any = js.native
    inline def value_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.defaultProps.width")
    @js.native
    def width: String = js.native
    inline def width_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object propTypes {
    
    @JSImport("react-monaco-editor", "default.propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-monaco-editor", "default.propTypes.className")
    @js.native
    def className: Requireable[String] = js.native
    inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.propTypes.defaultValue")
    @js.native
    def defaultValue: Requireable[String] = js.native
    inline def defaultValue_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.propTypes.editorDidMount")
    @js.native
    def editorDidMount: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def editorDidMount_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorDidMount")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.propTypes.editorWillMount")
    @js.native
    def editorWillMount: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def editorWillMount_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorWillMount")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.propTypes.editorWillUnmount")
    @js.native
    def editorWillUnmount: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def editorWillUnmount_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorWillUnmount")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.propTypes.height")
    @js.native
    def height: Requireable[NonNullable[String | Double]] = js.native
    inline def height_=(x: Requireable[NonNullable[String | Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.propTypes.language")
    @js.native
    def language: Requireable[String] = js.native
    inline def language_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.propTypes.onChange")
    @js.native
    def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.propTypes.options")
    @js.native
    def options: Requireable[js.Object] = js.native
    inline def options_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.propTypes.overrideServices")
    @js.native
    def overrideServices: Requireable[js.Object] = js.native
    inline def overrideServices_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrideServices")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.propTypes.theme")
    @js.native
    def theme: Requireable[String] = js.native
    inline def theme_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.propTypes.value")
    @js.native
    def value: Requireable[String] = js.native
    inline def value_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "default.propTypes.width")
    @js.native
    def width: Requireable[NonNullable[String | Double]] = js.native
    inline def width_=(x: Requireable[NonNullable[String | Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
  }
}
