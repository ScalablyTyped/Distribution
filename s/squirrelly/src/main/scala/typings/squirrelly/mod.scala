package typings.squirrelly

import typings.squirrelly.squirrellyStrings.clear
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("squirrelly", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Compile(str: String): SqrlFn = ^.asInstanceOf[js.Dynamic].applyDynamic("Compile")(str.asInstanceOf[js.Any]).asInstanceOf[SqrlFn]
  
  object F {
    
    @JSImport("squirrelly", "F")
    @js.native
    val ^ : js.Any = js.native
    
    inline def e(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("e")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def Render(template: String, options: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("Render")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def Render(template: SqrlFn, options: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("Render")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def autoEscaping[T /* <: Boolean */](bool: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("autoEscaping")(bool.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def defaultTags(tagArray: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultTags")(tagArray.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def defineFilter(name: String, callback: js.Function1[/* str */ String, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineFilter")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def defineHelper(name: String, callback: HelperCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineHelper")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def defineNativeHelper(name: String, obj: NativeHelper): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineNativeHelper")(name.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def definePartial(name: String, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("definePartial")(name.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def express(filePath: String, options: js.Object, callback: js.Function1[/* repeated */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__express")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def load(options: Options): SqrlFn | String = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(options.asInstanceOf[js.Any]).asInstanceOf[SqrlFn | String]
  inline def load(options: Options, str: String): SqrlFn = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(options.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[SqrlFn]
  
  inline def renderFile(filePath: String, options: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setDefaultFilters(obj: Record[String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultFilters")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setDefaultFilters_clear(obj: clear): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultFilters")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Blocks = Record[String, js.Function0[String]]
  
  type HelperCallback = js.Function3[
    /* args */ js.Array[String], 
    /* content */ js.Function0[String], 
    /* blocks */ Blocks, 
    String
  ]
  
  trait NativeHelper extends StObject {
    
    var blocks: js.UndefOr[Blocks] = js.undefined
    
    var helperEnd: js.UndefOr[js.Function0[String]] = js.undefined
    
    var helperStart: js.UndefOr[
        js.Function2[/* param */ js.UndefOr[String], /* id */ js.UndefOr[String], String]
      ] = js.undefined
    
    var selfClosing: js.UndefOr[js.Function1[/* param */ js.UndefOr[String], String]] = js.undefined
  }
  object NativeHelper {
    
    inline def apply(): NativeHelper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeHelper]
    }
    
    extension [Self <: NativeHelper](x: Self) {
      
      inline def setBlocks(value: Blocks): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
      
      inline def setHelperEnd(value: () => String): Self = StObject.set(x, "helperEnd", js.Any.fromFunction0(value))
      
      inline def setHelperEndUndefined: Self = StObject.set(x, "helperEnd", js.undefined)
      
      inline def setHelperStart(value: (/* param */ js.UndefOr[String], /* id */ js.UndefOr[String]) => String): Self = StObject.set(x, "helperStart", js.Any.fromFunction2(value))
      
      inline def setHelperStartUndefined: Self = StObject.set(x, "helperStart", js.undefined)
      
      inline def setSelfClosing(value: /* param */ js.UndefOr[String] => String): Self = StObject.set(x, "selfClosing", js.Any.fromFunction1(value))
      
      inline def setSelfClosingUndefined: Self = StObject.set(x, "selfClosing", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    @JSName("$cache")
    var $cache: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$file")
    var $file: js.UndefOr[String] = js.undefined
    
    @JSName("$name")
    var $name: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def set$cache(value: Boolean): Self = StObject.set(x, "$cache", value.asInstanceOf[js.Any])
      
      inline def set$cacheUndefined: Self = StObject.set(x, "$cache", js.undefined)
      
      inline def set$file(value: String): Self = StObject.set(x, "$file", value.asInstanceOf[js.Any])
      
      inline def set$fileUndefined: Self = StObject.set(x, "$file", js.undefined)
      
      inline def set$name(value: String): Self = StObject.set(x, "$name", value.asInstanceOf[js.Any])
      
      inline def set$nameUndefined: Self = StObject.set(x, "$name", js.undefined)
    }
  }
  
  type SqrlFn = js.Function2[/* options */ js.Object, /* Sqrl */ js.Any, String]
}
