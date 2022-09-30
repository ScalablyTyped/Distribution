package typings.storybookReact

import typings.storybookDocsTools.propDefMod.PropDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortPropsMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/propTypes/sortProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keepOriginalDefinitionOrder(extractedProps: js.Array[PropDef], component: Component): js.Array[PropDef] = (^.asInstanceOf[js.Dynamic].applyDynamic("keepOriginalDefinitionOrder")(extractedProps.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[js.Array[PropDef]]
  
  type Component = Any
}
