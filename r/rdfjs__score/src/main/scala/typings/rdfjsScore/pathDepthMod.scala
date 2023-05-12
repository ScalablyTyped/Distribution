package typings.rdfjsScore

import org.scalablytyped.runtime.Shortcut
import typings.rdfjsScore.mod.ScoreFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathDepthMod extends Shortcut {
  
  @JSImport("@rdfjs/score/pathDepth", JSImport.Default)
  @js.native
  val default: ScoreFn[js.Array[Any]] = js.native
  
  type _To = ScoreFn[js.Array[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `pathDepthMod.foo` */
  override def _to: ScoreFn[js.Array[Any]] = default
}
