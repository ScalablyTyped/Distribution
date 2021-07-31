package typings.ranjs.mod

import typings.ranjs.anon.Accepted
import typings.ranjs.anon.Cv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object _mc {
  
  @js.native
  sealed trait State extends StObject
  @JSImport("ranjs", "_mc.State")
  @js.native
  object State extends StObject
  
  @js.native
  trait MCMC extends StObject {
    
    def ac(): js.Array[Double] = js.native
    
    def ar(): Double = js.native
    
    def iterate(): Accepted = js.native
    def iterate(callback: js.Function2[/* x */ js.Array[Double], /* accepted */ Boolean, Unit]): Accepted = js.native
    def iterate(callback: js.Function2[/* x */ js.Array[Double], /* accepted */ Boolean, Unit], warmUp: Boolean): Accepted = js.native
    def iterate(callback: Unit, warmUp: Boolean): Accepted = js.native
    
    def sample(): js.Array[js.Array[Double]] = js.native
    def sample(progress: js.Function1[/* percentage */ Double, Unit]): js.Array[js.Array[Double]] = js.native
    def sample(progress: js.Function1[/* percentage */ Double, Unit], size: Double): js.Array[js.Array[Double]] = js.native
    def sample(progress: Unit, size: Double): js.Array[js.Array[Double]] = js.native
    
    def state(): State = js.native
    
    def statistics(): js.Array[Cv] = js.native
    
    def warmUp(): Unit = js.native
    def warmUp(progress: js.Function1[/* percentage */ Double, Unit]): Unit = js.native
    def warmUp(progress: js.Function1[/* percentage */ Double, Unit], maxBatches: Double): Unit = js.native
    def warmUp(progress: Unit, maxBatches: Double): Unit = js.native
  }
}
