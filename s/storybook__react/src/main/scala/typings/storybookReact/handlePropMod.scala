package typings.storybookReact

import typings.storybookDocsTools.extractDocgenPropsMod.ExtractedProp
import typings.storybookDocsTools.propDefMod.PropDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlePropMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/propTypes/handleProp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enhancePropTypesProp(extractedProp: ExtractedProp): PropDef = ^.asInstanceOf[js.Dynamic].applyDynamic("enhancePropTypesProp")(extractedProp.asInstanceOf[js.Any]).asInstanceOf[PropDef]
  inline def enhancePropTypesProp(extractedProp: ExtractedProp, rawDefaultProp: Any): PropDef = (^.asInstanceOf[js.Dynamic].applyDynamic("enhancePropTypesProp")(extractedProp.asInstanceOf[js.Any], rawDefaultProp.asInstanceOf[js.Any])).asInstanceOf[PropDef]
  
  inline def enhancePropTypesProps(extractedProps: js.Array[ExtractedProp], component: Component): js.Array[PropDef] = (^.asInstanceOf[js.Dynamic].applyDynamic("enhancePropTypesProps")(extractedProps.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[js.Array[PropDef]]
  
  type Component = Any
}
