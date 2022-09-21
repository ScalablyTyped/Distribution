package typings.prettier

import typings.prettier.anon.Graphql
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserGraphqlMod {
  
  @JSImport("prettier/parser-graphql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prettier/parser-graphql", "parsers")
  @js.native
  def parsers: Graphql = js.native
  inline def parsers_=(x: Graphql): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
}
