package typings.storybookMdx1Csf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTsSbMdxPluginMod {
  
  @JSImport("@storybook/mdx1-csf/dist/ts/sb-mdx-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCompiler(mdxOptions: MdxOptions): js.Function1[/* options */ js.UndefOr[CompilerOptions], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompiler")(mdxOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[CompilerOptions], Unit]]
  
  @JSImport("@storybook/mdx1-csf/dist/ts/sb-mdx-plugin", "wrapperJs")
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
  
  trait MdxOptions extends StObject {
    
    var filepath: js.UndefOr[String] = js.undefined
    
    var rehypePlugins: js.UndefOr[js.Array[Any]] = js.undefined
    
    var remarkPlugins: js.UndefOr[js.Array[Any]] = js.undefined
    
    var skipCsf: js.UndefOr[Boolean] = js.undefined
    
    var skipExport: js.UndefOr[Boolean] = js.undefined
    
    var wrapExport: js.UndefOr[String] = js.undefined
  }
  object MdxOptions {
    
    inline def apply(): MdxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MdxOptions]
    }
    
    extension [Self <: MdxOptions](x: Self) {
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
      
      inline def setRehypePlugins(value: js.Array[Any]): Self = StObject.set(x, "rehypePlugins", value.asInstanceOf[js.Any])
      
      inline def setRehypePluginsUndefined: Self = StObject.set(x, "rehypePlugins", js.undefined)
      
      inline def setRehypePluginsVarargs(value: Any*): Self = StObject.set(x, "rehypePlugins", js.Array(value*))
      
      inline def setRemarkPlugins(value: js.Array[Any]): Self = StObject.set(x, "remarkPlugins", value.asInstanceOf[js.Any])
      
      inline def setRemarkPluginsUndefined: Self = StObject.set(x, "remarkPlugins", js.undefined)
      
      inline def setRemarkPluginsVarargs(value: Any*): Self = StObject.set(x, "remarkPlugins", js.Array(value*))
      
      inline def setSkipCsf(value: Boolean): Self = StObject.set(x, "skipCsf", value.asInstanceOf[js.Any])
      
      inline def setSkipCsfUndefined: Self = StObject.set(x, "skipCsf", js.undefined)
      
      inline def setSkipExport(value: Boolean): Self = StObject.set(x, "skipExport", value.asInstanceOf[js.Any])
      
      inline def setSkipExportUndefined: Self = StObject.set(x, "skipExport", js.undefined)
      
      inline def setWrapExport(value: String): Self = StObject.set(x, "wrapExport", value.asInstanceOf[js.Any])
      
      inline def setWrapExportUndefined: Self = StObject.set(x, "wrapExport", js.undefined)
    }
  }
}
