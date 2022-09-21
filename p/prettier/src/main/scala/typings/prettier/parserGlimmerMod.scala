package typings.prettier

import typings.prettier.anon.Glimmer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserGlimmerMod {
  
  @JSImport("prettier/parser-glimmer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prettier/parser-glimmer", "parsers")
  @js.native
  def parsers: Glimmer = js.native
  inline def parsers_=(x: Glimmer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
}
