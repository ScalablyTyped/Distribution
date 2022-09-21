package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.anon.Output
import typings.stencilCore.stencilPublicCompilerMod.OptimizeCssInput
import typings.stencilCore.stencilPublicCompilerMod.OptimizeCssOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerWorkerContext extends StObject {
  
  def optimizeCss(inputOpts: OptimizeCssInput): js.Promise[OptimizeCssOutput]
  
  def prepareModule(input: String, minifyOpts: Any, transpile: Boolean, inlineHelpers: Boolean): js.Promise[Output]
  
  def prerenderWorker(prerenderRequest: PrerenderUrlRequest): js.Promise[PrerenderUrlResults]
  
  def transformCssToEsm(input: TransformCssToEsmInput): js.Promise[TransformCssToEsmOutput]
}
object CompilerWorkerContext {
  
  inline def apply(
    optimizeCss: OptimizeCssInput => js.Promise[OptimizeCssOutput],
    prepareModule: (String, Any, Boolean, Boolean) => js.Promise[Output],
    prerenderWorker: PrerenderUrlRequest => js.Promise[PrerenderUrlResults],
    transformCssToEsm: TransformCssToEsmInput => js.Promise[TransformCssToEsmOutput]
  ): CompilerWorkerContext = {
    val __obj = js.Dynamic.literal(optimizeCss = js.Any.fromFunction1(optimizeCss), prepareModule = js.Any.fromFunction4(prepareModule), prerenderWorker = js.Any.fromFunction1(prerenderWorker), transformCssToEsm = js.Any.fromFunction1(transformCssToEsm))
    __obj.asInstanceOf[CompilerWorkerContext]
  }
  
  extension [Self <: CompilerWorkerContext](x: Self) {
    
    inline def setOptimizeCss(value: OptimizeCssInput => js.Promise[OptimizeCssOutput]): Self = StObject.set(x, "optimizeCss", js.Any.fromFunction1(value))
    
    inline def setPrepareModule(value: (String, Any, Boolean, Boolean) => js.Promise[Output]): Self = StObject.set(x, "prepareModule", js.Any.fromFunction4(value))
    
    inline def setPrerenderWorker(value: PrerenderUrlRequest => js.Promise[PrerenderUrlResults]): Self = StObject.set(x, "prerenderWorker", js.Any.fromFunction1(value))
    
    inline def setTransformCssToEsm(value: TransformCssToEsmInput => js.Promise[TransformCssToEsmOutput]): Self = StObject.set(x, "transformCssToEsm", js.Any.fromFunction1(value))
  }
}
