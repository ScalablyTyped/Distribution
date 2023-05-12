package typings.rdfjsScore

import org.scalablytyped.runtime.Shortcut
import typings.rdfjsScore.mod.ScoreFn
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMod extends Shortcut {
  
  @JSImport("@rdfjs/score/type", JSImport.Default)
  @js.native
  val default: ScoreFn[js.Array[Term]] = js.native
  
  type _To = ScoreFn[js.Array[Term]]
  
  /* This means you don't have to write `default`, but can instead just say `typeMod.foo` */
  override def _to: ScoreFn[js.Array[Term]] = default
}
