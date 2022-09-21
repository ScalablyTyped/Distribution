package typings.prettier

import typings.prettier.anon.Typescript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserTypescriptMod {
  
  @JSImport("prettier/parser-typescript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prettier/parser-typescript", "parsers")
  @js.native
  def parsers: Typescript = js.native
  inline def parsers_=(x: Typescript): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
}
