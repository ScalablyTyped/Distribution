package typings.rdfjsScore

import typings.rdfjsScore.mod.Pointers
import typings.rdfjsScore.mod.Score
import typings.rdfjsScore.mod.ScoreCb
import typings.rdfjsScore.mod.ScoreFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combineMod {
  
  /* Inlined @rdfjs/score.@rdfjs/score.ScoreFn<[std.Array<@rdfjs/score.@rdfjs/score.ScoreCb>]> & {  prioritized :@rdfjs/score.@rdfjs/score.ScoreFn<[std.Array<@rdfjs/score.@rdfjs/score.ScoreCb>]>} */
  object default {
    
    inline def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[js.Array[ScoreCb]]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ptrs */ Pointers, js.Array[Score]]]
    
    @JSImport("@rdfjs/score/combine", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@rdfjs/score/combine", "default.prioritized")
    @js.native
    def prioritized: ScoreFn[js.Array[js.Array[ScoreCb]]] = js.native
    inline def prioritized(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[js.Array[ScoreCb]]
    ): js.Function1[/* ptrs */ Pointers, js.Array[Score]] = ^.asInstanceOf[js.Dynamic].applyDynamic("prioritized")(args.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ptrs */ Pointers, js.Array[Score]]]
    inline def prioritized_=(x: ScoreFn[js.Array[js.Array[ScoreCb]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prioritized")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@rdfjs/score/combine", "prioritized")
  @js.native
  val prioritized: ScoreFn[js.Array[js.Array[ScoreCb]]] = js.native
}
