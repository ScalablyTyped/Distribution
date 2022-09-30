package typings.storybookReact

import typings.storybookDocsTools.jsdocParserMod.ExtractedJsDocParam
import typings.storybookDocsTools.jsdocParserMod.ExtractedJsDocReturns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateFuncSignatureMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/propTypes/generateFuncSignature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateFuncSignature(params: js.Array[ExtractedJsDocParam], returns: ExtractedJsDocReturns): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFuncSignature")(params.asInstanceOf[js.Any], returns.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateShortFuncSignature(params: js.Array[ExtractedJsDocParam], returns: ExtractedJsDocReturns): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateShortFuncSignature")(params.asInstanceOf[js.Any], returns.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toMultilineSignature(signature: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMultilineSignature")(signature.asInstanceOf[js.Any]).asInstanceOf[String]
}
