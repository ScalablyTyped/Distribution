package typings.refractor

import typings.refractor.coreMod.RefractorNode
import typings.refractor.coreMod.RefractorSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("refractor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def highlight(value: String, name: String): js.Array[RefractorNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[RefractorNode]]
  
  inline def listLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listLanguages")().asInstanceOf[js.Array[String]]
  
  inline def register(syntax: RefractorSyntax): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(syntax.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registered(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("registered")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
