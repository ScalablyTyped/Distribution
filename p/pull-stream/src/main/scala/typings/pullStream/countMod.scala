package typings.pullStream

import typings.pullStream.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countMod {
  
  /**
    * Create a stream that outputs 0 ... `max`. By default, `max` = `Infinity`.
    */
  @scala.inline
  def apply(): Source[Double] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Source[Double]]
  @scala.inline
  def apply(max: Double): Source[Double] = ^.asInstanceOf[js.Dynamic].apply(max.asInstanceOf[js.Any]).asInstanceOf[Source[Double]]
  
  @JSImport("pull-stream/sources/count", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
