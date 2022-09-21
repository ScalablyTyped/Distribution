package typings.prettier

import typings.prettier.anon.Yaml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserYamlMod {
  
  @JSImport("prettier/parser-yaml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prettier/parser-yaml", "parsers")
  @js.native
  def parsers: Yaml = js.native
  inline def parsers_=(x: Yaml): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
}
