package typings.singleSpaReact

import typings.singleSpaReact.mod.DeprecatedRenderTypes
import typings.singleSpaReact.mod.LegacyRenderType
import typings.singleSpaReact.mod.RenderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleSpaReactStrings {
  
  @js.native
  sealed trait createBlockingRoot
    extends StObject
       with DeprecatedRenderTypes
  inline def createBlockingRoot: createBlockingRoot = "createBlockingRoot".asInstanceOf[createBlockingRoot]
  
  @js.native
  sealed trait createRoot
    extends StObject
       with RenderType
  inline def createRoot: createRoot = "createRoot".asInstanceOf[createRoot]
  
  @js.native
  sealed trait hydrate
    extends StObject
       with LegacyRenderType
       with RenderType
  inline def hydrate: hydrate = "hydrate".asInstanceOf[hydrate]
  
  @js.native
  sealed trait hydrateRoot
    extends StObject
       with RenderType
  inline def hydrateRoot: hydrateRoot = "hydrateRoot".asInstanceOf[hydrateRoot]
  
  @js.native
  sealed trait render
    extends StObject
       with LegacyRenderType
       with RenderType
  inline def render: render = "render".asInstanceOf[render]
  
  @js.native
  sealed trait unstable_createBlockingRoot
    extends StObject
       with DeprecatedRenderTypes
  inline def unstable_createBlockingRoot: unstable_createBlockingRoot = "unstable_createBlockingRoot".asInstanceOf[unstable_createBlockingRoot]
  
  @js.native
  sealed trait unstable_createRoot
    extends StObject
       with DeprecatedRenderTypes
  inline def unstable_createRoot: unstable_createRoot = "unstable_createRoot".asInstanceOf[unstable_createRoot]
}
