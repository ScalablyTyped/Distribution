package typings.squirrelly

import typings.squirrelly.mod.HelperCallback
import typings.squirrelly.mod.NativeHelper
import typings.squirrelly.mod.Options
import typings.squirrelly.mod.SqrlFn
import typings.squirrelly.squirrellyStrings.clear
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Sqrl {
    
    @JSGlobal("Sqrl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Compile(str: String): SqrlFn = ^.asInstanceOf[js.Dynamic].applyDynamic("Compile")(str.asInstanceOf[js.Any]).asInstanceOf[SqrlFn]
    
    object F {
      
      @JSGlobal("Sqrl.F")
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
  }
}
