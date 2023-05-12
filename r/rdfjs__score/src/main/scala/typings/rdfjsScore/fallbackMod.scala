package typings.rdfjsScore

import org.scalablytyped.runtime.Shortcut
import typings.rdfjsScore.mod.ScoreCb
import typings.rdfjsScore.mod.ScoreFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fallbackMod extends Shortcut {
  
  @JSImport("@rdfjs/score/fallback", JSImport.Default)
  @js.native
  val default: ScoreFn[js.Array[js.Array[ScoreCb]]] = js.native
  
  type _To = ScoreFn[js.Array[js.Array[ScoreCb]]]
  
  /* This means you don't have to write `default`, but can instead just say `fallbackMod.foo` */
  override def _to: ScoreFn[js.Array[js.Array[ScoreCb]]] = default
}
