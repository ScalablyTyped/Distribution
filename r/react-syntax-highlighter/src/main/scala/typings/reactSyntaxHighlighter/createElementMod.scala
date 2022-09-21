package typings.reactSyntaxHighlighter

import typings.react.mod.ReactNode
import typings.reactSyntaxHighlighter.mod.createElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createElementMod {
  
  @JSImport("react-syntax-highlighter/dist/cjs/create-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: createElementProps): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
}
