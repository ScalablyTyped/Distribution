package typings.retextProfanities

import typings.nlcst.mod.Root
import typings.unified.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ptMod {
  
  @JSImport("retext-profanities/pt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit | (Transformer[Root, Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit | (Transformer[Root, Root])]
  inline def default(options: typings.retextProfanities.factoryMod.Options): Unit | (Transformer[Root, Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[Root, Root])]
  
  type Options = typings.retextProfanities.factoryMod.Options
}
