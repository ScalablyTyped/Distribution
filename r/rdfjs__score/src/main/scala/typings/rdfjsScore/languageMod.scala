package typings.rdfjsScore

import org.scalablytyped.runtime.Shortcut
import typings.rdfjsScore.mod.ScoreFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languageMod extends Shortcut {
  
  @JSImport("@rdfjs/score/language", JSImport.Default)
  @js.native
  val default: ScoreFn[js.Array[js.Array[String]]] = js.native
  
  type _To = ScoreFn[js.Array[js.Array[String]]]
  
  /* This means you don't have to write `default`, but can instead just say `languageMod.foo` */
  override def _to: ScoreFn[js.Array[js.Array[String]]] = default
}
