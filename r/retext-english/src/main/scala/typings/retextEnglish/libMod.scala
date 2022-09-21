package typings.retextEnglish

import typings.unified.mod.ParserClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("retext-english/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  
  @JSImport("retext-english/lib", "Parser")
  @js.native
  val Parser: ParserClass[Root] = js.native
  
  type Root = typings.nlcst.mod.Root
}
