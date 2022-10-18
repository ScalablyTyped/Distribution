package typings.storybookMdx2Csf

import org.scalablytyped.runtime.StringDictionary
import typings.babelTypes.mod.JSXElement_
import typings.std.Record
import typings.storybookMdx2Csf.anon.ArgTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTsSbMdxPluginMod {
  
  @JSImport("@storybook/mdx2-csf/dist/ts/sb-mdx-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def genCanvasExports(ast: JSXElement_, context: Context): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("genCanvasExports")(ast.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def genMeta(ast: JSXElement_, options: CompilerOptions): ArgTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("genMeta")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ArgTypes]
  
  inline def genStoryExport(ast: JSXElement_, context: Context): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("genStoryExport")(ast.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  
  inline def stringifyMeta(meta: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyMeta")(meta.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@storybook/mdx2-csf/dist/ts/sb-mdx-plugin", "wrapperJs")
  @js.native
  val wrapperJs: String = js.native
  
  trait CompilerOptions extends StObject {
    
    var filepath: js.UndefOr[String] = js.undefined
  }
  object CompilerOptions {
    
    inline def apply(): CompilerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompilerOptions]
    }
    
    extension [Self <: CompilerOptions](x: Self) {
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
    }
  }
  
  trait Context extends StObject {
    
    var counter: Double
    
    var namedExports: Record[String, Any]
    
    var storyNameToKey: Record[String, String]
  }
  object Context {
    
    inline def apply(counter: Double, namedExports: Record[String, Any], storyNameToKey: Record[String, String]): Context = {
      val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], namedExports = namedExports.asInstanceOf[js.Any], storyNameToKey = storyNameToKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setNamedExports(value: Record[String, Any]): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      inline def setStoryNameToKey(value: Record[String, String]): Self = StObject.set(x, "storyNameToKey", value.asInstanceOf[js.Any])
    }
  }
  
  type MetaExport = Record[String, Any]
}
