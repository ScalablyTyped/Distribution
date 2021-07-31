package typings.reactDocgenTypescript

import typings.reactDocgenTypescript.parserMod.ComponentDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propTypesParserMod {
  
  @JSImport("react-docgen-typescript/lib/propTypesParser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(fileName: String): js.Array[ComponentDoc] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(fileName.asInstanceOf[js.Any]).asInstanceOf[js.Array[ComponentDoc]]
}
