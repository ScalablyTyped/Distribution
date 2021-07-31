package typings.std.global

import typings.std.anon.HighWaterMark
import typings.std.stdNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CountQueuingStrategy")
@js.native
class CountQueuingStrategy protected ()
  extends StObject
     with typings.std.CountQueuingStrategy {
  def this(options: HighWaterMark) = this()
  
  /* CompleteClass */
  @JSName("highWaterMark")
  var highWaterMark_CountQueuingStrategy: Double = js.native
  
  /* CompleteClass */
  @JSName("size")
  override def size_MCountQueuingStrategy(chunk: js.Any): `1` = js.native
}
