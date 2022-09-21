package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.`docs-custom`
import typings.stencilCore.stencilPublicDocsMod.JsonDocs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetDocsCustom
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  def generator(docs: JsonDocs, config: Config): Unit | js.Promise[Unit]
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_OutputTargetDocsCustom: `docs-custom`
}
object OutputTargetDocsCustom {
  
  inline def apply(generator: (JsonDocs, Config) => Unit | js.Promise[Unit]): OutputTargetDocsCustom = {
    val __obj = js.Dynamic.literal(generator = js.Any.fromFunction2(generator))
    __obj.updateDynamic("type")("docs-custom")
    __obj.asInstanceOf[OutputTargetDocsCustom]
  }
  
  extension [Self <: OutputTargetDocsCustom](x: Self) {
    
    inline def setGenerator(value: (JsonDocs, Config) => Unit | js.Promise[Unit]): Self = StObject.set(x, "generator", js.Any.fromFunction2(value))
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setType(value: `docs-custom`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
