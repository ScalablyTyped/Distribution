package typings.soundPlay

import typings.soundPlay.anon.Stdin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sound-play", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def play(path: String): js.Promise[Stdin] = ^.asInstanceOf[js.Dynamic].applyDynamic("play")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stdin]]
  inline def play(path: String, volume: Double): js.Promise[Stdin] = (^.asInstanceOf[js.Dynamic].applyDynamic("play")(path.asInstanceOf[js.Any], volume.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stdin]]
}
