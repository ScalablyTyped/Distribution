package typings.std.global

import typings.std.QueuingStrategyInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CountQueuingStrategy")
@js.native
open class CountQueuingStrategy protected ()
  extends StObject
     with typings.std.CountQueuingStrategy {
  /* standard dom */
  def this(init: QueuingStrategyInit) = this()
  
  /* standard dom */
  /* CompleteClass */
  @JSName("highWaterMark")
  override val highWaterMark_CountQueuingStrategy: Double = js.native
  
  /* standard dom */
  /* CompleteClass */
  @JSName("size")
  override def size_MCountQueuingStrategy(chunk: Any): Double = js.native
}
