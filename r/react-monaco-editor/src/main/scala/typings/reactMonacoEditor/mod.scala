package typings.reactMonacoEditor

import typings.propTypes.mod.Requireable
import typings.reactMonacoEditor.typesMod.MonacoDiffEditorProps
import typings.reactMonacoEditor.typesMod.MonacoEditorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-monaco-editor", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.reactMonacoEditor.editorMod.default {
    def this(props: MonacoEditorProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-monaco-editor", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
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
      def theme: js.Any = js.native
      inline def theme_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "default.defaultProps.value")
      @js.native
      def value: js.Any = js.native
      inline def value_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
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
      
      @JSImport("react-monaco-editor", "default.propTypes.defaultValue")
      @js.native
      def defaultValue: Requireable[String] = js.native
      inline def defaultValue_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "default.propTypes.editorDidMount")
      @js.native
      def editorDidMount: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      inline def editorDidMount_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorDidMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "default.propTypes.editorWillMount")
      @js.native
      def editorWillMount: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      inline def editorWillMount_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorWillMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "default.propTypes.height")
      @js.native
      def height: Requireable[String | Double] = js.native
      inline def height_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "default.propTypes.language")
      @js.native
      def language: Requireable[String] = js.native
      inline def language_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
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
      def width: Requireable[String | Double] = js.native
      inline def width_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("react-monaco-editor", "MonacoDiffEditor")
  @js.native
  class MonacoDiffEditor protected ()
    extends typings.reactMonacoEditor.diffMod.default {
    def this(props: MonacoDiffEditorProps) = this()
  }
  object MonacoDiffEditor {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.defaultProps.defaultValue")
      @js.native
      def defaultValue: String = js.native
      inline def defaultValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.defaultProps.editorDidMount")
      @js.native
      def editorDidMount: js.Function0[Unit] = js.native
      inline def editorDidMount_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorDidMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.defaultProps.editorWillMount")
      @js.native
      def editorWillMount: js.Function0[Unit] = js.native
      inline def editorWillMount_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorWillMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.defaultProps.height")
      @js.native
      def height: String = js.native
      inline def height_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.defaultProps.language")
      @js.native
      def language: String = js.native
      inline def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.defaultProps.onChange")
      @js.native
      def onChange: js.Function0[Unit] = js.native
      inline def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.defaultProps.original")
      @js.native
      def original: js.Any = js.native
      inline def original_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("original")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.defaultProps.theme")
      @js.native
      def theme: js.Any = js.native
      inline def theme_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.defaultProps.value")
      @js.native
      def value: js.Any = js.native
      inline def value_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.defaultProps.width")
      @js.native
      def width: String = js.native
      inline def width_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object propTypes {
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.propTypes.defaultValue")
      @js.native
      def defaultValue: Requireable[String] = js.native
      inline def defaultValue_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.propTypes.editorDidMount")
      @js.native
      def editorDidMount: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      inline def editorDidMount_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorDidMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.propTypes.editorWillMount")
      @js.native
      def editorWillMount: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      inline def editorWillMount_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorWillMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.propTypes.height")
      @js.native
      def height: Requireable[String | Double] = js.native
      inline def height_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.propTypes.language")
      @js.native
      def language: Requireable[String] = js.native
      inline def language_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.propTypes.options")
      @js.native
      def options: Requireable[js.Object] = js.native
      inline def options_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.propTypes.original")
      @js.native
      def original: Requireable[String] = js.native
      inline def original_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("original")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.propTypes.overrideServices")
      @js.native
      def overrideServices: Requireable[js.Object] = js.native
      inline def overrideServices_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrideServices")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.propTypes.theme")
      @js.native
      def theme: Requireable[String] = js.native
      inline def theme_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.propTypes.value")
      @js.native
      def value: Requireable[String] = js.native
      inline def value_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor", "MonacoDiffEditor.propTypes.width")
      @js.native
      def width: Requireable[String | Double] = js.native
      inline def width_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
  }
}
