package typings.propertiesReader

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("properties-reader", JSImport.Namespace)
  @js.native
  def apply(path: String): Reader = js.native
  @JSImport("properties-reader", JSImport.Namespace)
  @js.native
  def apply(path: String, encoding: js.UndefOr[scala.Nothing], options: AppenderOptions): Reader = js.native
  @JSImport("properties-reader", JSImport.Namespace)
  @js.native
  def apply(path: String, encoding: js.UndefOr[scala.Nothing], options: FullOptions): Reader = js.native
  @JSImport("properties-reader", JSImport.Namespace)
  @js.native
  def apply(path: String, encoding: js.UndefOr[scala.Nothing], options: WriterOptions): Reader = js.native
  @JSImport("properties-reader", JSImport.Namespace)
  @js.native
  def apply(path: String, encoding: String): Reader = js.native
  @JSImport("properties-reader", JSImport.Namespace)
  @js.native
  def apply(path: String, encoding: String, options: AppenderOptions): Reader = js.native
  @JSImport("properties-reader", JSImport.Namespace)
  @js.native
  def apply(path: String, encoding: String, options: FullOptions): Reader = js.native
  @JSImport("properties-reader", JSImport.Namespace)
  @js.native
  def apply(path: String, encoding: String, options: WriterOptions): Reader = js.native
  
  @js.native
  trait AppenderOptions extends StObject {
    
    var allowDuplicateSections: Boolean = js.native
  }
  object AppenderOptions {
    
    @scala.inline
    def apply(allowDuplicateSections: Boolean): AppenderOptions = {
      val __obj = js.Dynamic.literal(allowDuplicateSections = allowDuplicateSections.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppenderOptions]
    }
    
    @scala.inline
    implicit class AppenderOptionsMutableBuilder[Self <: AppenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDuplicateSections(value: Boolean): Self = StObject.set(x, "allowDuplicateSections", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FullOptions extends StObject {
    
    var appender: js.UndefOr[AppenderOptions] = js.native
    
    var writer: js.UndefOr[WriterOptions] = js.native
  }
  object FullOptions {
    
    @scala.inline
    def apply(): FullOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullOptions]
    }
    
    @scala.inline
    implicit class FullOptionsMutableBuilder[Self <: FullOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppender(value: AppenderOptions): Self = StObject.set(x, "appender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppenderUndefined: Self = StObject.set(x, "appender", js.undefined)
      
      @scala.inline
      def setWriter(value: WriterOptions): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
    }
  }
  
  @js.native
  trait Reader extends StObject {
    
    def append(path: String): Reader = js.native
    
    def bindToExpress(app: js.Object): Reader = js.native
    def bindToExpress(app: js.Object, basePath: js.UndefOr[scala.Nothing], makePaths: Boolean): Reader = js.native
    def bindToExpress(app: js.Object, basePath: String): Reader = js.native
    def bindToExpress(app: js.Object, basePath: String, makePaths: Boolean): Reader = js.native
    
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
  
  @js.native
  trait WriterOptions extends StObject {
    
    var saveSections: Boolean = js.native
  }
  object WriterOptions {
    
    @scala.inline
    def apply(saveSections: Boolean): WriterOptions = {
      val __obj = js.Dynamic.literal(saveSections = saveSections.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriterOptions]
    }
    
    @scala.inline
    implicit class WriterOptionsMutableBuilder[Self <: WriterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSaveSections(value: Boolean): Self = StObject.set(x, "saveSections", value.asInstanceOf[js.Any])
    }
  }
}
