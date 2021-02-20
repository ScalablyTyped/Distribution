package typings.pullStream

import typings.pullStream.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countMod {
  
  /**
    * Create a stream that outputs 0 ... `max`. By default, `max` = `Infinity`.
    */
  @JSImport("pull-stream/sources/count", JSImport.Namespace)
  @js.native
  def apply(): Source[Double] = js.native
  @JSImport("pull-stream/sources/count", JSImport.Namespace)
  @js.native
  def apply(max: Double): Source[Double] = js.native
}
