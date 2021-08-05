package typings.propertiesReader

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String): Reader = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Reader]
  inline def apply(path: String, encoding: String): Reader = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Reader]
  inline def apply(path: String, encoding: String, options: AppenderOptions): Reader = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reader]
  inline def apply(path: String, encoding: String, options: FullOptions): Reader = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reader]
  inline def apply(path: String, encoding: String, options: WriterOptions): Reader = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reader]
  inline def apply(path: String, encoding: Unit, options: AppenderOptions): Reader = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reader]
  inline def apply(path: String, encoding: Unit, options: FullOptions): Reader = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reader]
  inline def apply(path: String, encoding: Unit, options: WriterOptions): Reader = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reader]
  
  @JSImport("properties-reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AppenderOptions extends StObject {
    
    var allowDuplicateSections: Boolean
  }
  object AppenderOptions {
    
    inline def apply(allowDuplicateSections: Boolean): AppenderOptions = {
      val __obj = js.Dynamic.literal(allowDuplicateSections = allowDuplicateSections.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppenderOptions]
    }
    
    extension [Self <: AppenderOptions](x: Self) {
      
      inline def setAllowDuplicateSections(value: Boolean): Self = StObject.set(x, "allowDuplicateSections", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullOptions extends StObject {
    
    var appender: js.UndefOr[AppenderOptions] = js.undefined
    
    var writer: js.UndefOr[WriterOptions] = js.undefined
  }
  object FullOptions {
    
    inline def apply(): FullOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullOptions]
    }
    
    extension [Self <: FullOptions](x: Self) {
      
      inline def setAppender(value: AppenderOptions): Self = StObject.set(x, "appender", value.asInstanceOf[js.Any])
      
      inline def setAppenderUndefined: Self = StObject.set(x, "appender", js.undefined)
      
      inline def setWriter(value: WriterOptions): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
      
      inline def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
    }
  }
  
  @js.native
  trait Reader extends StObject {
    
    def append(path: String): Reader = js.native
    
    def bindToExpress(app: js.Object): Reader = js.native
    def bindToExpress(app: js.Object, basePath: String): Reader = js.native
    def bindToExpress(app: js.Object, basePath: String, makePaths: Boolean): Reader = js.native
    def bindToExpress(app: js.Object, basePath: Unit, makePaths: Boolean): Reader = js.native
    
    def each(iterator: js.Function2[/* key */ String, /* value */ Value, Unit]): Reader = js.native
    def each[T](iterator: js.ThisFunction2[/* this */ T, /* key */ String, /* value */ Value, Unit], scope: T): Reader = js.native
    
    def get(propertyName: String): Value | Null = js.native
    
    def getAllProperties(): StringDictionary[Value] = js.native
    
    def getByRoot(root: js.Any): StringDictionary[Value] = js.native
    
    def getRaw(propertyName: String): String | Null = js.native
    
    var length: Double = js.native
    
    def path(): js.Object = js.native
    
    def read(properties: String): Reader = js.native
    
    def save(destFile: String): js.Promise[String] = js.native
    def save(destFile: String, onComplete: js.Function2[/* err */ js.Any, /* data */ String, Unit]): js.Promise[String] = js.native
    
    def set(propertyName: String, value: Value): Reader = js.native
  }
  
  type Value = String | Double | Boolean
  
  trait WriterOptions extends StObject {
    
    var saveSections: Boolean
  }
  object WriterOptions {
    
    inline def apply(saveSections: Boolean): WriterOptions = {
      val __obj = js.Dynamic.literal(saveSections = saveSections.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriterOptions]
    }
    
    extension [Self <: WriterOptions](x: Self) {
      
      inline def setSaveSections(value: Boolean): Self = StObject.set(x, "saveSections", value.asInstanceOf[js.Any])
    }
  }
}
