package typings.statuses

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("statuses", JSImport.Namespace)
  @js.native
  val ^ : Status = js.native
  
  @js.native
  trait Status extends StObject {
    
    def apply(code_msg: String): Double | String = js.native
    def apply(code_msg: Double): Double | String = js.native
    
    var code: StringDictionary[js.UndefOr[Double]] = js.native
    
    var codes: js.Array[Double] = js.native
    
    var empty: NumberDictionary[js.UndefOr[Boolean]] = js.native
    
    var message: NumberDictionary[js.UndefOr[String]] = js.native
    
    var redirect: NumberDictionary[js.UndefOr[Boolean]] = js.native
    
    var retry: NumberDictionary[js.UndefOr[Boolean]] = js.native
  }
  
  type _To = Status
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Status = ^
}
