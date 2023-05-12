package typings.propertiesParser

import typings.node.fsMod.PathLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("properties-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEditor(): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")().asInstanceOf[Editor]
  inline def createEditor(options: EditorOptions): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(options.asInstanceOf[js.Any]).asInstanceOf[Editor]
  inline def createEditor(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createEditor(
    path: PathLike,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* editor */ Editor, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createEditor(path: PathLike, options: EditorOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createEditor(
    path: PathLike,
    options: EditorOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* editor */ Editor, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createEditor_Editor(path: PathLike): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(path.asInstanceOf[js.Any]).asInstanceOf[Editor]
  inline def createEditor_Editor(path: PathLike, options: EditorOptions): Editor = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Editor]
  
  inline def parse(text: String): Properties = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Properties]
  
  inline def read(path: PathLike): Properties = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(path.asInstanceOf[js.Any]).asInstanceOf[Properties]
  inline def read(path: PathLike, callback: js.Function2[/* err */ js.Error | Null, /* data */ Properties, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Editor extends StObject {
    
    def addHeadComment(comment: String): Unit = js.native
    
    def get(key: String): js.UndefOr[String] = js.native
    
    def save(): Unit = js.native
    def save(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def save(callback: js.Function1[/* err */ js.Error | Null, Unit], path: PathLike): Unit = js.native
    def save(path: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def save(path: PathLike): Unit = js.native
    def save(path: PathLike, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    
    def set(key: String): Unit = js.native
    def set(key: String, value: String): Unit = js.native
    def set(key: String, value: String, comment: String): Unit = js.native
    def set(key: String, value: Null, comment: String): Unit = js.native
    def set(key: String, value: Unit, comment: String): Unit = js.native
    
    def unset(key: String): Unit = js.native
  }
  
  trait EditorOptions extends StObject {
    
    var callback: js.UndefOr[js.Function2[/* err */ js.Error | Null, /* editor */ Editor, Unit]] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object EditorOptions {
    
    inline def apply(): EditorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: (/* err */ js.Error | Null, /* editor */ Editor) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  type Properties = Record[String, String]
}
