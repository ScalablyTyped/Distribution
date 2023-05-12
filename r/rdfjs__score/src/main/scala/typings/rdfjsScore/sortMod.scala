package typings.rdfjsScore

import typings.rdfjsScore.mod.Score
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortMod {
  
  @JSImport("@rdfjs/score/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(scores: js.Array[Score]): js.Array[Score] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scores.asInstanceOf[js.Any]).asInstanceOf[js.Array[Score]]
}
