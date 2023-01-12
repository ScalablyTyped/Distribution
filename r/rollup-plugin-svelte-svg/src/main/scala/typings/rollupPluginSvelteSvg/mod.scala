package typings.rollupPluginSvelteSvg

import typings.rollup.mod.Plugin
import typings.rollupPluginSvelteSvg.rollupPluginSvelteSvgStrings.post
import typings.rollupPluginSvelteSvg.rollupPluginSvelteSvgStrings.pre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-svelte-svg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def svelteSVG(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("svelteSVG")().asInstanceOf[Plugin]
  inline def svelteSVG(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("svelteSVG")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait Options extends StObject {
    
    var enforce: js.UndefOr[pre | post] = js.undefined
    
    var svgo: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OptimizeOptions */ Any
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEnforce(value: pre | post): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
      
      inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
      
      inline def setSvgo(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OptimizeOptions */ Any
      ): Self = StObject.set(x, "svgo", value.asInstanceOf[js.Any])
      
      inline def setSvgoUndefined: Self = StObject.set(x, "svgo", js.undefined)
    }
  }
}
