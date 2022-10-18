package typings.rword

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibShuffleWordsMod {
  
  @JSImport("rword/dist/lib/shuffle-words", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shuffleWords(words: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffleWords")(words.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
