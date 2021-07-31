package typings.purifycssWebpack

import typings.purifycssWebpack.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin * / any */ @JSImport("purifycss-webpack", JSImport.Namespace)
  @js.native
  class ^ () extends StObject {
    def this(options: PurifyOptions) = this()
  }
  
  trait PurifyOptions extends StObject {
    
    var minimize: js.UndefOr[Boolean] = js.undefined
    
    var moduleExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var paths: js.UndefOr[js.Object | js.Array[String]] = js.undefined
    
    var purifyOptions: js.UndefOr[Info] = js.undefined
    
    var styleExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object PurifyOptions {
    
    @scala.inline
    def apply(): PurifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PurifyOptions]
    }
    
    @scala.inline
    implicit class PurifyOptionsMutableBuilder[Self <: PurifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
      
      @scala.inline
      def setModuleExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleExtensionsUndefined: Self = StObject.set(x, "moduleExtensions", js.undefined)
      
      @scala.inline
      def setModuleExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleExtensions", js.Array(value :_*))
      
      @scala.inline
      def setPaths(value: js.Object | js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      @scala.inline
      def setPurifyOptions(value: Info): Self = StObject.set(x, "purifyOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurifyOptionsUndefined: Self = StObject.set(x, "purifyOptions", js.undefined)
      
      @scala.inline
      def setStyleExtensions(value: js.Array[String]): Self = StObject.set(x, "styleExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleExtensionsUndefined: Self = StObject.set(x, "styleExtensions", js.undefined)
      
      @scala.inline
      def setStyleExtensionsVarargs(value: String*): Self = StObject.set(x, "styleExtensions", js.Array(value :_*))
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type PurifyPlugin = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin */ js.Any
}
