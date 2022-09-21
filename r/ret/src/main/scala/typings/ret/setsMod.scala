package typings.ret

import typings.ret.tokensMod.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setsMod {
  
  @JSImport("ret/dist/sets", "anyChar")
  @js.native
  val anyChar: SetFunc = js.native
  
  @JSImport("ret/dist/sets", "ints")
  @js.native
  val ints: SetFunc = js.native
  
  @JSImport("ret/dist/sets", "notInts")
  @js.native
  val notInts: SetFunc = js.native
  
  @JSImport("ret/dist/sets", "notWhitespace")
  @js.native
  val notWhitespace: SetFunc = js.native
  
  @JSImport("ret/dist/sets", "notWords")
  @js.native
  val notWords: SetFunc = js.native
  
  @JSImport("ret/dist/sets", "whitespace")
  @js.native
  val whitespace: SetFunc = js.native
  
  @JSImport("ret/dist/sets", "words")
  @js.native
  val words: SetFunc = js.native
  
  type SetFunc = js.Function0[Set]
}
