package typings.rdfjsScore

import typings.rdfjsScore.mod.Score
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distinctMod {
  
  @JSImport("@rdfjs/score/distinct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(score: js.Array[Score]): js.Array[Score] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(score.asInstanceOf[js.Any]).asInstanceOf[js.Array[Score]]
}
