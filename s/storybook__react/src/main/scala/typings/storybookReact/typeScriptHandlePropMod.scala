package typings.storybookReact

import typings.storybookDocsTools.extractDocgenPropsMod.ExtractedProp
import typings.storybookDocsTools.propDefMod.PropDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptHandlePropMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/typeScript/handleProp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enhanceTypeScriptProp(extractedProp: ExtractedProp): PropDef = ^.asInstanceOf[js.Dynamic].applyDynamic("enhanceTypeScriptProp")(extractedProp.asInstanceOf[js.Any]).asInstanceOf[PropDef]
  inline def enhanceTypeScriptProp(extractedProp: ExtractedProp, rawDefaultProp: Any): PropDef = (^.asInstanceOf[js.Dynamic].applyDynamic("enhanceTypeScriptProp")(extractedProp.asInstanceOf[js.Any], rawDefaultProp.asInstanceOf[js.Any])).asInstanceOf[PropDef]
  
  inline def enhanceTypeScriptProps(extractedProps: js.Array[ExtractedProp]): js.Array[PropDef] = ^.asInstanceOf[js.Dynamic].applyDynamic("enhanceTypeScriptProps")(extractedProps.asInstanceOf[js.Any]).asInstanceOf[js.Array[PropDef]]
}
