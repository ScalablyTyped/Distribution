package typings.refractor

import org.scalablytyped.runtime.Shortcut
import typings.refractor.coreMod.RefractorSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod extends Shortcut {
  
  @JSImport("refractor/lang/http", JSImport.Namespace)
  @js.native
  val ^ : RefractorSyntax = js.native
  
  type _To = RefractorSyntax
  
  /* This means you don't have to write `^`, but can instead just say `httpMod.foo` */
  override def _to: RefractorSyntax = ^
}
