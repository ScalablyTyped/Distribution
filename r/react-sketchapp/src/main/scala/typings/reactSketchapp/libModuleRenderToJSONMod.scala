package typings.reactSketchapp

import typings.react.mod.ReactElement
import typings.reactSketchapp.libModuleTypesMod.PlatformBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleRenderToJSONMod {
  
  @JSImport("react-sketchapp/lib/module/renderToJSON", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderToJSON(platformBridge: PlatformBridge): js.Function1[
    /* element */ ReactElement, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.AnyLayer */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToJSON")(platformBridge.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* element */ ReactElement, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.AnyLayer */ Any
  ]]
}
