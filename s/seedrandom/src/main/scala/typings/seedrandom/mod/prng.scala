package typings.seedrandom.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait prng
  extends Instantiable0[prng]
     with Instantiable1[/* seed */ String, prng]
     with Instantiable2[js.UndefOr[/* seed */ String], /* options */ seedRandomOptions, prng]
     with Instantiable3[
      js.UndefOr[/* seed */ String], 
      js.UndefOr[/* options */ seedRandomOptions], 
      /* callback */ js.Any, 
      prng
    ] {
  
  def apply(): Double = js.native
  
  def double(): Double = js.native
  
  def int32(): Double = js.native
  
  def quick(): Double = js.native
  
  def state(): State = js.native
}
