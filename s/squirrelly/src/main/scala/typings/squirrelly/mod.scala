package typings.squirrelly

import typings.squirrelly.squirrellyStrings.clear
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("squirrelly", "Compile")
  @js.native
  def Compile(str: String): SqrlFn = js.native
  
  object F {
    
    @JSImport("squirrelly", "F.e")
    @js.native
    def e(str: String): String = js.native
  }
  
  @JSImport("squirrelly", "Render")
  @js.native
  def Render(template: String, options: js.Object): String = js.native
  @JSImport("squirrelly", "Render")
  @js.native
  def Render(template: SqrlFn, options: js.Object): String = js.native
  
  @JSImport("squirrelly", "autoEscaping")
  @js.native
  def autoEscaping[T /* <: Boolean */](bool: T): T = js.native
  
  @JSImport("squirrelly", "defaultTags")
  @js.native
  def defaultTags(tagArray: js.Array[String]): Unit = js.native
  
  @JSImport("squirrelly", "defineFilter")
  @js.native
  def defineFilter(name: String, callback: js.Function1[/* str */ String, String]): Unit = js.native
  
  @JSImport("squirrelly", "defineHelper")
  @js.native
  def defineHelper(name: String, callback: HelperCallback): Unit = js.native
  
  @JSImport("squirrelly", "defineNativeHelper")
  @js.native
  def defineNativeHelper(name: String, obj: NativeHelper): Unit = js.native
  
  @JSImport("squirrelly", "definePartial")
  @js.native
  def definePartial(name: String, str: String): Unit = js.native
  
  @JSImport("squirrelly", "__express")
  @js.native
  def express(filePath: String, options: js.Object, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  @JSImport("squirrelly", "load")
  @js.native
  def load(options: Options): SqrlFn | String = js.native
  @JSImport("squirrelly", "load")
  @js.native
  def load(options: Options, str: String): SqrlFn = js.native
  
  @JSImport("squirrelly", "renderFile")
  @js.native
  def renderFile(filePath: String, options: js.Object): String = js.native
  
  @JSImport("squirrelly", "setDefaultFilters")
  @js.native
  def setDefaultFilters(obj: Record[String, Boolean]): Unit = js.native
  @JSImport("squirrelly", "setDefaultFilters")
  @js.native
  def setDefaultFilters_clear(obj: clear): Unit = js.native
  
  type Blocks = Record[String, js.Function0[String]]
  
  type HelperCallback = js.Function3[
    /* args */ js.Array[String], 
    /* content */ js.Function0[String], 
    /* blocks */ Blocks, 
    String
  ]
  
  @js.native
  trait NativeHelper extends StObject {
    
    var blocks: js.UndefOr[Blocks] = js.native
    
    var helperEnd: js.UndefOr[js.Function0[String]] = js.native
    
    var helperStart: js.UndefOr[
        js.Function2[/* param */ js.UndefOr[String], /* id */ js.UndefOr[String], String]
      ] = js.native
    
    var selfClosing: js.UndefOr[js.Function1[/* param */ js.UndefOr[String], String]] = js.native
  }
  object NativeHelper {
    
    @scala.inline
    def apply(): NativeHelper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeHelper]
    }
    
    @scala.inline
    implicit class NativeHelperMutableBuilder[Self <: NativeHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocks(value: Blocks): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
      
      @scala.inline
      def setHelperEnd(value: () => String): Self = StObject.set(x, "helperEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHelperEndUndefined: Self = StObject.set(x, "helperEnd", js.undefined)
      
      @scala.inline
      def setHelperStart(value: (/* param */ js.UndefOr[String], /* id */ js.UndefOr[String]) => String): Self = StObject.set(x, "helperStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHelperStartUndefined: Self = StObject.set(x, "helperStart", js.undefined)
      
      @scala.inline
      def setSelfClosing(value: /* param */ js.UndefOr[String] => String): Self = StObject.set(x, "selfClosing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelfClosingUndefined: Self = StObject.set(x, "selfClosing", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    @JSName("$cache")
    var $cache: js.UndefOr[Boolean] = js.native
    
    @JSName("$file")
    var $file: js.UndefOr[String] = js.native
    
    @JSName("$name")
    var $name: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$cache(value: Boolean): Self = StObject.set(x, "$cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$cacheUndefined: Self = StObject.set(x, "$cache", js.undefined)
      
      @scala.inline
      def set$file(value: String): Self = StObject.set(x, "$file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$fileUndefined: Self = StObject.set(x, "$file", js.undefined)
      
      @scala.inline
      def set$name(value: String): Self = StObject.set(x, "$name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$nameUndefined: Self = StObject.set(x, "$name", js.undefined)
    }
  }
  
  type SqrlFn = js.Function2[/* options */ js.Object, /* Sqrl */ js.Any, String]
}
